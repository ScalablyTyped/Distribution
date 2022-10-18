package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSummary extends StObject {
  
  /**
    * The time, in seconds since the epoch, when the job completed.
    */
  var completedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time, in seconds since the epoch, when the job was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether a job is concurrent. Will be true when a job is rolling out new job executions or canceling previously created executions, otherwise false.
    */
  var isConcurrent: js.UndefOr[BooleanWrapperObject] = js.undefined
  
  /**
    * The job ARN.
    */
  var jobArn: js.UndefOr[JobArn] = js.undefined
  
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  
  /**
    * The time, in seconds since the epoch, when the job was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The job summary status.
    */
  var status: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * Specifies whether the job will continue to run (CONTINUOUS), or will be complete after all those things specified as targets have completed the job (SNAPSHOT). If continuous, the job may also be run on a thing when a change is detected in a target. For example, a job will run on a thing when the thing is added to a target group, even after the job was completed by all things originally in the group.  We recommend that you use continuous jobs instead of snapshot jobs for dynamic thing group targets. By using continuous jobs, devices that join the group receive the job execution even after the job has been created. 
    */
  var targetSelection: js.UndefOr[TargetSelection] = js.undefined
  
  /**
    * The ID of the thing group.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
}
object JobSummary {
  
  inline def apply(): JobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobSummary]
  }
  
  extension [Self <: JobSummary](x: Self) {
    
    inline def setCompletedAt(value: js.Date): Self = StObject.set(x, "completedAt", value.asInstanceOf[js.Any])
    
    inline def setCompletedAtUndefined: Self = StObject.set(x, "completedAt", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setIsConcurrent(value: BooleanWrapperObject): Self = StObject.set(x, "isConcurrent", value.asInstanceOf[js.Any])
    
    inline def setIsConcurrentUndefined: Self = StObject.set(x, "isConcurrent", js.undefined)
    
    inline def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    inline def setJobArnUndefined: Self = StObject.set(x, "jobArn", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTargetSelection(value: TargetSelection): Self = StObject.set(x, "targetSelection", value.asInstanceOf[js.Any])
    
    inline def setTargetSelectionUndefined: Self = StObject.set(x, "targetSelection", js.undefined)
    
    inline def setThingGroupId(value: ThingGroupId): Self = StObject.set(x, "thingGroupId", value.asInstanceOf[js.Any])
    
    inline def setThingGroupIdUndefined: Self = StObject.set(x, "thingGroupId", js.undefined)
  }
}
