package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelCountersForWorkteam extends js.Object {
  /**
    * The total number of data objects labeled by a human worker.
    */
  var HumanLabeled: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of data objects that need to be labeled by a human worker.
    */
  var PendingHuman: js.UndefOr[LabelCounter] = js.native
  /**
    * The total number of tasks in the labeling job.
    */
  var Total: js.UndefOr[LabelCounter] = js.native
}

object LabelCountersForWorkteam {
  @scala.inline
  def apply(HumanLabeled: Int | Double = null, PendingHuman: Int | Double = null, Total: Int | Double = null): LabelCountersForWorkteam = {
    val __obj = js.Dynamic.literal()
    if (HumanLabeled != null) __obj.updateDynamic("HumanLabeled")(HumanLabeled.asInstanceOf[js.Any])
    if (PendingHuman != null) __obj.updateDynamic("PendingHuman")(PendingHuman.asInstanceOf[js.Any])
    if (Total != null) __obj.updateDynamic("Total")(Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelCountersForWorkteam]
  }
}

