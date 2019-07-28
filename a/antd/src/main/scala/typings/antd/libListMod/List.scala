package typings.antd.libListMod

import typings.antd.Anon_CurrentTotal
import typings.antd.Anon_GridHorizontalItemLayout
import typings.antd.libConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait List[T]
  extends Component[ListProps[T], ListState, js.Any] {
  var defaultPaginationProps: Anon_CurrentTotal = js.native
  var keys: js.Any = js.native
  var onPaginationChange: js.Any = js.native
  var onPaginationShowSizeChange: js.Any = js.native
  def getChildContext(): Anon_GridHorizontalItemLayout = js.native
  def isSomethingAfterLastItem(): Boolean = js.native
  def renderEmpty(prefixCls: String, renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], ReactNode]): Element = js.native
  def renderItem(item: js.Any, index: Double): js.UndefOr[js.Object | Null] = js.native
  def renderList(hasGetPrefixClsRenderEmpty: ConfigConsumerProps): Element = js.native
  def triggerPaginationEvent(eventName: String): js.Function2[/* page */ Double, /* pageSize */ Double, Unit] = js.native
}

