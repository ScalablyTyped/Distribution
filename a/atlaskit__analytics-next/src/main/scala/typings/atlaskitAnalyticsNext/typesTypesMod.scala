package typings.atlaskitAnalyticsNext

import typings.atlaskitAnalyticsNext.analyticsEventMod.AnalyticsEventPayload
import typings.atlaskitAnalyticsNext.uianalyticseventMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypesMod {
  
  type AnalyticsEventCreator = js.Function2[
    /* create */ CreateUIAnalyticsEvent, 
    /* props */ Record[String, Any], 
    js.UndefOr[default]
  ]
  
  type CreateEventMap = Record[String, CreateEventMapValue]
  
  type CreateEventMapValue = AnalyticsEventPayload | AnalyticsEventCreator
  
  type CreateUIAnalyticsEvent = js.Function1[/* payload */ AnalyticsEventPayload, default]
}
