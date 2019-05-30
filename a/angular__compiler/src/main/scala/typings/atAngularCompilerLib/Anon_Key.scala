package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends js.Object {
  var key: java.lang.String
  var quoted: scala.Boolean
  var value: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
}

object Anon_Key {
  @scala.inline
  def apply(
    key: java.lang.String,
    quoted: scala.Boolean,
    value: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  ): Anon_Key = {
    val __obj = js.Dynamic.literal(key = key, quoted = quoted, value = value)
  
    __obj.asInstanceOf[Anon_Key]
  }
}

