package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupCertificateAuthorityRequest extends js.Object {
  /**
    * The ID of the certificate authority.
    */
  var CertificateAuthorityId: __string
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
}

object GetGroupCertificateAuthorityRequest {
  @scala.inline
  def apply(CertificateAuthorityId: __string, GroupId: __string): GetGroupCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityId = CertificateAuthorityId, GroupId = GroupId)
  
    __obj.asInstanceOf[GetGroupCertificateAuthorityRequest]
  }
}

