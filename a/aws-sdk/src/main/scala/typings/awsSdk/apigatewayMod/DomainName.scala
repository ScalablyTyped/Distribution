package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainName extends StObject {
  
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
  implicit class DomainNameMutableBuilder[Self <: DomainName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: String): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    @scala.inline
    def setCertificateName(value: String): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    @scala.inline
    def setCertificateUploadDate(value: Timestamp): Self = StObject.set(x, "certificateUploadDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUploadDateUndefined: Self = StObject.set(x, "certificateUploadDate", js.undefined)
    
    @scala.inline
    def setDistributionDomainName(value: String): Self = StObject.set(x, "distributionDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionDomainNameUndefined: Self = StObject.set(x, "distributionDomainName", js.undefined)
    
    @scala.inline
    def setDistributionHostedZoneId(value: String): Self = StObject.set(x, "distributionHostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionHostedZoneIdUndefined: Self = StObject.set(x, "distributionHostedZoneId", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameStatus(value: DomainNameStatus): Self = StObject.set(x, "domainNameStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameStatusMessage(value: String): Self = StObject.set(x, "domainNameStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameStatusMessageUndefined: Self = StObject.set(x, "domainNameStatusMessage", js.undefined)
    
    @scala.inline
    def setDomainNameStatusUndefined: Self = StObject.set(x, "domainNameStatus", js.undefined)
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setEndpointConfiguration(value: EndpointConfiguration): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
    
    @scala.inline
    def setMutualTlsAuthentication(value: MutualTlsAuthentication): Self = StObject.set(x, "mutualTlsAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutualTlsAuthenticationUndefined: Self = StObject.set(x, "mutualTlsAuthentication", js.undefined)
    
    @scala.inline
    def setRegionalCertificateArn(value: String): Self = StObject.set(x, "regionalCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalCertificateArnUndefined: Self = StObject.set(x, "regionalCertificateArn", js.undefined)
    
    @scala.inline
    def setRegionalCertificateName(value: String): Self = StObject.set(x, "regionalCertificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalCertificateNameUndefined: Self = StObject.set(x, "regionalCertificateName", js.undefined)
    
    @scala.inline
    def setRegionalDomainName(value: String): Self = StObject.set(x, "regionalDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalDomainNameUndefined: Self = StObject.set(x, "regionalDomainName", js.undefined)
    
    @scala.inline
    def setRegionalHostedZoneId(value: String): Self = StObject.set(x, "regionalHostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalHostedZoneIdUndefined: Self = StObject.set(x, "regionalHostedZoneId", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: SecurityPolicy): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
