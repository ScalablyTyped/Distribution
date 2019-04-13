package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewerCertificate extends js.Object {
  /**
    * For information about how and when to use ACMCertificateArn, see ViewerCertificate.
    */
  var ACMCertificateArn: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This field has been deprecated. Use one of the following fields instead:    ViewerCertificate$ACMCertificateArn     ViewerCertificate$IAMCertificateId     ViewerCertificate$CloudFrontDefaultCertificate   
    */
  var Certificate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This field has been deprecated. Use one of the following fields instead:    ViewerCertificate$ACMCertificateArn     ViewerCertificate$IAMCertificateId     ViewerCertificate$CloudFrontDefaultCertificate   
    */
  var CertificateSource: js.UndefOr[CertificateSource] = js.undefined
  /**
    * For information about how and when to use CloudFrontDefaultCertificate, see ViewerCertificate.
    */
  var CloudFrontDefaultCertificate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For information about how and when to use IAMCertificateId, see ViewerCertificate.
    */
  var IAMCertificateId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the security policy that you want CloudFront to use for HTTPS connections. A security policy determines two settings:   The minimum SSL/TLS protocol that CloudFront uses to communicate with viewers   The cipher that CloudFront uses to encrypt the content that it returns to viewers    On the CloudFront console, this setting is called Security policy.  We recommend that you specify TLSv1.1_2016 unless your users are using browsers or devices that do not support TLSv1.1 or later. When both of the following are true, you must specify TLSv1 or later for the security policy:    You're using a custom certificate: you specified a value for ACMCertificateArn or for IAMCertificateId    You're using SNI: you specified sni-only for SSLSupportMethod    If you specify true for CloudFrontDefaultCertificate, CloudFront automatically sets the security policy to TLSv1 regardless of the value that you specify for MinimumProtocolVersion. For information about the relationship between the security policy that you choose and the protocols and ciphers that CloudFront uses to communicate with viewers, see  Supported SSL/TLS Protocols and Ciphers for Communication Between Viewers and CloudFront in the Amazon CloudFront Developer Guide.
    */
  var MinimumProtocolVersion: js.UndefOr[MinimumProtocolVersion] = js.undefined
  /**
    * If you specify a value for ViewerCertificate$ACMCertificateArn or for ViewerCertificate$IAMCertificateId, you must also specify how you want CloudFront to serve HTTPS requests: using a method that works for all clients or one that works for most clients:    vip: CloudFront uses dedicated IP addresses for your content and can respond to HTTPS requests from any viewer. However, you will incur additional monthly charges.    sni-only: CloudFront can respond to HTTPS requests from viewers that support Server Name Indication (SNI). All modern browsers support SNI, but some browsers still in use don't support SNI. If some of your users' browsers don't support SNI, we recommend that you do one of the following:   Use the vip option (dedicated IP addresses) instead of sni-only.   Use the CloudFront SSL/TLS certificate instead of a custom certificate. This requires that you use the CloudFront domain name of your distribution in the URLs for your objects, for example, https://d111111abcdef8.cloudfront.net/logo.png.   If you can control which browser your users use, upgrade the browser to one that supports SNI.   Use HTTP instead of HTTPS.     Don't specify a value for SSLSupportMethod if you specified &lt;CloudFrontDefaultCertificate&gt;true&lt;CloudFrontDefaultCertificate&gt;. For more information, see Using Alternate Domain Names and HTTPS in the Amazon CloudFront Developer Guide.
    */
  var SSLSupportMethod: js.UndefOr[SSLSupportMethod] = js.undefined
}

object ViewerCertificate {
  @scala.inline
  def apply(
    ACMCertificateArn: java.lang.String = null,
    Certificate: java.lang.String = null,
    CertificateSource: CertificateSource = null,
    CloudFrontDefaultCertificate: js.UndefOr[scala.Boolean] = js.undefined,
    IAMCertificateId: java.lang.String = null,
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

