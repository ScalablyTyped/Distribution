package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReplaceRootVolumeTaskRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. If you do not specify a client token, a randomly generated token is used for the request to ensure idempotency. For more information, see Ensuring idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to automatically delete the original root volume after the root volume replacement task completes. To delete the original root volume, specify true. If you choose to keep the original root volume after the replacement task completes, you must manually delete it when you no longer need it.
    */
  var DeleteReplacedRootVolume: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AMI to use to restore the root volume. The specified AMI must have the same product code, billing information, architecture type, and virtualization type as that of the instance. If you want to restore the replacement volume from a specific snapshot, or if you want to restore it to its launch state, omit this parameter.
    */
  var ImageId: js.UndefOr[typings.awsSdk.clientsEc2Mod.ImageId] = js.undefined
  
  /**
    * The ID of the instance for which to replace the root volume.
    */
  var InstanceId: typings.awsSdk.clientsEc2Mod.InstanceId
  
  /**
    * The ID of the snapshot from which to restore the replacement root volume. The specified snapshot must be a snapshot that you previously created from the original root volume. If you want to restore the replacement root volume to the initial launch state, or if you want to restore the replacement root volume from an AMI, omit this parameter.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.clientsEc2Mod.SnapshotId] = js.undefined
  
  /**
    * The tags to apply to the root volume replacement task.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateReplaceRootVolumeTaskRequest {
  
  inline def apply(InstanceId: InstanceId): CreateReplaceRootVolumeTaskRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReplaceRootVolumeTaskRequest]
  }
  
  extension [Self <: CreateReplaceRootVolumeTaskRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDeleteReplacedRootVolume(value: Boolean): Self = StObject.set(x, "DeleteReplacedRootVolume", value.asInstanceOf[js.Any])
    
    inline def setDeleteReplacedRootVolumeUndefined: Self = StObject.set(x, "DeleteReplacedRootVolume", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
