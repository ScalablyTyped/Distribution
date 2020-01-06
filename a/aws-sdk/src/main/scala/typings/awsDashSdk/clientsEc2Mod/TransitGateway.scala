package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGateway extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.native
  /**
    * The description of the transit gateway.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The transit gateway options.
    */
  var Options: js.UndefOr[TransitGatewayOptions] = js.native
  /**
    * The ID of the AWS account ID that owns the transit gateway.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The state of the transit gateway.
    */
  var State: js.UndefOr[TransitGatewayState] = js.native
  /**
    * The tags for the transit gateway.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the transit gateway.
    */
  var TransitGatewayArn: js.UndefOr[String] = js.native
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
}

object TransitGateway {
  @scala.inline
  def apply(
    CreationTime: DateTime = null,
    Description: String = null,
    Options: TransitGatewayOptions = null,
    OwnerId: String = null,
    State: TransitGatewayState = null,
    Tags: TagList = null,
    TransitGatewayArn: String = null,
    TransitGatewayId: String = null
  ): TransitGateway = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Options != null) __obj.updateDynamic("Options")(Options.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TransitGatewayArn != null) __obj.updateDynamic("TransitGatewayArn")(TransitGatewayArn.asInstanceOf[js.Any])
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGateway]
  }
}

