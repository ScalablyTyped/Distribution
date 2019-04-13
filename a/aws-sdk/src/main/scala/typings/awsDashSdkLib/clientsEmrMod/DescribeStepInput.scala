package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStepInput extends js.Object {
  /**
    * The identifier of the cluster with steps to describe.
    */
  var ClusterId: awsDashSdkLib.clientsEmrMod.ClusterId
  /**
    * The identifier of the step to describe.
    */
  var StepId: awsDashSdkLib.clientsEmrMod.StepId
}

object DescribeStepInput {
  @scala.inline
  def apply(ClusterId: ClusterId, StepId: StepId): DescribeStepInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId, StepId = StepId)
  
    __obj.asInstanceOf[DescribeStepInput]
  }
}

