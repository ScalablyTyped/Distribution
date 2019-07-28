package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpekeKeyProvider extends js.Object {
  /**
    * Optional AWS Certificate Manager ARN for a certificate to send to the keyprovider. The certificate holds a key used by the keyprovider to encrypt the keys in its response.
    */
  var CertificateArn: js.UndefOr[__stringPatternArnAwsUsGovAcm] = js.undefined
  /**
    * The SPEKE-compliant server uses Resource ID (ResourceId) to identify content.
    */
  var ResourceId: js.UndefOr[__string] = js.undefined
  /**
    * Relates to SPEKE implementation. DRM system identifiers. DASH output groups support a max of two system ids. Other group types support one system id.
    */
  var SystemIds: js.UndefOr[__listOf__stringPattern09aFAF809aFAF409aFAF409aFAF409aFAF12] = js.undefined
  /**
    * Use URL (Url) to specify the SPEKE-compliant server that will provide keys for content.
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

