package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNamespacesResponse extends StObject {
  
  /**
    * An array that contains one NamespaceSummary object for each namespace that matches the specified filter criteria.
    */
  var Namespaces: js.UndefOr[NamespaceSummariesList] = js.undefined
  
  /**
    * If the response contains NextToken, submit another ListNamespaces request to get the next group of results. Specify the value of NextToken from the previous response in the next request.  Cloud Map gets MaxResults namespaces and then filters them based on the specified criteria. It's possible that no namespaces in the first MaxResults namespaces matched the specified criteria but that subsequent groups of MaxResults namespaces do contain namespaces that match the criteria. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.NextToken] = js.undefined
}
object ListNamespacesResponse {
  
  inline def apply(): ListNamespacesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNamespacesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNamespacesResponse] (val x: Self) extends AnyVal {
    
    inline def setNamespaces(value: NamespaceSummariesList): Self = StObject.set(x, "Namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesUndefined: Self = StObject.set(x, "Namespaces", js.undefined)
    
    inline def setNamespacesVarargs(value: NamespaceSummary*): Self = StObject.set(x, "Namespaces", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
