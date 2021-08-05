package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object partialModuleMod {
  
  trait PartialModule extends StObject {
    
    var fileName: String
    
    var statements: js.Array[Statement]
  }
  object PartialModule {
    
    inline def apply(fileName: String, statements: js.Array[Statement]): PartialModule = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialModule]
    }
    
    extension [Self <: PartialModule](x: Self) {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setStatements(value: js.Array[Statement]): Self = StObject.set(x, "statements", value.asInstanceOf[js.Any])
      
      inline def setStatementsVarargs(value: Statement*): Self = StObject.set(x, "statements", js.Array(value :_*))
    }
  }
}
