package typings.awsSdk.backupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChunkOutput extends StObject {
  
  /**
    * Data checksum
    */
  var Checksum: String
  
  /**
    * Checksum algorithm
    */
  var ChecksumAlgorithm: DataChecksumAlgorithm
  
  /**
    * Chunk data
    */
  var Data: PayloadBlob
  
  /**
    * Data length
    */
  var Length: long
}
object GetChunkOutput {
  
  inline def apply(Checksum: String, ChecksumAlgorithm: DataChecksumAlgorithm, Data: PayloadBlob, Length: long): GetChunkOutput = {
    val __obj = js.Dynamic.literal(Checksum = Checksum.asInstanceOf[js.Any], ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any], Data = Data.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChunkOutput]
  }
  
  extension [Self <: GetChunkOutput](x: Self) {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "Checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithm(value: DataChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setData(value: PayloadBlob): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setLength(value: long): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
  }
}
