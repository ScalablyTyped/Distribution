package typings.angularLocalize

import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.PathManipulation
import typings.angularLocalize.diagnosticsMod.DiagnosticHandlingStrategy
import typings.angularLocalize.diagnosticsMod.Diagnostics
import typings.angularLocalize.mod.ɵParsedMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object duplicatesMod {
  
  @JSImport("@angular/localize/tools/src/extract/duplicates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkDuplicateMessages(
    fs: PathManipulation,
    messages: js.Array[ɵParsedMessage],
    duplicateMessageHandling: DiagnosticHandlingStrategy,
    basePath: AbsoluteFsPath
  ): Diagnostics = (^.asInstanceOf[js.Dynamic].applyDynamic("checkDuplicateMessages")(fs.asInstanceOf[js.Any], messages.asInstanceOf[js.Any], duplicateMessageHandling.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[Diagnostics]
}
