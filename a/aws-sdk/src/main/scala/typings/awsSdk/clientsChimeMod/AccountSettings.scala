package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSettings extends StObject {
  
  /**
    * Setting that stops or starts remote control of shared screens during meetings.
    */
  var DisableRemoteControl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Setting that allows meeting participants to choose the Call me at a phone number option. For more information, see Join a Meeting without the Amazon Chime App.
    */
  var EnableDialOut: js.UndefOr[Boolean] = js.undefined
}
object AccountSettings {
  
  inline def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountSettings] (val x: Self) extends AnyVal {
    
    inline def setDisableRemoteControl(value: Boolean): Self = StObject.set(x, "DisableRemoteControl", value.asInstanceOf[js.Any])
    
    inline def setDisableRemoteControlUndefined: Self = StObject.set(x, "DisableRemoteControl", js.undefined)
    
    inline def setEnableDialOut(value: Boolean): Self = StObject.set(x, "EnableDialOut", value.asInstanceOf[js.Any])
    
    inline def setEnableDialOutUndefined: Self = StObject.set(x, "EnableDialOut", js.undefined)
  }
}
