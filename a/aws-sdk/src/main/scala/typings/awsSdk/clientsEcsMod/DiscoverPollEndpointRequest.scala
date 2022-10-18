package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverPollEndpointRequest extends StObject {
  
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that the container instance belongs to.
    */
  var cluster: js.UndefOr[String] = js.undefined
  
  /**
    * The container instance ID or full ARN of the container instance. For more information about the ARN format, see Amazon Resource Name (ARN) in the Amazon ECS Developer Guide.
    */
  var containerInstance: js.UndefOr[String] = js.undefined
}
object DiscoverPollEndpointRequest {
  
  inline def apply(): DiscoverPollEndpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverPollEndpointRequest]
  }
  
  extension [Self <: DiscoverPollEndpointRequest](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setContainerInstance(value: String): Self = StObject.set(x, "containerInstance", value.asInstanceOf[js.Any])
    
    inline def setContainerInstanceUndefined: Self = StObject.set(x, "containerInstance", js.undefined)
  }
}
