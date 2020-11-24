package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends js.Object {
  
  /**
    *  The execution steps for an execution job, for an Amplify app. 
    */
  var steps: Steps = js.native
  
  /**
    *  Describes the summary for an execution job for an Amplify app. 
    */
  var summary: JobSummary = js.native
}
object Job {
  
  @scala.inline
  def apply(steps: Steps, summary: JobSummary): Job = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStepsVarargs(value: Step*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: Steps): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: JobSummary): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
}
