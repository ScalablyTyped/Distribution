package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopySnapshotRequest extends StObject {
  
  /**
    * The ID of the KMS key used to encrypt the target snapshot.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsMemorydbMod.KmsKeyId] = js.undefined
  
  /**
    * The name of an existing snapshot from which to make a copy.
    */
  var SourceSnapshotName: String
  
  /**
    * A list of tags to be added to this resource. A tag is a key-value pair. A tag key must be accompanied by a tag value, although null is accepted.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The Amazon S3 bucket to which the snapshot is exported. This parameter is used only when exporting a snapshot for external access. When using this parameter to export a snapshot, be sure MemoryDB has the needed permissions to this S3 bucket. For more information, see Step 2: Grant MemoryDB Access to Your Amazon S3 Bucket. 
    */
  var TargetBucket: js.UndefOr[typings.awsSdk.clientsMemorydbMod.TargetBucket] = js.undefined
  
  /**
    * A name for the snapshot copy. MemoryDB does not permit overwriting a snapshot, therefore this name must be unique within its context - MemoryDB or an Amazon S3 bucket if exporting.
    */
  var TargetSnapshotName: String
}
object CopySnapshotRequest {
  
  inline def apply(SourceSnapshotName: String, TargetSnapshotName: String): CopySnapshotRequest = {
    val __obj = js.Dynamic.literal(SourceSnapshotName = SourceSnapshotName.asInstanceOf[js.Any], TargetSnapshotName = TargetSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopySnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopySnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setSourceSnapshotName(value: String): Self = StObject.set(x, "SourceSnapshotName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetBucket(value: TargetBucket): Self = StObject.set(x, "TargetBucket", value.asInstanceOf[js.Any])
    
    inline def setTargetBucketUndefined: Self = StObject.set(x, "TargetBucket", js.undefined)
    
    inline def setTargetSnapshotName(value: String): Self = StObject.set(x, "TargetSnapshotName", value.asInstanceOf[js.Any])
  }
}
