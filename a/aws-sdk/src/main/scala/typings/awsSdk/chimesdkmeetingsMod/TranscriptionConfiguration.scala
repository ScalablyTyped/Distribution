package typings.awsSdk.chimesdkmeetingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranscriptionConfiguration extends StObject {
  
  /**
    * The transcription configuration settings passed to Amazon Transcribe Medical.
    */
  var EngineTranscribeMedicalSettings: js.UndefOr[typings.awsSdk.chimesdkmeetingsMod.EngineTranscribeMedicalSettings] = js.undefined
  
  /**
    * The transcription configuration settings passed to Amazon Transcribe.
    */
  var EngineTranscribeSettings: js.UndefOr[typings.awsSdk.chimesdkmeetingsMod.EngineTranscribeSettings] = js.undefined
}
object TranscriptionConfiguration {
  
  inline def apply(): TranscriptionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TranscriptionConfiguration]
  }
  
  extension [Self <: TranscriptionConfiguration](x: Self) {
    
    inline def setEngineTranscribeMedicalSettings(value: EngineTranscribeMedicalSettings): Self = StObject.set(x, "EngineTranscribeMedicalSettings", value.asInstanceOf[js.Any])
    
    inline def setEngineTranscribeMedicalSettingsUndefined: Self = StObject.set(x, "EngineTranscribeMedicalSettings", js.undefined)
    
    inline def setEngineTranscribeSettings(value: EngineTranscribeSettings): Self = StObject.set(x, "EngineTranscribeSettings", value.asInstanceOf[js.Any])
    
    inline def setEngineTranscribeSettingsUndefined: Self = StObject.set(x, "EngineTranscribeSettings", js.undefined)
  }
}
