package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpeakerSearchTask extends StObject {
  
  /**
    * The call details of a speaker search task.
    */
  var CallDetails: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.CallDetails] = js.undefined
  
  /**
    * The time at which a speaker search task was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The details of a speaker search task.
    */
  var SpeakerSearchDetails: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.SpeakerSearchDetails] = js.undefined
  
  /**
    * The speaker search task ID.
    */
  var SpeakerSearchTaskId: js.UndefOr[NonEmptyString256] = js.undefined
  
  /**
    * The status of the speaker search task, IN_QUEUE, IN_PROGRESS, PARTIAL_SUCCESS, SUCCEEDED, FAILED, or STOPPED.
    */
  var SpeakerSearchTaskStatus: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The time at which the speaker search task began.
    */
  var StartedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A detailed message about the status of a speaker search.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which a speaker search task was updated.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object SpeakerSearchTask {
  
  inline def apply(): SpeakerSearchTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpeakerSearchTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpeakerSearchTask] (val x: Self) extends AnyVal {
    
    inline def setCallDetails(value: CallDetails): Self = StObject.set(x, "CallDetails", value.asInstanceOf[js.Any])
    
    inline def setCallDetailsUndefined: Self = StObject.set(x, "CallDetails", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setSpeakerSearchDetails(value: SpeakerSearchDetails): Self = StObject.set(x, "SpeakerSearchDetails", value.asInstanceOf[js.Any])
    
    inline def setSpeakerSearchDetailsUndefined: Self = StObject.set(x, "SpeakerSearchDetails", js.undefined)
    
    inline def setSpeakerSearchTaskId(value: NonEmptyString256): Self = StObject.set(x, "SpeakerSearchTaskId", value.asInstanceOf[js.Any])
    
    inline def setSpeakerSearchTaskIdUndefined: Self = StObject.set(x, "SpeakerSearchTaskId", js.undefined)
    
    inline def setSpeakerSearchTaskStatus(value: NonEmptyString): Self = StObject.set(x, "SpeakerSearchTaskStatus", value.asInstanceOf[js.Any])
    
    inline def setSpeakerSearchTaskStatusUndefined: Self = StObject.set(x, "SpeakerSearchTaskStatus", js.undefined)
    
    inline def setStartedTimestamp(value: js.Date): Self = StObject.set(x, "StartedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartedTimestampUndefined: Self = StObject.set(x, "StartedTimestamp", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
