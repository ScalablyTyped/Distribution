package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DnsDuplicateRuleGroupViolation extends StObject {
  
  /**
    * Information about the VPC ID. 
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.clientsFmsMod.ViolationTarget] = js.undefined
  
  /**
    * A description of the violation that specifies the rule group and VPC.
    */
  var ViolationTargetDescription: js.UndefOr[LengthBoundedString] = js.undefined
}
object DnsDuplicateRuleGroupViolation {
  
  inline def apply(): DnsDuplicateRuleGroupViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DnsDuplicateRuleGroupViolation]
  }
  
  extension [Self <: DnsDuplicateRuleGroupViolation](x: Self) {
    
    inline def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetDescription(value: LengthBoundedString): Self = StObject.set(x, "ViolationTargetDescription", value.asInstanceOf[js.Any])
    
    inline def setViolationTargetDescriptionUndefined: Self = StObject.set(x, "ViolationTargetDescription", js.undefined)
    
    inline def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
