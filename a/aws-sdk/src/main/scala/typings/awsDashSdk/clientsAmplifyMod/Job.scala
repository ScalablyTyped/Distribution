package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  /**
    *  Execution steps for an execution job, for an Amplify App. 
    */
  var steps: Steps = js.native
  /**
    *  Summary for an execution job for an Amplify App. 
    */
  var summary: JobSummary = js.native
}

object Job {
  @scala.inline
  def apply(steps: Steps, summary: JobSummary): Job = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Job]
  }
}

