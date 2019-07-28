package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDescribeSimulationJobRequest extends js.Object {
  /**
    * A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
    */
  var jobs: Arns
}

object BatchDescribeSimulationJobRequest {
  @scala.inline
  def apply(jobs: Arns): BatchDescribeSimulationJobRequest = {
    val __obj = js.Dynamic.literal(jobs = jobs)
  
    __obj.asInstanceOf[BatchDescribeSimulationJobRequest]
  }
}

