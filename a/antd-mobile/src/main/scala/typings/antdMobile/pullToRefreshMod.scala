package typings.antdMobile

import typings.antdMobile.anon.AntLocale
import typings.antdMobile.anon.PrefixCls
import typings.react.mod.Component
import typings.rmcPullToRefresh.propsTypeMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pullToRefreshMod {
  
  @JSImport("antd-mobile/lib/pull-to-refresh", JSImport.Default)
  @js.native
  class default () extends PullToRefresh
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/pull-to-refresh", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/pull-to-refresh", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    inline def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/pull-to-refresh", "default.defaultProps")
    @js.native
    def defaultProps: PrefixCls = js.native
    inline def defaultProps_=(x: PrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PullToRefresh
    extends Component[PropsType, js.Any, js.Any]
}
