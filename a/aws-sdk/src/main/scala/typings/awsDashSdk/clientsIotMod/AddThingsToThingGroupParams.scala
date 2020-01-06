package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddThingsToThingGroupParams extends js.Object {
  /**
    * Specifies if this mitigation action can move the things that triggered the mitigation action even if they are part of one or more dynamic things groups.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.native
  /**
    * The list of groups to which you want to add the things that triggered the mitigation action. You can add a thing to a maximum of 10 groups, but you cannot add a thing to more than one group in the same hierarchy.
    */
  var thingGroupNames: ThingGroupNames = js.native
}

object AddThingsToThingGroupParams {
  @scala.inline
  def apply(thingGroupNames: ThingGroupNames, overrideDynamicGroups: js.UndefOr[scala.Boolean] = js.undefined): AddThingsToThingGroupParams = {
    val __obj = js.Dynamic.literal(thingGroupNames = thingGroupNames.asInstanceOf[js.Any])
    if (!js.isUndefined(overrideDynamicGroups)) __obj.updateDynamic("overrideDynamicGroups")(overrideDynamicGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddThingsToThingGroupParams]
  }
}

