package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTransitGatewayVpcAttachmentsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the VPC attachments.
    */
  var TransitGatewayVpcAttachments: js.UndefOr[TransitGatewayVpcAttachmentList] = js.undefined
}

object DescribeTransitGatewayVpcAttachmentsResult {
  @scala.inline
  def apply(NextToken: String = null, TransitGatewayVpcAttachments: TransitGatewayVpcAttachmentList = null): DescribeTransitGatewayVpcAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TransitGatewayVpcAttachments != null) __obj.updateDynamic("TransitGatewayVpcAttachments")(TransitGatewayVpcAttachments)
    __obj.asInstanceOf[DescribeTransitGatewayVpcAttachmentsResult]
  }
}

