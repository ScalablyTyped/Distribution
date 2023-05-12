package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSourceRepositoryBranchesResponse extends StObject {
  
  /**
    * Information about the source branches.
    */
  var items: ListSourceRepositoryBranchesItems
  
  /**
    * A token returned from a call to this API to indicate the next batch of results to return, if any.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListSourceRepositoryBranchesResponse {
  
  inline def apply(items: ListSourceRepositoryBranchesItems): ListSourceRepositoryBranchesResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSourceRepositoryBranchesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSourceRepositoryBranchesResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ListSourceRepositoryBranchesItems): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ListSourceRepositoryBranchesItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
