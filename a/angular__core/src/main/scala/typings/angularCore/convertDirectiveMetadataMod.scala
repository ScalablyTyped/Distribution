package typings.angularCore

import typings.angularCompiler.mod.StaticSymbol
import typings.std.Error
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertDirectiveMetadataMod {
  
  @JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/decorator_rewrite/convert_directive_metadata", "UnexpectedMetadataValueError")
  @js.native
  class UnexpectedMetadataValueError () extends Error
  
  @JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/decorator_rewrite/convert_directive_metadata", "convertDirectiveMetadataToExpression")
  @js.native
  def convertDirectiveMetadataToExpression(
    metadata: js.Any,
    resolveSymbolImport: js.Function1[/* symbol */ StaticSymbol, String | Null],
    createImport: js.Function2[/* moduleName */ String, /* name */ String, Expression]
  ): Expression = js.native
  @JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/decorator_rewrite/convert_directive_metadata", "convertDirectiveMetadataToExpression")
  @js.native
  def convertDirectiveMetadataToExpression(
    metadata: js.Any,
    resolveSymbolImport: js.Function1[/* symbol */ StaticSymbol, String | Null],
    createImport: js.Function2[/* moduleName */ String, /* name */ String, Expression],
    convertProperty: js.Function2[/* key */ String, /* value */ js.Any, Expression | Null]
  ): Expression = js.native
}
