package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileTypeSummary extends StObject {
  
  var summaryKind: CompileSummaryKind | Null
  
  var `type`: CompileTypeMetadata
}
object CompileTypeSummary {
  
  inline def apply(`type`: CompileTypeMetadata): CompileTypeSummary = {
    val __obj = js.Dynamic.literal(summaryKind = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTypeSummary]
  }
  
  extension [Self <: CompileTypeSummary](x: Self) {
    
    inline def setSummaryKind(value: CompileSummaryKind): Self = StObject.set(x, "summaryKind", value.asInstanceOf[js.Any])
    
    inline def setSummaryKindNull: Self = StObject.set(x, "summaryKind", null)
    
    inline def setType(value: CompileTypeMetadata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
