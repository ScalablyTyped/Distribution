package typings.awsSdk.clientsBackupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutChunkOutput extends StObject {
  
  /**
    * Chunk checksum
    */
  var ChunkChecksum: String
  
  /**
    * Checksum algorithm
    */
  var ChunkChecksumAlgorithm: DataChecksumAlgorithm
}
object PutChunkOutput {
  
  inline def apply(ChunkChecksum: String, ChunkChecksumAlgorithm: DataChecksumAlgorithm): PutChunkOutput = {
    val __obj = js.Dynamic.literal(ChunkChecksum = ChunkChecksum.asInstanceOf[js.Any], ChunkChecksumAlgorithm = ChunkChecksumAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutChunkOutput]
  }
  
  extension [Self <: PutChunkOutput](x: Self) {
    
    inline def setChunkChecksum(value: String): Self = StObject.set(x, "ChunkChecksum", value.asInstanceOf[js.Any])
    
    inline def setChunkChecksumAlgorithm(value: DataChecksumAlgorithm): Self = StObject.set(x, "ChunkChecksumAlgorithm", value.asInstanceOf[js.Any])
  }
}
