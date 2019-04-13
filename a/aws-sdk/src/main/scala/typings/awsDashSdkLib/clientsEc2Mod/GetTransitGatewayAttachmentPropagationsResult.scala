package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTransitGatewayAttachmentPropagationsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the propagation route tables.
    */
  var TransitGatewayAttachmentPropagations: js.UndefOr[TransitGatewayAttachmentPropagationList] = js.undefined
}

object GetTransitGatewayAttachmentPropagationsResult {
  @scala.inline
  def apply(
    NextToken: String = null,
    TransitGatewayAttachmentPropagations: TransitGatewayAttachmentPropagationList = null
  ): GetTransitGatewayAttachmentPropagationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TransitGatewayAttachmentPropagations != null) __obj.updateDynamic("TransitGatewayAttachmentPropagations")(TransitGatewayAttachmentPropagations)
    __obj.asInstanceOf[GetTransitGatewayAttachmentPropagationsResult]
  }
}

