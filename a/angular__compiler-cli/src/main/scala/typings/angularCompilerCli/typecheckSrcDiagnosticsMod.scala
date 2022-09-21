package typings.angularCompilerCli

import typings.angularCompiler.mod.AbsoluteSourceSpan
import typings.angularCompiler.mod.ParseSourceSpan
import typings.angularCompilerCli.apiApiMod.TemplateDiagnostic
import typings.angularCompilerCli.apiApiMod.TemplateId
import typings.angularCompilerCli.tcbUtilMod.TemplateSourceResolver
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.Expression
import typings.typescript.mod.FunctionDeclaration
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typecheckSrcDiagnosticsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addParseSpanInfo(node: Node, span: AbsoluteSourceSpan): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addParseSpanInfo")(node.asInstanceOf[js.Any], span.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addParseSpanInfo(node: Node, span: ParseSourceSpan): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addParseSpanInfo")(node.asInstanceOf[js.Any], span.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addTemplateId(tcb: FunctionDeclaration, id: TemplateId): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTemplateId")(tcb.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def shouldReportDiagnostic(diagnostic: Diagnostic): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldReportDiagnostic")(diagnostic.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def translateDiagnostic(diagnostic: Diagnostic, resolver: TemplateSourceResolver): TemplateDiagnostic | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("translateDiagnostic")(diagnostic.asInstanceOf[js.Any], resolver.asInstanceOf[js.Any])).asInstanceOf[TemplateDiagnostic | Null]
  
  inline def wrapForDiagnostics(expr: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapForDiagnostics")(expr.asInstanceOf[js.Any]).asInstanceOf[Expression]
  
  inline def wrapForTypeChecker(expr: Expression): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapForTypeChecker")(expr.asInstanceOf[js.Any]).asInstanceOf[Expression]
}
