package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceSettings extends StObject {
  
  /**
    * Indicates the type of Amazon Polly voice that Amazon Lex should use for voice interaction with the user. For more information, see the  engine parameter of the SynthesizeSpeech operation in the Amazon Polly developer guide. If you do not specify a value, the default is standard.
    */
  var engine: js.UndefOr[VoiceEngine] = js.undefined
  
  /**
    * The identifier of the Amazon Polly voice to use.
    */
  var voiceId: VoiceId
}
object VoiceSettings {
  
  inline def apply(voiceId: VoiceId): VoiceSettings = {
    val __obj = js.Dynamic.literal(voiceId = voiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceSettings]
  }
  
  extension [Self <: VoiceSettings](x: Self) {
    
    inline def setEngine(value: VoiceEngine): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    inline def setVoiceId(value: VoiceId): Self = StObject.set(x, "voiceId", value.asInstanceOf[js.Any])
  }
}
