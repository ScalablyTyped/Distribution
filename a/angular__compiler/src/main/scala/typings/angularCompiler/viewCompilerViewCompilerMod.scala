package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileMetadataMod.CompilePipeSummary
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.srcUtilMod.OutputContext
import typings.angularCompiler.templateAstMod.TemplateAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewCompilerViewCompilerMod {
  
  @JSImport("@angular/compiler/src/view_compiler/view_compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler/src/view_compiler/view_compiler", "ViewCompileResult")
  @js.native
  class ViewCompileResult protected () extends StObject {
    def this(viewClassVar: String, rendererTypeVar: String) = this()
    
    var rendererTypeVar: String = js.native
    
    var viewClassVar: String = js.native
  }
  
  @JSImport("@angular/compiler/src/view_compiler/view_compiler", "ViewCompiler")
  @js.native
  class ViewCompiler protected () extends StObject {
    def this(_reflector: CompileReflector) = this()
    
    var _reflector: js.Any = js.native
    
    def compileComponent(
      outputCtx: OutputContext,
      component: CompileDirectiveMetadata,
      template: js.Array[TemplateAst],
      styles: Expression,
      usedPipes: js.Array[CompilePipeSummary]
    ): ViewCompileResult = js.native
  }
  
  @scala.inline
  def elementEventFullName(target: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("elementEventFullName")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def elementEventFullName(target: Null, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("elementEventFullName")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
}
