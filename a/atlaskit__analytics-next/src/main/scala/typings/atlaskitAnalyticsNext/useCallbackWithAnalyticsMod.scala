package typings.atlaskitAnalyticsNext

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCallbackWithAnalyticsMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/hooks/useCallbackWithAnalytics", "useCallbackWithAnalytics")
  @js.native
  val useCallbackWithAnalytics: UseCallbackWithAnalyticsHook = js.native
  
  type UseCallbackWithAnalyticsHook = js.Function3[
    /* method */ js.Function1[/* repeated */ Any, Unit], 
    /* payload */ (Record[String, Any]) | (js.Function1[/* repeated */ Any, Unit]), 
    /* channel */ js.UndefOr[String], 
    js.Function1[/* repeated */ Any, Unit]
  ]
}
