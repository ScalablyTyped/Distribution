package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTableStorageOptimizersResponse extends StObject {
  
  /**
    * A continuation token for paginating the returned list of tokens, returned if the current segment of the list is not the last.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * A list of the storage optimizers associated with a table.
    */
  var StorageOptimizerList: js.UndefOr[typings.awsSdk.clientsLakeformationMod.StorageOptimizerList] = js.undefined
}
object ListTableStorageOptimizersResponse {
  
  inline def apply(): ListTableStorageOptimizersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTableStorageOptimizersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTableStorageOptimizersResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStorageOptimizerList(value: StorageOptimizerList): Self = StObject.set(x, "StorageOptimizerList", value.asInstanceOf[js.Any])
    
    inline def setStorageOptimizerListUndefined: Self = StObject.set(x, "StorageOptimizerList", js.undefined)
    
    inline def setStorageOptimizerListVarargs(value: StorageOptimizer*): Self = StObject.set(x, "StorageOptimizerList", js.Array(value*))
  }
}
