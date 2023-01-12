package typings.atlaskitAnalyticsNext

import typings.atlaskitAnalyticsNext.distTypesEventsAnalyticsEventMod.AnalyticsEventPayload
import typings.atlaskitAnalyticsNext.distTypesEventsUianalyticseventMod.default
import typings.atlaskitAnalyticsNext.distTypesTypesMod.CreateUIAnalyticsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseAnalyticsEventsMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/hooks/useAnalyticsEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAnalyticsEvents(): UseAnalyticsEventsHook = ^.asInstanceOf[js.Dynamic].applyDynamic("useAnalyticsEvents")().asInstanceOf[UseAnalyticsEventsHook]
  
  trait UseAnalyticsEventsHook extends StObject {
    
    var createAnalyticsEvent: CreateUIAnalyticsEvent
  }
  object UseAnalyticsEventsHook {
    
    inline def apply(createAnalyticsEvent: /* payload */ AnalyticsEventPayload => default): UseAnalyticsEventsHook = {
      val __obj = js.Dynamic.literal(createAnalyticsEvent = js.Any.fromFunction1(createAnalyticsEvent))
      __obj.asInstanceOf[UseAnalyticsEventsHook]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseAnalyticsEventsHook] (val x: Self) extends AnyVal {
      
      inline def setCreateAnalyticsEvent(value: /* payload */ AnalyticsEventPayload => default): Self = StObject.set(x, "createAnalyticsEvent", js.Any.fromFunction1(value))
    }
  }
}
