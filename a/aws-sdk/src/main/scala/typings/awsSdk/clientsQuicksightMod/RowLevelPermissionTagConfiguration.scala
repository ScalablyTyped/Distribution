package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowLevelPermissionTagConfiguration extends StObject {
  
  /**
    * The status of row-level security tags. If enabled, the status is ENABLED. If disabled, the status is DISABLED.
    */
  var Status: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Status] = js.undefined
  
  /**
    * A list of tag configuration rules to apply to a dataset. All tag configurations have the OR condition. Tags within each tile will be joined (AND). At least one rule in this structure must have all tag values assigned to it to apply Row-level security (RLS) to the dataset.
    */
  var TagRuleConfigurations: js.UndefOr[RowLevelPermissionTagRuleConfigurationList] = js.undefined
  
  /**
    * A set of rules associated with row-level security, such as the tag names and columns that they are assigned to.
    */
  var TagRules: RowLevelPermissionTagRuleList
}
object RowLevelPermissionTagConfiguration {
  
  inline def apply(TagRules: RowLevelPermissionTagRuleList): RowLevelPermissionTagConfiguration = {
    val __obj = js.Dynamic.literal(TagRules = TagRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowLevelPermissionTagConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowLevelPermissionTagConfiguration] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTagRuleConfigurations(value: RowLevelPermissionTagRuleConfigurationList): Self = StObject.set(x, "TagRuleConfigurations", value.asInstanceOf[js.Any])
    
    inline def setTagRuleConfigurationsUndefined: Self = StObject.set(x, "TagRuleConfigurations", js.undefined)
    
    inline def setTagRuleConfigurationsVarargs(value: RowLevelPermissionTagRuleConfiguration*): Self = StObject.set(x, "TagRuleConfigurations", js.Array(value*))
    
    inline def setTagRules(value: RowLevelPermissionTagRuleList): Self = StObject.set(x, "TagRules", value.asInstanceOf[js.Any])
    
    inline def setTagRulesVarargs(value: RowLevelPermissionTagRule*): Self = StObject.set(x, "TagRules", js.Array(value*))
  }
}
