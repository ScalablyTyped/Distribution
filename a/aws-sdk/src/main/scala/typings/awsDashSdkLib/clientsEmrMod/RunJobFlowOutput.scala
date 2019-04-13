package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunJobFlowOutput extends js.Object {
  /**
    * An unique identifier for the job flow.
    */
  var JobFlowId: js.UndefOr[XmlStringMaxLen256] = js.undefined
}

object RunJobFlowOutput {
  @scala.inline
  def apply(JobFlowId: XmlStringMaxLen256 = null): RunJobFlowOutput = {
    val __obj = js.Dynamic.literal()
    if (JobFlowId != null) __obj.updateDynamic("JobFlowId")(JobFlowId)
    __obj.asInstanceOf[RunJobFlowOutput]
  }
}

