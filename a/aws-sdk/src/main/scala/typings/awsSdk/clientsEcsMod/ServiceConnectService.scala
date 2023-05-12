package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceConnectService extends StObject {
  
  /**
    * The list of client aliases for this Service Connect service. You use these to assign names that can be used by client applications. The maximum number of client aliases that you can have in this list is 1. Each alias ("endpoint") is a fully-qualified name and port number that other Amazon ECS tasks ("clients") can use to connect to this service. Each name and port mapping must be unique within the namespace. For each ServiceConnectService, you must provide at least one clientAlias with one port.
    */
  var clientAliases: js.UndefOr[ServiceConnectClientAliasList] = js.undefined
  
  /**
    * The discoveryName is the name of the new Cloud Map service that Amazon ECS creates for this Amazon ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64 characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name can't start with a hyphen. If the discoveryName isn't specified, the port mapping name from the task definition is used in portName.namespace.
    */
  var discoveryName: js.UndefOr[String] = js.undefined
  
  /**
    * The port number for the Service Connect proxy to listen on. Use the value of this field to bypass the proxy for traffic on the port number specified in the named portMapping in the task definition of this application, and then use it in your VPC security groups to allow traffic into the proxy for this Amazon ECS service. In awsvpc mode and Fargate, the default value is the container port number. The container port number is in the portMapping in the task definition. In bridge mode, the default value is the ephemeral port of the Service Connect proxy.
    */
  var ingressPortOverride: js.UndefOr[PortNumber] = js.undefined
  
  /**
    * The portName must match the name of one of the portMappings from all the containers in the task definition of this Amazon ECS service.
    */
  var portName: String
}
object ServiceConnectService {
  
  inline def apply(portName: String): ServiceConnectService = {
    val __obj = js.Dynamic.literal(portName = portName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConnectService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceConnectService] (val x: Self) extends AnyVal {
    
    inline def setClientAliases(value: ServiceConnectClientAliasList): Self = StObject.set(x, "clientAliases", value.asInstanceOf[js.Any])
    
    inline def setClientAliasesUndefined: Self = StObject.set(x, "clientAliases", js.undefined)
    
    inline def setClientAliasesVarargs(value: ServiceConnectClientAlias*): Self = StObject.set(x, "clientAliases", js.Array(value*))
    
    inline def setDiscoveryName(value: String): Self = StObject.set(x, "discoveryName", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryNameUndefined: Self = StObject.set(x, "discoveryName", js.undefined)
    
    inline def setIngressPortOverride(value: PortNumber): Self = StObject.set(x, "ingressPortOverride", value.asInstanceOf[js.Any])
    
    inline def setIngressPortOverrideUndefined: Self = StObject.set(x, "ingressPortOverride", js.undefined)
    
    inline def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
  }
}
