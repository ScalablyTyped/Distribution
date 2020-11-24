package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainNameConfiguration extends js.Object {
  
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
  implicit class DomainNameConfigurationOps[Self <: DomainNameConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiGatewayDomainName(value: string): Self = this.set("ApiGatewayDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiGatewayDomainName: Self = this.set("ApiGatewayDomainName", js.undefined)
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("CertificateArn", js.undefined)
    
    @scala.inline
    def setCertificateName(value: StringWithLengthBetween1And128): Self = this.set("CertificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateName: Self = this.set("CertificateName", js.undefined)
    
    @scala.inline
    def setCertificateUploadDate(value: timestampIso8601): Self = this.set("CertificateUploadDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateUploadDate: Self = this.set("CertificateUploadDate", js.undefined)
    
    @scala.inline
    def setDomainNameStatus(value: DomainNameStatus): Self = this.set("DomainNameStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainNameStatus: Self = this.set("DomainNameStatus", js.undefined)
    
    @scala.inline
    def setDomainNameStatusMessage(value: string): Self = this.set("DomainNameStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainNameStatusMessage: Self = this.set("DomainNameStatusMessage", js.undefined)
    
    @scala.inline
    def setEndpointType(value: EndpointType): Self = this.set("EndpointType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointType: Self = this.set("EndpointType", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: string): Self = this.set("HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostedZoneId: Self = this.set("HostedZoneId", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: SecurityPolicy): Self = this.set("SecurityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityPolicy: Self = this.set("SecurityPolicy", js.undefined)
  }
}
