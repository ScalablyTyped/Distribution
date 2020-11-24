package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiteralFactory extends js.Object {
  
  var literalFactory: typings.angularCompiler.outputAstMod.Expression = js.native
  
  var literalFactoryArguments: js.Array[typings.angularCompiler.outputAstMod.Expression] = js.native
}
object LiteralFactory {
  
  @scala.inline
  def apply(
    literalFactory: typings.angularCompiler.outputAstMod.Expression,
    literalFactoryArguments: js.Array[typings.angularCompiler.outputAstMod.Expression]
  ): LiteralFactory = {
    val __obj = js.Dynamic.literal(literalFactory = literalFactory.asInstanceOf[js.Any], literalFactoryArguments = literalFactoryArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralFactory]
  }
  
  @scala.inline
  implicit class LiteralFactoryOps[Self <: LiteralFactory] (val x: Self) extends AnyVal {
    
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
    def setLiteralFactory(value: typings.angularCompiler.outputAstMod.Expression): Self = this.set("literalFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiteralFactoryArgumentsVarargs(value: typings.angularCompiler.outputAstMod.Expression*): Self = this.set("literalFactoryArguments", js.Array(value :_*))
    
    @scala.inline
    def setLiteralFactoryArguments(value: js.Array[typings.angularCompiler.outputAstMod.Expression]): Self = this.set("literalFactoryArguments", value.asInstanceOf[js.Any])
  }
}
