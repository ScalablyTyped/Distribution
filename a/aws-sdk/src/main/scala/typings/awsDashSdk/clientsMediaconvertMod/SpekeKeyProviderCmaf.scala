package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpekeKeyProviderCmaf extends js.Object {
  /**
    * If you want your key provider to encrypt the content keys that it provides to MediaConvert, set up a certificate with a master key using AWS Certificate Manager. Specify the certificate's Amazon Resource Name (ARN) here.
    */
  var CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm] = js.undefined
  /**
    * Specify the DRM system IDs that you want signaled in the DASH manifest that MediaConvert creates as part of this CMAF package. The DASH manifest can currently signal up to three system IDs. For more information, see https://dashif.org/identifiers/content_protection/.
    */
  var DashSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.undefined
  /**
    * Specify the DRM system ID that you want signaled in the HLS manifest that MediaConvert creates as part of this CMAF package. The HLS manifest can currently signal only one system ID. For more information, see https://dashif.org/identifiers/content_protection/.
    */
  var HlsSignaledSystemIds: js.UndefOr[__listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.undefined
  /**
    * Specify the resource ID that your SPEKE-compliant key provider uses to identify this content.
    */
  var ResourceId: js.UndefOr[__stringPatternW] = js.undefined
  /**
    * Specify the URL to the key server that your SPEKE-compliant DRM key provider uses to provide keys for encrypting your content.
    */
  var Url: js.UndefOr[__stringPatternHttps] = js.undefined
}

object SpekeKeyProviderCmaf {
  @scala.inline
  def apply(
    CertificateArn: __stringPatternArnAwsUsGovAcm = null,
    DashSignaledSystemIds: __listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = null,
    HlsSignaledSystemIds: __listOf__stringMin36Max36Pattern09aFAF809aFAF409aFAF409aFAF409aFAF12 = null,
    ResourceId: __stringPatternW = null,
    Url: __stringPatternHttps = null
  ): SpekeKeyProviderCmaf = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn)
    if (DashSignaledSystemIds != null) __obj.updateDynamic("DashSignaledSystemIds")(DashSignaledSystemIds)
    if (HlsSignaledSystemIds != null) __obj.updateDynamic("HlsSignaledSystemIds")(HlsSignaledSystemIds)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[SpekeKeyProviderCmaf]
  }
}

