package typings.awsSdk.backupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChunksInput extends StObject {
  
  /**
    * Maximum number of chunks
    */
  var MaxResults: js.UndefOr[typings.awsSdk.backupstorageMod.MaxResults] = js.undefined
  
  /**
    * Pagination token
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Object token
    */
  var ObjectToken: String
  
  /**
    * Storage job id
    */
  var StorageJobId: String
}
object ListChunksInput {
  
  inline def apply(ObjectToken: String, StorageJobId: String): ListChunksInput = {
    val __obj = js.Dynamic.literal(ObjectToken = ObjectToken.asInstanceOf[js.Any], StorageJobId = StorageJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChunksInput]
  }
  
  extension [Self <: ListChunksInput](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setObjectToken(value: String): Self = StObject.set(x, "ObjectToken", value.asInstanceOf[js.Any])
    
    inline def setStorageJobId(value: String): Self = StObject.set(x, "StorageJobId", value.asInstanceOf[js.Any])
  }
}
