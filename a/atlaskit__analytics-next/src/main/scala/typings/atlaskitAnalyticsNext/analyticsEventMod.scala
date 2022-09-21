package typings.atlaskitAnalyticsNext

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analyticsEventMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/events/AnalyticsEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@atlaskit/analytics-next/dist/types/events/AnalyticsEvent", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AnalyticsEvent {
    def this(props: AnalyticsEventProps) = this()
    
    /* CompleteClass */
    var _isAnalyticsEvent: Boolean = js.native
    
    /* CompleteClass */
    var payload: AnalyticsEventPayload = js.native
    
    /* CompleteClass */
    override def update(updater: AnalyticsEventUpdater): this.type = js.native
  }
  
  inline def isAnalyticsEvent(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAnalyticsEvent")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait AnalyticsEvent extends StObject {
    
    var _isAnalyticsEvent: Boolean
    
    var payload: AnalyticsEventPayload
    
    def update(updater: AnalyticsEventUpdater): this.type
  }
  object AnalyticsEvent {
    
    inline def apply(
      _isAnalyticsEvent: Boolean,
      payload: AnalyticsEventPayload,
      update: AnalyticsEventUpdater => AnalyticsEvent
    ): AnalyticsEvent = {
      val __obj = js.Dynamic.literal(_isAnalyticsEvent = _isAnalyticsEvent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[AnalyticsEvent]
    }
    
    extension [Self <: AnalyticsEvent](x: Self) {
      
      inline def setPayload(value: AnalyticsEventPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: AnalyticsEventUpdater => AnalyticsEvent): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def set_isAnalyticsEvent(value: Boolean): Self = StObject.set(x, "_isAnalyticsEvent", value.asInstanceOf[js.Any])
    }
  }
  
  type AnalyticsEventCallback = js.Function1[/* payload */ AnalyticsEventPayload, AnalyticsEventPayload]
  
  type AnalyticsEventPayload = Record[String, Any]
  
  trait AnalyticsEventProps extends StObject {
    
    var payload: AnalyticsEventPayload
  }
  object AnalyticsEventProps {
    
    inline def apply(payload: AnalyticsEventPayload): AnalyticsEventProps = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsEventProps]
    }
    
    extension [Self <: AnalyticsEventProps](x: Self) {
      
      inline def setPayload(value: AnalyticsEventPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  type AnalyticsEventUpdater = AnalyticsEventPayload | AnalyticsEventCallback
}
