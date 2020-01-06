package typings.awsDashSdk.clientsSavingsplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSavingsPlanResponse extends js.Object {
  /**
    * The ID of the Savings Plan.
    */
  var savingsPlanId: js.UndefOr[SavingsPlanId] = js.native
}

object CreateSavingsPlanResponse {
  @scala.inline
  def apply(savingsPlanId: SavingsPlanId = null): CreateSavingsPlanResponse = {
    val __obj = js.Dynamic.literal()
    if (savingsPlanId != null) __obj.updateDynamic("savingsPlanId")(savingsPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSavingsPlanResponse]
  }
}

