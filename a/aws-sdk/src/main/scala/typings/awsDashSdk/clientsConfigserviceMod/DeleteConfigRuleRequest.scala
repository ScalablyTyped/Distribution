package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteConfigRuleRequest extends js.Object {
  /**
    * The name of the AWS Config rule that you want to delete.
    */
  var ConfigRuleName: StringWithCharLimit64
}

object DeleteConfigRuleRequest {
  @scala.inline
  def apply(ConfigRuleName: StringWithCharLimit64): DeleteConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName)
  
    __obj.asInstanceOf[DeleteConfigRuleRequest]
  }
}

