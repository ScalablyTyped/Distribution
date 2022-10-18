package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceInsightHealth extends StObject {
  
  /**
    * The number of open proactive insights in the Amazon Web Services service
    */
  var OpenProactiveInsights: js.UndefOr[NumOpenProactiveInsights] = js.undefined
  
  /**
    * The number of open reactive insights in the Amazon Web Services service
    */
  var OpenReactiveInsights: js.UndefOr[NumOpenReactiveInsights] = js.undefined
}
object ServiceInsightHealth {
  
  inline def apply(): ServiceInsightHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceInsightHealth]
  }
  
  extension [Self <: ServiceInsightHealth](x: Self) {
    
    inline def setOpenProactiveInsights(value: NumOpenProactiveInsights): Self = StObject.set(x, "OpenProactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setOpenProactiveInsightsUndefined: Self = StObject.set(x, "OpenProactiveInsights", js.undefined)
    
    inline def setOpenReactiveInsights(value: NumOpenReactiveInsights): Self = StObject.set(x, "OpenReactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setOpenReactiveInsightsUndefined: Self = StObject.set(x, "OpenReactiveInsights", js.undefined)
  }
}
