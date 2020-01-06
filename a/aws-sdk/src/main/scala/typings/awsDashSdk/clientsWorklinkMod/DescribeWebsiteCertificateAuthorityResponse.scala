package typings.awsDashSdk.clientsWorklinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWebsiteCertificateAuthorityResponse extends js.Object {
  /**
    * The root certificate of the certificate authority.
    */
  var Certificate: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.Certificate] = js.native
  /**
    * The time that the certificate authority was added.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.native
  /**
    * The certificate name to display.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsWorklinkMod.DisplayName] = js.native
}

object DescribeWebsiteCertificateAuthorityResponse {
  @scala.inline
  def apply(Certificate: Certificate = null, CreatedTime: DateTime = null, DisplayName: DisplayName = null): DescribeWebsiteCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWebsiteCertificateAuthorityResponse]
  }
}

