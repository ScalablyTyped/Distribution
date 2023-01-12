package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourceSetResourcesResponse extends StObject {
  
  /**
    * An array of the associated resources' uniform resource identifiers (URI).
    */
  var Items: ResourceList
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListResourceSetResourcesResponse {
  
  inline def apply(Items: ResourceList): ListResourceSetResourcesResponse = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourceSetResourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListResourceSetResourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ResourceList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Resource*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
