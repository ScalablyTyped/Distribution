package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShutdownEventConfiguration extends StObject {
  
  /**
    * Whether to enable Elastic Load Balancing connection draining. For more information, see Connection Draining 
    */
  var DelayUntilElbConnectionsDrained: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time, in seconds, that AWS OpsWorks Stacks will wait after triggering a Shutdown event before shutting down an instance.
    */
  var ExecutionTimeout: js.UndefOr[Integer] = js.undefined
}
object ShutdownEventConfiguration {
  
  inline def apply(): ShutdownEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShutdownEventConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShutdownEventConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDelayUntilElbConnectionsDrained(value: Boolean): Self = StObject.set(x, "DelayUntilElbConnectionsDrained", value.asInstanceOf[js.Any])
    
    inline def setDelayUntilElbConnectionsDrainedUndefined: Self = StObject.set(x, "DelayUntilElbConnectionsDrained", js.undefined)
    
    inline def setExecutionTimeout(value: Integer): Self = StObject.set(x, "ExecutionTimeout", value.asInstanceOf[js.Any])
    
    inline def setExecutionTimeoutUndefined: Self = StObject.set(x, "ExecutionTimeout", js.undefined)
  }
}
