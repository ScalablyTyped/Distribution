package typings.angularDevkitCore

import typings.angularDevkitCore.srcAnalyticsApiMod.Analytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnalyticsNoopMod {
  
  @JSImport("@angular-devkit/core/src/analytics/noop", "NoopAnalytics")
  @js.native
  open class NoopAnalytics ()
    extends StObject
       with Analytics {
    
    def event(): Unit = js.native
    
    def pageview(): Unit = js.native
    
    def screenview(): Unit = js.native
    
    def timing(): Unit = js.native
  }
}
