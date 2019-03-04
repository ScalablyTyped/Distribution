package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BootstrapComponents extends js.Object {
  var bootstrapComponents: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata]
  var declaredDirectives: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata]
  var declaredPipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata]
  var entryComponents: js.Array[
    atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
  ]
  var exportedDirectives: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata]
  var exportedModules: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleSummary]
  var exportedPipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata]
  var id: java.lang.String | scala.Null
  var importedModules: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleSummary]
  var providers: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata]
  var schemas: js.Array[atAngularCompilerLib.srcCoreMod.SchemaMetadata]
  var transitiveModule: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.TransitiveCompileNgModuleMetadata
  var `type`: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTypeMetadata
}

object Anon_BootstrapComponents {
  @scala.inline
  def apply(
    bootstrapComponents: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata],
    declaredDirectives: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata],
    declaredPipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata],
    entryComponents: js.Array[
      atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileEntryComponentMetadata
    ],
    exportedDirectives: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata],
    exportedModules: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleSummary],
    exportedPipes: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileIdentifierMetadata],
    importedModules: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileNgModuleSummary],
    providers: js.Array[atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileProviderMetadata],
    schemas: js.Array[atAngularCompilerLib.srcCoreMod.SchemaMetadata],
    transitiveModule: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.TransitiveCompileNgModuleMetadata,
    `type`: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileTypeMetadata,
    id: java.lang.String = null
  ): Anon_BootstrapComponents = {
    val __obj = js.Dynamic.literal(bootstrapComponents = bootstrapComponents, declaredDirectives = declaredDirectives, declaredPipes = declaredPipes, entryComponents = entryComponents, exportedDirectives = exportedDirectives, exportedModules = exportedModules, exportedPipes = exportedPipes, importedModules = importedModules, providers = providers, schemas = schemas, transitiveModule = transitiveModule)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[Anon_BootstrapComponents]
  }
}

