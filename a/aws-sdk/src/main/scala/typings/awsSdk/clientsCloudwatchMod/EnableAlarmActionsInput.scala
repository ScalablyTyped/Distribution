package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAlarmActionsInput extends StObject {
  
  /**
    * The names of the alarms.
    */
  var AlarmNames: typings.awsSdk.clientsCloudwatchMod.AlarmNames
}
object EnableAlarmActionsInput {
  
  inline def apply(AlarmNames: AlarmNames): EnableAlarmActionsInput = {
    val __obj = js.Dynamic.literal(AlarmNames = AlarmNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableAlarmActionsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableAlarmActionsInput] (val x: Self) extends AnyVal {
    
    inline def setAlarmNames(value: AlarmNames): Self = StObject.set(x, "AlarmNames", value.asInstanceOf[js.Any])
    
    inline def setAlarmNamesVarargs(value: AlarmName*): Self = StObject.set(x, "AlarmNames", js.Array(value*))
  }
}
