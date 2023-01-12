package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInputRoutingsResponse extends StObject {
  
  /**
    *  The token that you can use to return the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  Summary information about the routed resources. 
    */
  var routedResources: js.UndefOr[RoutedResources] = js.undefined
}
object ListInputRoutingsResponse {
  
  inline def apply(): ListInputRoutingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputRoutingsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInputRoutingsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRoutedResources(value: RoutedResources): Self = StObject.set(x, "routedResources", value.asInstanceOf[js.Any])
    
    inline def setRoutedResourcesUndefined: Self = StObject.set(x, "routedResources", js.undefined)
    
    inline def setRoutedResourcesVarargs(value: RoutedResource*): Self = StObject.set(x, "routedResources", js.Array(value*))
  }
}
