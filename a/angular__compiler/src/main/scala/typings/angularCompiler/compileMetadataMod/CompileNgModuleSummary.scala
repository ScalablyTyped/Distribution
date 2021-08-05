package typings.angularCompiler.compileMetadataMod

import typings.angularCompiler.anon.Module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileNgModuleSummary
  extends StObject
     with CompileTypeSummary {
  
  var entryComponents: js.Array[CompileEntryComponentMetadata]
  
  var exportedDirectives: js.Array[CompileIdentifierMetadata]
  
  var exportedPipes: js.Array[CompileIdentifierMetadata]
  
  var modules: js.Array[CompileTypeMetadata]
  
  var providers: js.Array[Module]
}
object CompileNgModuleSummary {
  
  inline def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    exportedDirectives: js.Array[CompileIdentifierMetadata],
    exportedPipes: js.Array[CompileIdentifierMetadata],
    modules: js.Array[CompileTypeMetadata],
    providers: js.Array[Module],
    `type`: CompileTypeMetadata
  ): CompileNgModuleSummary = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], exportedDirectives = exportedDirectives.asInstanceOf[js.Any], exportedPipes = exportedPipes.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], summaryKind = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileNgModuleSummary]
  }
  
  extension [Self <: CompileNgModuleSummary](x: Self) {
    
    inline def setEntryComponents(value: js.Array[CompileEntryComponentMetadata]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    inline def setEntryComponentsVarargs(value: CompileEntryComponentMetadata*): Self = StObject.set(x, "entryComponents", js.Array(value :_*))
    
    inline def setExportedDirectives(value: js.Array[CompileIdentifierMetadata]): Self = StObject.set(x, "exportedDirectives", value.asInstanceOf[js.Any])
    
    inline def setExportedDirectivesVarargs(value: CompileIdentifierMetadata*): Self = StObject.set(x, "exportedDirectives", js.Array(value :_*))
    
    inline def setExportedPipes(value: js.Array[CompileIdentifierMetadata]): Self = StObject.set(x, "exportedPipes", value.asInstanceOf[js.Any])
    
    inline def setExportedPipesVarargs(value: CompileIdentifierMetadata*): Self = StObject.set(x, "exportedPipes", js.Array(value :_*))
    
    inline def setModules(value: js.Array[CompileTypeMetadata]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    inline def setModulesVarargs(value: CompileTypeMetadata*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    inline def setProviders(value: js.Array[Module]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: Module*): Self = StObject.set(x, "providers", js.Array(value :_*))
  }
}
