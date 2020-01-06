package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupCertificateAuthorityProperties extends js.Object {
  /**
    * The ARN of the certificate authority for the group.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[__string] = js.native
  /**
    * The ID of the certificate authority for the group.
    */
  var GroupCertificateAuthorityId: js.UndefOr[__string] = js.native
}

object GroupCertificateAuthorityProperties {
  @scala.inline
  def apply(GroupCertificateAuthorityArn: __string = null, GroupCertificateAuthorityId: __string = null): GroupCertificateAuthorityProperties = {
    val __obj = js.Dynamic.literal()
    if (GroupCertificateAuthorityArn != null) __obj.updateDynamic("GroupCertificateAuthorityArn")(GroupCertificateAuthorityArn.asInstanceOf[js.Any])
    if (GroupCertificateAuthorityId != null) __obj.updateDynamic("GroupCertificateAuthorityId")(GroupCertificateAuthorityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCertificateAuthorityProperties]
  }
}

