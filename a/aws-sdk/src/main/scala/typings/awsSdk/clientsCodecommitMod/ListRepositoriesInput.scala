package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRepositoriesInput extends StObject {
  
  /**
    * An enumeration token that allows the operation to batch the results of the operation. Batch sizes are 1,000 for list repository operations. When the client sends the token back to AWS CodeCommit, another page of 1,000 records is retrieved.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The order in which to sort the results of a list repositories operation.
    */
  var order: js.UndefOr[OrderEnum] = js.undefined
  
  /**
    * The criteria used to sort the results of a list repositories operation.
    */
  var sortBy: js.UndefOr[SortByEnum] = js.undefined
}
object ListRepositoriesInput {
  
  inline def apply(): ListRepositoriesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRepositoriesInput] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOrder(value: OrderEnum): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setSortBy(value: SortByEnum): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
