package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputSourceRequest extends js.Object {
  /**
    * The key used to extract the password from EC2 Parameter store.
    */
  var PasswordParam: js.UndefOr[__string] = js.undefined
  /**
    * This represents the customer's source URL where stream is
  pulled from.
    */
  var Url: js.UndefOr[__string] = js.undefined
  /**
    * The username for the input source.
    */
  var Username: js.UndefOr[__string] = js.undefined
}

object InputSourceRequest {
  @scala.inline
  def apply(PasswordParam: __string = null, Url: __string = null, Username: __string = null): InputSourceRequest = {
    val __obj = js.Dynamic.literal()
    if (PasswordParam != null) __obj.updateDynamic("PasswordParam")(PasswordParam)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[InputSourceRequest]
  }
}

