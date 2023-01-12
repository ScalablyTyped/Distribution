package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResolverRulePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule that you want to share with another account.
    */
  var Arn: typings.awsSdk.clientsRoute53resolverMod.Arn
  
  /**
    * An Identity and Access Management policy statement that lists the rules that you want to share with another Amazon Web Services account and the operations that you want the account to be able to perform. You can specify the following operations in the Action section of the statement:    route53resolver:GetResolverRule     route53resolver:AssociateResolverRule     route53resolver:DisassociateResolverRule     route53resolver:ListResolverRules     route53resolver:ListResolverRuleAssociations    In the Resource section of the statement, specify the ARN for the rule that you want to share with another account. Specify the same ARN that you specified in Arn.
    */
  var ResolverRulePolicy: typings.awsSdk.clientsRoute53resolverMod.ResolverRulePolicy
}
object PutResolverRulePolicyRequest {
  
  inline def apply(Arn: Arn, ResolverRulePolicy: ResolverRulePolicy): PutResolverRulePolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], ResolverRulePolicy = ResolverRulePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResolverRulePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResolverRulePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setResolverRulePolicy(value: ResolverRulePolicy): Self = StObject.set(x, "ResolverRulePolicy", value.asInstanceOf[js.Any])
  }
}
