package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateHITReviewStatusRequest extends js.Object {
  /**
    *  The ID of the HIT to update. 
    */
  var HITId: EntityId
  /**
    *  Specifies how to update the HIT status. Default is False.     Setting this to false will only transition a HIT from Reviewable to Reviewing     Setting this to true will only transition a HIT from Reviewing to Reviewable   
    */
  var Revert: js.UndefOr[Boolean] = js.undefined
}

object UpdateHITReviewStatusRequest {
  @scala.inline
  def apply(HITId: EntityId, Revert: js.UndefOr[Boolean] = js.undefined): UpdateHITReviewStatusRequest = {
    val __obj = js.Dynamic.literal(HITId = HITId)
    if (!js.isUndefined(Revert)) __obj.updateDynamic("Revert")(Revert)
    __obj.asInstanceOf[UpdateHITReviewStatusRequest]
  }
}

