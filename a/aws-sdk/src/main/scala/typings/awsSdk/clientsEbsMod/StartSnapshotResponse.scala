package typings.awsSdk.clientsEbsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSnapshotResponse extends StObject {
  
  /**
    * The size of the blocks in the snapshot, in bytes.
    */
  var BlockSize: js.UndefOr[typings.awsSdk.clientsEbsMod.BlockSize] = js.undefined
  
  /**
    * The description of the snapshot.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsEbsMod.Description] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Key Management Service (KMS) key used to encrypt the snapshot.
    */
  var KmsKeyArn: js.UndefOr[typings.awsSdk.clientsEbsMod.KmsKeyArn] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the snapshot owner.
    */
  var OwnerId: js.UndefOr[typings.awsSdk.clientsEbsMod.OwnerId] = js.undefined
  
  /**
    * The ID of the parent snapshot.
    */
  var ParentSnapshotId: js.UndefOr[SnapshotId] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.clientsEbsMod.SnapshotId] = js.undefined
  
  /**
    * The timestamp when the snapshot was created.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the snapshot.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsEbsMod.Status] = js.undefined
  
  /**
    * The tags applied to the snapshot. You can specify up to 50 tags per snapshot. For more information, see  Tagging your Amazon EC2 resources in the Amazon Elastic Compute Cloud User Guide.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsEbsMod.Tags] = js.undefined
  
  /**
    * The size of the volume, in GiB.
    */
  var VolumeSize: js.UndefOr[typings.awsSdk.clientsEbsMod.VolumeSize] = js.undefined
}
object StartSnapshotResponse {
  
  inline def apply(): StartSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSnapshotResponse]
  }
  
  extension [Self <: StartSnapshotResponse](x: Self) {
    
    inline def setBlockSize(value: BlockSize): Self = StObject.set(x, "BlockSize", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeUndefined: Self = StObject.set(x, "BlockSize", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKmsKeyArn(value: KmsKeyArn): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setOwnerId(value: OwnerId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setParentSnapshotId(value: SnapshotId): Self = StObject.set(x, "ParentSnapshotId", value.asInstanceOf[js.Any])
    
    inline def setParentSnapshotIdUndefined: Self = StObject.set(x, "ParentSnapshotId", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVolumeSize(value: VolumeSize): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
  }
}
