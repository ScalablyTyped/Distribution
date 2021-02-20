package typings.angularCore

import typings.angularCompiler.mod.PropertyWrite
import typings.angularCore.ngComponentTemplateMod.ResolvedTemplate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyzeTemplateMod {
  
  @JSImport("@angular/core/schematics/migrations/template-var-assignment/analyze_template", "analyzeResolvedTemplate")
  @js.native
  def analyzeResolvedTemplate(template: ResolvedTemplate): js.Array[TemplateVariableAssignment] | Null = js.native
  
  @js.native
  trait TemplateVariableAssignment extends StObject {
    
    var end: Double = js.native
    
    var node: PropertyWrite = js.native
    
    var start: Double = js.native
  }
  object TemplateVariableAssignment {
    
    @scala.inline
    def apply(end: Double, node: PropertyWrite, start: Double): TemplateVariableAssignment = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateVariableAssignment]
    }
    
    @scala.inline
    implicit class TemplateVariableAssignmentMutableBuilder[Self <: TemplateVariableAssignment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: PropertyWrite): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
}
