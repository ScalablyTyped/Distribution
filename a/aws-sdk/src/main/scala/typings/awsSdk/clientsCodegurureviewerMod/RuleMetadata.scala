package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleMetadata extends StObject {
  
  /**
    * A long description of the rule.
    */
  var LongDescription: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.LongDescription] = js.undefined
  
  /**
    * The ID of the rule.
    */
  var RuleId: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.RuleId] = js.undefined
  
  /**
    * The name of the rule.
    */
  var RuleName: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.RuleName] = js.undefined
  
  /**
    * Tags that are associated with the rule.
    */
  var RuleTags: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.RuleTags] = js.undefined
  
  /**
    * A short description of the rule.
    */
  var ShortDescription: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.ShortDescription] = js.undefined
}
object RuleMetadata {
  
  inline def apply(): RuleMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleMetadata]
  }
  
  extension [Self <: RuleMetadata](x: Self) {
    
    inline def setLongDescription(value: LongDescription): Self = StObject.set(x, "LongDescription", value.asInstanceOf[js.Any])
    
    inline def setLongDescriptionUndefined: Self = StObject.set(x, "LongDescription", js.undefined)
    
    inline def setRuleId(value: RuleId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "RuleId", js.undefined)
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
    
    inline def setRuleTags(value: RuleTags): Self = StObject.set(x, "RuleTags", value.asInstanceOf[js.Any])
    
    inline def setRuleTagsUndefined: Self = StObject.set(x, "RuleTags", js.undefined)
    
    inline def setRuleTagsVarargs(value: RuleTag*): Self = StObject.set(x, "RuleTags", js.Array(value*))
    
    inline def setShortDescription(value: ShortDescription): Self = StObject.set(x, "ShortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "ShortDescription", js.undefined)
  }
}
