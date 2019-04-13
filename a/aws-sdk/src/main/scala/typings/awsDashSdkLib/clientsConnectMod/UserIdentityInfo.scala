package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdentityInfo extends js.Object {
  /**
    * The email address added to the user account. If you are using SAML for identity management and include this parameter, an InvalidRequestException is returned.
    */
  var Email: js.UndefOr[Email] = js.undefined
  /**
    * The first name used in the user account. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var FirstName: js.UndefOr[AgentFirstName] = js.undefined
  /**
    * The last name used in the user account. This is required if you are using Amazon Connect or SAML for identity management.
    */
  var LastName: js.UndefOr[AgentLastName] = js.undefined
}

object UserIdentityInfo {
  @scala.inline
  def apply(Email: Email = null, FirstName: AgentFirstName = null, LastName: AgentLastName = null): UserIdentityInfo = {
    val __obj = js.Dynamic.literal()
    if (Email != null) __obj.updateDynamic("Email")(Email)
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName)
    if (LastName != null) __obj.updateDynamic("LastName")(LastName)
    __obj.asInstanceOf[UserIdentityInfo]
  }
}

