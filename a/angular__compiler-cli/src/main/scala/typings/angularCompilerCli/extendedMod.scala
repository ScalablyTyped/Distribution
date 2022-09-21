package typings.angularCompilerCli

import typings.angularCompilerCli.checkerMod.TemplateTypeChecker
import typings.angularCompilerCli.errorCodeMod.ErrorCode
import typings.angularCompilerCli.extendedApiApiMod.TemplateCheckFactory
import typings.angularCompilerCli.extendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName
import typings.angularCompilerCli.optionsMod.NgCompilerOptions
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendedMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended", "ALL_DIAGNOSTIC_FACTORIES")
  @js.native
  val ALL_DIAGNOSTIC_FACTORIES: js.Array[TemplateCheckFactory[ErrorCode, ExtendedTemplateDiagnosticName]] = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended", "ExtendedTemplateCheckerImpl")
  @js.native
  open class ExtendedTemplateCheckerImpl protected ()
    extends typings.angularCompilerCli.srcExtendedTemplateCheckerMod.ExtendedTemplateCheckerImpl {
    def this(
      templateTypeChecker: TemplateTypeChecker,
      typeChecker: TypeChecker,
      templateCheckFactories: js.Array[TemplateCheckFactory[ErrorCode, ExtendedTemplateDiagnosticName]],
      options: NgCompilerOptions
    ) = this()
  }
}
