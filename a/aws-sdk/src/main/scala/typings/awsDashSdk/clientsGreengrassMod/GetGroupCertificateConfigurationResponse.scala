package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupCertificateConfigurationResponse extends js.Object {
  /**
    * The amount of time remaining before the certificate authority expires, in milliseconds.
    */
  var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string] = js.native
  /**
    * The amount of time remaining before the certificate expires, in milliseconds.
    */
  var CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.native
  /**
    * The ID of the group certificate configuration.
    */
  var GroupId: js.UndefOr[__string] = js.native
}

object GetGroupCertificateConfigurationResponse {
  @scala.inline
  def apply(
    CertificateAuthorityExpiryInMilliseconds: __string = null,
    CertificateExpiryInMilliseconds: __string = null,
    GroupId: __string = null
  ): GetGroupCertificateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateAuthorityExpiryInMilliseconds != null) __obj.updateDynamic("CertificateAuthorityExpiryInMilliseconds")(CertificateAuthorityExpiryInMilliseconds.asInstanceOf[js.Any])
    if (CertificateExpiryInMilliseconds != null) __obj.updateDynamic("CertificateExpiryInMilliseconds")(CertificateExpiryInMilliseconds.asInstanceOf[js.Any])
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupCertificateConfigurationResponse]
  }
}

