package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoRollbackConfig extends StObject {
  
  /**
    * List of CloudWatch alarms in your account that are configured to monitor metrics on an endpoint. If any alarms are tripped during a deployment, SageMaker rolls back the deployment.
    */
  var Alarms: js.UndefOr[AlarmList] = js.undefined
}
object AutoRollbackConfig {
  
  inline def apply(): AutoRollbackConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRollbackConfig]
  }
  
  extension [Self <: AutoRollbackConfig](x: Self) {
    
    inline def setAlarms(value: AlarmList): Self = StObject.set(x, "Alarms", value.asInstanceOf[js.Any])
    
    inline def setAlarmsUndefined: Self = StObject.set(x, "Alarms", js.undefined)
    
    inline def setAlarmsVarargs(value: Alarm*): Self = StObject.set(x, "Alarms", js.Array(value*))
  }
}
