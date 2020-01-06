package typings.awsDashSdk.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationsDecisionDetail extends js.Object {
  /**
    * Specifies whether the simulated operation is allowed by the Organizations service control policies that impact the simulated user's account.
    */
  var AllowedByOrganizations: js.UndefOr[booleanType] = js.native
}

object OrganizationsDecisionDetail {
  @scala.inline
  def apply(AllowedByOrganizations: js.UndefOr[Boolean] = js.undefined): OrganizationsDecisionDetail = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowedByOrganizations)) __obj.updateDynamic("AllowedByOrganizations")(AllowedByOrganizations.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsDecisionDetail]
  }
}

