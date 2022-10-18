package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAlarmModelRequest extends StObject {
  
  /**
    * The name of the alarm model.
    */
  var alarmModelName: AlarmModelName
}
object DeleteAlarmModelRequest {
  
  inline def apply(alarmModelName: AlarmModelName): DeleteAlarmModelRequest = {
    val __obj = js.Dynamic.literal(alarmModelName = alarmModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlarmModelRequest]
  }
  
  extension [Self <: DeleteAlarmModelRequest](x: Self) {
    
    inline def setAlarmModelName(value: AlarmModelName): Self = StObject.set(x, "alarmModelName", value.asInstanceOf[js.Any])
  }
}
