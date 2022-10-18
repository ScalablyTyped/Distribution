package typings.angularDevkitCore

import typings.angularDevkitCore.srcAnalyticsApiMod.Analytics
import typings.angularDevkitCore.srcLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnalyticsLoggingMod {
  
  @JSImport("@angular-devkit/core/src/analytics/logging", "LoggingAnalytics")
  @js.native
  open class LoggingAnalytics protected ()
    extends StObject
       with Analytics {
    def this(_logger: Logger) = this()
    
    /* protected */ var _logger: Logger = js.native
  }
}
