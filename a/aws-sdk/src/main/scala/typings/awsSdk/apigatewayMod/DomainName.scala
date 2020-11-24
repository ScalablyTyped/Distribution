package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainName extends js.Object {
  
  /**
    * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var certificateArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the certificate that will be used by edge-optimized endpoint for this domain name.
    */
  var certificateName: js.UndefOr[String] = js.native
  
  /**
    * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
    */
  var certificateUploadDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The domain name of the Amazon CloudFront distribution associated with this custom domain name for an edge-optimized endpoint. You set up this association when adding a DNS record pointing the custom domain name to this distribution name. For more information about CloudFront distributions, see the Amazon CloudFront documentation.
    */
  var distributionDomainName: js.UndefOr[String] = js.native
  
  /**
    * The region-agnostic Amazon Route 53 Hosted Zone ID of the edge-optimized endpoint. The valid value is Z2FDTNDATAQYW2 for all the regions. For more information, see Set up a Regional Custom Domain Name and AWS Regions and Endpoints for API Gateway. 
    */
  var distributionHostedZoneId: js.UndefOr[String] = js.native
  
  /**
    * The custom domain name as an API host name, for example, my-api.example.com.
    */
  var domainName: js.UndefOr[String] = js.native
  
  /**
    * The status of the DomainName migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  var domainNameStatus: js.UndefOr[DomainNameStatus] = js.native
  
  /**
    * An optional text message containing detailed information about status of the DomainName migration.
    */
  var domainNameStatusMessage: js.UndefOr[String] = js.native
  
  /**
    * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.native
  
  /**
    * The mutual TLS authentication configuration for a custom domain name. If specified, API Gateway performs two-way authentication between the client and the server. Clients must present a trusted certificate to access your API.
    */
  var mutualTlsAuthentication: js.UndefOr[MutualTlsAuthentication] = js.native
  
  /**
    * The reference to an AWS-managed certificate that will be used for validating the regional domain name. AWS Certificate Manager is the only supported source.
    */
  var regionalCertificateArn: js.UndefOr[String] = js.native
  
  /**
    * The name of the certificate that will be used for validating the regional domain name.
    */
  var regionalCertificateName: js.UndefOr[String] = js.native
  
  /**
    * The domain name associated with the regional endpoint for this custom domain name. You set up this association by adding a DNS record that points the custom domain name to this regional domain name. The regional domain name is returned by API Gateway when you create a regional endpoint.
    */
  var regionalDomainName: js.UndefOr[String] = js.native
  
  /**
    * The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint. For more information, see Set up a Regional Custom Domain Name and AWS Regions and Endpoints for API Gateway. 
    */
  var regionalHostedZoneId: js.UndefOr[String] = js.native
  
  /**
    * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are TLS_1_0 and TLS_1_2.
    */
  var securityPolicy: js.UndefOr[SecurityPolicy] = js.native
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
}
object DomainName {
  
  @scala.inline
  def apply(): DomainName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainName]
  }
  
  @scala.inline
  implicit class DomainNameOps[Self <: DomainName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificateArn(value: String): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    
    @scala.inline
    def setCertificateName(value: String): Self = this.set("certificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateName: Self = this.set("certificateName", js.undefined)
    
    @scala.inline
    def setCertificateUploadDate(value: Timestamp): Self = this.set("certificateUploadDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateUploadDate: Self = this.set("certificateUploadDate", js.undefined)
    
    @scala.inline
    def setDistributionDomainName(value: String): Self = this.set("distributionDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionDomainName: Self = this.set("distributionDomainName", js.undefined)
    
    @scala.inline
    def setDistributionHostedZoneId(value: String): Self = this.set("distributionHostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributionHostedZoneId: Self = this.set("distributionHostedZoneId", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setDomainNameStatus(value: DomainNameStatus): Self = this.set("domainNameStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainNameStatus: Self = this.set("domainNameStatus", js.undefined)
    
    @scala.inline
    def setDomainNameStatusMessage(value: String): Self = this.set("domainNameStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainNameStatusMessage: Self = this.set("domainNameStatusMessage", js.undefined)
    
    @scala.inline
    def setEndpointConfiguration(value: EndpointConfiguration): Self = this.set("endpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointConfiguration: Self = this.set("endpointConfiguration", js.undefined)
    
    @scala.inline
    def setMutualTlsAuthentication(value: MutualTlsAuthentication): Self = this.set("mutualTlsAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMutualTlsAuthentication: Self = this.set("mutualTlsAuthentication", js.undefined)
    
    @scala.inline
    def setRegionalCertificateArn(value: String): Self = this.set("regionalCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalCertificateArn: Self = this.set("regionalCertificateArn", js.undefined)
    
    @scala.inline
    def setRegionalCertificateName(value: String): Self = this.set("regionalCertificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalCertificateName: Self = this.set("regionalCertificateName", js.undefined)
    
    @scala.inline
    def setRegionalDomainName(value: String): Self = this.set("regionalDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalDomainName: Self = this.set("regionalDomainName", js.undefined)
    
    @scala.inline
    def setRegionalHostedZoneId(value: String): Self = this.set("regionalHostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegionalHostedZoneId: Self = this.set("regionalHostedZoneId", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: SecurityPolicy): Self = this.set("securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityPolicy: Self = this.set("securityPolicy", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
