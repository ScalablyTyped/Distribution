package typings.awsSdk.clientsCloud9Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentStatusResult extends StObject {
  
  /**
    * Any informational message about the status of the environment.
    */
  var message: String
  
  /**
    * The status of the environment. Available values include:    connecting: The environment is connecting.    creating: The environment is being created.    deleting: The environment is being deleted.    error: The environment is in an error state.    ready: The environment is ready.    stopped: The environment is stopped.    stopping: The environment is stopping.  
    */
  var status: EnvironmentStatus
}
object DescribeEnvironmentStatusResult {
  
  inline def apply(message: String, status: EnvironmentStatus): DescribeEnvironmentStatusResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentStatusResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEnvironmentStatusResult] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EnvironmentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
