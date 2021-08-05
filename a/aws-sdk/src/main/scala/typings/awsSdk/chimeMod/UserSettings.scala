package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSettings extends StObject {
  
  /**
    * The telephony settings associated with the user.
    */
  var Telephony: TelephonySettings
}
object UserSettings {
  
  inline def apply(Telephony: TelephonySettings): UserSettings = {
    val __obj = js.Dynamic.literal(Telephony = Telephony.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSettings]
  }
  
  extension [Self <: UserSettings](x: Self) {
    
    inline def setTelephony(value: TelephonySettings): Self = StObject.set(x, "Telephony", value.asInstanceOf[js.Any])
  }
}
