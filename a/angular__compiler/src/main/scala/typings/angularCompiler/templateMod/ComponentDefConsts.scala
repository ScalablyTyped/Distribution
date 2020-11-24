package typings.angularCompiler.templateMod

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentDefConsts extends js.Object {
  
  var constExpressions: js.Array[Expression] = js.native
  
  var prepareStatements: js.Array[Statement] = js.native
}
object ComponentDefConsts {
  
  @scala.inline
  def apply(constExpressions: js.Array[Expression], prepareStatements: js.Array[Statement]): ComponentDefConsts = {
    val __obj = js.Dynamic.literal(constExpressions = constExpressions.asInstanceOf[js.Any], prepareStatements = prepareStatements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDefConsts]
  }
  
  @scala.inline
  implicit class ComponentDefConstsOps[Self <: ComponentDefConsts] (val x: Self) extends AnyVal {
    
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
    def setConstExpressionsVarargs(value: Expression*): Self = this.set("constExpressions", js.Array(value :_*))
    
    @scala.inline
    def setConstExpressions(value: js.Array[Expression]): Self = this.set("constExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrepareStatementsVarargs(value: Statement*): Self = this.set("prepareStatements", js.Array(value :_*))
    
    @scala.inline
    def setPrepareStatements(value: js.Array[Statement]): Self = this.set("prepareStatements", value.asInstanceOf[js.Any])
  }
}
