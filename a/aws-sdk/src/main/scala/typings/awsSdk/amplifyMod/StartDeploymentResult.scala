package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDeploymentResult extends StObject {
  
  /**
    *  The summary for the job. 
    */
  var jobSummary: JobSummary = js.native
}
object StartDeploymentResult {
  
  @scala.inline
  def apply(jobSummary: JobSummary): StartDeploymentResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDeploymentResult]
  }
  
  @scala.inline
  implicit class StartDeploymentResultMutableBuilder[Self <: StartDeploymentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobSummary(value: JobSummary): Self = StObject.set(x, "jobSummary", value.asInstanceOf[js.Any])
  }
}
