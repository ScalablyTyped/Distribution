package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyQuoted extends js.Object {
  var key: java.lang.String
  var quoted: scala.Boolean
  var value: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
}

object Anon_KeyQuoted {
  @scala.inline
  def apply(
    key: java.lang.String,
    quoted: scala.Boolean,
    value: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  ): Anon_KeyQuoted = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("quoted")(quoted)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_KeyQuoted]
  }
}

