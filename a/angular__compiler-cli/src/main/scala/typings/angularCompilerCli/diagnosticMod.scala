package typings.angularCompilerCli

import typings.angularCompiler.mod.ParseSourceSpan
import typings.angularCompilerCli.anon.End
import typings.angularCompilerCli.apiApiMod.TemplateDiagnostic
import typings.angularCompilerCli.apiApiMod.TemplateId
import typings.angularCompilerCli.apiApiMod.TemplateSourceMapping
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticCategory
import typings.typescript.mod.DiagnosticMessageChain
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagnosticMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/diagnostics/src/diagnostic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTemplateDiagnostic(diagnostic: Diagnostic): /* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/typecheck/api/api.TemplateDiagnostic */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemplateDiagnostic")(diagnostic.asInstanceOf[js.Any]).asInstanceOf[/* is @angular/compiler-cli.@angular/compiler-cli/src/ngtsc/typecheck/api/api.TemplateDiagnostic */ Boolean]
  
  inline def makeTemplateDiagnostic(
    templateId: TemplateId,
    mapping: TemplateSourceMapping,
    span: ParseSourceSpan,
    category: DiagnosticCategory,
    code: Double,
    messageText: String
  ): TemplateDiagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTemplateDiagnostic")(templateId.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], span.asInstanceOf[js.Any], category.asInstanceOf[js.Any], code.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[TemplateDiagnostic]
  inline def makeTemplateDiagnostic(
    templateId: TemplateId,
    mapping: TemplateSourceMapping,
    span: ParseSourceSpan,
    category: DiagnosticCategory,
    code: Double,
    messageText: String,
    relatedMessages: js.Array[End]
  ): TemplateDiagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTemplateDiagnostic")(templateId.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], span.asInstanceOf[js.Any], category.asInstanceOf[js.Any], code.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any], relatedMessages.asInstanceOf[js.Any])).asInstanceOf[TemplateDiagnostic]
  inline def makeTemplateDiagnostic(
    templateId: TemplateId,
    mapping: TemplateSourceMapping,
    span: ParseSourceSpan,
    category: DiagnosticCategory,
    code: Double,
    messageText: DiagnosticMessageChain
  ): TemplateDiagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTemplateDiagnostic")(templateId.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], span.asInstanceOf[js.Any], category.asInstanceOf[js.Any], code.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any])).asInstanceOf[TemplateDiagnostic]
  inline def makeTemplateDiagnostic(
    templateId: TemplateId,
    mapping: TemplateSourceMapping,
    span: ParseSourceSpan,
    category: DiagnosticCategory,
    code: Double,
    messageText: DiagnosticMessageChain,
    relatedMessages: js.Array[End]
  ): TemplateDiagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeTemplateDiagnostic")(templateId.asInstanceOf[js.Any], mapping.asInstanceOf[js.Any], span.asInstanceOf[js.Any], category.asInstanceOf[js.Any], code.asInstanceOf[js.Any], messageText.asInstanceOf[js.Any], relatedMessages.asInstanceOf[js.Any])).asInstanceOf[TemplateDiagnostic]
}
