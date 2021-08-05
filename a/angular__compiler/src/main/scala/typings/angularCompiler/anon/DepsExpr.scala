package typings.angularCompiler.anon

import typings.angularCompiler.coreMod.NodeFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepsExpr extends StObject {
  
  var depsExpr: typings.angularCompiler.outputAstMod.Expression
  
  var flags: NodeFlags
  
  var providerExpr: typings.angularCompiler.outputAstMod.Expression
  
  var tokenExpr: typings.angularCompiler.outputAstMod.Expression
}
object DepsExpr {
  
  inline def apply(
    depsExpr: typings.angularCompiler.outputAstMod.Expression,
    flags: NodeFlags,
    providerExpr: typings.angularCompiler.outputAstMod.Expression,
    tokenExpr: typings.angularCompiler.outputAstMod.Expression
  ): DepsExpr = {
    val __obj = js.Dynamic.literal(depsExpr = depsExpr.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], providerExpr = providerExpr.asInstanceOf[js.Any], tokenExpr = tokenExpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepsExpr]
  }
  
  extension [Self <: DepsExpr](x: Self) {
    
    inline def setDepsExpr(value: typings.angularCompiler.outputAstMod.Expression): Self = StObject.set(x, "depsExpr", value.asInstanceOf[js.Any])
    
    inline def setFlags(value: NodeFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setProviderExpr(value: typings.angularCompiler.outputAstMod.Expression): Self = StObject.set(x, "providerExpr", value.asInstanceOf[js.Any])
    
    inline def setTokenExpr(value: typings.angularCompiler.outputAstMod.Expression): Self = StObject.set(x, "tokenExpr", value.asInstanceOf[js.Any])
  }
}
