package typings.angularCompiler.apiMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait R3ComponentDef extends js.Object {
  var expression: Expression = js.native
  var `type`: Type = js.native
}

object R3ComponentDef {
  @scala.inline
  def apply(expression: Expression, `type`: Type): R3ComponentDef = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3ComponentDef]
  }
  @scala.inline
  implicit class R3ComponentDefOps[Self <: R3ComponentDef] (val x: Self) extends AnyVal {
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
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

