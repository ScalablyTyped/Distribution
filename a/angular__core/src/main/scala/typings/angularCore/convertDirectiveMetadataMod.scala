package typings.angularCore

import typings.angularCompiler.staticSymbolMod.StaticSymbol
import typings.std.Error
import typings.typescript.mod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/schematics/migrations/undecorated-classes-with-di/decorator_rewrite/convert_directive_metadata", JSImport.Namespace)
@js.native
object convertDirectiveMetadataMod extends js.Object {
  @js.native
  class UnexpectedMetadataValueError () extends Error
  
  def convertDirectiveMetadataToExpression(
    metadata: js.Any,
    resolveSymbolImport: js.Function1[/* symbol */ StaticSymbol, String | Null],
    createImport: js.Function2[/* moduleName */ String, /* name */ String, Expression]
  ): Expression = js.native
  def convertDirectiveMetadataToExpression(
    metadata: js.Any,
    resolveSymbolImport: js.Function1[/* symbol */ StaticSymbol, String | Null],
    createImport: js.Function2[/* moduleName */ String, /* name */ String, Expression],
    convertProperty: js.Function2[/* key */ String, /* value */ js.Any, Expression | Null]
  ): Expression = js.native
}

