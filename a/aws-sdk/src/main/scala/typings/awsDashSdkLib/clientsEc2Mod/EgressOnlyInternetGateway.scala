package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EgressOnlyInternetGateway extends js.Object {
  /**
    * Information about the attachment of the egress-only internet gateway.
    */
  var Attachments: js.UndefOr[InternetGatewayAttachmentList] = js.undefined
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[EgressOnlyInternetGatewayId] = js.undefined
}

object EgressOnlyInternetGateway {
  @scala.inline
  def apply(
    Attachments: InternetGatewayAttachmentList = null,
    EgressOnlyInternetGatewayId: EgressOnlyInternetGatewayId = null
  ): EgressOnlyInternetGateway = {
    val __obj = js.Dynamic.literal()
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments)
    if (EgressOnlyInternetGatewayId != null) __obj.updateDynamic("EgressOnlyInternetGatewayId")(EgressOnlyInternetGatewayId)
    __obj.asInstanceOf[EgressOnlyInternetGateway]
  }
}

