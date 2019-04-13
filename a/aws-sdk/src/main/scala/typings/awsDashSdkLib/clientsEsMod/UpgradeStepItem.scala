package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpgradeStepItem extends js.Object {
  /**
    * A list of strings containing detailed information about the errors encountered in a particular step.
    */
  var Issues: js.UndefOr[Issues] = js.undefined
  /**
    * The Floating point value representing progress percentage of a particular step.
    */
  var ProgressPercent: js.UndefOr[Double] = js.undefined
  /**
    *  Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:  PreUpgradeCheck Snapshot Upgrade  
    */
  var UpgradeStep: js.UndefOr[UpgradeStep] = js.undefined
  /**
    *  The status of a particular step during an upgrade. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var UpgradeStepStatus: js.UndefOr[UpgradeStatus] = js.undefined
}

object UpgradeStepItem {
  @scala.inline
  def apply(
    Issues: Issues = null,
    ProgressPercent: js.UndefOr[Double] = js.undefined,
    UpgradeStep: UpgradeStep = null,
    UpgradeStepStatus: UpgradeStatus = null
  ): UpgradeStepItem = {
    val __obj = js.Dynamic.literal()
    if (Issues != null) __obj.updateDynamic("Issues")(Issues)
    if (!js.isUndefined(ProgressPercent)) __obj.updateDynamic("ProgressPercent")(ProgressPercent)
    if (UpgradeStep != null) __obj.updateDynamic("UpgradeStep")(UpgradeStep.asInstanceOf[js.Any])
    if (UpgradeStepStatus != null) __obj.updateDynamic("UpgradeStepStatus")(UpgradeStepStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeStepItem]
  }
}

