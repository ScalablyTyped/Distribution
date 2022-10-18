package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContainerAgentRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that your container instance is running on. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * The container instance ID or full ARN entries for the container instance where you would like to update the Amazon ECS container agent.
    */
  var containerInstance: String
}
object UpdateContainerAgentRequest {
  
  inline def apply(containerInstance: String): UpdateContainerAgentRequest = {
    val __obj = js.Dynamic.literal(containerInstance = containerInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContainerAgentRequest]
  }
  
  extension [Self <: UpdateContainerAgentRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setContainerInstance(value: String): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
  }
}
