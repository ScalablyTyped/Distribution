package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterPolicyRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: string
}
object GetClusterPolicyRequest {
  
  inline def apply(ClusterArn: string): GetClusterPolicyRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClusterPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
  }
}
