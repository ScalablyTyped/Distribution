package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTransitGatewayAttachmentPropagationsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * Information about the propagation route tables.
    */
  var TransitGatewayAttachmentPropagations: js.UndefOr[TransitGatewayAttachmentPropagationList] = js.native
}

object GetTransitGatewayAttachmentPropagationsResult {
  @scala.inline
  def apply(
    NextToken: String = null,
    TransitGatewayAttachmentPropagations: TransitGatewayAttachmentPropagationList = null
  ): GetTransitGatewayAttachmentPropagationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TransitGatewayAttachmentPropagations != null) __obj.updateDynamic("TransitGatewayAttachmentPropagations")(TransitGatewayAttachmentPropagations.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTransitGatewayAttachmentPropagationsResult]
  }
}

