package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

