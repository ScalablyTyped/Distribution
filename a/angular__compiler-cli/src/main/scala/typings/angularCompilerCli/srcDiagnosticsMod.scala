package typings.angularCompilerCli

import typings.angularCompilerCli.cyclesMod.Cycle
import typings.angularCompilerCli.ngtscImportsMod.Reference
import typings.typescript.mod.DiagnosticRelatedInformation
import typings.typescript.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDiagnosticsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/annotations/component/src/diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkCustomElementSelectorForErrors(selector: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("checkCustomElementSelectorForErrors")(selector.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  inline def makeCyclicImportInfo(ref: Reference[Node], `type`: String, cycle: Cycle): DiagnosticRelatedInformation = (^.asInstanceOf[js.Dynamic].applyDynamic("makeCyclicImportInfo")(ref.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], cycle.asInstanceOf[js.Any])).asInstanceOf[DiagnosticRelatedInformation]
}
