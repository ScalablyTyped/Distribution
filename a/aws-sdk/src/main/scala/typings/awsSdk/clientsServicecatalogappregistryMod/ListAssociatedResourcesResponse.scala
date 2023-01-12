package typings.awsSdk.clientsServicecatalogappregistryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAssociatedResourcesResponse extends StObject {
  
  /**
    * The token to use to get the next page of results after a previous API call. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Information about the resources.
    */
  var resources: js.UndefOr[Resources] = js.undefined
}
object ListAssociatedResourcesResponse {
  
  inline def apply(): ListAssociatedResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociatedResourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAssociatedResourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResources(value: Resources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: ResourceInfo*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
