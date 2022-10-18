package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDynamicThingGroupRequest extends StObject {
  
  /**
    * The expected version of the dynamic thing group to delete.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  
  /**
    * The name of the dynamic thing group to delete.
    */
  var thingGroupName: ThingGroupName
}
object DeleteDynamicThingGroupRequest {
  
  inline def apply(thingGroupName: ThingGroupName): DeleteDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDynamicThingGroupRequest]
  }
  
  extension [Self <: DeleteDynamicThingGroupRequest](x: Self) {
    
    inline def setExpectedVersion(value: OptionalVersion): Self = StObject.set(x, "expectedVersion", value.asInstanceOf[js.Any])
    
    inline def setExpectedVersionUndefined: Self = StObject.set(x, "expectedVersion", js.undefined)
    
    inline def setThingGroupName(value: ThingGroupName): Self = StObject.set(x, "thingGroupName", value.asInstanceOf[js.Any])
  }
}
