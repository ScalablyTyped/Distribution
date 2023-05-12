package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.component_
import typings.angularCompilerCli.angularCompilerCliStrings.directive_
import typings.angularCompilerCli.angularCompilerCliStrings.pipe_
import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscScopeSrcApiMod.ComponentScopeReader
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.DiagnosticWithLocation
import typings.typescript.mod.Expression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscScopeSrcUtilMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/scope/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDiagnosticNode(ref: Reference[ClassDeclarationDeclarati]): Expression = ^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnosticNode")(ref.asInstanceOf[js.Any]).asInstanceOf[Expression]
  inline def getDiagnosticNode(ref: Reference[ClassDeclarationDeclarati], rawExpr: Expression): Expression = (^.asInstanceOf[js.Dynamic].applyDynamic("getDiagnosticNode")(ref.asInstanceOf[js.Any], rawExpr.asInstanceOf[js.Any])).asInstanceOf[Expression]
  
  inline def makeNotStandaloneDiagnostic(
    scopeReader: ComponentScopeReader,
    ref: Reference[ClassDeclarationDeclarati],
    rawExpr: Null,
    kind: component_ | directive_ | pipe_
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeNotStandaloneDiagnostic")(scopeReader.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], rawExpr.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  inline def makeNotStandaloneDiagnostic(
    scopeReader: ComponentScopeReader,
    ref: Reference[ClassDeclarationDeclarati],
    rawExpr: Expression,
    kind: component_ | directive_ | pipe_
  ): Diagnostic = (^.asInstanceOf[js.Dynamic].applyDynamic("makeNotStandaloneDiagnostic")(scopeReader.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], rawExpr.asInstanceOf[js.Any], kind.asInstanceOf[js.Any])).asInstanceOf[Diagnostic]
  
  inline def makeUnknownComponentImportDiagnostic(ref: Reference[ClassDeclarationDeclarati], rawExpr: Expression): DiagnosticWithLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeUnknownComponentImportDiagnostic")(ref.asInstanceOf[js.Any], rawExpr.asInstanceOf[js.Any])).asInstanceOf[DiagnosticWithLocation]
}
