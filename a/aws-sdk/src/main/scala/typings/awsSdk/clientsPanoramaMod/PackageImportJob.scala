package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageImportJob extends StObject {
  
  /**
    * When the job was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The job's ID.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsPanoramaMod.JobId] = js.undefined
  
  /**
    * The job's type.
    */
  var JobType: js.UndefOr[PackageImportJobType] = js.undefined
  
  /**
    * When the job was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The job's status.
    */
  var Status: js.UndefOr[PackageImportJobStatus] = js.undefined
  
  /**
    * The job's status message.
    */
  var StatusMessage: js.UndefOr[PackageImportJobStatusMessage] = js.undefined
}
object PackageImportJob {
  
  inline def apply(): PackageImportJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageImportJob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageImportJob] (val x: Self) extends AnyVal {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobType(value: PackageImportJobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setStatus(value: PackageImportJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: PackageImportJobStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
