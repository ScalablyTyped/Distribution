package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserSettings extends js.Object {
  /**
    * The telephony settings associated with the user.
    */
  var Telephony: TelephonySettings = js.native
}

object UserSettings {
  @scala.inline
  def apply(Telephony: TelephonySettings): UserSettings = {
    val __obj = js.Dynamic.literal(Telephony = Telephony.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserSettings]
  }
}

