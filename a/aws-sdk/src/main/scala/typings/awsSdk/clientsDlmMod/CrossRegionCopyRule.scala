package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossRegionCopyRule extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key to use for EBS encryption. If this parameter is not specified, the default KMS key for the account is used.
    */
  var CmkArn: js.UndefOr[typings.awsSdk.clientsDlmMod.CmkArn] = js.undefined
  
  /**
    * Indicates whether to copy all user-defined tags from the source snapshot or AMI to the cross-Region copy.
    */
  var CopyTags: js.UndefOr[CopyTagsNullable] = js.undefined
  
  /**
    *  [AMI policies only] The AMI deprecation rule for cross-Region AMI copies created by the rule.
    */
  var DeprecateRule: js.UndefOr[CrossRegionCopyDeprecateRule] = js.undefined
  
  /**
    * To encrypt a copy of an unencrypted snapshot if encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or if encryption by default is not enabled.
    */
  var Encrypted: typings.awsSdk.clientsDlmMod.Encrypted
  
  /**
    * The retention rule that indicates how long the cross-Region snapshot or AMI copies are to be retained in the destination Region.
    */
  var RetainRule: js.UndefOr[CrossRegionCopyRetainRule] = js.undefined
  
  /**
    * The target Region or the Amazon Resource Name (ARN) of the target Outpost for the snapshot copies. Use this parameter instead of TargetRegion. Do not specify both.
    */
  var Target: js.UndefOr[typings.awsSdk.clientsDlmMod.Target] = js.undefined
  
  /**
    *  Avoid using this parameter when creating new policies. Instead, use Target to specify a target Region or a target Outpost for snapshot copies. For policies created before the Target parameter was introduced, this parameter indicates the target Region for snapshot copies. 
    */
  var TargetRegion: js.UndefOr[typings.awsSdk.clientsDlmMod.TargetRegion] = js.undefined
}
object CrossRegionCopyRule {
  
  inline def apply(Encrypted: Encrypted): CrossRegionCopyRule = {
    val __obj = js.Dynamic.literal(Encrypted = Encrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossRegionCopyRule]
  }
  
  extension [Self <: CrossRegionCopyRule](x: Self) {
    
    inline def setCmkArn(value: CmkArn): Self = StObject.set(x, "CmkArn", value.asInstanceOf[js.Any])
    
    inline def setCmkArnUndefined: Self = StObject.set(x, "CmkArn", js.undefined)
    
    inline def setCopyTags(value: CopyTagsNullable): Self = StObject.set(x, "CopyTags", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsUndefined: Self = StObject.set(x, "CopyTags", js.undefined)
    
    inline def setDeprecateRule(value: CrossRegionCopyDeprecateRule): Self = StObject.set(x, "DeprecateRule", value.asInstanceOf[js.Any])
    
    inline def setDeprecateRuleUndefined: Self = StObject.set(x, "DeprecateRule", js.undefined)
    
    inline def setEncrypted(value: Encrypted): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setRetainRule(value: CrossRegionCopyRetainRule): Self = StObject.set(x, "RetainRule", value.asInstanceOf[js.Any])
    
    inline def setRetainRuleUndefined: Self = StObject.set(x, "RetainRule", js.undefined)
    
    inline def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetRegion(value: TargetRegion): Self = StObject.set(x, "TargetRegion", value.asInstanceOf[js.Any])
    
    inline def setTargetRegionUndefined: Self = StObject.set(x, "TargetRegion", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
