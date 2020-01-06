package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrialResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TrialArn] = js.native
}

object CreateTrialResponse {
  @scala.inline
  def apply(TrialArn: TrialArn = null): CreateTrialResponse = {
    val __obj = js.Dynamic.literal()
    if (TrialArn != null) __obj.updateDynamic("TrialArn")(TrialArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrialResponse]
  }
}

