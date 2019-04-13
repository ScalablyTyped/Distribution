package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateResolverRuleRequest extends js.Object {
  /**
    * The new settings for the resolver rule.
    */
  var Config: ResolverRuleConfig
  /**
    * The ID of the resolver rule that you want to update.
    */
  var ResolverRuleId: ResourceId
}

object UpdateResolverRuleRequest {
  @scala.inline
  def apply(Config: ResolverRuleConfig, ResolverRuleId: ResourceId): UpdateResolverRuleRequest = {
    val __obj = js.Dynamic.literal(Config = Config, ResolverRuleId = ResolverRuleId)
  
    __obj.asInstanceOf[UpdateResolverRuleRequest]
  }
}

