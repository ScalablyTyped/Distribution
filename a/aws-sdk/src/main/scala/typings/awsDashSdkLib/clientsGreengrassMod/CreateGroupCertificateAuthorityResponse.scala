package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupCertificateAuthorityResponse extends js.Object {
  /**
    * The ARN of the group certificate authority.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined
}

object CreateGroupCertificateAuthorityResponse {
  @scala.inline
  def apply(GroupCertificateAuthorityArn: __string = null): CreateGroupCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupCertificateAuthorityArn != null) __obj.updateDynamic("GroupCertificateAuthorityArn")(GroupCertificateAuthorityArn)
    __obj.asInstanceOf[CreateGroupCertificateAuthorityResponse]
  }
}

