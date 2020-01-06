package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalNetwork extends js.Object {
  /**
    * The date and time that the global network was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * The description of the global network.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the global network.
    */
  var GlobalNetworkArn: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The state of the global network.
    */
  var State: js.UndefOr[GlobalNetworkState] = js.native
  /**
    * The tags for the global network.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object GlobalNetwork {
  @scala.inline
  def apply(
    CreatedAt: DateTime = null,
    Description: String = null,
    GlobalNetworkArn: String = null,
    GlobalNetworkId: String = null,
    State: GlobalNetworkState = null,
    Tags: TagList = null
  ): GlobalNetwork = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (GlobalNetworkArn != null) __obj.updateDynamic("GlobalNetworkArn")(GlobalNetworkArn.asInstanceOf[js.Any])
    if (GlobalNetworkId != null) __obj.updateDynamic("GlobalNetworkId")(GlobalNetworkId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalNetwork]
  }
}

