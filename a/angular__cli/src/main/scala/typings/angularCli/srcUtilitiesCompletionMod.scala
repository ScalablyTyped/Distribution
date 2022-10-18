package typings.angularCli

import typings.angularDevkitCore.mod.logging.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilitiesCompletionMod {
  
  @JSImport("@angular/cli/src/utilities/completion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def considerSettingUpAutocompletion(command: String, logger: Logger): js.Promise[js.UndefOr[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("considerSettingUpAutocompletion")(command.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Double]]]
  
  inline def hasGlobalCliInstall(): js.Promise[js.UndefOr[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasGlobalCliInstall")().asInstanceOf[js.Promise[js.UndefOr[Boolean]]]
  
  inline def initializeAutocomplete(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAutocomplete")().asInstanceOf[js.Promise[String]]
}
