package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePatchBaselineRequest extends js.Object {
  /**
    * A set of rules used to include patches in the baseline.
    */
  var ApprovalRules: js.UndefOr[PatchRuleGroup] = js.native
  /**
    * A list of explicitly approved patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
    */
  var ApprovedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * Defines the compliance level for approved patches. This means that if an approved patch is reported as missing, this is the severity of the compliance violation. The default value is UNSPECIFIED.
    */
  var ApprovedPatchesComplianceLevel: js.UndefOr[PatchComplianceLevel] = js.native
  /**
    * Indicates whether the list of approved patches includes non-security updates that should be applied to the instances. The default value is 'false'. Applies to Linux instances only.
    */
  var ApprovedPatchesEnableNonSecurity: js.UndefOr[Boolean] = js.native
  /**
    * User-provided idempotency token.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ClientToken] = js.native
  /**
    * A description of the patch baseline.
    */
  var Description: js.UndefOr[BaselineDescription] = js.native
  /**
    * A set of global filters used to include patches in the baseline.
    */
  var GlobalFilters: js.UndefOr[PatchFilterGroup] = js.native
  /**
    * The name of the patch baseline.
    */
  var Name: BaselineName = js.native
  /**
    * Defines the operating system the patch baseline applies to. The Default value is WINDOWS.
    */
  var OperatingSystem: js.UndefOr[typings.awsDashSdk.clientsSsmMod.OperatingSystem] = js.native
  /**
    * A list of explicitly rejected patches for the baseline. For information about accepted formats for lists of approved patches and rejected patches, see Package Name Formats for Approved and Rejected Patch Lists in the AWS Systems Manager User Guide.
    */
  var RejectedPatches: js.UndefOr[PatchIdList] = js.native
  /**
    * The action for Patch Manager to take on patches included in the RejectedPackages list.    ALLOW_AS_DEPENDENCY: A package in the Rejected patches list is installed only if it is a dependency of another package. It is considered compliant with the patch baseline, and its status is reported as InstalledOther. This is the default action if no option is specified.    BLOCK: Packages in the RejectedPatches list, and packages that include them as dependencies, are not installed under any circumstances. If a package was installed before it was added to the Rejected patches list, it is considered non-compliant with the patch baseline, and its status is reported as InstalledRejected.  
    */
  var RejectedPatchesAction: js.UndefOr[PatchAction] = js.native
  /**
    * Information about the patches to use to update the instances, including target operating systems and source repositories. Applies to Linux instances only.
    */
  var Sources: js.UndefOr[PatchSourceList] = js.native
  /**
    * Optional metadata that you assign to a resource. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag a patch baseline to identify the severity level of patches it specifies and the operating system family it applies to. In this case, you could specify the following key name/value pairs:    Key=PatchSeverity,Value=Critical     Key=OS,Value=Windows     To add tags to an existing patch baseline, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreatePatchBaselineRequest {
  @scala.inline
  def apply(
    Name: BaselineName,
    ApprovalRules: PatchRuleGroup = null,
    ApprovedPatches: PatchIdList = null,
    ApprovedPatchesComplianceLevel: PatchComplianceLevel = null,
    ApprovedPatchesEnableNonSecurity: js.UndefOr[scala.Boolean] = js.undefined,
    ClientToken: ClientToken = null,
    Description: BaselineDescription = null,
    GlobalFilters: PatchFilterGroup = null,
    OperatingSystem: OperatingSystem = null,
    RejectedPatches: PatchIdList = null,
    RejectedPatchesAction: PatchAction = null,
    Sources: PatchSourceList = null,
    Tags: TagList = null
  ): CreatePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (ApprovalRules != null) __obj.updateDynamic("ApprovalRules")(ApprovalRules.asInstanceOf[js.Any])
    if (ApprovedPatches != null) __obj.updateDynamic("ApprovedPatches")(ApprovedPatches.asInstanceOf[js.Any])
    if (ApprovedPatchesComplianceLevel != null) __obj.updateDynamic("ApprovedPatchesComplianceLevel")(ApprovedPatchesComplianceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(ApprovedPatchesEnableNonSecurity)) __obj.updateDynamic("ApprovedPatchesEnableNonSecurity")(ApprovedPatchesEnableNonSecurity.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GlobalFilters != null) __obj.updateDynamic("GlobalFilters")(GlobalFilters.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (RejectedPatches != null) __obj.updateDynamic("RejectedPatches")(RejectedPatches.asInstanceOf[js.Any])
    if (RejectedPatchesAction != null) __obj.updateDynamic("RejectedPatchesAction")(RejectedPatchesAction.asInstanceOf[js.Any])
    if (Sources != null) __obj.updateDynamic("Sources")(Sources.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePatchBaselineRequest]
  }
}

