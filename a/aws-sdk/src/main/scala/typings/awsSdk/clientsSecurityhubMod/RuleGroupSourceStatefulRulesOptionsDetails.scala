package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupSourceStatefulRulesOptionsDetails extends StObject {
  
  /**
    * A keyword to look for.
    */
  var Keyword: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of settings.
    */
  var Settings: js.UndefOr[RuleGroupSourceStatefulRulesRuleOptionsSettingsList] = js.undefined
}
object RuleGroupSourceStatefulRulesOptionsDetails {
  
  inline def apply(): RuleGroupSourceStatefulRulesOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleGroupSourceStatefulRulesOptionsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleGroupSourceStatefulRulesOptionsDetails] (val x: Self) extends AnyVal {
    
    inline def setKeyword(value: NonEmptyString): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "Keyword", js.undefined)
    
    inline def setSettings(value: RuleGroupSourceStatefulRulesRuleOptionsSettingsList): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setSettingsVarargs(value: NonEmptyString*): Self = StObject.set(x, "Settings", js.Array(value*))
  }
}
