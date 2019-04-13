package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOrganizationResponse extends js.Object {
  /**
    * A structure that contains details about the newly created organization.
    */
  var Organization: js.UndefOr[Organization] = js.undefined
}

object CreateOrganizationResponse {
  @scala.inline
  def apply(Organization: Organization = null): CreateOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (Organization != null) __obj.updateDynamic("Organization")(Organization)
    __obj.asInstanceOf[CreateOrganizationResponse]
  }
}

