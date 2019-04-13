package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credential extends js.Object {
  /**
    * The RFC2617 compliant password associated with the SIP credentials, in US-ASCII format.
    */
  var Password: js.UndefOr[SensitiveString] = js.undefined
  /**
    * The RFC2617 compliant user name associated with the SIP credentials, in US-ASCII format.
    */
  var Username: js.UndefOr[SensitiveString] = js.undefined
}

object Credential {
  @scala.inline
  def apply(Password: SensitiveString = null, Username: SensitiveString = null): Credential = {
    val __obj = js.Dynamic.literal()
    if (Password != null) __obj.updateDynamic("Password")(Password)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[Credential]
  }
}

