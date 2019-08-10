package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpekeKeyProvider extends js.Object {
  /**
    * If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a certificate with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource Name (ARN) here.
    */
  var CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm] = js.undefined
  /**
    * Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
    */
  var ResourceId: js.UndefOr[__string] = js.undefined
  /**
    * Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system ids. Other group types support one system id. See
    https://dashif.org/identifiers/content_protection/ for more details.
    */
  var SystemIds: js.UndefOr[__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.undefined
  /**
    * Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for encrypting your content.
    */
  var Url: js.UndefOr[__stringPatternHttps] = js.undefined
}

object SpekeKeyProvider {
  @scala.inline
  def apply(
    CertificateArn: __stringPatternArnAwsUsGovAcm = null,
    ResourceId: __string = null,
    SystemIds: __listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = null,
    Url: __stringPatternHttps = null
  ): SpekeKeyProvider = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (SystemIds != null) __obj.updateDynamic("SystemIds")(SystemIds)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[SpekeKeyProvider]
  }
}

