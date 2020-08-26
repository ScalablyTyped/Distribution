package typings.angularCompiler.r3FactoryMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.ExpressionType_
import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3FactoryFn extends js.Object {
  var factory: Expression = js.native
  var statements: js.Array[Statement] = js.native
  var `type`: ExpressionType_ = js.native
}

object R3FactoryFn {
  @scala.inline
  def apply(factory: Expression, statements: js.Array[Statement], `type`: ExpressionType_): R3FactoryFn = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3FactoryFn]
  }
  @scala.inline
  implicit class R3FactoryFnOps[Self <: R3FactoryFn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFactory(value: Expression): Self = this.set("factory", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatementsVarargs(value: Statement*): Self = this.set("statements", js.Array(value :_*))
    @scala.inline
    def setStatements(value: js.Array[Statement]): Self = this.set("statements", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ExpressionType_): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

