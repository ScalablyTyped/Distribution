package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThingGroupsResponse extends js.Object {
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The thing groups.
    */
  var thingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
}

object ListThingGroupsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, thingGroups: ThingGroupNameAndArnList = null): ListThingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (thingGroups != null) __obj.updateDynamic("thingGroups")(thingGroups)
    __obj.asInstanceOf[ListThingGroupsResponse]
  }
}

