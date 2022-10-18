package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainName extends StObject {
  
  /**
    * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var certificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the certificate that will be used by edge-optimized endpoint for this domain name.
    */
  var certificateName: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
    */
  var certificateUploadDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The domain name of the Amazon CloudFront distribution associated with this custom domain name for an edge-optimized endpoint. You set up this association when adding a DNS record pointing the custom domain name to this distribution name. For more information about CloudFront distributions, see the Amazon CloudFront documentation.
    */
  var distributionDomainName: js.UndefOr[String] = js.undefined
  
  /**
    * The region-agnostic Amazon Route 53 Hosted Zone ID of the edge-optimized endpoint. The valid value is Z2FDTNDATAQYW2 for all the regions. For more information, see Set up a Regional Custom Domain Name and AWS Regions and Endpoints for API Gateway. 
    */
  var distributionHostedZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * The custom domain name as an API host name, for example, my-api.example.com.
    */
  var domainName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the DomainName migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  var domainNameStatus: js.UndefOr[DomainNameStatus] = js.undefined
  
  /**
    * An optional text message containing detailed information about status of the DomainName migration.
    */
  var domainNameStatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The endpoint configuration of this DomainName showing the endpoint types of the domain name. 
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined
  
  /**
    * The mutual TLS authentication configuration for a custom domain name. If specified, API Gateway performs two-way authentication between the client and the server. Clients must present a trusted certificate to access your API.
    */
  var mutualTlsAuthentication: js.UndefOr[MutualTlsAuthentication] = js.undefined
  
  /**
    * The ARN of the public certificate issued by ACM to validate ownership of your custom domain. Only required when configuring mutual TLS and using an ACM imported or private CA certificate ARN as the regionalCertificateArn.
    */
  var ownershipVerificationCertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The reference to an AWS-managed certificate that will be used for validating the regional domain name. AWS Certificate Manager is the only supported source.
    */
  var regionalCertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the certificate that will be used for validating the regional domain name.
    */
  var regionalCertificateName: js.UndefOr[String] = js.undefined
  
  /**
    * The domain name associated with the regional endpoint for this custom domain name. You set up this association by adding a DNS record that points the custom domain name to this regional domain name. The regional domain name is returned by API Gateway when you create a regional endpoint.
    */
  var regionalDomainName: js.UndefOr[String] = js.undefined
  
  /**
    * The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint. For more information, see Set up a Regional Custom Domain Name and AWS Regions and Endpoints for API Gateway. 
    */
  var regionalHostedZoneId: js.UndefOr[String] = js.undefined
  
  /**
    * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are TLS_1_0 and TLS_1_2.
    */
  var securityPolicy: js.UndefOr[SecurityPolicy] = js.undefined
  
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
}
object DomainName {
  
  inline def apply(): DomainName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainName]
  }
  
  extension [Self <: DomainName](x: Self) {
    
    inline def setCertificateArn(value: String): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCertificateName(value: String): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    inline def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    inline def setCertificateUploadDate(value: js.Date): Self = StObject.set(x, "certificateUploadDate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUploadDateUndefined: Self = StObject.set(x, "certificateUploadDate", js.undefined)
    
    inline def setDistributionDomainName(value: String): Self = StObject.set(x, "distributionDomainName", value.asInstanceOf[js.Any])
    
    inline def setDistributionDomainNameUndefined: Self = StObject.set(x, "distributionDomainName", js.undefined)
    
    inline def setDistributionHostedZoneId(value: String): Self = StObject.set(x, "distributionHostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setDistributionHostedZoneIdUndefined: Self = StObject.set(x, "distributionHostedZoneId", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameStatus(value: DomainNameStatus): Self = StObject.set(x, "domainNameStatus", value.asInstanceOf[js.Any])
    
    inline def setDomainNameStatusMessage(value: String): Self = StObject.set(x, "domainNameStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setDomainNameStatusMessageUndefined: Self = StObject.set(x, "domainNameStatusMessage", js.undefined)
    
    inline def setDomainNameStatusUndefined: Self = StObject.set(x, "domainNameStatus", js.undefined)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setEndpointConfiguration(value: EndpointConfiguration): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
    
    inline def setMutualTlsAuthentication(value: MutualTlsAuthentication): Self = StObject.set(x, "mutualTlsAuthentication", value.asInstanceOf[js.Any])
    
    inline def setMutualTlsAuthenticationUndefined: Self = StObject.set(x, "mutualTlsAuthentication", js.undefined)
    
    inline def setOwnershipVerificationCertificateArn(value: String): Self = StObject.set(x, "ownershipVerificationCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setOwnershipVerificationCertificateArnUndefined: Self = StObject.set(x, "ownershipVerificationCertificateArn", js.undefined)
    
    inline def setRegionalCertificateArn(value: String): Self = StObject.set(x, "regionalCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setRegionalCertificateArnUndefined: Self = StObject.set(x, "regionalCertificateArn", js.undefined)
    
    inline def setRegionalCertificateName(value: String): Self = StObject.set(x, "regionalCertificateName", value.asInstanceOf[js.Any])
    
    inline def setRegionalCertificateNameUndefined: Self = StObject.set(x, "regionalCertificateName", js.undefined)
    
    inline def setRegionalDomainName(value: String): Self = StObject.set(x, "regionalDomainName", value.asInstanceOf[js.Any])
    
    inline def setRegionalDomainNameUndefined: Self = StObject.set(x, "regionalDomainName", js.undefined)
    
    inline def setRegionalHostedZoneId(value: String): Self = StObject.set(x, "regionalHostedZoneId", value.asInstanceOf[js.Any])
    
    inline def setRegionalHostedZoneIdUndefined: Self = StObject.set(x, "regionalHostedZoneId", js.undefined)
    
    inline def setSecurityPolicy(value: SecurityPolicy): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
