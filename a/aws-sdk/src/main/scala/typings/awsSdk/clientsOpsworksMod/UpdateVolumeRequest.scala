package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVolumeRequest extends StObject {
  
  /**
    * The new mount point.
    */
  var MountPoint: js.UndefOr[String] = js.undefined
  
  /**
    * The new name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The volume ID.
    */
  var VolumeId: String
}
object UpdateVolumeRequest {
  
  inline def apply(VolumeId: String): UpdateVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVolumeRequest]
  }
  
  extension [Self <: UpdateVolumeRequest](x: Self) {
    
    inline def setMountPoint(value: String): Self = StObject.set(x, "MountPoint", value.asInstanceOf[js.Any])
    
    inline def setMountPointUndefined: Self = StObject.set(x, "MountPoint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
