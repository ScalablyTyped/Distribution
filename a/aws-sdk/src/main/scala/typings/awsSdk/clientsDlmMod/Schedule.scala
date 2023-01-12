package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schedule extends StObject {
  
  /**
    *  [Snapshot policies that target volumes only] The snapshot archiving rule for the schedule. When you specify an archiving rule, snapshots are automatically moved from the standard tier to the archive tier once the schedule's retention threshold is met. Snapshots are then retained in the archive tier for the archive retention period that you specify.  For more information about using snapshot archiving, see Considerations for snapshot lifecycle policies.
    */
  var ArchiveRule: js.UndefOr[typings.awsSdk.clientsDlmMod.ArchiveRule] = js.undefined
  
  /**
    * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
    */
  var CopyTags: js.UndefOr[typings.awsSdk.clientsDlmMod.CopyTags] = js.undefined
  
  /**
    * The creation rule.
    */
  var CreateRule: js.UndefOr[typings.awsSdk.clientsDlmMod.CreateRule] = js.undefined
  
  /**
    * Specifies a rule for copying snapshots or AMIs across regions.  You can't specify cross-Region copy rules for policies that create snapshots on an Outpost. If the policy creates snapshots in a Region, then snapshots can be copied to up to three Regions or Outposts. 
    */
  var CrossRegionCopyRules: js.UndefOr[typings.awsSdk.clientsDlmMod.CrossRegionCopyRules] = js.undefined
  
  /**
    *  [AMI policies only] The AMI deprecation rule for the schedule.
    */
  var DeprecateRule: js.UndefOr[typings.awsSdk.clientsDlmMod.DeprecateRule] = js.undefined
  
  /**
    *  [Snapshot policies only] The rule for enabling fast snapshot restore.
    */
  var FastRestoreRule: js.UndefOr[typings.awsSdk.clientsDlmMod.FastRestoreRule] = js.undefined
  
  /**
    * The name of the schedule.
    */
  var Name: js.UndefOr[ScheduleName] = js.undefined
  
  /**
    * The retention rule for snapshots or AMIs created by the policy.
    */
  var RetainRule: js.UndefOr[typings.awsSdk.clientsDlmMod.RetainRule] = js.undefined
  
  /**
    *  [Snapshot policies only] The rule for sharing snapshots with other Amazon Web Services accounts.
    */
  var ShareRules: js.UndefOr[typings.awsSdk.clientsDlmMod.ShareRules] = js.undefined
  
  /**
    * The tags to apply to policy-created resources. These user-defined tags are in addition to the Amazon Web Services-added lifecycle tags.
    */
  var TagsToAdd: js.UndefOr[TagsToAddList] = js.undefined
  
  /**
    *  [AMI policies and snapshot policies that target instances only] A collection of key/value pairs with values determined dynamically when the policy is executed. Keys may be any valid Amazon EC2 tag key. Values must be in one of the two following formats: $(instance-id) or $(timestamp). Variable tags are only valid for EBS Snapshot Management – Instance policies.
    */
  var VariableTags: js.UndefOr[VariableTagsList] = js.undefined
}
object Schedule {
  
  inline def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
    
    inline def setArchiveRule(value: ArchiveRule): Self = StObject.set(x, "ArchiveRule", value.asInstanceOf[js.Any])
    
    inline def setArchiveRuleUndefined: Self = StObject.set(x, "ArchiveRule", js.undefined)
    
    inline def setCopyTags(value: CopyTags): Self = StObject.set(x, "CopyTags", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsUndefined: Self = StObject.set(x, "CopyTags", js.undefined)
    
    inline def setCreateRule(value: CreateRule): Self = StObject.set(x, "CreateRule", value.asInstanceOf[js.Any])
    
    inline def setCreateRuleUndefined: Self = StObject.set(x, "CreateRule", js.undefined)
    
    inline def setCrossRegionCopyRules(value: CrossRegionCopyRules): Self = StObject.set(x, "CrossRegionCopyRules", value.asInstanceOf[js.Any])
    
    inline def setCrossRegionCopyRulesUndefined: Self = StObject.set(x, "CrossRegionCopyRules", js.undefined)
    
    inline def setCrossRegionCopyRulesVarargs(value: CrossRegionCopyRule*): Self = StObject.set(x, "CrossRegionCopyRules", js.Array(value*))
    
    inline def setDeprecateRule(value: DeprecateRule): Self = StObject.set(x, "DeprecateRule", value.asInstanceOf[js.Any])
    
    inline def setDeprecateRuleUndefined: Self = StObject.set(x, "DeprecateRule", js.undefined)
    
    inline def setFastRestoreRule(value: FastRestoreRule): Self = StObject.set(x, "FastRestoreRule", value.asInstanceOf[js.Any])
    
    inline def setFastRestoreRuleUndefined: Self = StObject.set(x, "FastRestoreRule", js.undefined)
    
    inline def setName(value: ScheduleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRetainRule(value: RetainRule): Self = StObject.set(x, "RetainRule", value.asInstanceOf[js.Any])
    
    inline def setRetainRuleUndefined: Self = StObject.set(x, "RetainRule", js.undefined)
    
    inline def setShareRules(value: ShareRules): Self = StObject.set(x, "ShareRules", value.asInstanceOf[js.Any])
    
    inline def setShareRulesUndefined: Self = StObject.set(x, "ShareRules", js.undefined)
    
    inline def setShareRulesVarargs(value: ShareRule*): Self = StObject.set(x, "ShareRules", js.Array(value*))
    
    inline def setTagsToAdd(value: TagsToAddList): Self = StObject.set(x, "TagsToAdd", value.asInstanceOf[js.Any])
    
    inline def setTagsToAddUndefined: Self = StObject.set(x, "TagsToAdd", js.undefined)
    
    inline def setTagsToAddVarargs(value: Tag*): Self = StObject.set(x, "TagsToAdd", js.Array(value*))
    
    inline def setVariableTags(value: VariableTagsList): Self = StObject.set(x, "VariableTags", value.asInstanceOf[js.Any])
    
    inline def setVariableTagsUndefined: Self = StObject.set(x, "VariableTags", js.undefined)
    
    inline def setVariableTagsVarargs(value: Tag*): Self = StObject.set(x, "VariableTags", js.Array(value*))
  }
}
