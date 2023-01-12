package typings.awsSdk.clientsBackupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyObjectCompleteInput extends StObject {
  
  /**
    * Backup job Id for the in-progress backup
    */
  var BackupJobId: String
  
  /**
    * Optional metadata associated with an Object. Maximum length is 4MB.
    */
  var MetadataBlob: js.UndefOr[PayloadBlob] = js.undefined
  
  /**
    * Checksum of MetadataBlob.
    */
  var MetadataBlobChecksum: js.UndefOr[String] = js.undefined
  
  /**
    * Checksum algorithm.
    */
  var MetadataBlobChecksumAlgorithm: js.UndefOr[DataChecksumAlgorithm] = js.undefined
  
  /**
    * The size of MetadataBlob.
    */
  var MetadataBlobLength: js.UndefOr[long] = js.undefined
  
  /**
    * Optional metadata associated with an Object. Maximum string length is 256 bytes.
    */
  var MetadataString: js.UndefOr[typings.awsSdk.clientsBackupstorageMod.MetadataString] = js.undefined
  
  /**
    * Object checksum
    */
  var ObjectChecksum: String
  
  /**
    * Checksum algorithm
    */
  var ObjectChecksumAlgorithm: SummaryChecksumAlgorithm
  
  /**
    * Upload Id for the in-progress upload
    */
  var UploadId: String
}
object NotifyObjectCompleteInput {
  
  inline def apply(
    BackupJobId: String,
    ObjectChecksum: String,
    ObjectChecksumAlgorithm: SummaryChecksumAlgorithm,
    UploadId: String
  ): NotifyObjectCompleteInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId.asInstanceOf[js.Any], ObjectChecksum = ObjectChecksum.asInstanceOf[js.Any], ObjectChecksumAlgorithm = ObjectChecksumAlgorithm.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyObjectCompleteInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NotifyObjectCompleteInput] (val x: Self) extends AnyVal {
    
    inline def setBackupJobId(value: String): Self = StObject.set(x, "BackupJobId", value.asInstanceOf[js.Any])
    
    inline def setMetadataBlob(value: PayloadBlob): Self = StObject.set(x, "MetadataBlob", value.asInstanceOf[js.Any])
    
    inline def setMetadataBlobChecksum(value: String): Self = StObject.set(x, "MetadataBlobChecksum", value.asInstanceOf[js.Any])
    
    inline def setMetadataBlobChecksumAlgorithm(value: DataChecksumAlgorithm): Self = StObject.set(x, "MetadataBlobChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setMetadataBlobChecksumAlgorithmUndefined: Self = StObject.set(x, "MetadataBlobChecksumAlgorithm", js.undefined)
    
    inline def setMetadataBlobChecksumUndefined: Self = StObject.set(x, "MetadataBlobChecksum", js.undefined)
    
    inline def setMetadataBlobLength(value: long): Self = StObject.set(x, "MetadataBlobLength", value.asInstanceOf[js.Any])
    
    inline def setMetadataBlobLengthUndefined: Self = StObject.set(x, "MetadataBlobLength", js.undefined)
    
    inline def setMetadataBlobUndefined: Self = StObject.set(x, "MetadataBlob", js.undefined)
    
    inline def setMetadataString(value: MetadataString): Self = StObject.set(x, "MetadataString", value.asInstanceOf[js.Any])
    
    inline def setMetadataStringUndefined: Self = StObject.set(x, "MetadataString", js.undefined)
    
    inline def setObjectChecksum(value: String): Self = StObject.set(x, "ObjectChecksum", value.asInstanceOf[js.Any])
    
    inline def setObjectChecksumAlgorithm(value: SummaryChecksumAlgorithm): Self = StObject.set(x, "ObjectChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: String): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
  }
}
