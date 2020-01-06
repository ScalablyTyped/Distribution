package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateExperimentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.ExperimentArn] = js.native
}

object UpdateExperimentResponse {
  @scala.inline
  def apply(ExperimentArn: ExperimentArn = null): UpdateExperimentResponse = {
    val __obj = js.Dynamic.literal()
    if (ExperimentArn != null) __obj.updateDynamic("ExperimentArn")(ExperimentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExperimentResponse]
  }
}

