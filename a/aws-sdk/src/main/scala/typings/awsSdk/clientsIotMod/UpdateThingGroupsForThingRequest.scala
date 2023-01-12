package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateThingGroupsForThingRequest extends StObject {
  
  /**
    * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined
  
  /**
    * The groups to which the thing will be added.
    */
  var thingGroupsToAdd: js.UndefOr[ThingGroupList] = js.undefined
  
  /**
    * The groups from which the thing will be removed.
    */
  var thingGroupsToRemove: js.UndefOr[ThingGroupList] = js.undefined
  
  /**
    * The thing whose group memberships will be updated.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}
object UpdateThingGroupsForThingRequest {
  
  inline def apply(): UpdateThingGroupsForThingRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateThingGroupsForThingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateThingGroupsForThingRequest] (val x: Self) extends AnyVal {
    
    inline def setOverrideDynamicGroups(value: OverrideDynamicGroups): Self = StObject.set(x, "overrideDynamicGroups", value.asInstanceOf[js.Any])
    
    inline def setOverrideDynamicGroupsUndefined: Self = StObject.set(x, "overrideDynamicGroups", js.undefined)
    
    inline def setThingGroupsToAdd(value: ThingGroupList): Self = StObject.set(x, "thingGroupsToAdd", value.asInstanceOf[js.Any])
    
    inline def setThingGroupsToAddUndefined: Self = StObject.set(x, "thingGroupsToAdd", js.undefined)
    
    inline def setThingGroupsToAddVarargs(value: ThingGroupName*): Self = StObject.set(x, "thingGroupsToAdd", js.Array(value*))
    
    inline def setThingGroupsToRemove(value: ThingGroupList): Self = StObject.set(x, "thingGroupsToRemove", value.asInstanceOf[js.Any])
    
    inline def setThingGroupsToRemoveUndefined: Self = StObject.set(x, "thingGroupsToRemove", js.undefined)
    
    inline def setThingGroupsToRemoveVarargs(value: ThingGroupName*): Self = StObject.set(x, "thingGroupsToRemove", js.Array(value*))
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
    
    inline def setThingNameUndefined: Self = StObject.set(x, "thingName", js.undefined)
  }
}
