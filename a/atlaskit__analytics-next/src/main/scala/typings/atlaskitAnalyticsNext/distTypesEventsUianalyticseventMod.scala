package typings.atlaskitAnalyticsNext

import typings.atlaskitAnalyticsNext.distTypesEventsAnalyticsEventMod.AnalyticsEventPayload
import typings.atlaskitAnalyticsNext.distTypesEventsAnalyticsEventMod.AnalyticsEventProps
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventsUianalyticseventMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/events/UIAnalyticsEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@atlaskit/analytics-next/dist/types/events/UIAnalyticsEvent", JSImport.Default)
  @js.native
  open class default protected () extends UIAnalyticsEvent {
    def this(props: UIAnalyticsEventProps) = this()
  }
  
  inline def isUIAnalyticsEvent(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUIAnalyticsEvent")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type ChannelIdentifier = String
  
  type Context = js.Array[Record[String, Any]]
  
  @js.native
  trait UIAnalyticsEvent
    extends typings.atlaskitAnalyticsNext.distTypesEventsAnalyticsEventMod.default {
    
    var _isUIAnalyticsEvent: Boolean = js.native
    
    var context: Context = js.native
    
    def fire(): Unit = js.native
    def fire(channel: String): Unit = js.native
    
    var handlers: js.Array[UIAnalyticsEventHandler] = js.native
    
    var hasFired: Boolean = js.native
    
    def update(updater: js.Function1[/* payload */ AnalyticsEventPayload, AnalyticsEventPayload]): this.type = js.native
    def update(updater: Record[String, Any]): this.type = js.native
  }
  
  type UIAnalyticsEventHandler = js.Function2[/* event */ UIAnalyticsEvent, /* channel */ js.UndefOr[ChannelIdentifier], Unit]
  
  trait UIAnalyticsEventProps
    extends StObject
       with AnalyticsEventProps {
    
    var context: js.UndefOr[Context] = js.undefined
    
    var handlers: js.UndefOr[js.Array[UIAnalyticsEventHandler]] = js.undefined
  }
  object UIAnalyticsEventProps {
    
    inline def apply(payload: AnalyticsEventPayload): UIAnalyticsEventProps = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[UIAnalyticsEventProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UIAnalyticsEventProps] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setContextVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "context", js.Array(value*))
      
      inline def setHandlers(value: js.Array[UIAnalyticsEventHandler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setHandlersVarargs(value: UIAnalyticsEventHandler*): Self = StObject.set(x, "handlers", js.Array(value*))
    }
  }
}
