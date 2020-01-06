package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credential extends js.Object {
  /**
    * The RFC2617 compliant password associated with the SIP credentials, in US-ASCII format.
    */
  var Password: js.UndefOr[SensitiveString] = js.native
  /**
    * The RFC2617 compliant user name associated with the SIP credentials, in US-ASCII format.
    */
  var Username: js.UndefOr[SensitiveString] = js.native
}

object Credential {
  @scala.inline
  def apply(Password: SensitiveString = null, Username: SensitiveString = null): Credential = {
    val __obj = js.Dynamic.literal()
    if (Password != null) __obj.updateDynamic("Password")(Password.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credential]
  }
}

