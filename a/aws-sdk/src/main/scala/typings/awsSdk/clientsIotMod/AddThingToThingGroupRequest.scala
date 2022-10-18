package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddThingToThingGroupRequest extends StObject {
  
  /**
    * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined
  
  /**
    * The ARN of the thing to add to a group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  
  /**
    * The ARN of the group to which you are adding a thing.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
  
  /**
    * The name of the group to which you are adding a thing.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
  
  /**
    * The name of the thing to add to a group.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}
object AddThingToThingGroupRequest {
  
  inline def apply(): AddThingToThingGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddThingToThingGroupRequest]
  }
  
  extension [Self <: AddThingToThingGroupRequest](x: Self) {
    
    inline def setOverrideDynamicGroups(value: OverrideDynamicGroups): Self = StObject.set(x, "overrideDynamicGroups", value.asInstanceOf[js.Any])
    
    inline def setOverrideDynamicGroupsUndefined: Self = StObject.set(x, "overrideDynamicGroups", js.undefined)
    
    inline def setThingArn(value: ThingArn): Self = StObject.set(x, "thingArn", value.asInstanceOf[js.Any])
    
    inline def setThingArnUndefined: Self = StObject.set(x, "thingArn", js.undefined)
    
    inline def setThingGroupArn(value: ThingGroupArn): Self = StObject.set(x, "thingGroupArn", value.asInstanceOf[js.Any])
    
    inline def setThingGroupArnUndefined: Self = StObject.set(x, "thingGroupArn", js.undefined)
    
    inline def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
    
    inline def setThingGroupNameUndefined: Self = StObject.set(x, "thingGroupName", js.undefined)
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
