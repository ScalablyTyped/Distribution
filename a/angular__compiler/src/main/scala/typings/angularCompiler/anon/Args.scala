package typings.angularCompiler.anon

import typings.angularCompiler.outputAstMod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Args extends StObject {
  
  var args: js.Array[typings.angularCompiler.outputAstMod.Expression] = js.native
  
  var stmts: js.Array[Statement] = js.native
}
object Args {
  
  @scala.inline
  def apply(args: js.Array[typings.angularCompiler.outputAstMod.Expression], stmts: js.Array[Statement]): Args = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], stmts = stmts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Args]
  }
  
  @scala.inline
  implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[typings.angularCompiler.outputAstMod.Expression]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsVarargs(value: typings.angularCompiler.outputAstMod.Expression*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setStmts(value: js.Array[Statement]): Self = StObject.set(x, "stmts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStmtsVarargs(value: Statement*): Self = StObject.set(x, "stmts", js.Array(value :_*))
  }
}
