package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUpgradeStatusResponse extends js.Object {
  /**
    *  One of 4 statuses that a step can go through returned as part of the  GetUpgradeStatusResponse  object. The status can take one of the following values:  In Progress Succeeded Succeeded with Issues Failed  
    */
  var StepStatus: js.UndefOr[UpgradeStatus] = js.native
  /**
    * A string that describes the update briefly
    */
  var UpgradeName: js.UndefOr[typings.awsDashSdk.clientsEsMod.UpgradeName] = js.native
  /**
    *  Represents one of 3 steps that an Upgrade or Upgrade Eligibility Check does through:  PreUpgradeCheck Snapshot Upgrade  
    */
  var UpgradeStep: js.UndefOr[typings.awsDashSdk.clientsEsMod.UpgradeStep] = js.native
}

object GetUpgradeStatusResponse {
  @scala.inline
  def apply(StepStatus: UpgradeStatus = null, UpgradeName: UpgradeName = null, UpgradeStep: UpgradeStep = null): GetUpgradeStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (StepStatus != null) __obj.updateDynamic("StepStatus")(StepStatus.asInstanceOf[js.Any])
    if (UpgradeName != null) __obj.updateDynamic("UpgradeName")(UpgradeName.asInstanceOf[js.Any])
    if (UpgradeStep != null) __obj.updateDynamic("UpgradeStep")(UpgradeStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUpgradeStatusResponse]
  }
}

