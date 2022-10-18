package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcNgccOptionsMod.NgccOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcCommandLineOptionsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/command_line_options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseCommandLineOptions(args: js.Array[String]): NgccOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("parseCommandLineOptions")(args.asInstanceOf[js.Any]).asInstanceOf[NgccOptions]
}
