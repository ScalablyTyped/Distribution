package typings
package awsDashSdkLib.clientsSagemakerMod

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
    FailedNonRetryableError: js.UndefOr[LabelCounter] = js.undefined,
    HumanLabeled: js.UndefOr[LabelCounter] = js.undefined,
    MachineLabeled: js.UndefOr[LabelCounter] = js.undefined,
    TotalLabeled: js.UndefOr[LabelCounter] = js.undefined,
    Unlabeled: js.UndefOr[LabelCounter] = js.undefined
  ): LabelCounters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FailedNonRetryableError)) __obj.updateDynamic("FailedNonRetryableError")(FailedNonRetryableError)
    if (!js.isUndefined(HumanLabeled)) __obj.updateDynamic("HumanLabeled")(HumanLabeled)
    if (!js.isUndefined(MachineLabeled)) __obj.updateDynamic("MachineLabeled")(MachineLabeled)
    if (!js.isUndefined(TotalLabeled)) __obj.updateDynamic("TotalLabeled")(TotalLabeled)
    if (!js.isUndefined(Unlabeled)) __obj.updateDynamic("Unlabeled")(Unlabeled)
    __obj.asInstanceOf[LabelCounters]
  }
}

