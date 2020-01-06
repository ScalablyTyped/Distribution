package typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAlexaOfferToMasterResponse extends js.Object {
  /**
    * The base64-encoded SDP answer content.
    */
  var Answer: js.UndefOr[typings.awsDashSdk.clientsKinesisvideosignalingchannelsMod.Answer] = js.native
}

object SendAlexaOfferToMasterResponse {
  @scala.inline
  def apply(Answer: Answer = null): SendAlexaOfferToMasterResponse = {
    val __obj = js.Dynamic.literal()
    if (Answer != null) __obj.updateDynamic("Answer")(Answer.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAlexaOfferToMasterResponse]
  }
}

