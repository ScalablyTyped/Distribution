package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVolumePermissionModifications extends StObject {
  
  /**
    * Adds the specified Amazon Web Services account ID or group to the list.
    */
  var Add: js.UndefOr[CreateVolumePermissionList] = js.undefined
  
  /**
    * Removes the specified Amazon Web Services account ID or group from the list.
    */
  var Remove: js.UndefOr[CreateVolumePermissionList] = js.undefined
}
object CreateVolumePermissionModifications {
  
  inline def apply(): CreateVolumePermissionModifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVolumePermissionModifications]
  }
  
  extension [Self <: CreateVolumePermissionModifications](x: Self) {
    
    inline def setAdd(value: CreateVolumePermissionList): Self = StObject.set(x, "Add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "Add", js.undefined)
    
    inline def setAddVarargs(value: CreateVolumePermission*): Self = StObject.set(x, "Add", js.Array(value*))
    
    inline def setRemove(value: CreateVolumePermissionList): Self = StObject.set(x, "Remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "Remove", js.undefined)
    
    inline def setRemoveVarargs(value: CreateVolumePermission*): Self = StObject.set(x, "Remove", js.Array(value*))
  }
}
