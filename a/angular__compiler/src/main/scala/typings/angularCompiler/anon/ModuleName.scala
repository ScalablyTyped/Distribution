package typings.angularCompiler.anon

import typings.angularCompiler.srcSummaryResolverMod.Summary
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleName extends StObject {
  
  var importAs: js.Array[ImportAs]
  
  var moduleName: String | Null
  
  var summaries: js.Array[Summary[StaticSymbol]]
}
object ModuleName {
  
  inline def apply(importAs: js.Array[ImportAs], summaries: js.Array[Summary[StaticSymbol]]): ModuleName = {
    val __obj = js.Dynamic.literal(importAs = importAs.asInstanceOf[js.Any], summaries = summaries.asInstanceOf[js.Any], moduleName = null)
    __obj.asInstanceOf[ModuleName]
  }
  
  extension [Self <: ModuleName](x: Self) {
    
    inline def setImportAs(value: js.Array[ImportAs]): Self = StObject.set(x, "importAs", value.asInstanceOf[js.Any])
    
    inline def setImportAsVarargs(value: ImportAs*): Self = StObject.set(x, "importAs", js.Array(value :_*))
    
    inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
    
    inline def setModuleNameNull: Self = StObject.set(x, "moduleName", null)
    
    inline def setSummaries(value: js.Array[Summary[StaticSymbol]]): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesVarargs(value: Summary[StaticSymbol]*): Self = StObject.set(x, "summaries", js.Array(value :_*))
  }
}
