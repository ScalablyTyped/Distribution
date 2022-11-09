package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContainerServiceRequest extends StObject {
  
  /**
    * An object that describes a deployment for the container service. A deployment specifies the containers that will be launched on the container service and their settings, such as the ports to open, the environment variables to apply, and the launch command to run. It also specifies the container that will serve as the public endpoint of the deployment and its settings, such as the HTTP or HTTPS port to use, and the health check configuration.
    */
  var deployment: js.UndefOr[ContainerServiceDeploymentRequest] = js.undefined
  
  /**
    * The power specification for the container service. The power specifies the amount of memory, vCPUs, and base monthly cost of each node of the container service. The power and scale of a container service makes up its configured capacity. To determine the monthly price of your container service, multiply the base price of the power with the scale (the number of nodes) of the service. Use the GetContainerServicePowers action to get a list of power options that you can specify using this parameter, and their base monthly cost.
    */
  var power: ContainerServicePowerName
  
  /**
    * An object to describe the configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. For more information, see Configuring access to an Amazon ECR private repository for an Amazon Lightsail container service in the Amazon Lightsail Developer Guide.
    */
  var privateRegistryAccess: js.UndefOr[PrivateRegistryAccessRequest] = js.undefined
  
  /**
    * The public domain names to use with the container service, such as example.com and www.example.com. You can specify up to four public domain names for a container service. The domain names that you specify are used when you create a deployment with a container configured as the public endpoint of your container service. If you don't specify public domain names, then you can use the default domain of the container service.  You must create and validate an SSL/TLS certificate before you can use public domain names with your container service. Use the CreateCertificate action to create a certificate for the public domain names you want to use with your container service.  You can specify public domain names using a string to array map as shown in the example later on this page.
    */
  var publicDomainNames: js.UndefOr[ContainerServicePublicDomains] = js.undefined
  
  /**
    * The scale specification for the container service. The scale specifies the allocated compute nodes of the container service. The power and scale of a container service makes up its configured capacity. To determine the monthly price of your container service, multiply the base price of the power with the scale (the number of nodes) of the service.
    */
  var scale: ContainerServiceScale
  
  /**
    * The name for the container service. The name that you specify for your container service will make up part of its default domain. The default domain of a container service is typically https://&lt;ServiceName&gt;.&lt;RandomGUID&gt;.&lt;AWSRegion&gt;.cs.amazonlightsail.com. If the name of your container service is container-service-1, and it's located in the US East (Ohio) Amazon Web Services Region (us-east-2), then the domain for your container service will be like the following example: https://container-service-1.ur4EXAMPLE2uq.us-east-2.cs.amazonlightsail.com  The following are the requirements for container service names:   Must be unique within each Amazon Web Services Region in your Lightsail account.   Must contain 1 to 63 characters.   Must contain only alphanumeric characters and hyphens.   A hyphen (-) can separate words but cannot be at the start or end of the name.  
    */
  var serviceName: ContainerServiceName
  
  /**
    * The tag keys and optional values to add to the container service during create. Use the TagResource action to tag a resource after it's created. For more information about tags in Lightsail, see the Amazon Lightsail Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateContainerServiceRequest {
  
  inline def apply(power: ContainerServicePowerName, scale: ContainerServiceScale, serviceName: ContainerServiceName): CreateContainerServiceRequest = {
    val __obj = js.Dynamic.literal(power = power.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContainerServiceRequest]
  }
  
  extension [Self <: CreateContainerServiceRequest](x: Self) {
    
    inline def setDeployment(value: ContainerServiceDeploymentRequest): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setPower(value: ContainerServicePowerName): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPrivateRegistryAccess(value: PrivateRegistryAccessRequest): Self = StObject.set(x, "privateRegistryAccess", value.asInstanceOf[js.Any])
    
    inline def setPrivateRegistryAccessUndefined: Self = StObject.set(x, "privateRegistryAccess", js.undefined)
    
    inline def setPublicDomainNames(value: ContainerServicePublicDomains): Self = StObject.set(x, "publicDomainNames", value.asInstanceOf[js.Any])
    
    inline def setPublicDomainNamesUndefined: Self = StObject.set(x, "publicDomainNames", js.undefined)
    
    inline def setScale(value: ContainerServiceScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setServiceName(value: ContainerServiceName): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
