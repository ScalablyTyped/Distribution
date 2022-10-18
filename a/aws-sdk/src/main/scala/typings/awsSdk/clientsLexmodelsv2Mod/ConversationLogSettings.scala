package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationLogSettings extends StObject {
  
  /**
    * The Amazon S3 settings for logging audio to an S3 bucket.
    */
  var audioLogSettings: js.UndefOr[AudioLogSettingsList] = js.undefined
  
  /**
    * The Amazon CloudWatch Logs settings for logging text and metadata.
    */
  var textLogSettings: js.UndefOr[TextLogSettingsList] = js.undefined
}
object ConversationLogSettings {
  
  inline def apply(): ConversationLogSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConversationLogSettings]
  }
  
  extension [Self <: ConversationLogSettings](x: Self) {
    
    inline def setAudioLogSettings(value: AudioLogSettingsList): Self = StObject.set(x, "audioLogSettings", value.asInstanceOf[js.Any])
    
    inline def setAudioLogSettingsUndefined: Self = StObject.set(x, "audioLogSettings", js.undefined)
    
    inline def setAudioLogSettingsVarargs(value: AudioLogSetting*): Self = StObject.set(x, "audioLogSettings", js.Array(value*))
    
    inline def setTextLogSettings(value: TextLogSettingsList): Self = StObject.set(x, "textLogSettings", value.asInstanceOf[js.Any])
    
    inline def setTextLogSettingsUndefined: Self = StObject.set(x, "textLogSettings", js.undefined)
    
    inline def setTextLogSettingsVarargs(value: TextLogSetting*): Self = StObject.set(x, "textLogSettings", js.Array(value*))
  }
}
