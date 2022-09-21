package typings.antdMobile

import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pullToRefreshPullToRefreshMod {
  
  @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "PullToRefresh")
  @js.native
  val PullToRefresh: FC[PullToRefreshProps] = js.native
  
  object defaultProps {
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.canReleaseText")
    @js.native
    def canReleaseText: String = js.native
    inline def canReleaseText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canReleaseText")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.completeDelay")
    @js.native
    def completeDelay: Double = js.native
    inline def completeDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeDelay")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.completeText")
    @js.native
    def completeText: String = js.native
    inline def completeText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeText")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.disabled")
    @js.native
    def disabled: Boolean = js.native
    inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    
    inline def onRefresh(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onRefresh")().asInstanceOf[Unit]
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.pullingText")
    @js.native
    def pullingText: String = js.native
    inline def pullingText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pullingText")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/es/components/pull-to-refresh/pull-to-refresh", "defaultProps.refreshingText")
    @js.native
    def refreshingText: String = js.native
    inline def refreshingText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refreshingText")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings.pulling
    - typings.antdMobile.antdMobileStrings.canRelease
    - typings.antdMobile.antdMobileStrings.refreshing
    - typings.antdMobile.antdMobileStrings.complete
  */
  trait PullStatus extends StObject
  object PullStatus {
    
    inline def canRelease: typings.antdMobile.antdMobileStrings.canRelease = "canRelease".asInstanceOf[typings.antdMobile.antdMobileStrings.canRelease]
    
    inline def complete: typings.antdMobile.antdMobileStrings.complete = "complete".asInstanceOf[typings.antdMobile.antdMobileStrings.complete]
    
    inline def pulling: typings.antdMobile.antdMobileStrings.pulling = "pulling".asInstanceOf[typings.antdMobile.antdMobileStrings.pulling]
    
    inline def refreshing: typings.antdMobile.antdMobileStrings.refreshing = "refreshing".asInstanceOf[typings.antdMobile.antdMobileStrings.refreshing]
  }
  
  trait PullToRefreshProps extends StObject {
    
    var canReleaseText: js.UndefOr[ReactNode] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var completeDelay: js.UndefOr[Double] = js.undefined
    
    var completeText: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var headHeight: js.UndefOr[Double] = js.undefined
    
    var onRefresh: js.UndefOr[js.Function0[js.Promise[Any]]] = js.undefined
    
    var pullingText: js.UndefOr[ReactNode] = js.undefined
    
    var refreshingText: js.UndefOr[ReactNode] = js.undefined
    
    var renderText: js.UndefOr[js.Function1[/* status */ PullStatus, ReactNode]] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object PullToRefreshProps {
    
    inline def apply(): PullToRefreshProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PullToRefreshProps]
    }
    
    extension [Self <: PullToRefreshProps](x: Self) {
      
      inline def setCanReleaseText(value: ReactNode): Self = StObject.set(x, "canReleaseText", value.asInstanceOf[js.Any])
      
      inline def setCanReleaseTextUndefined: Self = StObject.set(x, "canReleaseText", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCompleteDelay(value: Double): Self = StObject.set(x, "completeDelay", value.asInstanceOf[js.Any])
      
      inline def setCompleteDelayUndefined: Self = StObject.set(x, "completeDelay", js.undefined)
      
      inline def setCompleteText(value: ReactNode): Self = StObject.set(x, "completeText", value.asInstanceOf[js.Any])
      
      inline def setCompleteTextUndefined: Self = StObject.set(x, "completeText", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setHeadHeight(value: Double): Self = StObject.set(x, "headHeight", value.asInstanceOf[js.Any])
      
      inline def setHeadHeightUndefined: Self = StObject.set(x, "headHeight", js.undefined)
      
      inline def setOnRefresh(value: () => js.Promise[Any]): Self = StObject.set(x, "onRefresh", js.Any.fromFunction0(value))
      
      inline def setOnRefreshUndefined: Self = StObject.set(x, "onRefresh", js.undefined)
      
      inline def setPullingText(value: ReactNode): Self = StObject.set(x, "pullingText", value.asInstanceOf[js.Any])
      
      inline def setPullingTextUndefined: Self = StObject.set(x, "pullingText", js.undefined)
      
      inline def setRefreshingText(value: ReactNode): Self = StObject.set(x, "refreshingText", value.asInstanceOf[js.Any])
      
      inline def setRefreshingTextUndefined: Self = StObject.set(x, "refreshingText", js.undefined)
      
      inline def setRenderText(value: /* status */ PullStatus => ReactNode): Self = StObject.set(x, "renderText", js.Any.fromFunction1(value))
      
      inline def setRenderTextUndefined: Self = StObject.set(x, "renderText", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
