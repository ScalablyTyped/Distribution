package typings.angularCli

import typings.angularDevkitCore.mod.logging.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCommandBuilderCommandRunnerMod {
  
  @JSImport("@angular/cli/src/command-builder/command-runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runCommand(args: js.Array[String], logger: Logger): js.Promise[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("runCommand")(args.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Double]]
}
