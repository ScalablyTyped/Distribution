package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListActiveViolationsResponse extends js.Object {
  /**
    * The list of active violations.
    */
  var activeViolations: js.UndefOr[ActiveViolations] = js.undefined
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListActiveViolationsResponse {
  @scala.inline
  def apply(activeViolations: ActiveViolations = null, nextToken: NextToken = null): ListActiveViolationsResponse = {
    val __obj = js.Dynamic.literal()
    if (activeViolations != null) __obj.updateDynamic("activeViolations")(activeViolations)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListActiveViolationsResponse]
  }
}

