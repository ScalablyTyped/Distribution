package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutClusterPolicyRequest extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: string
  
  /**
    * 
    The policy version.
    
    */
  var CurrentVersion: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The policy.
    
    */
  var Policy: string
}
object PutClusterPolicyRequest {
  
  inline def apply(ClusterArn: string, Policy: string): PutClusterPolicyRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutClusterPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutClusterPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setClusterArn(value: string): Self = StObject.set(x, "ClusterArn", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersion(value: string): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    inline def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    inline def setPolicy(value: string): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
