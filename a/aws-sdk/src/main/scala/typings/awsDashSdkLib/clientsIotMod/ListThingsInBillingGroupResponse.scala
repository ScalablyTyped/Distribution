package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingsInBillingGroupResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of things in the billing group.
    */
  var things: js.UndefOr[ThingNameList] = js.undefined
}

object ListThingsInBillingGroupResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, things: ThingNameList = null): ListThingsInBillingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (things != null) __obj.updateDynamic("things")(things)
    __obj.asInstanceOf[ListThingsInBillingGroupResponse]
  }
}

