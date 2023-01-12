package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityResolutionJob extends StObject {
  
  /**
    * The unique name of the domain.
    */
  var DomainName: js.UndefOr[name] = js.undefined
  
  /**
    * The S3 location where the Identity Resolution Job writes result files.
    */
  var ExportingLocation: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.ExportingLocation] = js.undefined
  
  /**
    * The timestamp of when the job was completed.
    */
  var JobEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier of the Identity Resolution Job.
    */
  var JobId: js.UndefOr[uuid] = js.undefined
  
  /**
    * The timestamp of when the job was started or will be started.
    */
  var JobStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Statistics about an Identity Resolution Job.
    */
  var JobStats: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.JobStats] = js.undefined
  
  /**
    * The error messages that are generated when the Identity Resolution Job runs.
    */
  var Message: js.UndefOr[stringTo2048] = js.undefined
  
  /**
    * The status of the Identity Resolution Job.    PENDING: The Identity Resolution Job is scheduled but has not started yet. If you turn off the Identity Resolution feature in your domain, jobs in the PENDING state are deleted.    PREPROCESSING: The Identity Resolution Job is loading your data.    FIND_MATCHING: The Identity Resolution Job is using the machine learning model to identify profiles that belong to the same matching group.    MERGING: The Identity Resolution Job is merging duplicate profiles.    COMPLETED: The Identity Resolution Job completed successfully.    PARTIAL_SUCCESS: There's a system error and not all of the data is merged. The Identity Resolution Job writes a message indicating the source of the problem.    FAILED: The Identity Resolution Job did not merge any data. It writes a message indicating the source of the problem.  
    */
  var Status: js.UndefOr[IdentityResolutionJobStatus] = js.undefined
}
object IdentityResolutionJob {
  
  inline def apply(): IdentityResolutionJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityResolutionJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityResolutionJob] (val x: Self) extends AnyVal {
    
    inline def setDomainName(value: name): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    inline def setExportingLocation(value: ExportingLocation): Self = StObject.set(x, "ExportingLocation", value.asInstanceOf[js.Any])
    
    inline def setExportingLocationUndefined: Self = StObject.set(x, "ExportingLocation", js.undefined)
    
    inline def setJobEndTime(value: js.Date): Self = StObject.set(x, "JobEndTime", value.asInstanceOf[js.Any])
    
    inline def setJobEndTimeUndefined: Self = StObject.set(x, "JobEndTime", js.undefined)
    
    inline def setJobId(value: uuid): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStartTime(value: js.Date): Self = StObject.set(x, "JobStartTime", value.asInstanceOf[js.Any])
    
    inline def setJobStartTimeUndefined: Self = StObject.set(x, "JobStartTime", js.undefined)
    
    inline def setJobStats(value: JobStats): Self = StObject.set(x, "JobStats", value.asInstanceOf[js.Any])
    
    inline def setJobStatsUndefined: Self = StObject.set(x, "JobStats", js.undefined)
    
    inline def setMessage(value: stringTo2048): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: IdentityResolutionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
