package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartVoiceToneAnalysisTaskResponse extends StObject {
  
  /**
    * The details of the voice tone analysis task.
    */
  var VoiceToneAnalysisTask: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceToneAnalysisTask] = js.undefined
}
object StartVoiceToneAnalysisTaskResponse {
  
  inline def apply(): StartVoiceToneAnalysisTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartVoiceToneAnalysisTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartVoiceToneAnalysisTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceToneAnalysisTask(value: VoiceToneAnalysisTask): Self = StObject.set(x, "VoiceToneAnalysisTask", value.asInstanceOf[js.Any])
    
    inline def setVoiceToneAnalysisTaskUndefined: Self = StObject.set(x, "VoiceToneAnalysisTask", js.undefined)
  }
}
