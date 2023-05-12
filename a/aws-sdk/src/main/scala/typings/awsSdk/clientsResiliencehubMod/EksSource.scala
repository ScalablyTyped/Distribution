package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksSource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Elastic Kubernetes Service cluster. The format for this ARN is: arn:aws:eks:region:account-id:cluster/cluster-name. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var eksClusterArn: Arn
  
  /**
    * The list of namespaces located on your Amazon Elastic Kubernetes Service cluster.
    */
  var namespaces: EksNamespaceList
}
object EksSource {
  
  inline def apply(eksClusterArn: Arn, namespaces: EksNamespaceList): EksSource = {
    val __obj = js.Dynamic.literal(eksClusterArn = eksClusterArn.asInstanceOf[js.Any], namespaces = namespaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[EksSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksSource] (val x: Self) extends AnyVal {
    
    inline def setEksClusterArn(value: Arn): Self = StObject.set(x, "eksClusterArn", value.asInstanceOf[js.Any])
    
    inline def setNamespaces(value: EksNamespaceList): Self = StObject.set(x, "namespaces", value.asInstanceOf[js.Any])
    
    inline def setNamespacesVarargs(value: EksNamespace*): Self = StObject.set(x, "namespaces", js.Array(value*))
  }
}
