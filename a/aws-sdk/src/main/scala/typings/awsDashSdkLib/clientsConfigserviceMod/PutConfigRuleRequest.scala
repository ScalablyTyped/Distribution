package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutConfigRuleRequest extends js.Object {
  /**
    * The rule that you want to add to your account.
    */
  var ConfigRule: awsDashSdkLib.clientsConfigserviceMod.ConfigRule
}

object PutConfigRuleRequest {
  @scala.inline
  def apply(ConfigRule: ConfigRule): PutConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRule = ConfigRule)
  
    __obj.asInstanceOf[PutConfigRuleRequest]
  }
}

