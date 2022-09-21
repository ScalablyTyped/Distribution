package typings.awsSdk.backupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChunkInput extends StObject {
  
  /**
    * Chunk token
    */
  var ChunkToken: String
  
  /**
    * Storage job id
    */
  var StorageJobId: String
}
object GetChunkInput {
  
  inline def apply(ChunkToken: String, StorageJobId: String): GetChunkInput = {
    val __obj = js.Dynamic.literal(ChunkToken = ChunkToken.asInstanceOf[js.Any], StorageJobId = StorageJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetChunkInput]
  }
  
  extension [Self <: GetChunkInput](x: Self) {
    
    inline def setChunkToken(value: String): Self = StObject.set(x, "ChunkToken", value.asInstanceOf[js.Any])
    
    inline def setStorageJobId(value: String): Self = StObject.set(x, "StorageJobId", value.asInstanceOf[js.Any])
  }
}
