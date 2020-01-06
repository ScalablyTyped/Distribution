package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link extends js.Object {
  /**
    * The bandwidth for the link.
    */
  var Bandwidth: js.UndefOr[typings.awsDashSdk.clientsNetworkmanagerMod.Bandwidth] = js.native
  /**
    * The date and time that the link was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * The description of the link.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the link.
    */
  var LinkArn: js.UndefOr[String] = js.native
  /**
    * The ID of the link.
    */
  var LinkId: js.UndefOr[String] = js.native
  /**
    * The provider of the link.
    */
  var Provider: js.UndefOr[String] = js.native
  /**
    * The ID of the site.
    */
  var SiteId: js.UndefOr[String] = js.native
  /**
    * The state of the link.
    */
  var State: js.UndefOr[LinkState] = js.native
  /**
    * The tags for the link.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The type of the link.
    */
  var Type: js.UndefOr[String] = js.native
}

object Link {
  @scala.inline
  def apply(
    Bandwidth: Bandwidth = null,
    CreatedAt: DateTime = null,
    Description: String = null,
    GlobalNetworkId: String = null,
    LinkArn: String = null,
    LinkId: String = null,
    Provider: String = null,
    SiteId: String = null,
    State: LinkState = null,
    Tags: TagList = null,
    Type: String = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    if (Bandwidth != null) __obj.updateDynamic("Bandwidth")(Bandwidth.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GlobalNetworkId != null) __obj.updateDynamic("GlobalNetworkId")(GlobalNetworkId.asInstanceOf[js.Any])
    if (LinkArn != null) __obj.updateDynamic("LinkArn")(LinkArn.asInstanceOf[js.Any])
    if (LinkId != null) __obj.updateDynamic("LinkId")(LinkId.asInstanceOf[js.Any])
    if (Provider != null) __obj.updateDynamic("Provider")(Provider.asInstanceOf[js.Any])
    if (SiteId != null) __obj.updateDynamic("SiteId")(SiteId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

