package typings.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: String
  var redirectUri: String
}

object Anon_Code {
  @scala.inline
  def apply(code: String, redirectUri: String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], redirectUri = redirectUri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Code]
  }
}

