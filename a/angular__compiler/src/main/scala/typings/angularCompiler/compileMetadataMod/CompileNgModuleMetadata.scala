package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.AnonBootstrapComponents
import typings.angularCompiler.coreMod.SchemaMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compile_metadata", "CompileNgModuleMetadata")
@js.native
class CompileNgModuleMetadata protected () extends js.Object {
  def this(hasTypeProvidersDeclaredDirectivesExportedDirectivesDeclaredPipesExportedPipesEntryComponentsBootstrapComponentsImportedModulesExportedModulesSchemasTransitiveModuleId: AnonBootstrapComponents) = this()
  var bootstrapComponents: js.Array[CompileIdentifierMetadata] = js.native
  var declaredDirectives: js.Array[CompileIdentifierMetadata] = js.native
  var declaredPipes: js.Array[CompileIdentifierMetadata] = js.native
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  var exportedDirectives: js.Array[CompileIdentifierMetadata] = js.native
  var exportedModules: js.Array[CompileNgModuleSummary] = js.native
  var exportedPipes: js.Array[CompileIdentifierMetadata] = js.native
  var id: String | Null = js.native
  var importedModules: js.Array[CompileNgModuleSummary] = js.native
  var providers: js.Array[CompileProviderMetadata] = js.native
  var schemas: js.Array[SchemaMetadata] = js.native
  var transitiveModule: TransitiveCompileNgModuleMetadata = js.native
  var `type`: CompileTypeMetadata = js.native
  def toSummary(): CompileNgModuleSummary = js.native
}

