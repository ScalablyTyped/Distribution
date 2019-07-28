package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserSettings extends js.Object {
  /**
    * The telephony settings associated with the user.
    */
  var Telephony: TelephonySettings
}

object UserSettings {
  @scala.inline
  def apply(Telephony: TelephonySettings): UserSettings = {
    val __obj = js.Dynamic.literal(Telephony = Telephony)
  
    __obj.asInstanceOf[UserSettings]
  }
}

