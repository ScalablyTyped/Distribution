package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TerminateJobFlowsInput extends js.Object {
  /**
    * A list of job flows to be shutdown.
    */
  var JobFlowIds: XmlStringList
}

object TerminateJobFlowsInput {
  @scala.inline
  def apply(JobFlowIds: XmlStringList): TerminateJobFlowsInput = {
    val __obj = js.Dynamic.literal(JobFlowIds = JobFlowIds)
  
    __obj.asInstanceOf[TerminateJobFlowsInput]
  }
}

