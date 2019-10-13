package typings.antd.esListMod

import typings.antd.Anon_CurrentTotal
import typings.antd.Anon_GridHorizontal
import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
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
  def getChildContext(): Anon_GridHorizontal = js.native
  def isSomethingAfterLastItem(): Boolean = js.native
  def renderEmpty(prefixCls: String, renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], ReactNode]): Element = js.native
  def renderItem(item: js.Any, index: Double): js.UndefOr[js.Object | Null] = js.native
  def renderList(hasGetPrefixClsRenderEmpty: ConfigConsumerProps): Element = js.native
  def triggerPaginationEvent(eventName: String): js.Function2[/* page */ Double, /* pageSize */ Double, Unit] = js.native
}

