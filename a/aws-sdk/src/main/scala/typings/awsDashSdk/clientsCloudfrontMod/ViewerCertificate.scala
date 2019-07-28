package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerCertificate extends js.Object {
  /**
    * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you must choose the type of certificate that you want to use. Specify the following value if ACM provided your certificate:    &lt;ACMCertificateArn&gt;ARN for ACM SSL/TLS certificate&lt;ACMCertificateArn&gt; where  ARN for ACM SSL/TLS certificate  is the ARN for the ACM SSL/TLS certificate that you want to use for this distribution.   If you specify ACMCertificateArn, you must also specify a value for SSLSupportMethod.
    */
  var ACMCertificateArn: js.UndefOr[String] = js.undefined
  /**
    * This field is no longer used. Use one of the following fields instead:    ACMCertificateArn     IAMCertificateId     CloudFrontDefaultCertificate   
    */
  var Certificate: js.UndefOr[String] = js.undefined
  /**
    * This field is no longer used. Use one of the following fields instead:    ACMCertificateArn     IAMCertificateId     CloudFrontDefaultCertificate   
    */
  var CertificateSource: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.CertificateSource] = js.undefined
  /**
    * If you're using the CloudFront domain name for your distribution, such as d111111abcdef8.cloudfront.net, specify the following value:    &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;    
    */
  var CloudFrontDefaultCertificate: js.UndefOr[Boolean] = js.undefined
  /**
    * If you want viewers to use HTTPS to request your objects and you're using an alternate domain name, you must choose the type of certificate that you want to use. Specify the following value if you purchased your certificate from a third-party certificate authority:    &lt;IAMCertificateId&gt;IAM certificate ID&lt;IAMCertificateId&gt; where  IAM certificate ID  is the ID that IAM returned when you added the certificate to the IAM certificate store.   If you specify IAMCertificateId, you must also specify a value for SSLSupportMethod.
    */
  var IAMCertificateId: js.UndefOr[String] = js.undefined
  /**
    * Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy determines two settings:   The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers   The cipher that CloudFront uses to encrypt the content that it returns to viewers    On the CloudFront console, this setting is called Security policy.  We recommend that you specify TLSv1.1_2016 unless your users are using browsers or devices that do not support TLSv1.1 or later. When both of the following are true, you must specify TLSv1 or later for the security policy:    You're using a custom certificate: you specified a value for ACMCertificateArn or for IAMCertificateId    You're using SNI: you specified sni-only for SSLSupportMethod    If you specify true for CloudFrontDefaultCertificate, CloudFront automatically sets the security policy to TLSv1 regardless of the value that you specify for MinimumProtocolVersion. For information about the relationship between the security policy that you choose and the protocols and ciphers that CloudFront uses to communicate with viewers, see  Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront in the Amazon CloudFront Developer Guide.
    */
  var MinimumProtocolVersion: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.MinimumProtocolVersion] = js.undefined
  /**
    * If you specify a value for ACMCertificateArn or for IAMCertificateId, you must also specify how you want CloudFront to serve HTTPS requests: using a method that works for browsers and clients released after 2010 or one that works for all clients.    sni-only: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication (SNI). All modern browsers support SNI, but there are a few that don't. For a current list of the browsers that support SNI, see the Wikipedia entry Server Name Indication. To learn about options to explore if you have users with browsers that don't include SNI support, see Choosing How CloudFront Serves HTTPS Requests in the Amazon CloudFront Developer Guide.    vip: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from any viewer. However, there are additional monthly charges. For details, including specific pricing information, see Custom SSL options for Amazon CloudFront on the AWS marketing site.   Don't specify a value for SSLSupportMethod if you specified &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;. For more information, see Choosing How CloudFront Serves HTTPS Requests in the Amazon CloudFront Developer Guide.
    */
  var SSLSupportMethod: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.SSLSupportMethod] = js.undefined
}

object ViewerCertificate {
  @scala.inline
  def apply(
    ACMCertificateArn: String = null,
    Certificate: String = null,
    CertificateSource: CertificateSource = null,
    CloudFrontDefaultCertificate: js.UndefOr[Boolean] = js.undefined,
    IAMCertificateId: String = null,
    MinimumProtocolVersion: MinimumProtocolVersion = null,
    SSLSupportMethod: SSLSupportMethod = null
  ): ViewerCertificate = {
    val __obj = js.Dynamic.literal()
    if (ACMCertificateArn != null) __obj.updateDynamic("ACMCertificateArn")(ACMCertificateArn)
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate)
    if (CertificateSource != null) __obj.updateDynamic("CertificateSource")(CertificateSource.asInstanceOf[js.Any])
    if (!js.isUndefined(CloudFrontDefaultCertificate)) __obj.updateDynamic("CloudFrontDefaultCertificate")(CloudFrontDefaultCertificate)
    if (IAMCertificateId != null) __obj.updateDynamic("IAMCertificateId")(IAMCertificateId)
    if (MinimumProtocolVersion != null) __obj.updateDynamic("MinimumProtocolVersion")(MinimumProtocolVersion.asInstanceOf[js.Any])
    if (SSLSupportMethod != null) __obj.updateDynamic("SSLSupportMethod")(SSLSupportMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewerCertificate]
  }
}

