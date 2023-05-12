package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlarmConfiguration extends StObject {
  
  /**
    * The name of the CloudWatch alarm specified in the configuration.
    */
  var Alarms: AlarmList
  
  /**
    * When this value is true, your automation or command continues to run in cases where we can’t retrieve alarm status information from CloudWatch. In cases where we successfully retrieve an alarm status of OK or INSUFFICIENT_DATA, the automation or command continues to run, regardless of this value. Default is false.
    */
  var IgnorePollAlarmFailure: js.UndefOr[Boolean] = js.undefined
}
object AlarmConfiguration {
  
  inline def apply(Alarms: AlarmList): AlarmConfiguration = {
    val __obj = js.Dynamic.literal(Alarms = Alarms.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlarmConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlarmConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAlarms(value: AlarmList): Self = StObject.set(x, "Alarms", value.asInstanceOf[js.Any])
    
    inline def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "Alarms", js.Array(value*))
    
    inline def setIgnorePollAlarmFailure(value: Boolean): Self = StObject.set(x, "IgnorePollAlarmFailure", value.asInstanceOf[js.Any])
    
    inline def setIgnorePollAlarmFailureUndefined: Self = StObject.set(x, "IgnorePollAlarmFailure", js.undefined)
  }
}
