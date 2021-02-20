package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.anon.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompileNgModuleSummary extends CompileTypeSummary {
  
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  
  var exportedDirectives: js.Array[CompileIdentifierMetadata] = js.native
  
  var exportedPipes: js.Array[CompileIdentifierMetadata] = js.native
  
  var modules: js.Array[CompileTypeMetadata] = js.native
  
  var providers: js.Array[Module] = js.native
}
object CompileNgModuleSummary {
  
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    exportedDirectives: js.Array[CompileIdentifierMetadata],
    exportedPipes: js.Array[CompileIdentifierMetadata],
    modules: js.Array[CompileTypeMetadata],
    providers: js.Array[Module],
    `type`: CompileTypeMetadata
  ): CompileNgModuleSummary = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], exportedDirectives = exportedDirectives.asInstanceOf[js.Any], exportedPipes = exportedPipes.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileNgModuleSummary]
  }
  
  @scala.inline
  implicit class CompileNgModuleSummaryMutableBuilder[Self <: CompileNgModuleSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntryComponents(value: js.Array[CompileEntryComponentMetadata]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryComponentsVarargs(value: CompileEntryComponentMetadata*): Self = StObject.set(x, "entryComponents", js.Array(value :_*))
    
    @scala.inline
    def setExportedDirectives(value: js.Array[CompileIdentifierMetadata]): Self = StObject.set(x, "exportedDirectives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportedDirectivesVarargs(value: CompileIdentifierMetadata*): Self = StObject.set(x, "exportedDirectives", js.Array(value :_*))
    
    @scala.inline
    def setExportedPipes(value: js.Array[CompileIdentifierMetadata]): Self = StObject.set(x, "exportedPipes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportedPipesVarargs(value: CompileIdentifierMetadata*): Self = StObject.set(x, "exportedPipes", js.Array(value :_*))
    
    @scala.inline
    def setModules(value: js.Array[CompileTypeMetadata]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesVarargs(value: CompileTypeMetadata*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[Module]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: Module*): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
