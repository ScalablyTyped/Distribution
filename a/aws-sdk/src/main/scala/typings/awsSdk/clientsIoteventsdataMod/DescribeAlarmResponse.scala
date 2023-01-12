package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlarmResponse extends StObject {
  
  /**
    * Contains information about an alarm.
    */
  var alarm: js.UndefOr[Alarm] = js.undefined
}
object DescribeAlarmResponse {
  
  inline def apply(): DescribeAlarmResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlarmResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAlarmResponse] (val x: Self) extends AnyVal {
    
    inline def setAlarm(value: Alarm): Self = StObject.set(x, "alarm", value.asInstanceOf[js.Any])
    
    inline def setAlarmUndefined: Self = StObject.set(x, "alarm", js.undefined)
  }
}
