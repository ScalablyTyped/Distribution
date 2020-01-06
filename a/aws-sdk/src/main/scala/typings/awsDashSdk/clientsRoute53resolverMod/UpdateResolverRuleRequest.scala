package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateResolverRuleRequest extends js.Object {
  /**
    * The new settings for the resolver rule.
    */
  var Config: ResolverRuleConfig = js.native
  /**
    * The ID of the resolver rule that you want to update.
    */
  var ResolverRuleId: ResourceId = js.native
}

object UpdateResolverRuleRequest {
  @scala.inline
  def apply(Config: ResolverRuleConfig, ResolverRuleId: ResourceId): UpdateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(Config = Config.asInstanceOf[js.Any], ResolverRuleId = ResolverRuleId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateResolverRuleRequest]
  }
}

