package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsWafv2RuleGroupDetails extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the entity. 
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The web ACL capacity units (WCUs) required for this rule group. 
    */
  var Capacity: js.UndefOr[Long] = js.undefined
  
  /**
    *  A description of the rule group that helps with identification. 
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  A unique identifier for the rule group. 
    */
  var Id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The name of the rule group. You cannot change the name of a rule group after you create it. 
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The Rule statements used to identify the web requests that you want to allow, block, or count. Each rule includes one top-level statement that WAF uses to identify matching web requests, and parameters that govern how WAF handles them. 
    */
  var Rules: js.UndefOr[AwsWafv2RulesList] = js.undefined
  
  /**
    *  Specifies whether the rule group is for an Amazon CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, or an Amazon Cognito user pool. 
    */
  var Scope: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  Defines and enables Amazon CloudWatch metrics and web request sample collection. 
    */
  var VisibilityConfig: js.UndefOr[AwsWafv2VisibilityConfigDetails] = js.undefined
}
object AwsWafv2RuleGroupDetails {
  
  inline def apply(): AwsWafv2RuleGroupDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsWafv2RuleGroupDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsWafv2RuleGroupDetails] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCapacity(value: Long): Self = StObject.set(x, "Capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "Capacity", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRules(value: AwsWafv2RulesList): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "Rules", js.undefined)
    
    inline def setRulesVarargs(value: AwsWafv2RulesDetails*): Self = StObject.set(x, "Rules", js.Array(value*))
    
    inline def setScope(value: NonEmptyString): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "Scope", js.undefined)
    
    inline def setVisibilityConfig(value: AwsWafv2VisibilityConfigDetails): Self = StObject.set(x, "VisibilityConfig", value.asInstanceOf[js.Any])
    
    inline def setVisibilityConfigUndefined: Self = StObject.set(x, "VisibilityConfig", js.undefined)
  }
}
