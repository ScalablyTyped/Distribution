package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupCertificateAuthorityResponse extends js.Object {
  /**
    * The ARN of the certificate authority for the group.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the certificate authority for the group.
    */
  var GroupCertificateAuthorityId: js.UndefOr[__string] = js.undefined
  /**
    * The PEM encoded certificate for the group.
    */
  var PemEncodedCertificate: js.UndefOr[__string] = js.undefined
}

object GetGroupCertificateAuthorityResponse {
  @scala.inline
  def apply(
    GroupCertificateAuthorityArn: __string = null,
    GroupCertificateAuthorityId: __string = null,
    PemEncodedCertificate: __string = null
  ): GetGroupCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupCertificateAuthorityArn != null) __obj.updateDynamic("GroupCertificateAuthorityArn")(GroupCertificateAuthorityArn)
    if (GroupCertificateAuthorityId != null) __obj.updateDynamic("GroupCertificateAuthorityId")(GroupCertificateAuthorityId)
    if (PemEncodedCertificate != null) __obj.updateDynamic("PemEncodedCertificate")(PemEncodedCertificate)
    __obj.asInstanceOf[GetGroupCertificateAuthorityResponse]
  }
}

