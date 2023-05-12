package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceAnalyticsProcessorConfiguration extends StObject {
  
  /**
    * The status of the speaker search task.
    */
  var SpeakerSearchStatus: js.UndefOr[VoiceAnalyticsConfigurationStatus] = js.undefined
  
  /**
    * The status of the voice tone analysis task.
    */
  var VoiceToneAnalysisStatus: js.UndefOr[VoiceAnalyticsConfigurationStatus] = js.undefined
}
object VoiceAnalyticsProcessorConfiguration {
  
  inline def apply(): VoiceAnalyticsProcessorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceAnalyticsProcessorConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceAnalyticsProcessorConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSpeakerSearchStatus(value: VoiceAnalyticsConfigurationStatus): Self = StObject.set(x, "SpeakerSearchStatus", value.asInstanceOf[js.Any])
    
    inline def setSpeakerSearchStatusUndefined: Self = StObject.set(x, "SpeakerSearchStatus", js.undefined)
    
    inline def setVoiceToneAnalysisStatus(value: VoiceAnalyticsConfigurationStatus): Self = StObject.set(x, "VoiceToneAnalysisStatus", value.asInstanceOf[js.Any])
    
    inline def setVoiceToneAnalysisStatusUndefined: Self = StObject.set(x, "VoiceToneAnalysisStatus", js.undefined)
  }
}
