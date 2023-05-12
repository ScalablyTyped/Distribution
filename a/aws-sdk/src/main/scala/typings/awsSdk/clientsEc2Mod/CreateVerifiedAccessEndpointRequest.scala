package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVerifiedAccessEndpointRequest extends StObject {
  
  /**
    * The DNS name for users to reach your application.
    */
  var ApplicationDomain: String
  
  /**
    * The type of attachment.
    */
  var AttachmentType: VerifiedAccessEndpointAttachmentType
  
  /**
    * A unique, case-sensitive token that you provide to ensure idempotency of your modification request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * A description for the Verified Access endpoint.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the public TLS/SSL certificate in Amazon Web Services Certificate Manager to associate with the endpoint. The CN in the certificate must match the DNS name your end users will use to reach your application.
    */
  var DomainCertificateArn: CertificateArn
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A custom identifier that is prepended to the DNS name that is generated for the endpoint.
    */
  var EndpointDomainPrefix: String
  
  /**
    * The type of Verified Access endpoint to create.
    */
  var EndpointType: VerifiedAccessEndpointType
  
  /**
    * The load balancer details. This parameter is required if the endpoint type is load-balancer.
    */
  var LoadBalancerOptions: js.UndefOr[CreateVerifiedAccessEndpointLoadBalancerOptions] = js.undefined
  
  /**
    * The network interface details. This parameter is required if the endpoint type is network-interface.
    */
  var NetworkInterfaceOptions: js.UndefOr[CreateVerifiedAccessEndpointEniOptions] = js.undefined
  
  /**
    * The Verified Access policy document.
    */
  var PolicyDocument: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the security groups to associate with the Verified Access endpoint.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
  
  /**
    * The tags to assign to the Verified Access endpoint.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
  
  /**
    * The ID of the Verified Access group to associate the endpoint with.
    */
  var VerifiedAccessGroupId: typings.awsSdk.clientsEc2Mod.VerifiedAccessGroupId
}
object CreateVerifiedAccessEndpointRequest {
  
  inline def apply(
    ApplicationDomain: String,
    AttachmentType: VerifiedAccessEndpointAttachmentType,
    DomainCertificateArn: CertificateArn,
    EndpointDomainPrefix: String,
    EndpointType: VerifiedAccessEndpointType,
    VerifiedAccessGroupId: VerifiedAccessGroupId
  ): CreateVerifiedAccessEndpointRequest = {
    val __obj = js.Dynamic.literal(ApplicationDomain = ApplicationDomain.asInstanceOf[js.Any], AttachmentType = AttachmentType.asInstanceOf[js.Any], DomainCertificateArn = DomainCertificateArn.asInstanceOf[js.Any], EndpointDomainPrefix = EndpointDomainPrefix.asInstanceOf[js.Any], EndpointType = EndpointType.asInstanceOf[js.Any], VerifiedAccessGroupId = VerifiedAccessGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVerifiedAccessEndpointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVerifiedAccessEndpointRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationDomain(value: String): Self = StObject.set(x, "ApplicationDomain", value.asInstanceOf[js.Any])
    
    inline def setAttachmentType(value: VerifiedAccessEndpointAttachmentType): Self = StObject.set(x, "AttachmentType", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDomainCertificateArn(value: CertificateArn): Self = StObject.set(x, "DomainCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setEndpointDomainPrefix(value: String): Self = StObject.set(x, "EndpointDomainPrefix", value.asInstanceOf[js.Any])
    
    inline def setEndpointType(value: VerifiedAccessEndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerOptions(value: CreateVerifiedAccessEndpointLoadBalancerOptions): Self = StObject.set(x, "LoadBalancerOptions", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerOptionsUndefined: Self = StObject.set(x, "LoadBalancerOptions", js.undefined)
    
    inline def setNetworkInterfaceOptions(value: CreateVerifiedAccessEndpointEniOptions): Self = StObject.set(x, "NetworkInterfaceOptions", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceOptionsUndefined: Self = StObject.set(x, "NetworkInterfaceOptions", js.undefined)
    
    inline def setPolicyDocument(value: String): Self = StObject.set(x, "PolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setPolicyDocumentUndefined: Self = StObject.set(x, "PolicyDocument", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
    
    inline def setVerifiedAccessGroupId(value: VerifiedAccessGroupId): Self = StObject.set(x, "VerifiedAccessGroupId", value.asInstanceOf[js.Any])
  }
}
