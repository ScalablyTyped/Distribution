package typings.apolloDashLinkDashHttpDashCommon

import typings.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod.Body
import typings.apolloDashLinkDashHttpDashCommon.apolloDashLinkDashHttpDashCommonMod.HttpConfig
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: Body
  var options: HttpConfig with (Record[String, _])
}

object Anon_Body {
  @scala.inline
  def apply(body: Body, options: HttpConfig with (Record[String, _])): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Body]
  }
}

