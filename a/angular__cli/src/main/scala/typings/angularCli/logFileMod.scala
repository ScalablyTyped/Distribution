package typings.angularCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logFileMod {
  
  @JSImport("@angular/cli/src/utilities/log-file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeErrorToLogFile(error: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("writeErrorToLogFile")(error.asInstanceOf[js.Any]).asInstanceOf[String]
}
