package typings
package awsDashSdkLib.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationDependenciesResponse extends js.Object {
  /**
    * An array of application summaries nested in the application.
    */
  var Dependencies: js.UndefOr[__listOfApplicationDependencySummary] = js.undefined
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListApplicationDependenciesResponse {
  @scala.inline
  def apply(Dependencies: __listOfApplicationDependencySummary = null, NextToken: __string = null): ListApplicationDependenciesResponse = {
    val __obj = js.Dynamic.literal()
    if (Dependencies != null) __obj.updateDynamic("Dependencies")(Dependencies)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListApplicationDependenciesResponse]
  }
}

