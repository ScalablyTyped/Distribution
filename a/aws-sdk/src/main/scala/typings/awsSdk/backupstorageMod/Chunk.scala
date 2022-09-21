package typings.awsSdk.backupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunk extends StObject {
  
  /**
    * Chunk checksum
    */
  var Checksum: String
  
  /**
    * Checksum algorithm
    */
  var ChecksumAlgorithm: DataChecksumAlgorithm
  
  /**
    * Chunk token
    */
  var ChunkToken: String
  
  /**
    * Chunk index
    */
  var Index: long
  
  /**
    * Chunk length
    */
  var Length: long
}
object Chunk {
  
  inline def apply(
    Checksum: String,
    ChecksumAlgorithm: DataChecksumAlgorithm,
    ChunkToken: String,
    Index: long,
    Length: long
  ): Chunk = {
    val __obj = js.Dynamic.literal(Checksum = Checksum.asInstanceOf[js.Any], ChecksumAlgorithm = ChecksumAlgorithm.asInstanceOf[js.Any], ChunkToken = ChunkToken.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Length = Length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chunk]
  }
  
  extension [Self <: Chunk](x: Self) {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "Checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithm(value: DataChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChunkToken(value: String): Self = StObject.set(x, "ChunkToken", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: long): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setLength(value: long): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
  }
}
