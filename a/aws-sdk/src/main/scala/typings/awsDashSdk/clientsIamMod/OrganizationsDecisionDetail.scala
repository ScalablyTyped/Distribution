package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationsDecisionDetail extends js.Object {
  /**
    * Specifies whether the simulated operation is allowed by the Organizations service control policies that impact the simulated user's account.
    */
  var AllowedByOrganizations: js.UndefOr[booleanType] = js.undefined
}

object OrganizationsDecisionDetail {
  @scala.inline
  def apply(AllowedByOrganizations: js.UndefOr[booleanType] = js.undefined): OrganizationsDecisionDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowedByOrganizations)) __obj.updateDynamic("AllowedByOrganizations")(AllowedByOrganizations)
    __obj.asInstanceOf[OrganizationsDecisionDetail]
  }
}

