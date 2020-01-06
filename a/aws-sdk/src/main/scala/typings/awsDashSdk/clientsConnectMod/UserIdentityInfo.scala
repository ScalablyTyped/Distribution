package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserIdentityInfo extends js.Object {
  /**
    * The email address. If you are using SAML for identity management and include this parameter, an error is returned.
    */
  var Email: js.UndefOr[typings.awsDashSdk.clientsConnectMod.Email] = js.native
  /**
    * The first name. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var FirstName: js.UndefOr[AgentFirstName] = js.native
  /**
    * The last name. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var LastName: js.UndefOr[AgentLastName] = js.native
}

object UserIdentityInfo {
  @scala.inline
  def apply(Email: Email = null, FirstName: AgentFirstName = null, LastName: AgentLastName = null): UserIdentityInfo = {
    val __obj = js.Dynamic.literal()
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName.asInstanceOf[js.Any])
    if (LastName != null) __obj.updateDynamic("LastName")(LastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserIdentityInfo]
  }
}

