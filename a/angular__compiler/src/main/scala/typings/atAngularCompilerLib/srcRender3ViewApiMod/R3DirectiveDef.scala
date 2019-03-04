package typings
package atAngularCompilerLib.srcRender3ViewApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3DirectiveDef extends js.Object {
  var expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement]
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type
}

object R3DirectiveDef {
  @scala.inline
  def apply(
    expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    statements: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Statement],
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Type
  ): R3DirectiveDef = {
    val __obj = js.Dynamic.literal(expression = expression, statements = statements)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[R3DirectiveDef]
  }
}

