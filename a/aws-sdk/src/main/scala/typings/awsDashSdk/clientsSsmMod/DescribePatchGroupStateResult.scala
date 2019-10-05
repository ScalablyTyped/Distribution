package typings.awsDashSdk.clientsSsmMod

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
  /**
    * The number of instances with NotApplicable patches beyond the supported limit, which are not reported by name to Systems Manager Inventory.
    */
  var InstancesWithUnreportedNotApplicablePatches: js.UndefOr[Integer] = js.undefined
}

object DescribePatchGroupStateResult {
  @scala.inline
  def apply(
    Instances: Int | Double = null,
    InstancesWithFailedPatches: Int | Double = null,
    InstancesWithInstalledOtherPatches: Int | Double = null,
    InstancesWithInstalledPatches: Int | Double = null,
    InstancesWithInstalledRejectedPatches: Int | Double = null,
    InstancesWithMissingPatches: Int | Double = null,
    InstancesWithNotApplicablePatches: Int | Double = null,
    InstancesWithUnreportedNotApplicablePatches: Int | Double = null
  ): DescribePatchGroupStateResult = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    if (InstancesWithFailedPatches != null) __obj.updateDynamic("InstancesWithFailedPatches")(InstancesWithFailedPatches.asInstanceOf[js.Any])
    if (InstancesWithInstalledOtherPatches != null) __obj.updateDynamic("InstancesWithInstalledOtherPatches")(InstancesWithInstalledOtherPatches.asInstanceOf[js.Any])
    if (InstancesWithInstalledPatches != null) __obj.updateDynamic("InstancesWithInstalledPatches")(InstancesWithInstalledPatches.asInstanceOf[js.Any])
    if (InstancesWithInstalledRejectedPatches != null) __obj.updateDynamic("InstancesWithInstalledRejectedPatches")(InstancesWithInstalledRejectedPatches.asInstanceOf[js.Any])
    if (InstancesWithMissingPatches != null) __obj.updateDynamic("InstancesWithMissingPatches")(InstancesWithMissingPatches.asInstanceOf[js.Any])
    if (InstancesWithNotApplicablePatches != null) __obj.updateDynamic("InstancesWithNotApplicablePatches")(InstancesWithNotApplicablePatches.asInstanceOf[js.Any])
    if (InstancesWithUnreportedNotApplicablePatches != null) __obj.updateDynamic("InstancesWithUnreportedNotApplicablePatches")(InstancesWithUnreportedNotApplicablePatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePatchGroupStateResult]
  }
}

