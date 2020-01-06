package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateTrialComponentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TrialArn] = js.native
  /**
    * The ARN of the trial component.
    */
  var TrialComponentArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TrialComponentArn] = js.native
}

object DisassociateTrialComponentResponse {
  @scala.inline
  def apply(TrialArn: TrialArn = null, TrialComponentArn: TrialComponentArn = null): DisassociateTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    if (TrialArn != null) __obj.updateDynamic("TrialArn")(TrialArn.asInstanceOf[js.Any])
    if (TrialComponentArn != null) __obj.updateDynamic("TrialComponentArn")(TrialComponentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateTrialComponentResponse]
  }
}

