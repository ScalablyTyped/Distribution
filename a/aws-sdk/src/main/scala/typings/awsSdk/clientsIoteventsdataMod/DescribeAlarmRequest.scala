package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlarmRequest extends StObject {
  
  /**
    * The name of the alarm model.
    */
  var alarmModelName: AlarmModelName
  
  /**
    * The value of the key used as a filter to select only the alarms associated with the key.
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
}
object DescribeAlarmRequest {
  
  inline def apply(alarmModelName: AlarmModelName): DescribeAlarmRequest = {
    val __obj = js.Dynamic.literal(alarmModelName = alarmModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAlarmRequest]
  }
  
  extension [Self <: DescribeAlarmRequest](x: Self) {
    
    inline def setAlarmModelName(value: AlarmModelName): Self = StObject.set(x, "alarmModelName", value.asInstanceOf[js.Any])
    
    inline def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
  }
}
