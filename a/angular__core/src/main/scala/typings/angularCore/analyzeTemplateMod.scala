package typings.angularCore

import typings.angularCompiler.mod.PropertyWrite
import typings.angularCore.ngComponentTemplateMod.ResolvedTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyzeTemplateMod {
  
  @JSImport("@angular/core/schematics/migrations/template-var-assignment/analyze_template", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def analyzeResolvedTemplate(template: ResolvedTemplate): js.Array[TemplateVariableAssignment] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("analyzeResolvedTemplate")(template.asInstanceOf[js.Any]).asInstanceOf[js.Array[TemplateVariableAssignment] | Null]
  
  trait TemplateVariableAssignment extends StObject {
    
    var end: Double
    
    var node: PropertyWrite
    
    var start: Double
  }
  object TemplateVariableAssignment {
    
    inline def apply(end: Double, node: PropertyWrite, start: Double): TemplateVariableAssignment = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateVariableAssignment]
    }
    
    extension [Self <: TemplateVariableAssignment](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setNode(value: PropertyWrite): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
