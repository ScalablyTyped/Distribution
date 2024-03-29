package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterEcsClusterRequest extends StObject {
  
  /**
    * The cluster's Amazon Resource Number (ARN).
    */
  var EcsClusterArn: String
}
object DeregisterEcsClusterRequest {
  
  inline def apply(EcsClusterArn: String): DeregisterEcsClusterRequest = {
    val __obj = js.Dynamic.literal(EcsClusterArn = EcsClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterEcsClusterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeregisterEcsClusterRequest] (val x: Self) extends AnyVal {
    
    inline def setEcsClusterArn(value: String): Self = StObject.set(x, "EcsClusterArn", value.asInstanceOf[js.Any])
  }
}
