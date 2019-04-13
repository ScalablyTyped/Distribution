package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutResolverRulePolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the account that you want to grant permissions to.
    */
  var Arn: awsDashSdkLib.clientsRoute53resolverMod.Arn
  /**
    * An AWS Identity and Access Management policy statement that lists the permissions that you want to grant to another AWS account.
    */
  var ResolverRulePolicy: awsDashSdkLib.clientsRoute53resolverMod.ResolverRulePolicy
}

object PutResolverRulePolicyRequest {
  @scala.inline
  def apply(Arn: Arn, ResolverRulePolicy: ResolverRulePolicy): PutResolverRulePolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn, ResolverRulePolicy = ResolverRulePolicy)
  
    __obj.asInstanceOf[PutResolverRulePolicyRequest]
  }
}

