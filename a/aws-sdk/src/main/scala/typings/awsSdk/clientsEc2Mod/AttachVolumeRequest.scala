package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachVolumeRequest extends StObject {
  
  /**
    * The device name (for example, /dev/sdh or xvdh).
    */
  var Device: String
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: typings.awsSdk.clientsEc2Mod.InstanceId
  
  /**
    * The ID of the EBS volume. The volume and instance must be within the same Availability Zone.
    */
  var VolumeId: typings.awsSdk.clientsEc2Mod.VolumeId
}
object AttachVolumeRequest {
  
  inline def apply(Device: String, InstanceId: InstanceId, VolumeId: VolumeId): AttachVolumeRequest = {
    val __obj = js.Dynamic.literal(Device = Device.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any], VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachVolumeRequest]
  }
  
  extension [Self <: AttachVolumeRequest](x: Self) {
    
    inline def setDevice(value: String): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
