package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeAsyncResponse extends js.Object {
  /**
    * The status code.
    */
  var Status: js.UndefOr[HttpStatus] = js.undefined
}

object InvokeAsyncResponse {
  @scala.inline
  def apply(Status: js.UndefOr[HttpStatus] = js.undefined): InvokeAsyncResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[InvokeAsyncResponse]
  }
}

