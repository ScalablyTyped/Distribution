package typings.antdDashMobile

import typings.react.reactMod.Component
import typings.rmcDashPullDashToDashRefresh.libPropsTypeMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd-mobile/lib/pull-to-refresh", JSImport.Namespace)
@js.native
object libPullDashToDashRefreshMod extends js.Object {
  @js.native
  trait PullToRefresh
    extends Component[PropsType, js.Any, js.Any]
  
  @js.native
  class default () extends PullToRefresh
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextTypes: Anon_AntLocale = js.native
    var defaultProps: Anon_PrefixCls = js.native
  }
  
}

