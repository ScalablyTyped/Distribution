package typings.awsSdk.backupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectOutput extends StObject {
  
  /**
    * Inline chunk checksum
    */
  var InlineChunkChecksum: String
  
  /**
    * Inline chunk checksum algorithm
    */
  var InlineChunkChecksumAlgorithm: DataChecksumAlgorithm
  
  /**
    * object checksum
    */
  var ObjectChecksum: String
  
  /**
    * object checksum algorithm
    */
  var ObjectChecksumAlgorithm: SummaryChecksumAlgorithm
}
object PutObjectOutput {
  
  inline def apply(
    InlineChunkChecksum: String,
    InlineChunkChecksumAlgorithm: DataChecksumAlgorithm,
    ObjectChecksum: String,
    ObjectChecksumAlgorithm: SummaryChecksumAlgorithm
  ): PutObjectOutput = {
    val __obj = js.Dynamic.literal(InlineChunkChecksum = InlineChunkChecksum.asInstanceOf[js.Any], InlineChunkChecksumAlgorithm = InlineChunkChecksumAlgorithm.asInstanceOf[js.Any], ObjectChecksum = ObjectChecksum.asInstanceOf[js.Any], ObjectChecksumAlgorithm = ObjectChecksumAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectOutput]
  }
  
  extension [Self <: PutObjectOutput](x: Self) {
    
    inline def setInlineChunkChecksum(value: String): Self = StObject.set(x, "InlineChunkChecksum", value.asInstanceOf[js.Any])
    
    inline def setInlineChunkChecksumAlgorithm(value: DataChecksumAlgorithm): Self = StObject.set(x, "InlineChunkChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setObjectChecksum(value: String): Self = StObject.set(x, "ObjectChecksum", value.asInstanceOf[js.Any])
    
    inline def setObjectChecksumAlgorithm(value: SummaryChecksumAlgorithm): Self = StObject.set(x, "ObjectChecksumAlgorithm", value.asInstanceOf[js.Any])
  }
}
