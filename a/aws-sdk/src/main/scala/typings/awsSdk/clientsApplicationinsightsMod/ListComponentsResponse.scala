package typings.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentsResponse extends StObject {
  
  /**
    * The list of application components.
    */
  var ApplicationComponentList: js.UndefOr[typings.awsSdk.clientsApplicationinsightsMod.ApplicationComponentList] = js.undefined
  
  /**
    * The token to request the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListComponentsResponse {
  
  inline def apply(): ListComponentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListComponentsResponse]
  }
  
  extension [Self <: ListComponentsResponse](x: Self) {
    
    inline def setApplicationComponentList(value: ApplicationComponentList): Self = StObject.set(x, "ApplicationComponentList", value.asInstanceOf[js.Any])
    
    inline def setApplicationComponentListUndefined: Self = StObject.set(x, "ApplicationComponentList", js.undefined)
    
    inline def setApplicationComponentListVarargs(value: ApplicationComponent*): Self = StObject.set(x, "ApplicationComponentList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
