package typings.awsSdk.clientsBackupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutChunkInput extends StObject {
  
  /**
    * Backup job Id for the in-progress backup.
    */
  var BackupJobId: String
  
  /**
    * Data checksum
    */
  var Checksum: String
  
  /**
    * Checksum algorithm
    */
  var ChecksumAlgorithm: DataChecksumAlgorithm
  
  /**
    * Describes this chunk's position relative to the other chunks
    */
  var ChunkIndex: long
  
  /**
    * Data to be uploaded
    */
  var Data: PayloadBlob
  
  /**
    * Data length
    */
  var Length: long
  
  /**
    * Upload Id for the in-progress upload.
    */
  var UploadId: String
}
object PutChunkInput {
  
  inline def apply(
    BackupJobId: String,
    Checksum: String,
    ChecksumAlgorithm: DataChecksumAlgorithm,
    ChunkIndex: long,
    Data: PayloadBlob,
    Length: long,
    UploadId: String
  ): PutChunkInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId.asInstanceOf[js.Any], Checksum = Checksum.asInstanceOf[js.Any], ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any], ChunkIndex = ChunkIndex.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutChunkInput]
  }
  
  extension [Self <: PutChunkInput](x: Self) {
    
    inline def setBackupJobId(value: String): Self = StObject.set(x, "BackupJobId", value.asInstanceOf[js.Any])
    
    inline def setChecksum(value: String): Self = StObject.set(x, "Checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithm(value: DataChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChunkIndex(value: long): Self = StObject.set(x, "ChunkIndex", value.asInstanceOf[js.Any])
    
    inline def setData(value: PayloadBlob): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setLength(value: long): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
    
    inline def setUploadId(value: String): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
  }
}
