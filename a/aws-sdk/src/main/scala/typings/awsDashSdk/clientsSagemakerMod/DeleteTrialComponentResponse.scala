package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTrialComponentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the component is being deleted.
    */
  var TrialComponentArn: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.TrialComponentArn] = js.native
}

object DeleteTrialComponentResponse {
  @scala.inline
  def apply(TrialComponentArn: TrialComponentArn = null): DeleteTrialComponentResponse = {
    val __obj = js.Dynamic.literal()
    if (TrialComponentArn != null) __obj.updateDynamic("TrialComponentArn")(TrialComponentArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrialComponentResponse]
  }
}

