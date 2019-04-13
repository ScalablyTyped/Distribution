package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  /**
    *  Execution steps for an execution job, for an Amplify App. 
    */
  var steps: Steps
  /**
    *  Summary for an execution job for an Amplify App. 
    */
  var summary: JobSummary
}

object Job {
  @scala.inline
  def apply(steps: Steps, summary: JobSummary): Job = {
    val __obj = js.Dynamic.literal(steps = steps, summary = summary)
  
    __obj.asInstanceOf[Job]
  }
}

