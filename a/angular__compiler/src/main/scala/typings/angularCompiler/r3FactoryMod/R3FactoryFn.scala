package typings.angularCompiler.r3FactoryMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExpressionType_
import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3FactoryFn extends js.Object {
  var factory: Expression
  var statements: js.Array[Statement]
  var `type`: ExpressionType_
}

object R3FactoryFn {
  @scala.inline
  def apply(factory: Expression, statements: js.Array[Statement], `type`: ExpressionType_): R3FactoryFn = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryFn]
  }
}

