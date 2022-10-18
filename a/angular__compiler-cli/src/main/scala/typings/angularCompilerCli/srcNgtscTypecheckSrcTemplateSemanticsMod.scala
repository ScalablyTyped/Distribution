package typings.angularCompilerCli

import typings.angularCompiler.mod.AST
import typings.angularCompiler.mod.BoundTarget
import typings.angularCompiler.mod.RecursiveAstVisitor
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateId
import typings.angularCompilerCli.srcNgtscTypecheckSrcOobMod.OutOfBandDiagnosticRecorder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcTemplateSemanticsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/template_semantics", "ExpressionSemanticVisitor")
  @js.native
  open class ExpressionSemanticVisitor protected () extends RecursiveAstVisitor {
    def this(templateId: TemplateId, boundTarget: BoundTarget[Any], oob: OutOfBandDiagnosticRecorder) = this()
    
    /* private */ var boundTarget: Any = js.native
    
    /* private */ var oob: Any = js.native
    
    /* private */ var templateId: Any = js.native
  }
  /* static members */
  object ExpressionSemanticVisitor {
    
    @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/template_semantics", "ExpressionSemanticVisitor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def visit(ast: AST, id: TemplateId, boundTarget: BoundTarget[Any], oob: OutOfBandDiagnosticRecorder): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(ast.asInstanceOf[js.Any], id.asInstanceOf[js.Any], boundTarget.asInstanceOf[js.Any], oob.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
