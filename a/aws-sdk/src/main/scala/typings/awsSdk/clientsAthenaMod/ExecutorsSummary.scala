package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutorsSummary extends StObject {
  
  /**
    * The UUID of the executor.
    */
  var ExecutorId: typings.awsSdk.clientsAthenaMod.ExecutorId
  
  /**
    * The smallest unit of compute that a session can request from Athena. Size is measured in data processing unit (DPU) values, a relative measure of processing power.
    */
  var ExecutorSize: js.UndefOr[Long] = js.undefined
  
  /**
    * The processing state of the executor. A description of each state follows.  CREATING - The executor is being started, including acquiring resources.  CREATED - The executor has been started.  REGISTERED - The executor has been registered.  TERMINATING - The executor is in the process of shutting down.  TERMINATED - The executor is no longer running.  FAILED - Due to a failure, the executor is no longer running.
    */
  var ExecutorState: js.UndefOr[typings.awsSdk.clientsAthenaMod.ExecutorState] = js.undefined
  
  /**
    * The type of executor used for the application (COORDINATOR, GATEWAY, or WORKER).
    */
  var ExecutorType: js.UndefOr[typings.awsSdk.clientsAthenaMod.ExecutorType] = js.undefined
  
  /**
    * The date and time that the executor started.
    */
  var StartDateTime: js.UndefOr[Long] = js.undefined
  
  /**
    * The date and time that the executor was terminated.
    */
  var TerminationDateTime: js.UndefOr[Long] = js.undefined
}
object ExecutorsSummary {
  
  inline def apply(ExecutorId: ExecutorId): ExecutorsSummary = {
    val __obj = js.Dynamic.literal(ExecutorId = ExecutorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutorsSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutorsSummary] (val x: Self) extends AnyVal {
    
    inline def setExecutorId(value: ExecutorId): Self = StObject.set(x, "ExecutorId", value.asInstanceOf[js.Any])
    
    inline def setExecutorSize(value: Long): Self = StObject.set(x, "ExecutorSize", value.asInstanceOf[js.Any])
    
    inline def setExecutorSizeUndefined: Self = StObject.set(x, "ExecutorSize", js.undefined)
    
    inline def setExecutorState(value: ExecutorState): Self = StObject.set(x, "ExecutorState", value.asInstanceOf[js.Any])
    
    inline def setExecutorStateUndefined: Self = StObject.set(x, "ExecutorState", js.undefined)
    
    inline def setExecutorType(value: ExecutorType): Self = StObject.set(x, "ExecutorType", value.asInstanceOf[js.Any])
    
    inline def setExecutorTypeUndefined: Self = StObject.set(x, "ExecutorType", js.undefined)
    
    inline def setStartDateTime(value: Long): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
    
    inline def setTerminationDateTime(value: Long): Self = StObject.set(x, "TerminationDateTime", value.asInstanceOf[js.Any])
    
    inline def setTerminationDateTimeUndefined: Self = StObject.set(x, "TerminationDateTime", js.undefined)
  }
}
