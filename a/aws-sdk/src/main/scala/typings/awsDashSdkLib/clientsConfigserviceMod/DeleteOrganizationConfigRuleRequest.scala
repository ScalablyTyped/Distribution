package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteOrganizationConfigRuleRequest extends js.Object {
  var OrganizationConfigRuleName: StringWithCharLimit64
}

object DeleteOrganizationConfigRuleRequest {
  @scala.inline
  def apply(OrganizationConfigRuleName: StringWithCharLimit64): DeleteOrganizationConfigRuleRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName)
  
    __obj.asInstanceOf[DeleteOrganizationConfigRuleRequest]
  }
}

