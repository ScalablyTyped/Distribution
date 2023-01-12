package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollForThirdPartyJobsOutput extends StObject {
  
  /**
    * Information about the jobs to take action on.
    */
  var jobs: js.UndefOr[ThirdPartyJobList] = js.undefined
}
object PollForThirdPartyJobsOutput {
  
  inline def apply(): PollForThirdPartyJobsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollForThirdPartyJobsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PollForThirdPartyJobsOutput] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: ThirdPartyJobList): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    inline def setJobsVarargs(value: ThirdPartyJob*): Self = StObject.set(x, "jobs", js.Array(value*))
  }
}
