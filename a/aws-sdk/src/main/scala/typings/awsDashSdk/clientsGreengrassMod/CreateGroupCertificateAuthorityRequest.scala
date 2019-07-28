package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateGroupCertificateAuthorityRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
}

object CreateGroupCertificateAuthorityRequest {
  @scala.inline
  def apply(GroupId: __string, AmznClientToken: __string = null): CreateGroupCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    __obj.asInstanceOf[CreateGroupCertificateAuthorityRequest]
  }
}

