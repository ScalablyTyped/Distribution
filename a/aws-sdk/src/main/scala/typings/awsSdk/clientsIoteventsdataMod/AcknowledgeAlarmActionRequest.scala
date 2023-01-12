package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcknowledgeAlarmActionRequest extends StObject {
  
  /**
    * The name of the alarm model.
    */
  var alarmModelName: AlarmModelName
  
  /**
    * The value of the key used as a filter to select only the alarms associated with the key.
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
  
  /**
    * The note that you can leave when you acknowledge the alarm.
    */
  var note: js.UndefOr[Note] = js.undefined
  
  /**
    * The request ID. Each ID must be unique within each batch.
    */
  var requestId: RequestId
}
object AcknowledgeAlarmActionRequest {
  
  inline def apply(alarmModelName: AlarmModelName, requestId: RequestId): AcknowledgeAlarmActionRequest = {
    val __obj = js.Dynamic.literal(alarmModelName = alarmModelName.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeAlarmActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcknowledgeAlarmActionRequest] (val x: Self) extends AnyVal {
    
    inline def setAlarmModelName(value: AlarmModelName): Self = StObject.set(x, "alarmModelName", value.asInstanceOf[js.Any])
    
    inline def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    inline def setNote(value: Note): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
