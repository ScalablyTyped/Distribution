package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDescribeSimulationJobResponse extends js.Object {
  /**
    * A list of simulation jobs.
    */
  var jobs: js.UndefOr[SimulationJobs] = js.undefined
  /**
    * A list of unprocessed simulation job Amazon Resource Names (ARNs).
    */
  var unprocessedJobs: js.UndefOr[Arns] = js.undefined
}

object BatchDescribeSimulationJobResponse {
  @scala.inline
  def apply(jobs: SimulationJobs = null, unprocessedJobs: Arns = null): BatchDescribeSimulationJobResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs)
    if (unprocessedJobs != null) __obj.updateDynamic("unprocessedJobs")(unprocessedJobs)
    __obj.asInstanceOf[BatchDescribeSimulationJobResponse]
  }
}

