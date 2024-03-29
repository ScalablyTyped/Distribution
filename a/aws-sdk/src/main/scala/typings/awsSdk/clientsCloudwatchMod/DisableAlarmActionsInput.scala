package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableAlarmActionsInput extends StObject {
  
  /**
    * The names of the alarms.
    */
  var AlarmNames: typings.awsSdk.clientsCloudwatchMod.AlarmNames
}
object DisableAlarmActionsInput {
  
  inline def apply(AlarmNames: AlarmNames): DisableAlarmActionsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableAlarmActionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableAlarmActionsInput] (val x: Self) extends AnyVal {
    
    inline def setAlarmNames(value: AlarmNames): Self = StObject.set(x, "AlarmNames", value.asInstanceOf[js.Any])
    
    inline def setAlarmNamesVarargs(value: AlarmName*): Self = StObject.set(x, "AlarmNames", js.Array(value*))
  }
}
