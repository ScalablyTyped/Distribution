package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupCertificateAuthorityProperties extends js.Object {
  /**
    * The ARN of the certificate authority for the group.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the certificate authority for the group.
    */
  var GroupCertificateAuthorityId: js.UndefOr[__string] = js.undefined
}

object GroupCertificateAuthorityProperties {
  @scala.inline
  def apply(GroupCertificateAuthorityArn: __string = null, GroupCertificateAuthorityId: __string = null): GroupCertificateAuthorityProperties = {
    val __obj = js.Dynamic.literal()
    if (GroupCertificateAuthorityArn != null) __obj.updateDynamic("GroupCertificateAuthorityArn")(GroupCertificateAuthorityArn)
    if (GroupCertificateAuthorityId != null) __obj.updateDynamic("GroupCertificateAuthorityId")(GroupCertificateAuthorityId)
    __obj.asInstanceOf[GroupCertificateAuthorityProperties]
  }
}

