package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentAlarms extends StObject {
  
  /**
    * One or more CloudWatch alarm names. Use a "," to separate the alarms.
    */
  var alarmNames: StringList
  
  /**
    * Determines whether to use the CloudWatch alarm option in the service deployment process.
    */
  var enable: Boolean
  
  /**
    * Determines whether to configure Amazon ECS to roll back the service if a service deployment fails. If rollback is used, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
    */
  var rollback: Boolean
}
object DeploymentAlarms {
  
  inline def apply(alarmNames: StringList, enable: Boolean, rollback: Boolean): DeploymentAlarms = {
    val __obj = js.Dynamic.literal(alarmNames = alarmNames.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], rollback = rollback.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentAlarms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentAlarms] (val x: Self) extends AnyVal {
    
    inline def setAlarmNames(value: StringList): Self = StObject.set(x, "alarmNames", value.asInstanceOf[js.Any])
    
    inline def setAlarmNamesVarargs(value: String*): Self = StObject.set(x, "alarmNames", js.Array(value*))
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setRollback(value: Boolean): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
  }
}
