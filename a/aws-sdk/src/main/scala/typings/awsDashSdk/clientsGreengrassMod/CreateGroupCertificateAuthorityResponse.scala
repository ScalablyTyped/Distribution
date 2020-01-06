package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupCertificateAuthorityResponse extends js.Object {
  /**
    * The ARN of the group certificate authority.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[__string] = js.native
}

object CreateGroupCertificateAuthorityResponse {
  @scala.inline
  def apply(GroupCertificateAuthorityArn: __string = null): CreateGroupCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupCertificateAuthorityArn != null) __obj.updateDynamic("GroupCertificateAuthorityArn")(GroupCertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupCertificateAuthorityResponse]
  }
}

