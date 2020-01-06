package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGroupCertificateAuthorityRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.native
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string = js.native
}

object CreateGroupCertificateAuthorityRequest {
  @scala.inline
  def apply(GroupId: __string, AmznClientToken: __string = null): CreateGroupCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGroupCertificateAuthorityRequest]
  }
}

