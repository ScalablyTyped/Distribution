package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInstanceRequest extends StObject {
  
  /**
    * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
    */
  var forceDeleteAddOns: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the instance to delete.
    */
  var instanceName: ResourceName
}
object DeleteInstanceRequest {
  
  inline def apply(instanceName: ResourceName): DeleteInstanceRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceRequest]
  }
  
  extension [Self <: DeleteInstanceRequest](x: Self) {
    
    inline def setForceDeleteAddOns(value: Boolean): Self = StObject.set(x, "forceDeleteAddOns", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteAddOnsUndefined: Self = StObject.set(x, "forceDeleteAddOns", js.undefined)
    
    inline def setInstanceName(value: ResourceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
  }
}
