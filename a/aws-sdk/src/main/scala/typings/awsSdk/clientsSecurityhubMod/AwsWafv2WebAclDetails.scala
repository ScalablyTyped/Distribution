package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2WebAclDetails extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the web ACL that you want to associate with the resource. 
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The web ACL capacity units (WCUs) currently being used by this web ACL. 
    */
  var Capacity: js.UndefOr[Long] = js.undefined
  
  /**
    *  Specifies how WAF should handle CAPTCHA evaluations for rules that don't have their own CaptchaConfig settings. 
    */
  var CaptchaConfig: js.UndefOr[AwsWafv2WebAclCaptchaConfigDetails] = js.undefined
  
  /**
    *  The action to perform if none of the Rules contained in the web ACL match. 
    */
  var DefaultAction: js.UndefOr[AwsWafv2WebAclActionDetails] = js.undefined
  
  /**
    *  A description of the web ACL that helps with identification. 
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  A unique identifier for the web ACL. 
    */
  var Id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Indicates whether this web ACL is managed by Firewall Manager. 
    */
  var ManagedbyFirewallManager: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The name of the web ACL. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes one top-level statement that WAF uses to identify matching web requests, and parameters that govern how WAF handles them. 
    */
  var Rules: js.UndefOr[AwsWafv2RulesList] = js.undefined
  
  /**
    *  Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: js.UndefOr[AwsWafv2VisibilityConfigDetails] = js.undefined
}
object AwsWafv2WebAclDetails {
  
  inline def apply(): AwsWafv2WebAclDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2WebAclDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2WebAclDetails] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCapacity(value: Long): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setCaptchaConfig(value: AwsWafv2WebAclCaptchaConfigDetails): Self = StObject.set(x, "CaptchaConfig", value.asInstanceOf[js.Any])
    
    inline def setCaptchaConfigUndefined: Self = StObject.set(x, "CaptchaConfig", js.undefined)
    
    inline def setDefaultAction(value: AwsWafv2WebAclActionDetails): Self = StObject.set(x, "DefaultAction", value.asInstanceOf[js.Any])
    
    inline def setDefaultActionUndefined: Self = StObject.set(x, "DefaultAction", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setManagedbyFirewallManager(value: Boolean): Self = StObject.set(x, "ManagedbyFirewallManager", value.asInstanceOf[js.Any])
    
    inline def setManagedbyFirewallManagerUndefined: Self = StObject.set(x, "ManagedbyFirewallManager", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRules(value: AwsWafv2RulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: AwsWafv2RulesDetails*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setVisibilityConfig(value: AwsWafv2VisibilityConfigDetails): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
    
    inline def setVisibilityConfigUndefined: Self = StObject.set(x, "VisibilityConfig", js.undefined)
  }
}
