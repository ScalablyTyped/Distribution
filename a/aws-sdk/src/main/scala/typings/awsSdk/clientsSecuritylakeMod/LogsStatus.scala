package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogsStatus extends StObject {
  
  /**
    * The health status of services, including error codes and patterns.
    */
  var healthStatus: SourceStatus
  
  /**
    * Defines path the stored logs are available which has information on your systems, applications, and services. 
    */
  var pathToLogs: String
}
object LogsStatus {
  
  inline def apply(healthStatus: SourceStatus, pathToLogs: String): LogsStatus = {
    val __obj = js.Dynamic.literal(healthStatus = healthStatus.asInstanceOf[js.Any], pathToLogs = pathToLogs.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogsStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogsStatus] (val x: Self) extends AnyVal {
    
    inline def setHealthStatus(value: SourceStatus): Self = StObject.set(x, "healthStatus", value.asInstanceOf[js.Any])
    
    inline def setPathToLogs(value: String): Self = StObject.set(x, "pathToLogs", value.asInstanceOf[js.Any])
  }
}
