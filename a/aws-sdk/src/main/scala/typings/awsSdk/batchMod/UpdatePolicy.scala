package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePolicy extends StObject {
  
  /**
    * Specifies the job timeout, in minutes, when the compute environment infrastructure is updated. The default value is 30.
    */
  var jobExecutionTimeoutMinutes: js.UndefOr[JobExecutionTimeoutMinutes] = js.undefined
  
  /**
    * Specifies whether jobs are automatically terminated when the computer environment infrastructure is updated. The default value is false.
    */
  var terminateJobsOnUpdate: js.UndefOr[Boolean] = js.undefined
}
object UpdatePolicy {
  
  inline def apply(): UpdatePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePolicy]
  }
  
  extension [Self <: UpdatePolicy](x: Self) {
    
    inline def setJobExecutionTimeoutMinutes(value: JobExecutionTimeoutMinutes): Self = StObject.set(x, "jobExecutionTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setJobExecutionTimeoutMinutesUndefined: Self = StObject.set(x, "jobExecutionTimeoutMinutes", js.undefined)
    
    inline def setTerminateJobsOnUpdate(value: Boolean): Self = StObject.set(x, "terminateJobsOnUpdate", value.asInstanceOf[js.Any])
    
    inline def setTerminateJobsOnUpdateUndefined: Self = StObject.set(x, "terminateJobsOnUpdate", js.undefined)
  }
}
