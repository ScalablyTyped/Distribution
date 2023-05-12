package typings.angularLocalize

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.PathManipulation
import typings.angularLocalize.localizeMod.ɵParsedMessage
import typings.angularLocalize.toolsSrcDiagnosticsMod.DiagnosticHandlingStrategy
import typings.angularLocalize.toolsSrcDiagnosticsMod.Diagnostics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolsSrcExtractDuplicatesMod {
  
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
