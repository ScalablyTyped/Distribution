package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelCountersForWorkteam extends js.Object {
  /**
    * The total number of data objects labeled by a human worker.
    */
  var HumanLabeled: js.UndefOr[LabelCounter] = js.undefined
  /**
    * The total number of data objects that need to be labeled by a human worker.
    */
  var PendingHuman: js.UndefOr[LabelCounter] = js.undefined
  /**
    * The total number of tasks in the labeling job.
    */
  var Total: js.UndefOr[LabelCounter] = js.undefined
}

object LabelCountersForWorkteam {
  @scala.inline
  def apply(
    HumanLabeled: js.UndefOr[LabelCounter] = js.undefined,
    PendingHuman: js.UndefOr[LabelCounter] = js.undefined,
    Total: js.UndefOr[LabelCounter] = js.undefined
  ): LabelCountersForWorkteam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(HumanLabeled)) __obj.updateDynamic("HumanLabeled")(HumanLabeled)
    if (!js.isUndefined(PendingHuman)) __obj.updateDynamic("PendingHuman")(PendingHuman)
    if (!js.isUndefined(Total)) __obj.updateDynamic("Total")(Total)
    __obj.asInstanceOf[LabelCountersForWorkteam]
  }
}

