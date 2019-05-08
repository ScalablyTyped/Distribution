package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstancePatchState extends js.Object {
  /**
    * The ID of the patch baseline used to patch the instance.
    */
  var BaselineId: awsDashSdkLib.clientsSsmMod.BaselineId
  /**
    * The number of patches from the patch baseline that were attempted to be installed during the last patching operation, but failed to install.
    */
  var FailedCount: js.UndefOr[PatchFailedCount] = js.undefined
  /**
    * An https URL or an Amazon S3 path-style URL to a list of patches to be installed. This patch installation list, which you maintain in an Amazon S3 bucket in YAML format and specify in the SSM document AWS-RunPatchBaseline, overrides the patches specified by the default patch baseline. For more information about the InstallOverrideList parameter, see About the SSM Document AWS-RunPatchBaseline in the AWS Systems Manager User Guide.
    */
  var InstallOverrideList: js.UndefOr[InstallOverrideList] = js.undefined
  /**
    * The number of patches from the patch baseline that are installed on the instance.
    */
  var InstalledCount: js.UndefOr[PatchInstalledCount] = js.undefined
  /**
    * The number of patches not specified in the patch baseline that are installed on the instance.
    */
  var InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount] = js.undefined
  /**
    * The number of instances with patches installed that are specified in a RejectedPatches list. Patches with a status of InstalledRejected were typically installed before they were added to a RejectedPatches list.  If ALLOW_AS_DEPENDENCY is the specified option for RejectedPatchesAction, the value of InstalledRejectedCount will always be 0 (zero). 
    */
  var InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount] = js.undefined
  /**
    * The ID of the managed instance the high-level patch compliance information was collected for.
    */
  var InstanceId: awsDashSdkLib.clientsSsmMod.InstanceId
  /**
    * The number of patches from the patch baseline that are applicable for the instance but aren't currently installed.
    */
  var MissingCount: js.UndefOr[PatchMissingCount] = js.undefined
  /**
    * The number of patches from the patch baseline that aren't applicable for the instance and therefore aren't installed on the instance. This number may be truncated if the list of patch names is very large. The number of patches beyond this limit are reported in UnreportedNotApplicableCount.
    */
  var NotApplicableCount: js.UndefOr[PatchNotApplicableCount] = js.undefined
  /**
    * The type of patching operation that was performed: SCAN (assess patch compliance state) or INSTALL (install missing patches).
    */
  var Operation: PatchOperationType
  /**
    * The time the most recent patching operation completed on the instance.
    */
  var OperationEndTime: DateTime
  /**
    * The time the most recent patching operation was started on the instance.
    */
  var OperationStartTime: DateTime
  /**
    * Placeholder information. This field will always be empty in the current release of the service.
    */
  var OwnerInformation: js.UndefOr[OwnerInformation] = js.undefined
  /**
    * The name of the patch group the managed instance belongs to.
    */
  var PatchGroup: awsDashSdkLib.clientsSsmMod.PatchGroup
  /**
    * The ID of the patch baseline snapshot used during the patching operation when this compliance data was collected.
    */
  var SnapshotId: js.UndefOr[SnapshotId] = js.undefined
  /**
    * The number of patches beyond the supported limit of NotApplicableCount that are not reported by name to Systems Manager Inventory.
    */
  var UnreportedNotApplicableCount: js.UndefOr[PatchUnreportedNotApplicableCount] = js.undefined
}

object InstancePatchState {
  @scala.inline
  def apply(
    BaselineId: BaselineId,
    InstanceId: InstanceId,
    Operation: PatchOperationType,
    OperationEndTime: DateTime,
    OperationStartTime: DateTime,
    PatchGroup: PatchGroup,
    FailedCount: js.UndefOr[PatchFailedCount] = js.undefined,
    InstallOverrideList: InstallOverrideList = null,
    InstalledCount: js.UndefOr[PatchInstalledCount] = js.undefined,
    InstalledOtherCount: js.UndefOr[PatchInstalledOtherCount] = js.undefined,
    InstalledRejectedCount: js.UndefOr[PatchInstalledRejectedCount] = js.undefined,
    MissingCount: js.UndefOr[PatchMissingCount] = js.undefined,
    NotApplicableCount: js.UndefOr[PatchNotApplicableCount] = js.undefined,
    OwnerInformation: OwnerInformation = null,
    SnapshotId: SnapshotId = null,
    UnreportedNotApplicableCount: js.UndefOr[PatchUnreportedNotApplicableCount] = js.undefined
  ): InstancePatchState = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId, InstanceId = InstanceId, Operation = Operation.asInstanceOf[js.Any], OperationEndTime = OperationEndTime, OperationStartTime = OperationStartTime, PatchGroup = PatchGroup)
    if (!js.isUndefined(FailedCount)) __obj.updateDynamic("FailedCount")(FailedCount)
    if (InstallOverrideList != null) __obj.updateDynamic("InstallOverrideList")(InstallOverrideList)
    if (!js.isUndefined(InstalledCount)) __obj.updateDynamic("InstalledCount")(InstalledCount)
    if (!js.isUndefined(InstalledOtherCount)) __obj.updateDynamic("InstalledOtherCount")(InstalledOtherCount)
    if (!js.isUndefined(InstalledRejectedCount)) __obj.updateDynamic("InstalledRejectedCount")(InstalledRejectedCount)
    if (!js.isUndefined(MissingCount)) __obj.updateDynamic("MissingCount")(MissingCount)
    if (!js.isUndefined(NotApplicableCount)) __obj.updateDynamic("NotApplicableCount")(NotApplicableCount)
    if (OwnerInformation != null) __obj.updateDynamic("OwnerInformation")(OwnerInformation)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (!js.isUndefined(UnreportedNotApplicableCount)) __obj.updateDynamic("UnreportedNotApplicableCount")(UnreportedNotApplicableCount)
    __obj.asInstanceOf[InstancePatchState]
  }
}

