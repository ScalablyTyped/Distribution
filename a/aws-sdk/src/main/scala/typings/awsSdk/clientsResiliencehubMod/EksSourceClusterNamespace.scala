package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EksSourceClusterNamespace extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Elastic Kubernetes Service cluster. The format for this ARN is: arn:aws:eks:region:account-id:cluster/cluster-name. For more information about ARNs, see  Amazon Resource Names (ARNs) in the AWS General Reference guide.
    */
  var eksClusterArn: Arn
  
  /**
    * Name of the namespace that is located on your Amazon Elastic Kubernetes Service cluster.
    */
  var namespace: EksNamespace
}
object EksSourceClusterNamespace {
  
  inline def apply(eksClusterArn: Arn, namespace: EksNamespace): EksSourceClusterNamespace = {
    val __obj = js.Dynamic.literal(eksClusterArn = eksClusterArn.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[EksSourceClusterNamespace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EksSourceClusterNamespace] (val x: Self) extends AnyVal {
    
    inline def setEksClusterArn(value: Arn): Self = StObject.set(x, "eksClusterArn", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: EksNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
