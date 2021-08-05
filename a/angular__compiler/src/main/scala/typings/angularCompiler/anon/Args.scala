package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Args extends StObject {
  
  var args: js.Array[typings.angularCompiler.outputAstMod.Expression]
  
  var stmts: js.Array[Statement]
}
object Args {
  
  inline def apply(args: js.Array[typings.angularCompiler.outputAstMod.Expression], stmts: js.Array[Statement]): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], stmts = stmts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  extension [Self <: Args](x: Self) {
    
    inline def setArgs(value: js.Array[typings.angularCompiler.outputAstMod.Expression]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsVarargs(value: typings.angularCompiler.outputAstMod.Expression*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setStmts(value: js.Array[Statement]): Self = StObject.set(x, "stmts", value.asInstanceOf[js.Any])
    
    inline def setStmtsVarargs(value: Statement*): Self = StObject.set(x, "stmts", js.Array(value :_*))
  }
}
