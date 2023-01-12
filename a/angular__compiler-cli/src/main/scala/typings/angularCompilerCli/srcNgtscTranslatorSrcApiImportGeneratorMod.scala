package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTranslatorSrcApiImportGeneratorMod {
  
  trait ImportGenerator[TExpression] extends StObject {
    
    def generateNamedImport(moduleName: String, originalSymbol: String): NamedImport[TExpression]
    
    def generateNamespaceImport(moduleName: String): TExpression
  }
  object ImportGenerator {
    
    inline def apply[TExpression](
      generateNamedImport: (String, String) => NamedImport[TExpression],
      generateNamespaceImport: String => TExpression
    ): ImportGenerator[TExpression] = {
      val __obj = js.Dynamic.literal(generateNamedImport = js.Any.fromFunction2(generateNamedImport), generateNamespaceImport = js.Any.fromFunction1(generateNamespaceImport))
      __obj.asInstanceOf[ImportGenerator[TExpression]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportGenerator[?], TExpression] (val x: Self & ImportGenerator[TExpression]) extends AnyVal {
      
      inline def setGenerateNamedImport(value: (String, String) => NamedImport[TExpression]): Self = StObject.set(x, "generateNamedImport", js.Any.fromFunction2(value))
      
      inline def setGenerateNamespaceImport(value: String => TExpression): Self = StObject.set(x, "generateNamespaceImport", js.Any.fromFunction1(value))
    }
  }
  
  trait NamedImport[TExpression] extends StObject {
    
    /** The import namespace containing this imported symbol. */
    var moduleImport: TExpression | Null
    
    /** The (possibly rewritten) name of the imported symbol. */
    var symbol: String
  }
  object NamedImport {
    
    inline def apply[TExpression](symbol: String): NamedImport[TExpression] = {
      val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any], moduleImport = null)
      __obj.asInstanceOf[NamedImport[TExpression]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NamedImport[?], TExpression] (val x: Self & NamedImport[TExpression]) extends AnyVal {
      
      inline def setModuleImport(value: TExpression): Self = StObject.set(x, "moduleImport", value.asInstanceOf[js.Any])
      
      inline def setModuleImportNull: Self = StObject.set(x, "moduleImport", null)
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
}
