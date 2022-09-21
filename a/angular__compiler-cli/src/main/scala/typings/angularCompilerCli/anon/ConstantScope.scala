package typings.angularCompilerCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConstantScope[TConstantScope, TStatement] extends StObject {
  
  var constantScope: TConstantScope
  
  var statements: js.Array[TStatement]
}
object ConstantScope {
  
  inline def apply[TConstantScope, TStatement](constantScope: TConstantScope, statements: js.Array[TStatement]): ConstantScope[TConstantScope, TStatement] = {
    val __obj = js.Dynamic.literal(constantScope = constantScope.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstantScope[TConstantScope, TStatement]]
  }
  
  extension [Self <: ConstantScope[?, ?], TConstantScope, TStatement](x: Self & (ConstantScope[TConstantScope, TStatement])) {
    
    inline def setConstantScope(value: TConstantScope): Self = StObject.set(x, "constantScope", value.asInstanceOf[js.Any])
    
    inline def setStatements(value: js.Array[TStatement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
    
    inline def setStatementsVarargs(value: TStatement*): Self = StObject.set(x, "statements", js.Array(value*))
  }
}
