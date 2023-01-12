package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBatchJobDefinitionsResponse extends StObject {
  
  /**
    * The list of batch job definitions.
    */
  var batchJobDefinitions: BatchJobDefinitions
  
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBatchJobDefinitionsResponse {
  
  inline def apply(batchJobDefinitions: BatchJobDefinitions): ListBatchJobDefinitionsResponse = {
    val __obj = js.Dynamic.literal(batchJobDefinitions = batchJobDefinitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBatchJobDefinitionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBatchJobDefinitionsResponse] (val x: Self) extends AnyVal {
    
    inline def setBatchJobDefinitions(value: BatchJobDefinitions): Self = StObject.set(x, "batchJobDefinitions", value.asInstanceOf[js.Any])
    
    inline def setBatchJobDefinitionsVarargs(value: BatchJobDefinition*): Self = StObject.set(x, "batchJobDefinitions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
