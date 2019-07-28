package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupCertificateConfigurationResponse extends js.Object {
  /**
    * The amount of time remaining before the certificate authority expires, in milliseconds.
    */
  var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string] = js.undefined
  /**
    * The amount of time remaining before the certificate expires, in milliseconds.
    */
  var CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the group certificate configuration.
    */
  var GroupId: js.UndefOr[__string] = js.undefined
}

object GetGroupCertificateConfigurationResponse {
  @scala.inline
  def apply(
    CertificateAuthorityExpiryInMilliseconds: __string = null,
    CertificateExpiryInMilliseconds: __string = null,
    GroupId: __string = null
  ): GetGroupCertificateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    if (CertificateAuthorityExpiryInMilliseconds != null) __obj.updateDynamic("CertificateAuthorityExpiryInMilliseconds")(CertificateAuthorityExpiryInMilliseconds)
    if (CertificateExpiryInMilliseconds != null) __obj.updateDynamic("CertificateExpiryInMilliseconds")(CertificateExpiryInMilliseconds)
    if (GroupId != null) __obj.updateDynamic("GroupId")(GroupId)
    __obj.asInstanceOf[GetGroupCertificateConfigurationResponse]
  }
}

