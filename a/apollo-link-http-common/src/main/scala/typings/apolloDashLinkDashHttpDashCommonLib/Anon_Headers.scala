package typings
package apolloDashLinkDashHttpDashCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: Anon_Accept
  var http: apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod.HttpQueryOptions
  var options: Anon_Method
}

object Anon_Headers {
  @scala.inline
  def apply(
    headers: Anon_Accept,
    http: apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod.HttpQueryOptions,
    options: Anon_Method
  ): Anon_Headers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("http")(http)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Headers]
  }
}

