package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAlarmRequest extends StObject {
  
  /**
    * The name of the alarm to delete.
    */
  var alarmName: ResourceName
}
object DeleteAlarmRequest {
  
  inline def apply(alarmName: ResourceName): DeleteAlarmRequest = {
    val __obj = js.Dynamic.literal(alarmName = alarmName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlarmRequest]
  }
  
  extension [Self <: DeleteAlarmRequest](x: Self) {
    
    inline def setAlarmName(value: ResourceName): Self = StObject.set(x, "alarmName", value.asInstanceOf[js.Any])
  }
}
