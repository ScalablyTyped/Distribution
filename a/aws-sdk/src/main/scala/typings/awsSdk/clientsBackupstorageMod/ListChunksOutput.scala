package typings.awsSdk.clientsBackupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChunksOutput extends StObject {
  
  /**
    * List of chunks
    */
  var ChunkList: typings.awsSdk.clientsBackupstorageMod.ChunkList
  
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListChunksOutput {
  
  inline def apply(ChunkList: ChunkList): ListChunksOutput = {
    val __obj = js.Dynamic.literal(ChunkList = ChunkList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChunksOutput]
  }
  
  extension [Self <: ListChunksOutput](x: Self) {
    
    inline def setChunkList(value: ChunkList): Self = StObject.set(x, "ChunkList", value.asInstanceOf[js.Any])
    
    inline def setChunkListVarargs(value: Chunk*): Self = StObject.set(x, "ChunkList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
