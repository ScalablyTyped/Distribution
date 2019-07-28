package typings.atAngularCompiler

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileNgModuleSummary
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileProviderMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.TransitiveCompileNgModuleMetadata
import typings.atAngularCompiler.srcCoreMod.SchemaMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BootstrapComponents extends js.Object {
  var bootstrapComponents: js.Array[CompileIdentifierMetadata]
  var declaredDirectives: js.Array[CompileIdentifierMetadata]
  var declaredPipes: js.Array[CompileIdentifierMetadata]
  var entryComponents: js.Array[CompileEntryComponentMetadata]
  var exportedDirectives: js.Array[CompileIdentifierMetadata]
  var exportedModules: js.Array[CompileNgModuleSummary]
  var exportedPipes: js.Array[CompileIdentifierMetadata]
  var id: String | Null
  var importedModules: js.Array[CompileNgModuleSummary]
  var providers: js.Array[CompileProviderMetadata]
  var schemas: js.Array[SchemaMetadata]
  var transitiveModule: TransitiveCompileNgModuleMetadata
  var `type`: CompileTypeMetadata
}

object Anon_BootstrapComponents {
  @scala.inline
  def apply(
    bootstrapComponents: js.Array[CompileIdentifierMetadata],
    declaredDirectives: js.Array[CompileIdentifierMetadata],
    declaredPipes: js.Array[CompileIdentifierMetadata],
    entryComponents: js.Array[CompileEntryComponentMetadata],
    exportedDirectives: js.Array[CompileIdentifierMetadata],
    exportedModules: js.Array[CompileNgModuleSummary],
    exportedPipes: js.Array[CompileIdentifierMetadata],
    importedModules: js.Array[CompileNgModuleSummary],
    providers: js.Array[CompileProviderMetadata],
    schemas: js.Array[SchemaMetadata],
    transitiveModule: TransitiveCompileNgModuleMetadata,
    `type`: CompileTypeMetadata,
    id: String = null
  ): Anon_BootstrapComponents = {
    val __obj = js.Dynamic.literal(bootstrapComponents = bootstrapComponents, declaredDirectives = declaredDirectives, declaredPipes = declaredPipes, entryComponents = entryComponents, exportedDirectives = exportedDirectives, exportedModules = exportedModules, exportedPipes = exportedPipes, importedModules = importedModules, providers = providers, schemas = schemas, transitiveModule = transitiveModule)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_BootstrapComponents]
  }
}

