package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterServiceConnectDefaultsRequest extends StObject {
  
  /**
    * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace that's used when you create a service and don't specify a Service Connect configuration. The namespace name can include up to 1024 characters. The name is case-sensitive. The name can't include hyphens (-), tilde (~), greater than (&gt;), less than (&lt;), or slash (/). If you enter an existing namespace name or ARN, then that namespace will be used. Any namespace type is supported. The namespace must be in this account and this Amazon Web Services Region. If you enter a new name, a Cloud Map namespace will be created. Amazon ECS creates a Cloud Map namespace with the "API calls" method of instance discovery only. This instance discovery method is the "HTTP" namespace type in the Command Line Interface. Other types of instance discovery aren't used by Service Connect. If you update the service with an empty string "" for the namespace name, the cluster configuration for Service Connect is removed. Note that the namespace will remain in Cloud Map and must be deleted separately. For more information about Cloud Map, see Working with Services in the Cloud Map Developer Guide.
    */
  var namespace: String
}
object ClusterServiceConnectDefaultsRequest {
  
  inline def apply(namespace: String): ClusterServiceConnectDefaultsRequest = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterServiceConnectDefaultsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterServiceConnectDefaultsRequest] (val x: Self) extends AnyVal {
    
    inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
