package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EgressOnlyInternetGateway extends js.Object {
  /**
    * Information about the attachment of the egress-only internet gateway.
    */
  var Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.native
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.EgressOnlyInternetGatewayId] = js.native
}

object EgressOnlyInternetGateway {
  @scala.inline
  def apply(
    Attachments: InternetGatewayAttachmentList = null,
    EgressOnlyInternetGatewayId: EgressOnlyInternetGatewayId = null
  ): EgressOnlyInternetGateway = {
    val __obj = js.Dynamic.literal()
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments.asInstanceOf[js.Any])
    if (EgressOnlyInternetGatewayId != null) __obj.updateDynamic("EgressOnlyInternetGatewayId")(EgressOnlyInternetGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EgressOnlyInternetGateway]
  }
}

