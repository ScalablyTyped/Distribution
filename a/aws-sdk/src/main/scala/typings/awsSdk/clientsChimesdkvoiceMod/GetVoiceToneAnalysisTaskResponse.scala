package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVoiceToneAnalysisTaskResponse extends StObject {
  
  /**
    * The details of the voice tone analysis task.
    */
  var VoiceToneAnalysisTask: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.VoiceToneAnalysisTask] = js.undefined
}
object GetVoiceToneAnalysisTaskResponse {
  
  inline def apply(): GetVoiceToneAnalysisTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceToneAnalysisTaskResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVoiceToneAnalysisTaskResponse] (val x: Self) extends AnyVal {
    
    inline def setVoiceToneAnalysisTask(value: VoiceToneAnalysisTask): Self = StObject.set(x, "VoiceToneAnalysisTask", value.asInstanceOf[js.Any])
    
    inline def setVoiceToneAnalysisTaskUndefined: Self = StObject.set(x, "VoiceToneAnalysisTask", js.undefined)
  }
}
