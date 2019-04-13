package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStepOutput extends js.Object {
  /**
    * The step details for the requested step identifier.
    */
  var Step: js.UndefOr[Step] = js.undefined
}

object DescribeStepOutput {
  @scala.inline
  def apply(Step: Step = null): DescribeStepOutput = {
    val __obj = js.Dynamic.literal()
    if (Step != null) __obj.updateDynamic("Step")(Step)
    __obj.asInstanceOf[DescribeStepOutput]
  }
}

