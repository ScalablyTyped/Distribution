package typings.angularCompiler.apiMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3DirectiveDef extends js.Object {
  var expression: Expression
  var `type`: Type
}

object R3DirectiveDef {
  @scala.inline
  def apply(expression: Expression, `type`: Type): R3DirectiveDef = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3DirectiveDef]
  }
}

