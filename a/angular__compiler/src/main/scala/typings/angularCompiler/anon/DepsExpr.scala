package typings.angularCompiler.anon

import typings.angularCompiler.coreMod.NodeFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DepsExpr extends StObject {
  
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
  implicit class DepsExprMutableBuilder[Self <: DepsExpr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepsExpr(value: typings.angularCompiler.outputAstMod.Expression): Self = StObject.set(x, "depsExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlags(value: NodeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderExpr(value: typings.angularCompiler.outputAstMod.Expression): Self = StObject.set(x, "providerExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenExpr(value: typings.angularCompiler.outputAstMod.Expression): Self = StObject.set(x, "tokenExpr", value.asInstanceOf[js.Any])
  }
}
