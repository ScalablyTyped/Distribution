package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode
import typings.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName
import typings.angularCompilerCli.srcNgtscTypecheckApiApiMod.TemplateDiagnostic
import typings.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.TemplateTypeChecker
import typings.angularCompilerCli.srcNgtscTypecheckExtendedApiApiMod.TemplateCheckFactory
import typings.angularCompilerCli.srcNgtscTypecheckExtendedApiExtendedTemplateCheckerMod.ExtendedTemplateChecker
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckExtendedSrcExtendedTemplateCheckerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended/src/extended_template_checker", "ExtendedTemplateCheckerImpl")
  @js.native
  open class ExtendedTemplateCheckerImpl protected ()
    extends StObject
       with ExtendedTemplateChecker {
    def this(
      templateTypeChecker: TemplateTypeChecker,
      typeChecker: TypeChecker,
      templateCheckFactories: js.Array[TemplateCheckFactory[ErrorCode, ExtendedTemplateDiagnosticName]],
      options: NgCompilerOptions
    ) = this()
    
    /**
      * Run `TemplateCheck`s for a component and return the generated `ts.Diagnostic`s.
      */
    /* CompleteClass */
    override def getDiagnosticsForComponent(component: ClassDeclaration): js.Array[TemplateDiagnostic] = js.native
    
    /* private */ val partialCtx: Any = js.native
    
    /* private */ val templateChecks: Any = js.native
  }
}
