package typings.antd.collapseCollapseMod

import typings.antd.configProviderContextMod.ConfigConsumerProps
import typings.antd.transferMod.TransferDirection
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Collapse
  extends Component[CollapseProps, js.Any, js.Any] {
  def getIconPosition(): TransferDirection = js.native
  def getIconPosition(direction: String): TransferDirection = js.native
  def renderCollapse(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def renderExpandIcon(panelProps: js.UndefOr[PanelProps], prefixCls: String): ReactElement = js.native
}

