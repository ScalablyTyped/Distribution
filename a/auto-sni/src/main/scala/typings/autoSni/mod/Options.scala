package typings.autoSni.mod

import typings.autoSni.anon.Http
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var agreeTos: Boolean
  var debug: js.UndefOr[Boolean] = js.undefined
  var domains: js.Array[String | js.Array[String]]
  var email: String
  var ports: js.UndefOr[Http] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    agreeTos: Boolean,
    domains: js.Array[String | js.Array[String]],
    email: String,
    debug: js.UndefOr[Boolean] = js.undefined,
    ports: Http = null
  ): Options = {
    val __obj = js.Dynamic.literal(agreeTos = agreeTos.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (ports != null) __obj.updateDynamic("ports")(ports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

