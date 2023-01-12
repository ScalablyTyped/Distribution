package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageOptions extends StObject {
  
  /**
    * If `true`, the settings tab will display a section for configuring audio input and output devices for the agent's local machine.
    * If `false`, or if `pageOptions` is not provided, the agent will not be able to change audio device settings from the settings tab.
    */
  val enableAudioDeviceSettings: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, or if `pageOptions` is not provided, the settings tab will display a section for configuring the agent's phone type and deskphone number.
    * If `false`, the agent will not be able to change the phone type or deskphone number from the settings tab.
    */
  val enablePhoneTypeSettings: js.UndefOr[Boolean] = js.undefined
}
object PageOptions {
  
  inline def apply(): PageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageOptions] (val x: Self) extends AnyVal {
    
    inline def setEnableAudioDeviceSettings(value: Boolean): Self = StObject.set(x, "enableAudioDeviceSettings", value.asInstanceOf[js.Any])
    
    inline def setEnableAudioDeviceSettingsUndefined: Self = StObject.set(x, "enableAudioDeviceSettings", js.undefined)
    
    inline def setEnablePhoneTypeSettings(value: Boolean): Self = StObject.set(x, "enablePhoneTypeSettings", value.asInstanceOf[js.Any])
    
    inline def setEnablePhoneTypeSettingsUndefined: Self = StObject.set(x, "enablePhoneTypeSettings", js.undefined)
  }
}
