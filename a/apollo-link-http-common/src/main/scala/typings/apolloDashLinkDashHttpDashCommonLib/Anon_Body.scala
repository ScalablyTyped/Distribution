package typings
package apolloDashLinkDashHttpDashCommonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod.Body
  var options: apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod.HttpConfig with (stdLib.Record[java.lang.String, _])
}

object Anon_Body {
  @scala.inline
  def apply(
    body: apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod.Body,
    options: apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod.HttpConfig with (stdLib.Record[java.lang.String, _])
  ): Anon_Body = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[Anon_Body]
  }
}

