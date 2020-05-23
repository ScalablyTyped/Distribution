package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quoted extends js.Object {
  var key: String
  var quoted: Boolean
}

object Quoted {
  @scala.inline
  def apply(key: String, quoted: Boolean): Quoted = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quoted]
  }
}

