package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSourceRequest extends js.Object {
  /**
    * The key used to extract the password from EC2 Parameter store.
    */
  var PasswordParam: js.UndefOr[__string] = js.native
  /**
    * This represents the customer's source URL where stream is
  pulled from.
    */
  var Url: js.UndefOr[__string] = js.native
  /**
    * The username for the input source.
    */
  var Username: js.UndefOr[__string] = js.native
}

object InputSourceRequest {
  @scala.inline
  def apply(PasswordParam: __string = null, Url: __string = null, Username: __string = null): InputSourceRequest = {
    val __obj = js.Dynamic.literal()
    if (PasswordParam != null) __obj.updateDynamic("PasswordParam")(PasswordParam.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    if (Username != null) __obj.updateDynamic("Username")(Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSourceRequest]
  }
}

