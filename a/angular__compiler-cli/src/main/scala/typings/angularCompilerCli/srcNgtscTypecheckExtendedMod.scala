package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscCoreApiSrcOptionsMod.NgCompilerOptions
import typings.angularCompilerCli.srcNgtscDiagnosticsSrcErrorCodeMod.ErrorCode
import typings.angularCompilerCli.srcNgtscDiagnosticsSrcExtendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName
import typings.angularCompilerCli.srcNgtscTypecheckApiCheckerMod.TemplateTypeChecker
import typings.angularCompilerCli.srcNgtscTypecheckExtendedApiApiMod.TemplateCheckFactory
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckExtendedMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended", "ALL_DIAGNOSTIC_FACTORIES")
  @js.native
  val ALL_DIAGNOSTIC_FACTORIES: js.Array[TemplateCheckFactory[ErrorCode, ExtendedTemplateDiagnosticName]] = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended", "ExtendedTemplateCheckerImpl")
  @js.native
  open class ExtendedTemplateCheckerImpl protected ()
    extends typings.angularCompilerCli.srcNgtscTypecheckExtendedSrcExtendedTemplateCheckerMod.ExtendedTemplateCheckerImpl {
    def this(
      templateTypeChecker: TemplateTypeChecker,
      typeChecker: TypeChecker,
      templateCheckFactories: js.Array[TemplateCheckFactory[ErrorCode, ExtendedTemplateDiagnosticName]],
      options: NgCompilerOptions
    ) = this()
  }
}
