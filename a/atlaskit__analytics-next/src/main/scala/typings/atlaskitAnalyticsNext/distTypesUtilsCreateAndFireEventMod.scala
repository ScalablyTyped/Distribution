package typings.atlaskitAnalyticsNext

import typings.atlaskitAnalyticsNext.distTypesEventsAnalyticsEventMod.AnalyticsEventPayload
import typings.atlaskitAnalyticsNext.distTypesTypesMod.CreateUIAnalyticsEvent
import typings.atlaskitAnalyticsNext.mod.UIAnalyticsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsCreateAndFireEventMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/utils/createAndFireEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function1[
    /* payload */ AnalyticsEventPayload, 
    js.Function1[/* createAnalyticsEvent */ CreateUIAnalyticsEvent, UIAnalyticsEvent]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[
    /* payload */ AnalyticsEventPayload, 
    js.Function1[/* createAnalyticsEvent */ CreateUIAnalyticsEvent, UIAnalyticsEvent]
  ]]
  inline def default(channel: String): js.Function1[
    /* payload */ AnalyticsEventPayload, 
    js.Function1[/* createAnalyticsEvent */ CreateUIAnalyticsEvent, UIAnalyticsEvent]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(channel.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* payload */ AnalyticsEventPayload, 
    js.Function1[/* createAnalyticsEvent */ CreateUIAnalyticsEvent, UIAnalyticsEvent]
  ]]
}
