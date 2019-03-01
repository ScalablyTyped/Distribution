package typings
package atAngularCompilerLib.srcInjectableUnderscoreCompilerUnderscore2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectableDef extends js.Object {
  var expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type
}

object InjectableDef {
  @scala.inline
  def apply(
    expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type
  ): InjectableDef = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("statements")(statements)
    __obj.asInstanceOf[InjectableDef]
  }
}

