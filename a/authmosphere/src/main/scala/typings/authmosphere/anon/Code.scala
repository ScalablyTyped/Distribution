package typings.authmosphere.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  var code: String
  var redirectUri: String
}

object Code {
  @scala.inline
  def apply(code: String, redirectUri: String): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

