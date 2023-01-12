package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVolumeRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target IOPS rate of the volume. This parameter is valid only for gp3, io1, and io2 volumes. The following are the supported values for each volume type:    gp3: 3,000-16,000 IOPS    io1: 100-64,000 IOPS    io2: 100-64,000 IOPS   Default: The existing value is retained if you keep the same volume type. If you change the volume type to io1, io2, or gp3, the default is 3,000.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * Specifies whether to enable Amazon EBS Multi-Attach. If you enable Multi-Attach, you can attach the volume to up to 16  Nitro-based instances in the same Availability Zone. This parameter is supported with io1 and io2 volumes only. For more information, see  Amazon EBS Multi-Attach in the Amazon Elastic Compute Cloud User Guide.
    */
  var MultiAttachEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target size of the volume, in GiB. The target volume size must be greater than or equal to the existing size of the volume. The following are the supported volumes sizes for each volume type:    gp2 and gp3: 1-16,384    io1 and io2: 4-16,384    st1 and sc1: 125-16,384    standard: 1-1,024   Default: The existing size is retained.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  
  /**
    * The target throughput of the volume, in MiB/s. This parameter is valid only for gp3 volumes. The maximum value is 1,000. Default: The existing value is retained if the source and target volume type is gp3. Otherwise, the default value is 125. Valid Range: Minimum value of 125. Maximum value of 1000.
    */
  var Throughput: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the volume.
    */
  var VolumeId: typings.awsSdk.clientsEc2Mod.VolumeId
  
  /**
    * The target EBS volume type of the volume. For more information, see Amazon EBS volume types in the Amazon Elastic Compute Cloud User Guide. Default: The existing type is retained.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.clientsEc2Mod.VolumeType] = js.undefined
}
object ModifyVolumeRequest {
  
  inline def apply(VolumeId: VolumeId): ModifyVolumeRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVolumeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyVolumeRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setMultiAttachEnabled(value: Boolean): Self = StObject.set(x, "MultiAttachEnabled", value.asInstanceOf[js.Any])
    
    inline def setMultiAttachEnabledUndefined: Self = StObject.set(x, "MultiAttachEnabled", js.undefined)
    
    inline def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setThroughput(value: Integer): Self = StObject.set(x, "Throughput", value.asInstanceOf[js.Any])
    
    inline def setThroughputUndefined: Self = StObject.set(x, "Throughput", js.undefined)
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
