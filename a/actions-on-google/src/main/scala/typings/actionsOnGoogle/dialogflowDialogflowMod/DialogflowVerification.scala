package typings.actionsOnGoogle.dialogflowDialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowVerification extends js.Object {
  /**
    * Custom error message as a string or a function that returns a string
    * given the original error message set by the library.
    *
    * The message will get sent back in the JSON top level `error` property.
    * @public
    */
  var error: js.UndefOr[String | (js.Function1[/* error */ String, String])] = js.undefined
  /**
    * An object representing the header key to value map to check against,
    * @public
    */
  var headers: DialogflowVerificationHeaders
  /**
    * Custom status code to return on verification error.
    * @public
    */
  var status: js.UndefOr[Double] = js.undefined
}

object DialogflowVerification {
  @scala.inline
  def apply(
    headers: DialogflowVerificationHeaders,
    error: String | (js.Function1[/* error */ String, String]) = null,
    status: js.UndefOr[Double] = js.undefined
  ): DialogflowVerification = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowVerification]
  }
}

