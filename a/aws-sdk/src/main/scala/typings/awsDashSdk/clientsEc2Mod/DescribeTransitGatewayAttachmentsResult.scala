package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTransitGatewayAttachmentsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the attachments.
    */
  var TransitGatewayAttachments: js.UndefOr[TransitGatewayAttachmentList] = js.native
}

object DescribeTransitGatewayAttachmentsResult {
  @scala.inline
  def apply(NextToken: String = null, TransitGatewayAttachments: TransitGatewayAttachmentList = null): DescribeTransitGatewayAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGatewayAttachments != null) __obj.updateDynamic("TransitGatewayAttachments")(TransitGatewayAttachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTransitGatewayAttachmentsResult]
  }
}

