package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationSummary extends js.Object {
  /**
    * The alias associated with the organization.
    */
  var Alias: js.UndefOr[OrganizationName] = js.undefined
  /**
    * The error message associated with the organization. It is only present if unexpected behavior has occurred with regards to the organization. It provides insight or solutions regarding unexpected behavior.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * The identifier associated with the organization.
    */
  var OrganizationId: js.UndefOr[typings.awsDashSdk.clientsWorkmailMod.OrganizationId] = js.undefined
  /**
    * The state associated with the organization.
    */
  var State: js.UndefOr[String] = js.undefined
}

object OrganizationSummary {
  @scala.inline
  def apply(
    Alias: OrganizationName = null,
    ErrorMessage: String = null,
    OrganizationId: OrganizationId = null,
    State: String = null
  ): OrganizationSummary = {
    val __obj = js.Dynamic.literal()
    if (Alias != null) __obj.updateDynamic("Alias")(Alias)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (OrganizationId != null) __obj.updateDynamic("OrganizationId")(OrganizationId)
    if (State != null) __obj.updateDynamic("State")(State)
    __obj.asInstanceOf[OrganizationSummary]
  }
}

