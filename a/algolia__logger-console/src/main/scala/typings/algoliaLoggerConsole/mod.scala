package typings.algoliaLoggerConsole

import typings.algoliaLoggerCommon.mod.LogLevelType
import typings.algoliaLoggerCommon.mod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@algolia/logger-console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createConsoleLogger(logLevel: LogLevelType): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createConsoleLogger")(logLevel.asInstanceOf[js.Any]).asInstanceOf[Logger]
}
