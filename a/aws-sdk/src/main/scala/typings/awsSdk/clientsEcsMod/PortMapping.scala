package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortMapping extends StObject {
  
  /**
    * The application protocol that's used for the port mapping. This parameter only applies to Service Connect. We recommend that you set this parameter to be consistent with the protocol that your application uses. If you set this parameter, Amazon ECS adds protocol-specific connection handling to the Service Connect proxy. If you set this parameter, Amazon ECS adds protocol-specific telemetry in the Amazon ECS console and CloudWatch. If you don't set a value for this parameter, then TCP is used. However, Amazon ECS doesn't add protocol-specific telemetry for TCP. Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to services across all of the clusters in the namespace. Tasks connect through a managed proxy container that collects logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported with Service Connect. For more information, see Service Connect in the Amazon Elastic Container Service Developer Guide.
    */
  var appProtocol: js.UndefOr[ApplicationProtocol] = js.undefined
  
  /**
    * The port number on the container that's bound to the user-specified or automatically assigned host port. If you use containers in a task with the awsvpc or host network mode, specify the exposed ports using containerPort. If you use containers in a task with the bridge network mode and you specify a container port and not a host port, your container automatically receives a host port in the ephemeral port range. For more information, see hostPort. Port mappings that are automatically assigned in this way do not count toward the 100 reserved ports limit of a container instance.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The port number range on the container that's bound to the dynamically mapped host port range.  The following rules apply when you specify a containerPortRange:   You must use either the bridge network mode or the awsvpc network mode.   This parameter is available for both the EC2 and Fargate launch types.   This parameter is available for both the Linux and Windows operating systems.   The container instance must have at least version 1.67.0 of the container agent and at least version 1.67.0-1 of the ecs-init package    You can specify a maximum of 100 port ranges per container.   You do not specify a hostPortRange. The value of the hostPortRange is set as follows:   For containers in a task with the awsvpc network mode, the hostPort is set to the same value as the containerPort. This is a static mapping strategy.   For containers in a task with the bridge network mode, the Amazon ECS agent finds open host ports from the default ephemeral range and passes it to docker to bind them to the container ports.     The containerPortRange valid values are between 1 and 65535.   A port can only be included in one port mapping per container.   You cannot specify overlapping port ranges.   The first port in the range must be less than last port in the range.   Docker recommends that you turn off the docker-proxy in the Docker daemon config file when you have a large number of ports. For more information, see  Issue #11185 on the Github website. For information about how to turn off the docker-proxy in the Docker daemon config file, see Docker daemon in the Amazon ECS Developer Guide.   You can call  DescribeTasks  to view the hostPortRange which are the host ports that are bound to the container ports.
    */
  var containerPortRange: js.UndefOr[String] = js.undefined
  
  /**
    * The port number on the container instance to reserve for your container. If you specify a containerPortRange, leave this field empty and the value of the hostPort is set as follows:   For containers in a task with the awsvpc network mode, the hostPort is set to the same value as the containerPort. This is a static mapping strategy.   For containers in a task with the bridge network mode, the Amazon ECS agent finds open ports on the host and automatically binds them to the container ports. This is a dynamic mapping strategy.   If you use containers in a task with the awsvpc or host network mode, the hostPort can either be left blank or set to the same value as the containerPort. If you use containers in a task with the bridge network mode, you can specify a non-reserved host port for your container port mapping, or you can omit the hostPort (or set it to 0) while specifying a containerPort and your container automatically receives a port in the ephemeral port range for your container instance operating system and Docker version. The default ephemeral port range for Docker version 1.6.0 and later is listed on the instance under /proc/sys/net/ipv4/ip_local_port_range. If this kernel parameter is unavailable, the default ephemeral port range from 49153 through 65535 is used. Do not attempt to specify a host port in the ephemeral port range as these are reserved for automatic assignment. In general, ports below 32768 are outside of the ephemeral port range. The default reserved ports are 22 for SSH, the Docker ports 2375 and 2376, and the Amazon ECS container agent ports 51678-51680. Any host port that was previously specified in a running task is also reserved while the task is running. That is, after a task stops, the host port is released. The current reserved ports are displayed in the remainingResources of DescribeContainerInstances output. A container instance can have up to 100 reserved ports at a time. This number includes the default reserved ports. Automatically assigned ports aren't included in the 100 reserved ports quota.
    */
  var hostPort: js.UndefOr[BoxedInteger] = js.undefined
  
  /**
    * The name that's used for the port mapping. This parameter only applies to Service Connect. This parameter is the name that you use in the serviceConnectConfiguration of a service. The name can include up to 64 characters. The characters can include lowercase letters, numbers, underscores (_), and hyphens (-). The name can't start with a hyphen. For more information, see Service Connect in the Amazon Elastic Container Service Developer Guide.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The protocol used for the port mapping. Valid values are tcp and udp. The default is tcp.
    */
  var protocol: js.UndefOr[TransportProtocol] = js.undefined
}
object PortMapping {
  
  inline def apply(): PortMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortMapping] (val x: Self) extends AnyVal {
    
    inline def setAppProtocol(value: ApplicationProtocol): Self = StObject.set(x, "appProtocol", value.asInstanceOf[js.Any])
    
    inline def setAppProtocolUndefined: Self = StObject.set(x, "appProtocol", js.undefined)
    
    inline def setContainerPort(value: BoxedInteger): Self = StObject.set(x, "containerPort", value.asInstanceOf[js.Any])
    
    inline def setContainerPortRange(value: String): Self = StObject.set(x, "containerPortRange", value.asInstanceOf[js.Any])
    
    inline def setContainerPortRangeUndefined: Self = StObject.set(x, "containerPortRange", js.undefined)
    
    inline def setContainerPortUndefined: Self = StObject.set(x, "containerPort", js.undefined)
    
    inline def setHostPort(value: BoxedInteger): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    inline def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtocol(value: TransportProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
  }
}
