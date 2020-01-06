package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDirectConnectGatewayAttachmentsResult extends js.Object {
  /**
    * The attachments.
    */
  var directConnectGatewayAttachments: js.UndefOr[DirectConnectGatewayAttachmentList] = js.native
  /**
    * The token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object DescribeDirectConnectGatewayAttachmentsResult {
  @scala.inline
  def apply(
    directConnectGatewayAttachments: DirectConnectGatewayAttachmentList = null,
    nextToken: PaginationToken = null
  ): DescribeDirectConnectGatewayAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayAttachments != null) __obj.updateDynamic("directConnectGatewayAttachments")(directConnectGatewayAttachments.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDirectConnectGatewayAttachmentsResult]
  }
}

