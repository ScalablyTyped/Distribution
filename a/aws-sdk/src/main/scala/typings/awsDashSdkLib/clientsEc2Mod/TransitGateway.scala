package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGateway extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[DateTime] = js.undefined
  /**
    * The description of the transit gateway.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The transit gateway options.
    */
  var Options: js.UndefOr[TransitGatewayOptions] = js.undefined
  /**
    * The ID of the AWS account ID that owns the transit gateway.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * The state of the transit gateway.
    */
  var State: js.UndefOr[TransitGatewayState] = js.undefined
  /**
    * The tags for the transit gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the transit gateway.
    */
  var TransitGatewayArn: js.UndefOr[String] = js.undefined
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
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
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TransitGatewayArn != null) __obj.updateDynamic("TransitGatewayArn")(TransitGatewayArn)
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId)
    __obj.asInstanceOf[TransitGateway]
  }
}

