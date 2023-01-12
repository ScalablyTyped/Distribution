package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSummary extends StObject {
  
  /**
    * The ID of the job.
    */
  var id: ID
  
  /**
    * The unique name that helps identify the job request.
    */
  var name: Name
  
  /**
    * The status of the bulk import job can be one of following values.    PENDING – IoT SiteWise is waiting for the current bulk import job to finish.    CANCELLED – The bulk import job has been canceled.    RUNNING – IoT SiteWise is processing your request to import your data from Amazon S3.    COMPLETED – IoT SiteWise successfully completed your request to import data from Amazon S3.    FAILED – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.    COMPLETED_WITH_FAILURES – IoT SiteWise completed your request to import data from Amazon S3 with errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.  
    */
  var status: JobStatus
}
object JobSummary {
  
  inline def apply(id: ID, name: Name, status: JobStatus): JobSummary = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobSummary] (val x: Self) extends AnyVal {
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
