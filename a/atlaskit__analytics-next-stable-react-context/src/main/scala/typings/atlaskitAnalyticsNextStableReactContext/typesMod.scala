package typings.atlaskitAnalyticsNextStableReactContext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait AnalyticsReactContextInterface extends StObject {
    
    def getAtlaskitAnalyticsContext(): js.Array[Any]
    
    def getAtlaskitAnalyticsEventHandlers(): js.Array[Any]
  }
  object AnalyticsReactContextInterface {
    
    inline def apply(
      getAtlaskitAnalyticsContext: () => js.Array[Any],
      getAtlaskitAnalyticsEventHandlers: () => js.Array[Any]
    ): AnalyticsReactContextInterface = {
      val __obj = js.Dynamic.literal(getAtlaskitAnalyticsContext = js.Any.fromFunction0(getAtlaskitAnalyticsContext), getAtlaskitAnalyticsEventHandlers = js.Any.fromFunction0(getAtlaskitAnalyticsEventHandlers))
      __obj.asInstanceOf[AnalyticsReactContextInterface]
    }
    
    extension [Self <: AnalyticsReactContextInterface](x: Self) {
      
      inline def setGetAtlaskitAnalyticsContext(value: () => js.Array[Any]): Self = StObject.set(x, "getAtlaskitAnalyticsContext", js.Any.fromFunction0(value))
      
      inline def setGetAtlaskitAnalyticsEventHandlers(value: () => js.Array[Any]): Self = StObject.set(x, "getAtlaskitAnalyticsEventHandlers", js.Any.fromFunction0(value))
    }
  }
}
