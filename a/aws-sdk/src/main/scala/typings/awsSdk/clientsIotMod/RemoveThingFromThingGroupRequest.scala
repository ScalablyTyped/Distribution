package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveThingFromThingGroupRequest extends StObject {
  
  /**
    * The ARN of the thing to remove from the group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  
  /**
    * The group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
  
  /**
    * The group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
  
  /**
    * The name of the thing to remove from the group.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}
object RemoveThingFromThingGroupRequest {
  
  inline def apply(): RemoveThingFromThingGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveThingFromThingGroupRequest]
  }
  
  extension [Self <: RemoveThingFromThingGroupRequest](x: Self) {
    
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
