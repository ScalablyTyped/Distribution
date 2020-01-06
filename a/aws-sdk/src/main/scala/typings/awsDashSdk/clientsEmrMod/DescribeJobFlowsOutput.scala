package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobFlowsOutput extends js.Object {
  /**
    * A list of job flows matching the parameters supplied.
    */
  var JobFlows: js.UndefOr[JobFlowDetailList] = js.native
}

object DescribeJobFlowsOutput {
  @scala.inline
  def apply(JobFlows: JobFlowDetailList = null): DescribeJobFlowsOutput = {
    val __obj = js.Dynamic.literal()
    if (JobFlows != null) __obj.updateDynamic("JobFlows")(JobFlows.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobFlowsOutput]
  }
}

