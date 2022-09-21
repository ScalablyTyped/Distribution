package typings.angularCompilerCli

import typings.angularCompilerCli.errorCodeMod.ErrorCode.MISSING_CONTROL_FLOW_DIRECTIVE
import typings.angularCompilerCli.extendedApiApiMod.TemplateCheckFactory
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object missingControlFlowDirectiveMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended/checks/missing_control_flow_directive", "KNOWN_CONTROL_FLOW_DIRECTIVES")
  @js.native
  val KNOWN_CONTROL_FLOW_DIRECTIVES: Map[String, String] = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/extended/checks/missing_control_flow_directive", "factory")
  @js.native
  val factory: TemplateCheckFactory[
    MISSING_CONTROL_FLOW_DIRECTIVE, 
    typings.angularCompilerCli.extendedTemplateDiagnosticNameMod.ExtendedTemplateDiagnosticName.MISSING_CONTROL_FLOW_DIRECTIVE
  ] = js.native
}
