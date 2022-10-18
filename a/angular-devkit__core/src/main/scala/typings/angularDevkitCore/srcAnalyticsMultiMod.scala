package typings.angularDevkitCore

import typings.angularDevkitCore.srcAnalyticsApiMod.Analytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcAnalyticsMultiMod {
  
  @JSImport("@angular-devkit/core/src/analytics/multi", "MultiAnalytics")
  @js.native
  open class MultiAnalytics ()
    extends StObject
       with Analytics {
    def this(_backends: js.Array[Analytics]) = this()
    
    /* protected */ var _backends: js.Array[Analytics] = js.native
    
    def push(backend: Analytics*): Unit = js.native
  }
}
