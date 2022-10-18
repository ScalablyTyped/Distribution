package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAlarmsInput extends StObject {
  
  /**
    * The alarms to be deleted.
    */
  var AlarmNames: typings.awsSdk.clientsCloudwatchMod.AlarmNames
}
object DeleteAlarmsInput {
  
  inline def apply(AlarmNames: AlarmNames): DeleteAlarmsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlarmsInput]
  }
  
  extension [Self <: DeleteAlarmsInput](x: Self) {
    
    inline def setAlarmNames(value: AlarmNames): Self = StObject.set(x, "AlarmNames", value.asInstanceOf[js.Any])
    
    inline def setAlarmNamesVarargs(value: AlarmName*): Self = StObject.set(x, "AlarmNames", js.Array(value*))
  }
}
