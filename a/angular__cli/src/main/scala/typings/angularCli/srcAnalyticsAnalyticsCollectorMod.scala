package typings.angularCli

import typings.angularDevkitCore.srcAnalyticsApiMod.Analytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnalyticsAnalyticsCollectorMod {
  
  @JSImport("@angular/cli/src/analytics/analytics-collector", "AnalyticsCollector")
  @js.native
  open class AnalyticsCollector protected ()
    extends StObject
       with Analytics {
    def this(trackingId: String, userId: String) = this()
    
    /* private */ var addToQueue: Any = js.native
    
    /* private */ val analyticsLogDebug: Any = js.native
    
    /**
      * Creates the dimension and metrics variables to add to the queue.
      * @private
      */
    /* private */ var customVariables: Any = js.native
    
    /* private */ val parameters: Any = js.native
    
    /* private */ var send: Any = js.native
    
    /* private */ var trackingEventsQueue: Any = js.native
  }
}
