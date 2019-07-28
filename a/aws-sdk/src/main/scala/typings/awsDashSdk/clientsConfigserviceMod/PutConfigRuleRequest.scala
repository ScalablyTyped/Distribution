package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutConfigRuleRequest extends js.Object {
  /**
    * The rule that you want to add to your account.
    */
  var ConfigRule: typings.awsDashSdk.clientsConfigserviceMod.ConfigRule
  var Tags: js.UndefOr[TagsList] = js.undefined
}

object PutConfigRuleRequest {
  @scala.inline
  def apply(ConfigRule: ConfigRule, Tags: TagsList = null): PutConfigRuleRequest = {
    val __obj = js.Dynamic.literal(ConfigRule = ConfigRule)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[PutConfigRuleRequest]
  }
}

