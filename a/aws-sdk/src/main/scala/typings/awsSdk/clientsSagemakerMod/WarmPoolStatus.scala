package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WarmPoolStatus extends StObject {
  
  /**
    * The billable time in seconds used by the warm pool. Billable time refers to the absolute wall-clock time. Multiply ResourceRetainedBillableTimeInSeconds by the number of instances (InstanceCount) in your training cluster to get the total compute time SageMaker bills you if you run warm pool training. The formula is as follows: ResourceRetainedBillableTimeInSeconds * InstanceCount.
    */
  var ResourceRetainedBillableTimeInSeconds: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ResourceRetainedBillableTimeInSeconds] = js.undefined
  
  /**
    * The name of the matching training job that reused the warm pool.
    */
  var ReusedByJob: js.UndefOr[TrainingJobName] = js.undefined
  
  /**
    * The status of the warm pool.    InUse: The warm pool is in use for the training job.    Available: The warm pool is available to reuse for a matching training job.    Reused: The warm pool moved to a matching training job for reuse.    Terminated: The warm pool is no longer available. Warm pools are unavailable if they are terminated by a user, terminated for a patch update, or terminated for exceeding the specified KeepAlivePeriodInSeconds.  
    */
  var Status: WarmPoolResourceStatus
}
object WarmPoolStatus {
  
  inline def apply(Status: WarmPoolResourceStatus): WarmPoolStatus = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[WarmPoolStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WarmPoolStatus] (val x: Self) extends AnyVal {
    
    inline def setResourceRetainedBillableTimeInSeconds(value: ResourceRetainedBillableTimeInSeconds): Self = StObject.set(x, "ResourceRetainedBillableTimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setResourceRetainedBillableTimeInSecondsUndefined: Self = StObject.set(x, "ResourceRetainedBillableTimeInSeconds", js.undefined)
    
    inline def setReusedByJob(value: TrainingJobName): Self = StObject.set(x, "ReusedByJob", value.asInstanceOf[js.Any])
    
    inline def setReusedByJobUndefined: Self = StObject.set(x, "ReusedByJob", js.undefined)
    
    inline def setStatus(value: WarmPoolResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
