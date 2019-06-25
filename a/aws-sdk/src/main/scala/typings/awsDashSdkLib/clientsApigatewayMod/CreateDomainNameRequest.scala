package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDomainNameRequest extends js.Object {
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
    * [Required] The name of the DomainName resource.
    */
  var domainName: String
  /**
    * The endpoint configuration of this DomainName showing the endpoint types of the domain name. 
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined
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
  @scala.inline
  def apply(
    domainName: String,
    certificateArn: String = null,
    certificateBody: String = null,
    certificateChain: String = null,
    certificateName: String = null,
    certificatePrivateKey: String = null,
    endpointConfiguration: EndpointConfiguration = null,
    regionalCertificateArn: String = null,
    regionalCertificateName: String = null,
    securityPolicy: SecurityPolicy = null,
    tags: MapOfStringToString = null
  ): CreateDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName)
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn)
    if (certificateBody != null) __obj.updateDynamic("certificateBody")(certificateBody)
    if (certificateChain != null) __obj.updateDynamic("certificateChain")(certificateChain)
    if (certificateName != null) __obj.updateDynamic("certificateName")(certificateName)
    if (certificatePrivateKey != null) __obj.updateDynamic("certificatePrivateKey")(certificatePrivateKey)
    if (endpointConfiguration != null) __obj.updateDynamic("endpointConfiguration")(endpointConfiguration)
    if (regionalCertificateArn != null) __obj.updateDynamic("regionalCertificateArn")(regionalCertificateArn)
    if (regionalCertificateName != null) __obj.updateDynamic("regionalCertificateName")(regionalCertificateName)
    if (securityPolicy != null) __obj.updateDynamic("securityPolicy")(securityPolicy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CreateDomainNameRequest]
  }
}

