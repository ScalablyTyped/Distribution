package typings.antd.rateMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rate
  extends Component[RateProps, js.Any, js.Any] {
  var rcRate: js.Any = js.native
  def blur(): Unit = js.native
  def characterRender(node: ReactElement, hasIndex: RateNodeProps): Element = js.native
  def focus(): Unit = js.native
  def renderRate(hasGetPrefixClsDirection: ConfigConsumerProps): Element = js.native
  def saveRate(node: js.Any): Unit = js.native
}

