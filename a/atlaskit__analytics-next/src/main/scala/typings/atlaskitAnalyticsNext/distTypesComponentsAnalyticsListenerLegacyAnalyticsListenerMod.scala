package typings.atlaskitAnalyticsNext

import typings.atlaskitAnalyticsNext.anon.GetAtlaskitAnalyticsEventHandlers
import typings.atlaskitAnalyticsNextStableReactContext.distCjsTypesMod.AnalyticsReactContextInterface
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsAnalyticsListenerLegacyAnalyticsListenerMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsListener/LegacyAnalyticsListener", JSImport.Default)
  @js.native
  open class default protected () extends AnalyticsListener {
    def this(props: Props) = this()
  }
  object default {
    
    /* static member */
    object childContextTypes {
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsListener/LegacyAnalyticsListener", "default.childContextTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsListener/LegacyAnalyticsListener", "default.childContextTypes.getAtlaskitAnalyticsContext")
      @js.native
      def getAtlaskitAnalyticsContext: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def getAtlaskitAnalyticsContext_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAtlaskitAnalyticsContext")(x.asInstanceOf[js.Any])
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsListener/LegacyAnalyticsListener", "default.childContextTypes.getAtlaskitAnalyticsEventHandlers")
      @js.native
      def getAtlaskitAnalyticsEventHandlers: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def getAtlaskitAnalyticsEventHandlers_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAtlaskitAnalyticsEventHandlers")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object contextTypes {
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsListener/LegacyAnalyticsListener", "default.contextTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsListener/LegacyAnalyticsListener", "default.contextTypes.getAtlaskitAnalyticsContext")
      @js.native
      def getAtlaskitAnalyticsContext: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def getAtlaskitAnalyticsContext_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAtlaskitAnalyticsContext")(x.asInstanceOf[js.Any])
      
      @JSImport("@atlaskit/analytics-next/dist/types/components/AnalyticsListener/LegacyAnalyticsListener", "default.contextTypes.getAtlaskitAnalyticsEventHandlers")
      @js.native
      def getAtlaskitAnalyticsEventHandlers: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def getAtlaskitAnalyticsEventHandlers_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAtlaskitAnalyticsEventHandlers")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnalyticsListener
    extends Component[Props, js.Object, Any] {
    
    var contextValue: AnalyticsReactContextInterface = js.native
    
    def getAnalyticsEventHandlers(): js.Array[Any] = js.native
    
    def getAtlaskitAnalyticsContext(): Any = js.native
    
    def getChildContext(): GetAtlaskitAnalyticsEventHandlers = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    /** The channel to listen for events on. */
    var channel: js.UndefOr[String] = js.native
    
    /** Children! */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** A function which will be called when an event is fired on this Listener's
      * channel. It is passed the event and the channel as arguments. */
    def onEvent(event: typings.atlaskitAnalyticsNext.distTypesEventsUianalyticseventMod.default): Unit = js.native
    def onEvent(event: typings.atlaskitAnalyticsNext.distTypesEventsUianalyticseventMod.default, channel: String): Unit = js.native
  }
}
