package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon EKS cluster. An example is arn:aws:eks:us-east-1:123456789012:cluster/ClusterForBatch . 
    */
  var eksClusterArn: String
  
  /**
    * The namespace of the Amazon EKS cluster. Batch manages pods in this namespace. The value can't left empty or null. It must be fewer than 64 characters long, can't be set to default, can't start with "kube-," and must match this regular expression: ^[a-z0-9]([-a-z0-9]*[a-z0-9])?$. For more information, see Namespaces in the Kubernetes documentation.
    */
  var kubernetesNamespace: String
}
object EksConfiguration {
  
  inline def apply(eksClusterArn: String, kubernetesNamespace: String): EksConfiguration = {
    val __obj = js.Dynamic.literal(eksClusterArn = eksClusterArn.asInstanceOf[js.Any], kubernetesNamespace = kubernetesNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[EksConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEksClusterArn(value: String): Self = StObject.set(x, "eksClusterArn", value.asInstanceOf[js.Any])
    
    inline def setKubernetesNamespace(value: String): Self = StObject.set(x, "kubernetesNamespace", value.asInstanceOf[js.Any])
  }
}
