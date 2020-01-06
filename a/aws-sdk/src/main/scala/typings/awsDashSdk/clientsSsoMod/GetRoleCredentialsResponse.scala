package typings.awsDashSdk.clientsSsoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRoleCredentialsResponse extends js.Object {
  /**
    * The credentials for the role that is assigned to the user.
    */
  var roleCredentials: js.UndefOr[RoleCredentials] = js.native
}

object GetRoleCredentialsResponse {
  @scala.inline
  def apply(roleCredentials: RoleCredentials = null): GetRoleCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    if (roleCredentials != null) __obj.updateDynamic("roleCredentials")(roleCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRoleCredentialsResponse]
  }
}

