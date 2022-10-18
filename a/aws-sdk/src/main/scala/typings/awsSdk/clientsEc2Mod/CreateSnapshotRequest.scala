package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotRequest extends StObject {
  
  /**
    * A description for the snapshot.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Outpost on which to create a local snapshot.   To create a snapshot of a volume in a Region, omit this parameter. The snapshot is created in the same Region as the volume.   To create a snapshot of a volume on an Outpost and store the snapshot in the Region, omit this parameter. The snapshot is created in the Region for the Outpost.   To create a snapshot of a volume on an Outpost and store the snapshot on an Outpost, specify the ARN of the destination Outpost. The snapshot must be created on the same Outpost as the volume.   For more information, see Create local snapshots from volumes on an Outpost in the Amazon Elastic Compute Cloud User Guide.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The tags to apply to the snapshot during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The ID of the Amazon EBS volume.
    */
  var VolumeId: typings.awsSdk.clientsEc2Mod.VolumeId
}
object CreateSnapshotRequest {
  
  inline def apply(VolumeId: VolumeId): CreateSnapshotRequest = {
    val __obj = js.Dynamic.literal(VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotRequest]
  }
  
  extension [Self <: CreateSnapshotRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
