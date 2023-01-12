package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobLogs extends StObject {
  
  /**
    * A link to an Amazon S3 presigned URL where the job completion report is located.
    */
  var JobCompletionReportURI: js.UndefOr[String] = js.undefined
  
  /**
    * A link to an Amazon S3 presigned URL where the job failure log is located.
    */
  var JobFailureLogURI: js.UndefOr[String] = js.undefined
  
  /**
    * A link to an Amazon S3 presigned URL where the job success log is located.
    */
  var JobSuccessLogURI: js.UndefOr[String] = js.undefined
}
object JobLogs {
  
  inline def apply(): JobLogs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobLogs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobLogs] (val x: Self) extends AnyVal {
    
    inline def setJobCompletionReportURI(value: String): Self = StObject.set(x, "JobCompletionReportURI", value.asInstanceOf[js.Any])
    
    inline def setJobCompletionReportURIUndefined: Self = StObject.set(x, "JobCompletionReportURI", js.undefined)
    
    inline def setJobFailureLogURI(value: String): Self = StObject.set(x, "JobFailureLogURI", value.asInstanceOf[js.Any])
    
    inline def setJobFailureLogURIUndefined: Self = StObject.set(x, "JobFailureLogURI", js.undefined)
    
    inline def setJobSuccessLogURI(value: String): Self = StObject.set(x, "JobSuccessLogURI", value.asInstanceOf[js.Any])
    
    inline def setJobSuccessLogURIUndefined: Self = StObject.set(x, "JobSuccessLogURI", js.undefined)
  }
}
