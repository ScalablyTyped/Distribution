package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileTypeSummary extends StObject {
  
  var summaryKind: CompileSummaryKind | Null
  
  var `type`: CompileTypeMetadata
}
object CompileTypeSummary {
  
  @scala.inline
  def apply(`type`: CompileTypeMetadata): CompileTypeSummary = {
    val __obj = js.Dynamic.literal(summaryKind = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTypeSummary]
  }
  
  @scala.inline
  implicit class CompileTypeSummaryMutableBuilder[Self <: CompileTypeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSummaryKind(value: CompileSummaryKind): Self = StObject.set(x, "summaryKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummaryKindNull: Self = StObject.set(x, "summaryKind", null)
    
    @scala.inline
    def setType(value: CompileTypeMetadata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
