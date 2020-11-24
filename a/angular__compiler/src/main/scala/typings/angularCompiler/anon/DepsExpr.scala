package typings.angularCompiler.anon

import typings.angularCompiler.coreMod.NodeFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepsExpr extends js.Object {
  
  var depsExpr: typings.angularCompiler.outputAstMod.Expression = js.native
  
  var flags: NodeFlags = js.native
  
  var providerExpr: typings.angularCompiler.outputAstMod.Expression = js.native
  
  var tokenExpr: typings.angularCompiler.outputAstMod.Expression = js.native
}
object DepsExpr {
  
  @scala.inline
  def apply(
    depsExpr: typings.angularCompiler.outputAstMod.Expression,
    flags: NodeFlags,
    providerExpr: typings.angularCompiler.outputAstMod.Expression,
    tokenExpr: typings.angularCompiler.outputAstMod.Expression
  ): DepsExpr = {
    val __obj = js.Dynamic.literal(depsExpr = depsExpr.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], providerExpr = providerExpr.asInstanceOf[js.Any], tokenExpr = tokenExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepsExpr]
  }
  
  @scala.inline
  implicit class DepsExprOps[Self <: DepsExpr] (val x: Self) extends AnyVal {
    
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
    def setDepsExpr(value: typings.angularCompiler.outputAstMod.Expression): Self = this.set("depsExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: NodeFlags): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderExpr(value: typings.angularCompiler.outputAstMod.Expression): Self = this.set("providerExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenExpr(value: typings.angularCompiler.outputAstMod.Expression): Self = this.set("tokenExpr", value.asInstanceOf[js.Any])
  }
}
