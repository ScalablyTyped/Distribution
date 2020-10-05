package typings.angularCompiler.injectableCompiler2Mod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.outputAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InjectableDef extends js.Object {
  var expression: Expression = js.native
  var statements: js.Array[Statement] = js.native
  var `type`: Type = js.native
}

object InjectableDef {
  @scala.inline
  def apply(expression: Expression, statements: js.Array[Statement], `type`: Type): InjectableDef = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InjectableDef]
  }
  @scala.inline
  implicit class InjectableDefOps[Self <: InjectableDef] (val x: Self) extends AnyVal {
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
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatementsVarargs(value: Statement*): Self = this.set("statements", js.Array(value :_*))
    @scala.inline
    def setStatements(value: js.Array[Statement]): Self = this.set("statements", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

