package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String
  var quoted: Boolean
  var value: typings.angularCompiler.outputAstMod.Expression
}

object Key {
  @scala.inline
  def apply(key: String, quoted: Boolean, value: typings.angularCompiler.outputAstMod.Expression): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

