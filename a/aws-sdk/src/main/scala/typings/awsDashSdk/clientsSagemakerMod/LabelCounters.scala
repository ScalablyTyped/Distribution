package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelCounters extends js.Object {
  /**
    * The total number of objects that could not be labeled due to an error.
    */
  var FailedNonRetryableError: js.UndefOr[LabelCounter] = js.undefined
  /**
    * The total number of objects labeled by a human worker.
    */
  var HumanLabeled: js.UndefOr[LabelCounter] = js.undefined
  /**
    * The total number of objects labeled by automated data labeling.
    */
  var MachineLabeled: js.UndefOr[LabelCounter] = js.undefined
  /**
    * The total number of objects labeled.
    */
  var TotalLabeled: js.UndefOr[LabelCounter] = js.undefined
  /**
    * The total number of objects not yet labeled.
    */
  var Unlabeled: js.UndefOr[LabelCounter] = js.undefined
}

object LabelCounters {
  @scala.inline
  def apply(
    FailedNonRetryableError: Int | Double = null,
    HumanLabeled: Int | Double = null,
    MachineLabeled: Int | Double = null,
    TotalLabeled: Int | Double = null,
    Unlabeled: Int | Double = null
  ): LabelCounters = {
    val __obj = js.Dynamic.literal()
    if (FailedNonRetryableError != null) __obj.updateDynamic("FailedNonRetryableError")(FailedNonRetryableError.asInstanceOf[js.Any])
    if (HumanLabeled != null) __obj.updateDynamic("HumanLabeled")(HumanLabeled.asInstanceOf[js.Any])
    if (MachineLabeled != null) __obj.updateDynamic("MachineLabeled")(MachineLabeled.asInstanceOf[js.Any])
    if (TotalLabeled != null) __obj.updateDynamic("TotalLabeled")(TotalLabeled.asInstanceOf[js.Any])
    if (Unlabeled != null) __obj.updateDynamic("Unlabeled")(Unlabeled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelCounters]
  }
}

