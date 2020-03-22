package typings.antd.cardMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Card
  extends Component[CardProps, js.Object, js.Any] {
  def isContainGrid(): js.UndefOr[scala.Nothing] = js.native
  def onTabChange(key: String): Unit = js.native
  def renderCard(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
}

