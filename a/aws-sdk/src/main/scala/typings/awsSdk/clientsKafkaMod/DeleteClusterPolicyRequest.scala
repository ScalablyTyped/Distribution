package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterPolicyRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: string
}
object DeleteClusterPolicyRequest {
  
  inline def apply(ClusterArn: string): DeleteClusterPolicyRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteClusterPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
  }
}
