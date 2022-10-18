package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainNameRequest extends StObject {
  
  /**
    * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var certificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this domain name provided by your certificate authority.
    */
  var certificateBody: js.UndefOr[String] = js.undefined
  
  /**
    * [Deprecated] The intermediate certificates and optionally the root certificate, one after the other without any blank lines, used by an edge-optimized endpoint for this domain name. If you include the root certificate, your certificate chain must start with intermediate certificates and end with the root certificate. Use the intermediate certificates that were provided by your certificate authority. Do not include any intermediaries that are not in the chain of trust path.
    */
  var certificateChain: js.UndefOr[String] = js.undefined
  
  /**
    * The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain name.
    */
  var certificateName: js.UndefOr[String] = js.undefined
  
  /**
    * [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
    */
  var certificatePrivateKey: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the DomainName resource.
    */
  var domainName: String
  
  /**
    * The endpoint configuration of this DomainName showing the endpoint types of the domain name. 
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined
  
  var mutualTlsAuthentication: js.UndefOr[MutualTlsAuthenticationInput] = js.undefined
  
  /**
    * The ARN of the public certificate issued by ACM to validate ownership of your custom domain. Only required when configuring mutual TLS and using an ACM imported or private CA certificate ARN as the regionalCertificateArn.
    */
  var ownershipVerificationCertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var regionalCertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
    */
  var regionalCertificateName: js.UndefOr[String] = js.undefined
  
  /**
    * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are TLS_1_0 and TLS_1_2.
    */
  var securityPolicy: js.UndefOr[SecurityPolicy] = js.undefined
  
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
}
object CreateDomainNameRequest {
  
  inline def apply(domainName: String): CreateDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainNameRequest]
  }
  
  extension [Self <: CreateDomainNameRequest](x: Self) {
    
    inline def setCertificateArn(value: String): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCertificateBody(value: String): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
    
    inline def setCertificateBodyUndefined: Self = StObject.set(x, "certificateBody", js.undefined)
    
    inline def setCertificateChain(value: String): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    inline def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
    
    inline def setCertificateName(value: String): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    inline def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    inline def setCertificatePrivateKey(value: String): Self = StObject.set(x, "certificatePrivateKey", value.asInstanceOf[js.Any])
    
    inline def setCertificatePrivateKeyUndefined: Self = StObject.set(x, "certificatePrivateKey", js.undefined)
    
    inline def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfiguration(value: EndpointConfiguration): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
    
    inline def setMutualTlsAuthentication(value: MutualTlsAuthenticationInput): Self = StObject.set(x, "mutualTlsAuthentication", value.asInstanceOf[js.Any])
    
    inline def setMutualTlsAuthenticationUndefined: Self = StObject.set(x, "mutualTlsAuthentication", js.undefined)
    
    inline def setOwnershipVerificationCertificateArn(value: String): Self = StObject.set(x, "ownershipVerificationCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setOwnershipVerificationCertificateArnUndefined: Self = StObject.set(x, "ownershipVerificationCertificateArn", js.undefined)
    
    inline def setRegionalCertificateArn(value: String): Self = StObject.set(x, "regionalCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setRegionalCertificateArnUndefined: Self = StObject.set(x, "regionalCertificateArn", js.undefined)
    
    inline def setRegionalCertificateName(value: String): Self = StObject.set(x, "regionalCertificateName", value.asInstanceOf[js.Any])
    
    inline def setRegionalCertificateNameUndefined: Self = StObject.set(x, "regionalCertificateName", js.undefined)
    
    inline def setSecurityPolicy(value: SecurityPolicy): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
    
    inline def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
