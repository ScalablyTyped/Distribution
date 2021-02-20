package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainNameConfiguration extends StObject {
  
  /**
    * A domain name for the API.
    */
  var ApiGatewayDomainName: js.UndefOr[string] = js.native
  
  /**
    * An AWS-managed certificate that will be used by the edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var CertificateArn: js.UndefOr[Arn] = js.native
  
  /**
    * The user-friendly name of the certificate that will be used by the edge-optimized endpoint for this domain name.
    */
  var CertificateName: js.UndefOr[StringWithLengthBetween1And128] = js.native
  
  /**
    * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
    */
  var CertificateUploadDate: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  var DomainNameStatus: js.UndefOr[typings.awsSdk.apigatewayv2Mod.DomainNameStatus] = js.native
  
  /**
    * An optional text message containing detailed information about status of the domain name migration.
    */
  var DomainNameStatusMessage: js.UndefOr[string] = js.native
  
  /**
    * The endpoint type.
    */
  var EndpointType: js.UndefOr[typings.awsSdk.apigatewayv2Mod.EndpointType] = js.native
  
  /**
    * The Amazon Route 53 Hosted Zone ID of the endpoint.
    */
  var HostedZoneId: js.UndefOr[string] = js.native
  
  /**
    * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are TLS_1_0 and TLS_1_2.
    */
  var SecurityPolicy: js.UndefOr[typings.awsSdk.apigatewayv2Mod.SecurityPolicy] = js.native
}
object DomainNameConfiguration {
  
  @scala.inline
  def apply(): DomainNameConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainNameConfiguration]
  }
  
  @scala.inline
  implicit class DomainNameConfigurationMutableBuilder[Self <: DomainNameConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiGatewayDomainName(value: string): Self = StObject.set(x, "ApiGatewayDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiGatewayDomainNameUndefined: Self = StObject.set(x, "ApiGatewayDomainName", js.undefined)
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setCertificateName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "CertificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateNameUndefined: Self = StObject.set(x, "CertificateName", js.undefined)
    
    @scala.inline
    def setCertificateUploadDate(value: timestampIso8601): Self = StObject.set(x, "CertificateUploadDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUploadDateUndefined: Self = StObject.set(x, "CertificateUploadDate", js.undefined)
    
    @scala.inline
    def setDomainNameStatus(value: DomainNameStatus): Self = StObject.set(x, "DomainNameStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameStatusMessage(value: string): Self = StObject.set(x, "DomainNameStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameStatusMessageUndefined: Self = StObject.set(x, "DomainNameStatusMessage", js.undefined)
    
    @scala.inline
    def setDomainNameStatusUndefined: Self = StObject.set(x, "DomainNameStatus", js.undefined)
    
    @scala.inline
    def setEndpointType(value: EndpointType): Self = StObject.set(x, "EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypeUndefined: Self = StObject.set(x, "EndpointType", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: string): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: SecurityPolicy): Self = StObject.set(x, "SecurityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicyUndefined: Self = StObject.set(x, "SecurityPolicy", js.undefined)
  }
}
