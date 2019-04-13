package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateSamplingRuleRequest extends js.Object {
  /**
    * The rule and fields to change.
    */
  var SamplingRuleUpdate: awsDashSdkLib.clientsXrayMod.SamplingRuleUpdate
}

object UpdateSamplingRuleRequest {
  @scala.inline
  def apply(SamplingRuleUpdate: SamplingRuleUpdate): UpdateSamplingRuleRequest = {
    val __obj = js.Dynamic.literal(SamplingRuleUpdate = SamplingRuleUpdate)
  
    __obj.asInstanceOf[UpdateSamplingRuleRequest]
  }
}

