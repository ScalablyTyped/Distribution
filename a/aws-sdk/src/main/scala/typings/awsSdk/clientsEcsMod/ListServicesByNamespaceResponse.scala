package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServicesByNamespaceResponse extends StObject {
  
  /**
    * The nextToken value to include in a future ListServicesByNamespace request. When the results of a ListServicesByNamespace request exceed maxResults, this value can be used to retrieve the next page of results. When there are no more results to return, this value is null.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of full ARN entries for each service that's associated with the specified namespace.
    */
  var serviceArns: js.UndefOr[StringList] = js.undefined
}
object ListServicesByNamespaceResponse {
  
  inline def apply(): ListServicesByNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServicesByNamespaceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServicesByNamespaceResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setServiceArns(value: StringList): Self = StObject.set(x, "serviceArns", value.asInstanceOf[js.Any])
    
    inline def setServiceArnsUndefined: Self = StObject.set(x, "serviceArns", js.undefined)
    
    inline def setServiceArnsVarargs(value: String*): Self = StObject.set(x, "serviceArns", js.Array(value*))
  }
}
