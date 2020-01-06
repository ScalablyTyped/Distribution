package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationDependenciesResponse extends js.Object {
  /**
    * An array of application summaries nested in the application.
    */
  var Dependencies: js.UndefOr[__listOfApplicationDependencySummary] = js.native
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListApplicationDependenciesResponse {
  @scala.inline
  def apply(Dependencies: __listOfApplicationDependencySummary = null, NextToken: __string = null): ListApplicationDependenciesResponse = {
    val __obj = js.Dynamic.literal()
    if (Dependencies != null) __obj.updateDynamic("Dependencies")(Dependencies.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationDependenciesResponse]
  }
}

