package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupCertificateAuthoritiesResponse extends js.Object {
  /**
    * A list of certificate authorities associated with the group.
    */
  var GroupCertificateAuthorities: js.UndefOr[__listOfGroupCertificateAuthorityProperties] = js.undefined
}

object ListGroupCertificateAuthoritiesResponse {
  @scala.inline
  def apply(GroupCertificateAuthorities: __listOfGroupCertificateAuthorityProperties = null): ListGroupCertificateAuthoritiesResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupCertificateAuthorities != null) __obj.updateDynamic("GroupCertificateAuthorities")(GroupCertificateAuthorities)
    __obj.asInstanceOf[ListGroupCertificateAuthoritiesResponse]
  }
}

