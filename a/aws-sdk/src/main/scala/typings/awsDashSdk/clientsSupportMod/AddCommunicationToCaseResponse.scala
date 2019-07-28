package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCommunicationToCaseResponse extends js.Object {
  /**
    * True if AddCommunicationToCase succeeds. Otherwise, returns an error.
    */
  var result: js.UndefOr[Result] = js.undefined
}

object AddCommunicationToCaseResponse {
  @scala.inline
  def apply(result: js.UndefOr[Result] = js.undefined): AddCommunicationToCaseResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(result)) __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[AddCommunicationToCaseResponse]
  }
}

