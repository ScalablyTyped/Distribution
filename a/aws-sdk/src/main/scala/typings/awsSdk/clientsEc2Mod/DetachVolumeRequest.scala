package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachVolumeRequest extends StObject {
  
  /**
    * The device name.
    */
  var Device: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Forces detachment if the previous detachment attempt did not occur cleanly (for example, logging into an instance, unmounting the volume, and detaching normally). This option can lead to data loss or a corrupted file system. Use this option only as a last resort to detach a volume from a failed instance. The instance won't have an opportunity to flush file system caches or file system metadata. If you use this option, you must perform file system check and repair procedures.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the instance. If you are detaching a Multi-Attach enabled volume, you must specify an instance ID.
    */
  var InstanceId: js.UndefOr[InstanceIdForResolver] = js.undefined
  
  /**
    * The ID of the volume.
    */
  var VolumeId: VolumeIdWithResolver
}
object DetachVolumeRequest {
  
  inline def apply(VolumeId: VolumeIdWithResolver): DetachVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachVolumeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetachVolumeRequest] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: String): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    inline def setInstanceId(value: InstanceIdForResolver): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setVolumeId(value: VolumeIdWithResolver): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
