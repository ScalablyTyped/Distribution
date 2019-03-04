package typings
package atAngularCompilerLib.srcRender3R3UnderscoreModuleUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3NgModuleDef extends js.Object {
  var additionalStatements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  var expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type
}

object R3NgModuleDef {
  @scala.inline
  def apply(
    additionalStatements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type
  ): R3NgModuleDef = {
    val __obj = js.Dynamic.literal(additionalStatements = additionalStatements, expression = expression)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[R3NgModuleDef]
  }
}

