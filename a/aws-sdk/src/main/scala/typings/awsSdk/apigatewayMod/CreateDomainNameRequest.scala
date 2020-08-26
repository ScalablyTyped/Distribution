package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainNameRequest extends js.Object {
  /**
    * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var certificateArn: js.UndefOr[String] = js.native
  /**
    * [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this domain name provided by your certificate authority.
    */
  var certificateBody: js.UndefOr[String] = js.native
  /**
    * [Deprecated] The intermediate certificates and optionally the root certificate, one after the other without any blank lines, used by an edge-optimized endpoint for this domain name. If you include the root certificate, your certificate chain must start with intermediate certificates and end with the root certificate. Use the intermediate certificates that were provided by your certificate authority. Do not include any intermediaries that are not in the chain of trust path.
    */
  var certificateChain: js.UndefOr[String] = js.native
  /**
    * The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain name.
    */
  var certificateName: js.UndefOr[String] = js.native
  /**
    * [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
    */
  var certificatePrivateKey: js.UndefOr[String] = js.native
  /**
    * [Required] The name of the DomainName resource.
    */
  var domainName: String = js.native
  /**
    * The endpoint configuration of this DomainName showing the endpoint types of the domain name. 
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.native
  /**
    * The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var regionalCertificateArn: js.UndefOr[String] = js.native
  /**
    * The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
    */
  var regionalCertificateName: js.UndefOr[String] = js.native
  /**
    * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are TLS_1_0 and TLS_1_2.
    */
  var securityPolicy: js.UndefOr[SecurityPolicy] = js.native
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
}

object CreateDomainNameRequest {
  @scala.inline
  def apply(domainName: String): CreateDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainNameRequest]
  }
  @scala.inline
  implicit class CreateDomainNameRequestOps[Self <: CreateDomainNameRequest] (val x: Self) extends AnyVal {
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
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificateArn(value: String): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    @scala.inline
    def setCertificateBody(value: String): Self = this.set("certificateBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateBody: Self = this.set("certificateBody", js.undefined)
    @scala.inline
    def setCertificateChain(value: String): Self = this.set("certificateChain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateChain: Self = this.set("certificateChain", js.undefined)
    @scala.inline
    def setCertificateName(value: String): Self = this.set("certificateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateName: Self = this.set("certificateName", js.undefined)
    @scala.inline
    def setCertificatePrivateKey(value: String): Self = this.set("certificatePrivateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificatePrivateKey: Self = this.set("certificatePrivateKey", js.undefined)
    @scala.inline
    def setEndpointConfiguration(value: EndpointConfiguration): Self = this.set("endpointConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointConfiguration: Self = this.set("endpointConfiguration", js.undefined)
    @scala.inline
    def setRegionalCertificateArn(value: String): Self = this.set("regionalCertificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionalCertificateArn: Self = this.set("regionalCertificateArn", js.undefined)
    @scala.inline
    def setRegionalCertificateName(value: String): Self = this.set("regionalCertificateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionalCertificateName: Self = this.set("regionalCertificateName", js.undefined)
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

