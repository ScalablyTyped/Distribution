package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyQuoted extends js.Object {
  var key: String
  var quoted: Boolean
}

object Anon_KeyQuoted {
  @scala.inline
  def apply(key: String, quoted: Boolean): Anon_KeyQuoted = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KeyQuoted]
  }
}

