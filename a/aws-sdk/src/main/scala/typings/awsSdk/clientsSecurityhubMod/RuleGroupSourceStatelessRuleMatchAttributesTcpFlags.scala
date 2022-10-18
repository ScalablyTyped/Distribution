package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceStatelessRuleMatchAttributesTcpFlags extends StObject {
  
  /**
    * Defines the flags from the Masks setting that must be set in order for the packet to match. Flags that are listed must be set. Flags that are not listed must not be set.
    */
  var Flags: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The set of flags to consider in the inspection. If not specified, then all flags are inspected.
    */
  var Masks: js.UndefOr[NonEmptyStringList] = js.undefined
}
object RuleGroupSourceStatelessRuleMatchAttributesTcpFlags {
  
  inline def apply(): RuleGroupSourceStatelessRuleMatchAttributesTcpFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceStatelessRuleMatchAttributesTcpFlags]
  }
  
  extension [Self <: RuleGroupSourceStatelessRuleMatchAttributesTcpFlags](x: Self) {
    
    inline def setFlags(value: NonEmptyStringList): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "Flags", js.undefined)
    
    inline def setFlagsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Flags", js.Array(value*))
    
    inline def setMasks(value: NonEmptyStringList): Self = StObject.set(x, "Masks", value.asInstanceOf[js.Any])
    
    inline def setMasksUndefined: Self = StObject.set(x, "Masks", js.undefined)
    
    inline def setMasksVarargs(value: NonEmptyString*): Self = StObject.set(x, "Masks", js.Array(value*))
  }
}
