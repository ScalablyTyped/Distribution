package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWebsiteCertificateAuthorityResponse extends js.Object {
  /**
    * The root certificate of the certificate authority.
    */
  var Certificate: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.Certificate] = js.undefined
  /**
    * The time that the certificate authority was added.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The certificate name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.DisplayName] = js.undefined
}

object DescribeWebsiteCertificateAuthorityResponse {
  @scala.inline
  def apply(Certificate: Certificate = null, CreatedTime: DateTime = null, DisplayName: DisplayName = null): DescribeWebsiteCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.asInstanceOf[DescribeWebsiteCertificateAuthorityResponse]
  }
}

