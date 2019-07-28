package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingsInThingGroupResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The things in the specified thing group.
    */
  var things: js.UndefOr[ThingNameList] = js.undefined
}

object ListThingsInThingGroupResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, things: ThingNameList = null): ListThingsInThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (things != null) __obj.updateDynamic("things")(things)
    __obj.asInstanceOf[ListThingsInThingGroupResponse]
  }
}

