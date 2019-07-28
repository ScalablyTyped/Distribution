package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableAllFeaturesResponse extends js.Object {
  /**
    * A structure that contains details about the handshake created to support this request to enable all features in the organization.
    */
  var Handshake: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Handshake] = js.undefined
}

object EnableAllFeaturesResponse {
  @scala.inline
  def apply(Handshake: Handshake = null): EnableAllFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    if (Handshake != null) __obj.updateDynamic("Handshake")(Handshake)
    __obj.asInstanceOf[EnableAllFeaturesResponse]
  }
}

