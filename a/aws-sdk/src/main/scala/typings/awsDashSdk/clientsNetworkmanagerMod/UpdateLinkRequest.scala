package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateLinkRequest extends js.Object {
  /**
    * The upload and download speed in Mbps. 
    */
  var Bandwidth: js.UndefOr[typings.awsDashSdk.clientsNetworkmanagerMod.Bandwidth] = js.native
  /**
    * A description of the link. Length Constraints: Maximum length of 256 characters.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: String = js.native
  /**
    * The ID of the link.
    */
  var LinkId: String = js.native
  /**
    * The provider of the link. Length Constraints: Maximum length of 128 characters.
    */
  var Provider: js.UndefOr[String] = js.native
  /**
    * The type of the link. Length Constraints: Maximum length of 128 characters.
    */
  var Type: js.UndefOr[String] = js.native
}

object UpdateLinkRequest {
  @scala.inline
  def apply(
    GlobalNetworkId: String,
    LinkId: String,
    Bandwidth: Bandwidth = null,
    Description: String = null,
    Provider: String = null,
    Type: String = null
  ): UpdateLinkRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], LinkId = LinkId.asInstanceOf[js.Any])
    if (Bandwidth != null) __obj.updateDynamic("Bandwidth")(Bandwidth.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Provider != null) __obj.updateDynamic("Provider")(Provider.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLinkRequest]
  }
}

