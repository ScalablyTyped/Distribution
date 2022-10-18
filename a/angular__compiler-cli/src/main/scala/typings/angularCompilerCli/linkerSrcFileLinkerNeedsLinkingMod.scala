package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerNeedsLinkingMod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/needs_linking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def needsLinking(path: String, source: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("needsLinking")(path.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
