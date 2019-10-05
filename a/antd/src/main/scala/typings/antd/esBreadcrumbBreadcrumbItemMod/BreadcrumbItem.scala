package typings.antd.esBreadcrumbBreadcrumbItemMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod.Global.JSX.Element
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbItem
  extends Component[BreadcrumbItemProps, js.Any, js.Any] {
  def renderBreadcrumbItem(hasGetPrefixCls: ConfigConsumerProps): Element | Null = js.native
  /**
    * if overlay is have
    * Wrap a DropDown
    */
  def renderBreadcrumbNode(breadcrumbItem: ReactNode, prefixCls: String): js.UndefOr[js.Object | Null] = js.native
}

