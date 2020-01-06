package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteOrganizationConfigRuleRequest extends js.Object {
  /**
    * The name of organization config rule that you want to delete.
    */
  var OrganizationConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.OrganizationConfigRuleName = js.native
}

object DeleteOrganizationConfigRuleRequest {
  @scala.inline
  def apply(OrganizationConfigRuleName: OrganizationConfigRuleName): DeleteOrganizationConfigRuleRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteOrganizationConfigRuleRequest]
  }
}

