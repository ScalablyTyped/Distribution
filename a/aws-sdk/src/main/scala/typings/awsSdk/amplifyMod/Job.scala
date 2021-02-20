package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Job extends StObject {
  
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
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSteps(value: Steps): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsVarargs(value: Step*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: JobSummary): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
