package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListViolationEventsResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The security profile violation alerts issued for this account during the given time frame, potentially filtered by security profile, behavior violated, or thing (device) violating.
    */
  var violationEvents: js.UndefOr[ViolationEvents] = js.undefined
}

object ListViolationEventsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, violationEvents: ViolationEvents = null): ListViolationEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (violationEvents != null) __obj.updateDynamic("violationEvents")(violationEvents)
    __obj.asInstanceOf[ListViolationEventsResponse]
  }
}

