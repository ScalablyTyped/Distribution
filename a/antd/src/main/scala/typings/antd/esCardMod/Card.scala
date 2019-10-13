package typings.antd.esCardMod

import typings.antd.esConfigDashProviderMod.ConfigConsumerProps
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Card
  extends Component[CardProps, js.Object, js.Any] {
  @JSName("componentDidMount")
  def componentDidMount_MCard(): Unit = js.native
  def getCompatibleHoverable(): js.UndefOr[Boolean] = js.native
  def isContainGrid(): js.UndefOr[scala.Nothing] = js.native
  def onTabChange(key: String): Unit = js.native
  def renderCard(hasGetPrefixCls: ConfigConsumerProps): Element = js.native
}

