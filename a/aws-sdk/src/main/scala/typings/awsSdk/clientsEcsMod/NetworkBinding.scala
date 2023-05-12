package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkBinding extends StObject {
  
  /**
    * The IP address that the container is bound to on the container instance.
    */
  var bindIP: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on the container that's used with the network binding.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The port number range on the container that's bound to the dynamically mapped host port range. The following rules apply when you specify a containerPortRange:   You must use either the bridge network mode or the awsvpc network mode.   This parameter is available for both the EC2 and Fargate launch types.   This parameter is available for both the Linux and Windows operating systems.   The container instance must have at least version 1.67.0 of the container agent and at least version 1.67.0-1 of the ecs-init package    You can specify a maximum of 100 port ranges per container.   You do not specify a hostPortRange. The value of the hostPortRange is set as follows:   For containers in a task with the awsvpc network mode, the hostPort is set to the same value as the containerPort. This is a static mapping strategy.   For containers in a task with the bridge network mode, the Amazon ECS agent finds open host ports from the default ephemeral range and passes it to docker to bind them to the container ports.     The containerPortRange valid values are between 1 and 65535.   A port can only be included in one port mapping per container.   You cannot specify overlapping port ranges.   The first port in the range must be less than last port in the range.   Docker recommends that you turn off the docker-proxy in the Docker daemon config file when you have a large number of ports. For more information, see  Issue #11185 on the Github website. For information about how to turn off the docker-proxy in the Docker daemon config file, see Docker daemon in the Amazon ECS Developer Guide.   You can call  DescribeTasks  to view the hostPortRange which are the host ports that are bound to the container ports.
    */
  var containerPortRange: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on the host that's used with the network binding.
    */
  var hostPort: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The port number range on the host that's used with the network binding. This is assigned is assigned by Docker and delivered by the Amazon ECS agent.
    */
  var hostPortRange: js.UndefOr[String] = js.undefined
  
  /**
    * The protocol used for the network binding.
    */
  var protocol: js.UndefOr[TransportProtocol] = js.undefined
}
object NetworkBinding {
  
  inline def apply(): NetworkBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkBinding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkBinding] (val x: Self) extends AnyVal {
    
    inline def setBindIP(value: String): Self = StObject.set(x, "bindIP", value.asInstanceOf[js.Any])
    
    inline def setBindIPUndefined: Self = StObject.set(x, "bindIP", js.undefined)
    
    inline def setContainerPort(value: BoxedInteger): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortRange(value: String): Self = StObject.set(x, "containerPortRange", value.asInstanceOf[js.Any])
    
    inline def setContainerPortRangeUndefined: Self = StObject.set(x, "containerPortRange", js.undefined)
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    inline def setHostPort(value: BoxedInteger): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    inline def setHostPortRange(value: String): Self = StObject.set(x, "hostPortRange", value.asInstanceOf[js.Any])
    
    inline def setHostPortRangeUndefined: Self = StObject.set(x, "hostPortRange", js.undefined)
    
    inline def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    inline def setProtocol(value: TransportProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
