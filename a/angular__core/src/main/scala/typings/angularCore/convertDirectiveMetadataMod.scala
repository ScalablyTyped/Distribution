package typings.angularCore

import typings.angularCompiler.mod.StaticSymbol
import typings.std.Error
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertDirectiveMetadataMod {
  
  @JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/decorator_rewrite/convert_directive_metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/decorator_rewrite/convert_directive_metadata", "UnexpectedMetadataValueError")
  @js.native
  class UnexpectedMetadataValueError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def convertDirectiveMetadataToExpression(
    metadata: js.Any,
    resolveSymbolImport: js.Function1[/* symbol */ StaticSymbol, String | Null],
    createImport: js.Function2[/* moduleName */ String, /* name */ String, Expression]
  ): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDirectiveMetadataToExpression")(metadata.asInstanceOf[js.Any], resolveSymbolImport.asInstanceOf[js.Any], createImport.asInstanceOf[js.Any])).asInstanceOf[Expression]
  inline def convertDirectiveMetadataToExpression(
    metadata: js.Any,
    resolveSymbolImport: js.Function1[/* symbol */ StaticSymbol, String | Null],
    createImport: js.Function2[/* moduleName */ String, /* name */ String, Expression],
    convertProperty: js.Function2[/* key */ String, /* value */ js.Any, Expression | Null]
  ): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("convertDirectiveMetadataToExpression")(metadata.asInstanceOf[js.Any], resolveSymbolImport.asInstanceOf[js.Any], createImport.asInstanceOf[js.Any], convertProperty.asInstanceOf[js.Any])).asInstanceOf[Expression]
}
