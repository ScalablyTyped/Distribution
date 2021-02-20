package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSettings extends StObject {
  
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
  
  @scala.inline
  implicit class UserSettingsMutableBuilder[Self <: UserSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTelephony(value: TelephonySettings): Self = StObject.set(x, "Telephony", value.asInstanceOf[js.Any])
  }
}
