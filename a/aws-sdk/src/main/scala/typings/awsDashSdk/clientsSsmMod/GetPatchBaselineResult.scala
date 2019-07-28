package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPatchBaselineResult extends js.Object {
  /**
    * A set of rules used to include patches in the baseline.
    */
  var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.undefined
  /**
    * A list of explicitly approved patches for the baseline.
    */
  var ApprovedPatches: js.UndefOr[PatchIdList] = js.undefined
  /**
    * Returns the specified compliance severity level for approved patches in the patch baseline.
    */
  var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.undefined
  /**
    * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
    */
  var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the retrieved patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.BaselineId] = js.undefined
  /**
    * The date the patch baseline was created.
    */
  var CreatedDate: js.UndefOr[DateTime] = js.undefined
  /**
    * A description of the patch baseline.
    */
  var Description: js.UndefOr[BaselineDescription] = js.undefined
  /**
    * A set of global filters used to exclude patches from the baseline.
    */
  var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.undefined
  /**
    * The date the patch baseline was last modified.
    */
  var ModifiedDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The name of the patch baseline.
    */
  var Name: js.UndefOr[BaselineName] = js.undefined
  /**
    * Returns the operating system specified for the patch baseline.
    */
  var OperatingSystem: js.UndefOr[typings.awsDashSdk.clientsSsmMod.OperatingSystem] = js.undefined
  /**
    * Patch groups included in the patch baseline.
    */
  var PatchGroups: js.UndefOr[PatchGroupList] = js.undefined
  /**
    * A list of explicitly rejected patches for the baseline.
    */
  var RejectedPatches: js.UndefOr[PatchIdList] = js.undefined
  /**
    * The action specified to take on patches included in the RejectedPatches list. A patch can be allowed only if it is a dependency of another package, or blocked entirely along with packages that include it as a dependency.
    */
  var RejectedPatchesAction: js.UndefOr[PatchAction] = js.undefined
  /**
    * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
    */
  var Sources: js.UndefOr[PatchSourceList] = js.undefined
}

object GetPatchBaselineResult {
  @scala.inline
  def apply(
    ApprovalRules: PatchRuleGroup = null,
    ApprovedPatches: PatchIdList = null,
    ApprovedPatchesComplianceLevel: PatchComplianceLevel = null,
    ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.undefined,
    BaselineId: BaselineId = null,
    CreatedDate: DateTime = null,
    Description: BaselineDescription = null,
    GlobalFilters: PatchFilterGroup = null,
    ModifiedDate: DateTime = null,
    Name: BaselineName = null,
    OperatingSystem: OperatingSystem = null,
    PatchGroups: PatchGroupList = null,
    RejectedPatches: PatchIdList = null,
    RejectedPatchesAction: PatchAction = null,
    Sources: PatchSourceList = null
  ): GetPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (ApprovalRules != null) __obj.updateDynamic("ApprovalRules")(ApprovalRules)
    if (ApprovedPatches != null) __obj.updateDynamic("ApprovedPatches")(ApprovedPatches)
    if (ApprovedPatchesComplianceLevel != null) __obj.updateDynamic("ApprovedPatchesComplianceLevel")(ApprovedPatchesComplianceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(ApprovedPatchesEnableNonSecurity)) __obj.updateDynamic("ApprovedPatchesEnableNonSecurity")(ApprovedPatchesEnableNonSecurity)
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId)
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (GlobalFilters != null) __obj.updateDynamic("GlobalFilters")(GlobalFilters)
    if (ModifiedDate != null) __obj.updateDynamic("ModifiedDate")(ModifiedDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (PatchGroups != null) __obj.updateDynamic("PatchGroups")(PatchGroups)
    if (RejectedPatches != null) __obj.updateDynamic("RejectedPatches")(RejectedPatches)
    if (RejectedPatchesAction != null) __obj.updateDynamic("RejectedPatchesAction")(RejectedPatchesAction.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources)
    __obj.asInstanceOf[GetPatchBaselineResult]
  }
}

