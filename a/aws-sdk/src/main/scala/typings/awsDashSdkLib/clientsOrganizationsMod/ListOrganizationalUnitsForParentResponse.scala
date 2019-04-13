package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOrganizationalUnitsForParentResponse extends js.Object {
  /**
    * If present, this value indicates that there is more output available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of the OUs in the specified root or parent OU.
    */
  var OrganizationalUnits: js.UndefOr[OrganizationalUnits] = js.undefined
}

object ListOrganizationalUnitsForParentResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, OrganizationalUnits: OrganizationalUnits = null): ListOrganizationalUnitsForParentResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (OrganizationalUnits != null) __obj.updateDynamic("OrganizationalUnits")(OrganizationalUnits)
    __obj.asInstanceOf[ListOrganizationalUnitsForParentResponse]
  }
}

