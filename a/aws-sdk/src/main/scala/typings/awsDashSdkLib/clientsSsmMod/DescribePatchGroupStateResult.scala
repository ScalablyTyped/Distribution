package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePatchGroupStateResult extends js.Object {
  /**
    * The number of instances in the patch group.
    */
  var Instances: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with patches from the patch baseline that failed to install.
    */
  var InstancesWithFailedPatches: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with patches installed that aren't defined in the patch baseline.
    */
  var InstancesWithInstalledOtherPatches: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with installed patches.
    */
  var InstancesWithInstalledPatches: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of INSTALLED_REJECTED were typically installed before they were added to a RejectedPatches list.  If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstancesWithInstalledRejectedPatches will always be 0 (zero). 
    */
  var InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.undefined
  /**
    * The number of instances with missing patches from the patch baseline.
    */
  var InstancesWithMissingPatches: js.UndefOr[Integer] = js.undefined
  /**
    * The number of instances with patches that aren't applicable.
    */
  var InstancesWithNotApplicablePatches: js.UndefOr[Integer] = js.undefined
}

object DescribePatchGroupStateResult {
  @scala.inline
  def apply(
    Instances: js.UndefOr[Integer] = js.undefined,
    InstancesWithFailedPatches: js.UndefOr[Integer] = js.undefined,
    InstancesWithInstalledOtherPatches: js.UndefOr[Integer] = js.undefined,
    InstancesWithInstalledPatches: js.UndefOr[Integer] = js.undefined,
    InstancesWithInstalledRejectedPatches: js.UndefOr[InstancesCount] = js.undefined,
    InstancesWithMissingPatches: js.UndefOr[Integer] = js.undefined,
    InstancesWithNotApplicablePatches: js.UndefOr[Integer] = js.undefined
  ): DescribePatchGroupStateResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Instances)) __obj.updateDynamic("Instances")(Instances)
    if (!js.isUndefined(InstancesWithFailedPatches)) __obj.updateDynamic("InstancesWithFailedPatches")(InstancesWithFailedPatches)
    if (!js.isUndefined(InstancesWithInstalledOtherPatches)) __obj.updateDynamic("InstancesWithInstalledOtherPatches")(InstancesWithInstalledOtherPatches)
    if (!js.isUndefined(InstancesWithInstalledPatches)) __obj.updateDynamic("InstancesWithInstalledPatches")(InstancesWithInstalledPatches)
    if (!js.isUndefined(InstancesWithInstalledRejectedPatches)) __obj.updateDynamic("InstancesWithInstalledRejectedPatches")(InstancesWithInstalledRejectedPatches)
    if (!js.isUndefined(InstancesWithMissingPatches)) __obj.updateDynamic("InstancesWithMissingPatches")(InstancesWithMissingPatches)
    if (!js.isUndefined(InstancesWithNotApplicablePatches)) __obj.updateDynamic("InstancesWithNotApplicablePatches")(InstancesWithNotApplicablePatches)
    __obj.asInstanceOf[DescribePatchGroupStateResult]
  }
}

