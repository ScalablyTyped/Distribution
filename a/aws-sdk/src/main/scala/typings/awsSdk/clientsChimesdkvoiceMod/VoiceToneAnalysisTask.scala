package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceToneAnalysisTask extends StObject {
  
  /**
    * The call details of a voice tone analysis task.
    */
  var CallDetails: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.CallDetails] = js.undefined
  
  /**
    * The time at which a voice tone analysis task was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time at which a voice tone analysis task started.
    */
  var StartedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of a voice tone analysis task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which a voice tone analysis task was updated.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the voice tone analysis task.
    */
  var VoiceToneAnalysisTaskId: js.UndefOr[NonEmptyString256] = js.undefined
  
  /**
    * The status of a voice tone analysis task, IN_QUEUE, IN_PROGRESS, PARTIAL_SUCCESS, SUCCEEDED, FAILED, or STOPPED.
    */
  var VoiceToneAnalysisTaskStatus: js.UndefOr[NonEmptyString] = js.undefined
}
object VoiceToneAnalysisTask {
  
  inline def apply(): VoiceToneAnalysisTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceToneAnalysisTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoiceToneAnalysisTask] (val x: Self) extends AnyVal {
    
    inline def setCallDetails(value: CallDetails): Self = StObject.set(x, "CallDetails", value.asInstanceOf[js.Any])
    
    inline def setCallDetailsUndefined: Self = StObject.set(x, "CallDetails", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setStartedTimestamp(value: js.Date): Self = StObject.set(x, "StartedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartedTimestampUndefined: Self = StObject.set(x, "StartedTimestamp", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
    
    inline def setVoiceToneAnalysisTaskId(value: NonEmptyString256): Self = StObject.set(x, "VoiceToneAnalysisTaskId", value.asInstanceOf[js.Any])
    
    inline def setVoiceToneAnalysisTaskIdUndefined: Self = StObject.set(x, "VoiceToneAnalysisTaskId", js.undefined)
    
    inline def setVoiceToneAnalysisTaskStatus(value: NonEmptyString): Self = StObject.set(x, "VoiceToneAnalysisTaskStatus", value.asInstanceOf[js.Any])
    
    inline def setVoiceToneAnalysisTaskStatusUndefined: Self = StObject.set(x, "VoiceToneAnalysisTaskStatus", js.undefined)
  }
}
