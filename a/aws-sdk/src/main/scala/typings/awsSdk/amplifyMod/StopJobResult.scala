package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopJobResult extends StObject {
  
  /**
    *  The summary for the job. 
    */
  var jobSummary: JobSummary = js.native
}
object StopJobResult {
  
  @scala.inline
  def apply(jobSummary: JobSummary): StopJobResult = {
    val __obj = js.Dynamic.literal(jobSummary = jobSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobResult]
  }
  
  @scala.inline
  implicit class StopJobResultMutableBuilder[Self <: StopJobResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobSummary(value: JobSummary): Self = StObject.set(x, "jobSummary", value.asInstanceOf[js.Any])
  }
}
