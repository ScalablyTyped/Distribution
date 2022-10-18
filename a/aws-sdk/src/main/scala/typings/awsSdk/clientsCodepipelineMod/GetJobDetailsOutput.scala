package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobDetailsOutput extends StObject {
  
  /**
    * The details of the job.  If AWSSessionCredentials is used, a long-running job can call GetJobDetails again to obtain new credentials. 
    */
  var jobDetails: js.UndefOr[JobDetails] = js.undefined
}
object GetJobDetailsOutput {
  
  inline def apply(): GetJobDetailsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobDetailsOutput]
  }
  
  extension [Self <: GetJobDetailsOutput](x: Self) {
    
    inline def setJobDetails(value: JobDetails): Self = StObject.set(x, "jobDetails", value.asInstanceOf[js.Any])
    
    inline def setJobDetailsUndefined: Self = StObject.set(x, "jobDetails", js.undefined)
  }
}
