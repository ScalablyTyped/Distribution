package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationsResponse extends js.Object {
  /**
    * An array of application summaries.
    */
  var Applications: js.UndefOr[__listOfApplicationSummary] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListApplicationsResponse {
  @scala.inline
  def apply(Applications: __listOfApplicationSummary = null, NextToken: __string = null): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Applications != null) __obj.updateDynamic("Applications")(Applications.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationsResponse]
  }
}

