package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var key: String
  var quoted: Boolean
  var value: Expression
}

object AnonKey {
  @scala.inline
  def apply(key: String, quoted: Boolean, value: Expression): AnonKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], quoted = quoted.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKey]
  }
}

