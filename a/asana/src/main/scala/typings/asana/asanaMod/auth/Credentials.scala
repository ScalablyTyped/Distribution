package typings.asana.asanaMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
  var refresh_token: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(access_token: String = null, refresh_token: String = null): Credentials = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token)
    __obj.asInstanceOf[Credentials]
  }
}

