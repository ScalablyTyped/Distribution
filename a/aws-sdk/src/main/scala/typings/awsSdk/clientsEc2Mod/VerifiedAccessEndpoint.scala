package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VerifiedAccessEndpoint extends StObject {
  
  /**
    * The DNS name for users to reach your application.
    */
  var ApplicationDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The type of attachment used to provide connectivity between the Amazon Web Services Verified Access endpoint and the application.
    */
  var AttachmentType: js.UndefOr[VerifiedAccessEndpointAttachmentType] = js.undefined
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[String] = js.undefined
  
  /**
    * The deletion time.
    */
  var DeletionTime: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the Amazon Web Services Verified Access endpoint.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Returned if endpoint has a device trust provider attached.
    */
  var DeviceValidationDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of a public TLS/SSL certificate imported into or created with ACM.
    */
  var DomainCertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * A DNS name that is generated for the endpoint.
    */
  var EndpointDomain: js.UndefOr[String] = js.undefined
  
  /**
    * The type of Amazon Web Services Verified Access endpoint. Incoming application requests will be sent to an IP address, load balancer or a network interface depending on the endpoint type specified.
    */
  var EndpointType: js.UndefOr[VerifiedAccessEndpointType] = js.undefined
  
  /**
    * The last updated time.
    */
  var LastUpdatedTime: js.UndefOr[String] = js.undefined
  
  /**
    * The load balancer details if creating the Amazon Web Services Verified Access endpoint as load-balancertype.
    */
  var LoadBalancerOptions: js.UndefOr[VerifiedAccessEndpointLoadBalancerOptions] = js.undefined
  
  /**
    * The options for network-interface type endpoint.
    */
  var NetworkInterfaceOptions: js.UndefOr[VerifiedAccessEndpointEniOptions] = js.undefined
  
  /**
    * The IDs of the security groups for the endpoint.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
  
  /**
    * The endpoint status.
    */
  var Status: js.UndefOr[VerifiedAccessEndpointStatus] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the Amazon Web Services Verified Access endpoint.
    */
  var VerifiedAccessEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services Verified Access group.
    */
  var VerifiedAccessGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services Verified Access instance.
    */
  var VerifiedAccessInstanceId: js.UndefOr[String] = js.undefined
}
object VerifiedAccessEndpoint {
  
  inline def apply(): VerifiedAccessEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerifiedAccessEndpoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VerifiedAccessEndpoint] (val x: Self) extends AnyVal {
    
    inline def setApplicationDomain(value: String): Self = StObject.set(x, "ApplicationDomain", value.asInstanceOf[js.Any])
    
    inline def setApplicationDomainUndefined: Self = StObject.set(x, "ApplicationDomain", js.undefined)
    
    inline def setAttachmentType(value: VerifiedAccessEndpointAttachmentType): Self = StObject.set(x, "AttachmentType", value.asInstanceOf[js.Any])
    
    inline def setAttachmentTypeUndefined: Self = StObject.set(x, "AttachmentType", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDeletionTime(value: String): Self = StObject.set(x, "DeletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "DeletionTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceValidationDomain(value: String): Self = StObject.set(x, "DeviceValidationDomain", value.asInstanceOf[js.Any])
    
    inline def setDeviceValidationDomainUndefined: Self = StObject.set(x, "DeviceValidationDomain", js.undefined)
    
    inline def setDomainCertificateArn(value: String): Self = StObject.set(x, "DomainCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setDomainCertificateArnUndefined: Self = StObject.set(x, "DomainCertificateArn", js.undefined)
    
    inline def setEndpointDomain(value: String): Self = StObject.set(x, "EndpointDomain", value.asInstanceOf[js.Any])
    
    inline def setEndpointDomainUndefined: Self = StObject.set(x, "EndpointDomain", js.undefined)
    
    inline def setEndpointType(value: VerifiedAccessEndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setLastUpdatedTime(value: String): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setLoadBalancerOptions(value: VerifiedAccessEndpointLoadBalancerOptions): Self = StObject.set(x, "LoadBalancerOptions", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerOptionsUndefined: Self = StObject.set(x, "LoadBalancerOptions", js.undefined)
    
    inline def setNetworkInterfaceOptions(value: VerifiedAccessEndpointEniOptions): Self = StObject.set(x, "NetworkInterfaceOptions", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceOptionsUndefined: Self = StObject.set(x, "NetworkInterfaceOptions", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setStatus(value: VerifiedAccessEndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVerifiedAccessEndpointId(value: String): Self = StObject.set(x, "VerifiedAccessEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessEndpointIdUndefined: Self = StObject.set(x, "VerifiedAccessEndpointId", js.undefined)
    
    inline def setVerifiedAccessGroupId(value: String): Self = StObject.set(x, "VerifiedAccessGroupId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessGroupIdUndefined: Self = StObject.set(x, "VerifiedAccessGroupId", js.undefined)
    
    inline def setVerifiedAccessInstanceId(value: String): Self = StObject.set(x, "VerifiedAccessInstanceId", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessInstanceIdUndefined: Self = StObject.set(x, "VerifiedAccessInstanceId", js.undefined)
  }
}
