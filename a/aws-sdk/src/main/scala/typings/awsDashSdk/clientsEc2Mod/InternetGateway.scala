package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternetGateway extends js.Object {
  /**
    * Any VPCs attached to the internet gateway.
    */
  var Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.undefined
  /**
    * The ID of the internet gateway.
    */
  var InternetGatewayId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * Any tags assigned to the internet gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object InternetGateway {
  @scala.inline
  def apply(
    Attachments: InternetGatewayAttachmentList = null,
    InternetGatewayId: String = null,
    OwnerId: String = null,
    Tags: TagList = null
  ): InternetGateway = {
    val __obj = js.Dynamic.literal()
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments)
    if (InternetGatewayId != null) __obj.updateDynamic("InternetGatewayId")(InternetGatewayId)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[InternetGateway]
  }
}

