package typings.angularCompiler.r3ModuleCompilerMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import typings.angularCompiler.outputAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3NgModuleDef extends js.Object {
  var additionalStatements: js.Array[Statement] = js.native
  var expression: Expression = js.native
  var `type`: Type = js.native
}

object R3NgModuleDef {
  @scala.inline
  def apply(additionalStatements: js.Array[Statement], expression: Expression, `type`: Type): R3NgModuleDef = {
    val __obj = js.Dynamic.literal(additionalStatements = additionalStatements.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3NgModuleDef]
  }
  @scala.inline
  implicit class R3NgModuleDefOps[Self <: R3NgModuleDef] (val x: Self) extends AnyVal {
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
    def setAdditionalStatementsVarargs(value: Statement*): Self = this.set("additionalStatements", js.Array(value :_*))
    @scala.inline
    def setAdditionalStatements(value: js.Array[Statement]): Self = this.set("additionalStatements", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpression(value: Expression): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

