package typings.angularCompiler.compileMetadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilePipeSummary
  extends StObject
     with CompileTypeSummary {
  
  var name: String
  
  var pure: Boolean
}
object CompilePipeSummary {
  
  @scala.inline
  def apply(name: String, pure: Boolean, `type`: CompileTypeMetadata): CompilePipeSummary = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pure = pure.asInstanceOf[js.Any], summaryKind = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilePipeSummary]
  }
  
  @scala.inline
  implicit class CompilePipeSummaryMutableBuilder[Self <: CompilePipeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPure(value: Boolean): Self = StObject.set(x, "pure", value.asInstanceOf[js.Any])
  }
}
