package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileEntryComponentMetadata
import typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
import typings.angularCompiler.compileMetadataMod.CompileNgModuleSummary
import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typings.angularCompiler.compileMetadataMod.TransitiveCompileNgModuleMetadata
import typings.angularCompiler.coreMod.SchemaMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapComponents extends js.Object {
  
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
}
object BootstrapComponents {
  
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
    `type`: CompileTypeMetadata
  ): BootstrapComponents = {
    val __obj = js.Dynamic.literal(bootstrapComponents = bootstrapComponents.asInstanceOf[js.Any], declaredDirectives = declaredDirectives.asInstanceOf[js.Any], declaredPipes = declaredPipes.asInstanceOf[js.Any], entryComponents = entryComponents.asInstanceOf[js.Any], exportedDirectives = exportedDirectives.asInstanceOf[js.Any], exportedModules = exportedModules.asInstanceOf[js.Any], exportedPipes = exportedPipes.asInstanceOf[js.Any], importedModules = importedModules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any], transitiveModule = transitiveModule.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapComponents]
  }
  
  @scala.inline
  implicit class BootstrapComponentsOps[Self <: BootstrapComponents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBootstrapComponentsVarargs(value: CompileIdentifierMetadata*): Self = this.set("bootstrapComponents", js.Array(value :_*))
    
    @scala.inline
    def setBootstrapComponents(value: js.Array[CompileIdentifierMetadata]): Self = this.set("bootstrapComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredDirectivesVarargs(value: CompileIdentifierMetadata*): Self = this.set("declaredDirectives", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredDirectives(value: js.Array[CompileIdentifierMetadata]): Self = this.set("declaredDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredPipesVarargs(value: CompileIdentifierMetadata*): Self = this.set("declaredPipes", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredPipes(value: js.Array[CompileIdentifierMetadata]): Self = this.set("declaredPipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryComponentsVarargs(value: CompileEntryComponentMetadata*): Self = this.set("entryComponents", js.Array(value :_*))
    
    @scala.inline
    def setEntryComponents(value: js.Array[CompileEntryComponentMetadata]): Self = this.set("entryComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportedDirectivesVarargs(value: CompileIdentifierMetadata*): Self = this.set("exportedDirectives", js.Array(value :_*))
    
    @scala.inline
    def setExportedDirectives(value: js.Array[CompileIdentifierMetadata]): Self = this.set("exportedDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportedModulesVarargs(value: CompileNgModuleSummary*): Self = this.set("exportedModules", js.Array(value :_*))
    
    @scala.inline
    def setExportedModules(value: js.Array[CompileNgModuleSummary]): Self = this.set("exportedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportedPipesVarargs(value: CompileIdentifierMetadata*): Self = this.set("exportedPipes", js.Array(value :_*))
    
    @scala.inline
    def setExportedPipes(value: js.Array[CompileIdentifierMetadata]): Self = this.set("exportedPipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedModulesVarargs(value: CompileNgModuleSummary*): Self = this.set("importedModules", js.Array(value :_*))
    
    @scala.inline
    def setImportedModules(value: js.Array[CompileNgModuleSummary]): Self = this.set("importedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: CompileProviderMetadata*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[CompileProviderMetadata]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: SchemaMetadata*): Self = this.set("schemas", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata]): Self = this.set("schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitiveModule(value: TransitiveCompileNgModuleMetadata): Self = this.set("transitiveModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CompileTypeMetadata): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
  }
}
