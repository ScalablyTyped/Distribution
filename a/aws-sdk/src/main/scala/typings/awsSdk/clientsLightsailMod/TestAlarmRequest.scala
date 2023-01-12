package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestAlarmRequest extends StObject {
  
  /**
    * The name of the alarm to test.
    */
  var alarmName: ResourceName
  
  /**
    * The alarm state to test. An alarm has the following possible states that can be tested:    ALARM - The metric is outside of the defined threshold.    INSUFFICIENT_DATA - The alarm has just started, the metric is not available, or not enough data is available for the metric to determine the alarm state.    OK - The metric is within the defined threshold.  
    */
  var state: AlarmState
}
object TestAlarmRequest {
  
  inline def apply(alarmName: ResourceName, state: AlarmState): TestAlarmRequest = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAlarmRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestAlarmRequest] (val x: Self) extends AnyVal {
    
    inline def setAlarmName(value: ResourceName): Self = StObject.set(x, "alarmName", value.asInstanceOf[js.Any])
    
    inline def setState(value: AlarmState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
