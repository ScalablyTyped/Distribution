package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSamplingRuleRequest extends js.Object {
  /**
    * The rule definition.
    */
  var SamplingRule: typings.awsDashSdk.clientsXrayMod.SamplingRule
}

object CreateSamplingRuleRequest {
  @scala.inline
  def apply(SamplingRule: SamplingRule): CreateSamplingRuleRequest = {
    val __obj = js.Dynamic.literal(SamplingRule = SamplingRule)
  
    __obj.asInstanceOf[CreateSamplingRuleRequest]
  }
}

