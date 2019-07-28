package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SampleChannelDataResponse extends js.Object {
  /**
    * The list of message samples. Each sample message is returned as a base64-encoded string.
    */
  var payloads: js.UndefOr[MessagePayloads] = js.undefined
}

object SampleChannelDataResponse {
  @scala.inline
  def apply(payloads: MessagePayloads = null): SampleChannelDataResponse = {
    val __obj = js.Dynamic.literal()
    if (payloads != null) __obj.updateDynamic("payloads")(payloads)
    __obj.asInstanceOf[SampleChannelDataResponse]
  }
}

