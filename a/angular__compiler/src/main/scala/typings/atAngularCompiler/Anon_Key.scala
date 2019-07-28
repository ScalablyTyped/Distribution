package typings.atAngularCompiler

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: String
  var quoted: Boolean
  var value: Expression
}

object Anon_Key {
  @scala.inline
  def apply(key: String, quoted: Boolean, value: Expression): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key, quoted = quoted, value = value)
  
    __obj.asInstanceOf[Anon_Key]
  }
}

