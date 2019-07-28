package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverRulePolicyRequest extends js.Object {
  /**
    * The ID of the resolver rule policy that you want to get information about.
    */
  var Arn: typings.awsDashSdk.clientsRoute53resolverMod.Arn
}

object GetResolverRulePolicyRequest {
  @scala.inline
  def apply(Arn: Arn): GetResolverRulePolicyRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn)
  
    __obj.asInstanceOf[GetResolverRulePolicyRequest]
  }
}

