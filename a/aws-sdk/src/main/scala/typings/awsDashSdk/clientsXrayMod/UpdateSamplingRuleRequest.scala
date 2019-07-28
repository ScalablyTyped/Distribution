package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSamplingRuleRequest extends js.Object {
  /**
    * The rule and fields to change.
    */
  var SamplingRuleUpdate: typings.awsDashSdk.clientsXrayMod.SamplingRuleUpdate
}

object UpdateSamplingRuleRequest {
  @scala.inline
  def apply(SamplingRuleUpdate: SamplingRuleUpdate): UpdateSamplingRuleRequest = {
    val __obj = js.Dynamic.literal(SamplingRuleUpdate = SamplingRuleUpdate)
  
    __obj.asInstanceOf[UpdateSamplingRuleRequest]
  }
}

