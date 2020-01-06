package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrialComponentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TrialComponentArn] = js.native
}

object UpdateTrialComponentResponse {
  @scala.inline
  def apply(TrialComponentArn: TrialComponentArn = null): UpdateTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    if (TrialComponentArn != null) __obj.updateDynamic("TrialComponentArn")(TrialComponentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrialComponentResponse]
  }
}

