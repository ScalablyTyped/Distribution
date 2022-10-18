package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDeploymentResult extends StObject {
  
  /**
    *  The summary for the job. 
    */
  var jobSummary: JobSummary
}
object StartDeploymentResult {
  
  inline def apply(jobSummary: JobSummary): StartDeploymentResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeploymentResult]
  }
  
  extension [Self <: StartDeploymentResult](x: Self) {
    
    inline def setJobSummary(value: JobSummary): Self = StObject.set(x, "jobSummary", value.asInstanceOf[js.Any])
  }
}
