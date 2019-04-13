package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleTaskError extends js.Object {
  /**
    * The error code.
    */
  var Code: js.UndefOr[String] = js.undefined
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.undefined
}

object BundleTaskError {
  @scala.inline
  def apply(Code: String = null, Message: String = null): BundleTaskError = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[BundleTaskError]
  }
}

