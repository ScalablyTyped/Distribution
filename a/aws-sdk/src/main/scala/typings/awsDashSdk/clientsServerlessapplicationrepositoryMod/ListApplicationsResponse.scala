package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationsResponse extends js.Object {
  /**
    * An array of application summaries.
    */
  var Applications: js.UndefOr[__listOfApplicationSummary] = js.undefined
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListApplicationsResponse {
  @scala.inline
  def apply(Applications: __listOfApplicationSummary = null, NextToken: __string = null): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Applications != null) __obj.updateDynamic("Applications")(Applications)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListApplicationsResponse]
  }
}

