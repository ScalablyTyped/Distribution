package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerService extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the container service.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the container service.
    */
  var containerServiceName: js.UndefOr[ContainerServiceName] = js.undefined
  
  /**
    * The timestamp when the container service was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An object that describes the current container deployment of the container service.
    */
  var currentDeployment: js.UndefOr[ContainerServiceDeployment] = js.undefined
  
  /**
    * A Boolean value indicating whether the container service is disabled.
    */
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object that describes the location of the container service, such as the Amazon Web Services Region and Availability Zone.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * An object that describes the next deployment of the container service. This value is null when there is no deployment in a pending state.
    */
  var nextDeployment: js.UndefOr[ContainerServiceDeployment] = js.undefined
  
  /**
    * The power specification of the container service. The power specifies the amount of RAM, the number of vCPUs, and the base price of the container service.
    */
  var power: js.UndefOr[ContainerServicePowerName] = js.undefined
  
  /**
    * The ID of the power of the container service.
    */
  var powerId: js.UndefOr[String] = js.undefined
  
  /**
    * The principal ARN of the container service. The principal ARN can be used to create a trust relationship between your standard Amazon Web Services account and your Lightsail container service. This allows you to give your service permission to access resources in your standard Amazon Web Services account.
    */
  var principalArn: js.UndefOr[String] = js.undefined
  
  /**
    * The private domain name of the container service. The private domain name is accessible only by other resources within the default virtual private cloud (VPC) of your Lightsail account.
    */
  var privateDomainName: js.UndefOr[String] = js.undefined
  
  /**
    * An object that describes the configuration for the container service to access private container image repositories, such as Amazon Elastic Container Registry (Amazon ECR) private repositories. For more information, see Configuring access to an Amazon ECR private repository for an Amazon Lightsail container service in the Amazon Lightsail Developer Guide.
    */
  var privateRegistryAccess: js.UndefOr[PrivateRegistryAccess] = js.undefined
  
  /**
    * The public domain name of the container service, such as example.com and www.example.com. You can specify up to four public domain names for a container service. The domain names that you specify are used when you create a deployment with a container configured as the public endpoint of your container service. If you don't specify public domain names, then you can use the default domain of the container service.  You must create and validate an SSL/TLS certificate before you can use public domain names with your container service. Use the CreateCertificate action to create a certificate for the public domain names you want to use with your container service.  See CreateContainerService or UpdateContainerService for information about how to specify public domain names for your Lightsail container service.
    */
  var publicDomainNames: js.UndefOr[ContainerServicePublicDomains] = js.undefined
  
  /**
    * The Lightsail resource type of the container service (i.e., ContainerService).
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The scale specification of the container service. The scale specifies the allocated compute nodes of the container service.
    */
  var scale: js.UndefOr[ContainerServiceScale] = js.undefined
  
  /**
    * The current state of the container service. The following container service states are possible:    PENDING - The container service is being created.    READY - The container service is running but it does not have an active container deployment.    DEPLOYING - The container service is launching a container deployment.    RUNNING - The container service is running and it has an active container deployment.    UPDATING - The container service capacity or its custom domains are being updated.    DELETING - The container service is being deleted.    DISABLED - The container service is disabled, and its active deployment and containers, if any, are shut down.  
    */
  var state: js.UndefOr[ContainerServiceState] = js.undefined
  
  /**
    * An object that describes the current state of the container service.  The state detail is populated only when a container service is in a PENDING, DEPLOYING, or UPDATING state. 
    */
  var stateDetail: js.UndefOr[ContainerServiceStateDetail] = js.undefined
  
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Amazon Lightsail Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The publicly accessible URL of the container service. If no public endpoint is specified in the currentDeployment, this URL returns a 404 response.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ContainerService {
  
  inline def apply(): ContainerService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerService]
  }
  
  extension [Self <: ContainerService](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setContainerServiceName(value: ContainerServiceName): Self = StObject.set(x, "containerServiceName", value.asInstanceOf[js.Any])
    
    inline def setContainerServiceNameUndefined: Self = StObject.set(x, "containerServiceName", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCurrentDeployment(value: ContainerServiceDeployment): Self = StObject.set(x, "currentDeployment", value.asInstanceOf[js.Any])
    
    inline def setCurrentDeploymentUndefined: Self = StObject.set(x, "currentDeployment", js.undefined)
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setNextDeployment(value: ContainerServiceDeployment): Self = StObject.set(x, "nextDeployment", value.asInstanceOf[js.Any])
    
    inline def setNextDeploymentUndefined: Self = StObject.set(x, "nextDeployment", js.undefined)
    
    inline def setPower(value: ContainerServicePowerName): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setPowerId(value: String): Self = StObject.set(x, "powerId", value.asInstanceOf[js.Any])
    
    inline def setPowerIdUndefined: Self = StObject.set(x, "powerId", js.undefined)
    
    inline def setPowerUndefined: Self = StObject.set(x, "power", js.undefined)
    
    inline def setPrincipalArn(value: String): Self = StObject.set(x, "principalArn", value.asInstanceOf[js.Any])
    
    inline def setPrincipalArnUndefined: Self = StObject.set(x, "principalArn", js.undefined)
    
    inline def setPrivateDomainName(value: String): Self = StObject.set(x, "privateDomainName", value.asInstanceOf[js.Any])
    
    inline def setPrivateDomainNameUndefined: Self = StObject.set(x, "privateDomainName", js.undefined)
    
    inline def setPrivateRegistryAccess(value: PrivateRegistryAccess): Self = StObject.set(x, "privateRegistryAccess", value.asInstanceOf[js.Any])
    
    inline def setPrivateRegistryAccessUndefined: Self = StObject.set(x, "privateRegistryAccess", js.undefined)
    
    inline def setPublicDomainNames(value: ContainerServicePublicDomains): Self = StObject.set(x, "publicDomainNames", value.asInstanceOf[js.Any])
    
    inline def setPublicDomainNamesUndefined: Self = StObject.set(x, "publicDomainNames", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setScale(value: ContainerServiceScale): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setState(value: ContainerServiceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateDetail(value: ContainerServiceStateDetail): Self = StObject.set(x, "stateDetail", value.asInstanceOf[js.Any])
    
    inline def setStateDetailUndefined: Self = StObject.set(x, "stateDetail", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
