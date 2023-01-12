package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNamespacesResponse extends StObject {
  
  /**
    * The list of returned namespaces.
    */
  var namespaces: NamespaceList
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListNamespacesResponse {
  
  inline def apply(namespaces: NamespaceList): ListNamespacesResponse = {
    val __obj = js.Dynamic.literal(namespaces = namespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNamespacesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNamespacesResponse] (val x: Self) extends AnyVal {
    
    inline def setNamespaces(value: NamespaceList): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesVarargs(value: Namespace*): Self = StObject.set(x, "namespaces", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
