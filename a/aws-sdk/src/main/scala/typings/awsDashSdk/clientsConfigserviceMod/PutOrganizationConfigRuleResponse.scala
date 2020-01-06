package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutOrganizationConfigRuleResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of an organization config rule.
    */
  var OrganizationConfigRuleArn: js.UndefOr[StringWithCharLimit256] = js.native
}

object PutOrganizationConfigRuleResponse {
  @scala.inline
  def apply(OrganizationConfigRuleArn: StringWithCharLimit256 = null): PutOrganizationConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (OrganizationConfigRuleArn != null) __obj.updateDynamic("OrganizationConfigRuleArn")(OrganizationConfigRuleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutOrganizationConfigRuleResponse]
  }
}

