package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupCertificateAuthoritiesRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
}

object ListGroupCertificateAuthoritiesRequest {
  @scala.inline
  def apply(GroupId: __string): ListGroupCertificateAuthoritiesRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
  
    __obj.asInstanceOf[ListGroupCertificateAuthoritiesRequest]
  }
}

