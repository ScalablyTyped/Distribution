package typings.awsSdk.backupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectInput extends StObject {
  
  /**
    * Backup job Id for the in-progress backup.
    */
  var BackupJobId: String
  
  /**
    * Inline chunk data to be uploaded.
    */
  var InlineChunk: js.UndefOr[PayloadBlob] = js.undefined
  
  /**
    * Inline chunk checksum
    */
  var InlineChunkChecksum: js.UndefOr[String] = js.undefined
  
  /**
    * Inline chunk checksum algorithm
    */
  var InlineChunkChecksumAlgorithm: js.UndefOr[String] = js.undefined
  
  /**
    * Length of the inline chunk data.
    */
  var InlineChunkLength: js.UndefOr[long] = js.undefined
  
  /**
    * Store user defined metadata like backup checksum, disk ids, restore metadata etc.
    */
  var MetadataString: js.UndefOr[String] = js.undefined
  
  /**
    * object checksum
    */
  var ObjectChecksum: js.UndefOr[String] = js.undefined
  
  /**
    * object checksum algorithm
    */
  var ObjectChecksumAlgorithm: js.UndefOr[SummaryChecksumAlgorithm] = js.undefined
  
  /**
    * The name of the Object to be uploaded.
    */
  var ObjectName: String
  
  /**
    * Throw an exception if Object name is already exist.
    */
  var ThrowOnDuplicate: js.UndefOr[Boolean] = js.undefined
}
object PutObjectInput {
  
  inline def apply(BackupJobId: String, ObjectName: String): PutObjectInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId.asInstanceOf[js.Any], ObjectName = ObjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectInput]
  }
  
  extension [Self <: PutObjectInput](x: Self) {
    
    inline def setBackupJobId(value: String): Self = StObject.set(x, "BackupJobId", value.asInstanceOf[js.Any])
    
    inline def setInlineChunk(value: PayloadBlob): Self = StObject.set(x, "InlineChunk", value.asInstanceOf[js.Any])
    
    inline def setInlineChunkChecksum(value: String): Self = StObject.set(x, "InlineChunkChecksum", value.asInstanceOf[js.Any])
    
    inline def setInlineChunkChecksumAlgorithm(value: String): Self = StObject.set(x, "InlineChunkChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setInlineChunkChecksumAlgorithmUndefined: Self = StObject.set(x, "InlineChunkChecksumAlgorithm", js.undefined)
    
    inline def setInlineChunkChecksumUndefined: Self = StObject.set(x, "InlineChunkChecksum", js.undefined)
    
    inline def setInlineChunkLength(value: long): Self = StObject.set(x, "InlineChunkLength", value.asInstanceOf[js.Any])
    
    inline def setInlineChunkLengthUndefined: Self = StObject.set(x, "InlineChunkLength", js.undefined)
    
    inline def setInlineChunkUndefined: Self = StObject.set(x, "InlineChunk", js.undefined)
    
    inline def setMetadataString(value: String): Self = StObject.set(x, "MetadataString", value.asInstanceOf[js.Any])
    
    inline def setMetadataStringUndefined: Self = StObject.set(x, "MetadataString", js.undefined)
    
    inline def setObjectChecksum(value: String): Self = StObject.set(x, "ObjectChecksum", value.asInstanceOf[js.Any])
    
    inline def setObjectChecksumAlgorithm(value: SummaryChecksumAlgorithm): Self = StObject.set(x, "ObjectChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setObjectChecksumAlgorithmUndefined: Self = StObject.set(x, "ObjectChecksumAlgorithm", js.undefined)
    
    inline def setObjectChecksumUndefined: Self = StObject.set(x, "ObjectChecksum", js.undefined)
    
    inline def setObjectName(value: String): Self = StObject.set(x, "ObjectName", value.asInstanceOf[js.Any])
    
    inline def setThrowOnDuplicate(value: Boolean): Self = StObject.set(x, "ThrowOnDuplicate", value.asInstanceOf[js.Any])
    
    inline def setThrowOnDuplicateUndefined: Self = StObject.set(x, "ThrowOnDuplicate", js.undefined)
  }
}
