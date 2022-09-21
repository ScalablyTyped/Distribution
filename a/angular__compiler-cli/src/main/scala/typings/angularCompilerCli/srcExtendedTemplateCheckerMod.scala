package typings.angularCompilerCli

import typings.angularCompilerCli.apiApiMod.TemplateDiagnostic
import typings.angularCompilerCli.checkerMod.TemplateTypeChecker
import typings.angularCompilerCli.errorCodeMod.ErrorCode
import typings.angularCompilerCli.extendedApiApiMod.TemplateCheckFactory
import typings.angularCompilerCli.extendedTemplateCheckerMod.ExtendedTemplateChecker
import typings.angularCompilerCli.extendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName
import typings.angularCompilerCli.optionsMod.NgCompilerOptions
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcExtendedTemplateCheckerMod {
  
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
