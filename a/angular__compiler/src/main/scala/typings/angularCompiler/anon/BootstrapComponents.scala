package typings.angularCompiler.anon

import typings.angularCompiler.compileMetadataMod.CompileEntryComponentMetadata
import typings.angularCompiler.compileMetadataMod.CompileIdentifierMetadata
import typings.angularCompiler.compileMetadataMod.CompileNgModuleSummary
import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typings.angularCompiler.compileMetadataMod.TransitiveCompileNgModuleMetadata
import typings.angularCompiler.coreMod.SchemaMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapComponents extends StObject {
  
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
  implicit class BootstrapComponentsMutableBuilder[Self <: BootstrapComponents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBootstrapComponents(value: js.Array[CompileIdentifierMetadata]): Self = StObject.set(x, "bootstrapComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootstrapComponentsVarargs(value: CompileIdentifierMetadata*): Self = StObject.set(x, "bootstrapComponents", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredDirectives(value: js.Array[CompileIdentifierMetadata]): Self = StObject.set(x, "declaredDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredDirectivesVarargs(value: CompileIdentifierMetadata*): Self = StObject.set(x, "declaredDirectives", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredPipes(value: js.Array[CompileIdentifierMetadata]): Self = StObject.set(x, "declaredPipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredPipesVarargs(value: CompileIdentifierMetadata*): Self = StObject.set(x, "declaredPipes", js.Array(value :_*))
    
    @scala.inline
    def setEntryComponents(value: js.Array[CompileEntryComponentMetadata]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryComponentsVarargs(value: CompileEntryComponentMetadata*): Self = StObject.set(x, "entryComponents", js.Array(value :_*))
    
    @scala.inline
    def setExportedDirectives(value: js.Array[CompileIdentifierMetadata]): Self = StObject.set(x, "exportedDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportedDirectivesVarargs(value: CompileIdentifierMetadata*): Self = StObject.set(x, "exportedDirectives", js.Array(value :_*))
    
    @scala.inline
    def setExportedModules(value: js.Array[CompileNgModuleSummary]): Self = StObject.set(x, "exportedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportedModulesVarargs(value: CompileNgModuleSummary*): Self = StObject.set(x, "exportedModules", js.Array(value :_*))
    
    @scala.inline
    def setExportedPipes(value: js.Array[CompileIdentifierMetadata]): Self = StObject.set(x, "exportedPipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportedPipesVarargs(value: CompileIdentifierMetadata*): Self = StObject.set(x, "exportedPipes", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setImportedModules(value: js.Array[CompileNgModuleSummary]): Self = StObject.set(x, "importedModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportedModulesVarargs(value: CompileNgModuleSummary*): Self = StObject.set(x, "importedModules", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[CompileProviderMetadata]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: CompileProviderMetadata*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value :_*))
    
    @scala.inline
    def setTransitiveModule(value: TransitiveCompileNgModuleMetadata): Self = StObject.set(x, "transitiveModule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CompileTypeMetadata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
