package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNamespacesRequest extends StObject {
  
  /**
    * An optional parameter that specifies the maximum number of results to return. You can use nextToken to get the next page of results.
    */
  var maxResults: js.UndefOr[ListNamespacesRequestMaxResultsInteger] = js.undefined
  
  /**
    * If your initial ListNamespaces operation returns a nextToken, you can include the returned nextToken in subsequent ListNamespaces operations, which returns results in the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListNamespacesRequest {
  
  inline def apply(): ListNamespacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNamespacesRequest]
  }
  
  extension [Self <: ListNamespacesRequest](x: Self) {
    
    inline def setMaxResults(value: ListNamespacesRequestMaxResultsInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
