package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServicesByNamespaceRequest extends StObject {
  
  /**
    * The maximum number of service results that ListServicesByNamespace returns in paginated output. When this parameter is used, ListServicesByNamespace only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListServicesByNamespace request with the returned nextToken value. This value can be between 1 and 100. If this parameter isn't used, then ListServicesByNamespace returns up to 10 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace to list the services in. Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported with Service Connect. For more information, see Service Connect in the Amazon Elastic Container Service Developer Guide.
    */
  var namespace: String
  
  /**
    * The nextToken value that's returned from a ListServicesByNamespace request. It indicates that more results are available to fulfill the request and further calls are needed. If maxResults is returned, it is possible the number of results is less than maxResults.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListServicesByNamespaceRequest {
  
  inline def apply(namespace: String): ListServicesByNamespaceRequest = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServicesByNamespaceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServicesByNamespaceRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: BoxedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
