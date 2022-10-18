package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollForJobsOutput extends StObject {
  
  /**
    * Information about the jobs to take action on.
    */
  var jobs: js.UndefOr[JobList] = js.undefined
}
object PollForJobsOutput {
  
  inline def apply(): PollForJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollForJobsOutput]
  }
  
  extension [Self <: PollForJobsOutput](x: Self) {
    
    inline def setJobs(value: JobList): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: Job*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
