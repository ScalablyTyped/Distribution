package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchBaselineIdentity extends js.Object {
  /**
    * The description of the patch baseline.
    */
  var BaselineDescription: js.UndefOr[typings.awsDashSdk.clientsSsmMod.BaselineDescription] = js.undefined
  /**
    * The ID of the patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.BaselineId] = js.undefined
  /**
    * The name of the patch baseline.
    */
  var BaselineName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.BaselineName] = js.undefined
  /**
    * Whether this is the default baseline. Note that Systems Manager supports creating multiple default patch baselines. For example, you can create a default patch baseline for each operating system.
    */
  var DefaultBaseline: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DefaultBaseline] = js.undefined
  /**
    * Defines the operating system the patch baseline applies to. The Default value is WINDOWS. 
    */
  var OperatingSystem: js.UndefOr[typings.awsDashSdk.clientsSsmMod.OperatingSystem] = js.undefined
}

object PatchBaselineIdentity {
  @scala.inline
  def apply(
    BaselineDescription: BaselineDescription = null,
    BaselineId: BaselineId = null,
    BaselineName: BaselineName = null,
    DefaultBaseline: js.UndefOr[scala.Boolean] = js.undefined,
    OperatingSystem: OperatingSystem = null
  ): PatchBaselineIdentity = {
    val __obj = js.Dynamic.literal()
    if (BaselineDescription != null) __obj.updateDynamic("BaselineDescription")(BaselineDescription)
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId)
    if (BaselineName != null) __obj.updateDynamic("BaselineName")(BaselineName)
    if (!js.isUndefined(DefaultBaseline)) __obj.updateDynamic("DefaultBaseline")(DefaultBaseline)
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchBaselineIdentity]
  }
}

