package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDiskRequest extends StObject {
  
  /**
    * The unique name of the disk you want to delete (e.g., my-disk).
    */
  var diskName: ResourceName
  
  /**
    * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
    */
  var forceDeleteAddOns: js.UndefOr[Boolean] = js.undefined
}
object DeleteDiskRequest {
  
  inline def apply(diskName: ResourceName): DeleteDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDiskRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDiskRequest] (val x: Self) extends AnyVal {
    
    inline def setDiskName(value: ResourceName): Self = StObject.set(x, "diskName", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteAddOns(value: Boolean): Self = StObject.set(x, "forceDeleteAddOns", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteAddOnsUndefined: Self = StObject.set(x, "forceDeleteAddOns", js.undefined)
  }
}
