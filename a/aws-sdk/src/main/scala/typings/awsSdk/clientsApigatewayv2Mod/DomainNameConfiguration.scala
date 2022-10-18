package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainNameConfiguration extends StObject {
  
  /**
    * A domain name for the API.
    */
  var ApiGatewayDomainName: js.UndefOr[string] = js.undefined
  
  /**
    * An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var CertificateArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this domain name.
    */
  var CertificateName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  
  /**
    * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
    */
  var CertificateUploadDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the domain name migration. The valid values are AVAILABLE, UPDATING, PENDING_CERTIFICATE_REIMPORT, and PENDING_OWNERSHIP_VERIFICATION. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  var DomainNameStatus: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.DomainNameStatus] = js.undefined
  
  /**
    * An optional text message containing detailed information about status of the domain name migration.
    */
  var DomainNameStatusMessage: js.UndefOr[string] = js.undefined
  
  /**
    * The endpoint type.
    */
  var EndpointType: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.EndpointType] = js.undefined
  
  /**
    * The Amazon Route 53 Hosted Zone ID of the endpoint.
    */
  var HostedZoneId: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the public certificate issued by ACM to validate ownership of your custom domain. Only required when configuring mutual TLS and using an ACM imported or private CA certificate ARN as the regionalCertificateArn
    */
  var OwnershipVerificationCertificateArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are TLS_1_0 and TLS_1_2.
    */
  var SecurityPolicy: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.SecurityPolicy] = js.undefined
}
object DomainNameConfiguration {
  
  inline def apply(): DomainNameConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainNameConfiguration]
  }
  
  extension [Self <: DomainNameConfiguration](x: Self) {
    
    inline def setApiGatewayDomainName(value: string): Self = StObject.set(x, "ApiGatewayDomainName", value.asInstanceOf[js.Any])
    
    inline def setApiGatewayDomainNameUndefined: Self = StObject.set(x, "ApiGatewayDomainName", js.undefined)
    
    inline def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    inline def setCertificateName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "CertificateName", value.asInstanceOf[js.Any])
    
    inline def setCertificateNameUndefined: Self = StObject.set(x, "CertificateName", js.undefined)
    
    inline def setCertificateUploadDate(value: js.Date): Self = StObject.set(x, "CertificateUploadDate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUploadDateUndefined: Self = StObject.set(x, "CertificateUploadDate", js.undefined)
    
    inline def setDomainNameStatus(value: DomainNameStatus): Self = StObject.set(x, "DomainNameStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainNameStatusMessage(value: string): Self = StObject.set(x, "DomainNameStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setDomainNameStatusMessageUndefined: Self = StObject.set(x, "DomainNameStatusMessage", js.undefined)
    
    inline def setDomainNameStatusUndefined: Self = StObject.set(x, "DomainNameStatus", js.undefined)
    
    inline def setEndpointType(value: EndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    inline def setHostedZoneId(value: string): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
    
    inline def setOwnershipVerificationCertificateArn(value: Arn): Self = StObject.set(x, "OwnershipVerificationCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setOwnershipVerificationCertificateArnUndefined: Self = StObject.set(x, "OwnershipVerificationCertificateArn", js.undefined)
    
    inline def setSecurityPolicy(value: SecurityPolicy): Self = StObject.set(x, "SecurityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "SecurityPolicy", js.undefined)
  }
}
