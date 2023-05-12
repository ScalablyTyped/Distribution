package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2RulesDetails extends StObject {
  
  /**
    *  The action that WAF should take on a web request when it matches the rule statement. Settings at the web ACL level can override the rule action setting. 
    */
  var Action: js.UndefOr[AwsWafv2RulesActionDetails] = js.undefined
  
  /**
    *  The name of the rule. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The action to use in the place of the action that results from the rule group evaluation. 
    */
  var OverrideAction: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  If you define more than one Rule in a WebACL, WAF evaluates each request against the Rules in order based on the value of Priority. WAF processes rules with lower priority first. The priorities don't need to be consecutive, but they must all be different. 
    */
  var Priority: js.UndefOr[Integer] = js.undefined
  
  /**
    *  Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: js.UndefOr[AwsWafv2VisibilityConfigDetails] = js.undefined
}
object AwsWafv2RulesDetails {
  
  inline def apply(): AwsWafv2RulesDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2RulesDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2RulesDetails] (val x: Self) extends AnyVal {
    
    inline def setAction(value: AwsWafv2RulesActionDetails): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOverrideAction(value: NonEmptyString): Self = StObject.set(x, "OverrideAction", value.asInstanceOf[js.Any])
    
    inline def setOverrideActionUndefined: Self = StObject.set(x, "OverrideAction", js.undefined)
    
    inline def setPriority(value: Integer): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setVisibilityConfig(value: AwsWafv2VisibilityConfigDetails): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
    
    inline def setVisibilityConfigUndefined: Self = StObject.set(x, "VisibilityConfig", js.undefined)
  }
}
