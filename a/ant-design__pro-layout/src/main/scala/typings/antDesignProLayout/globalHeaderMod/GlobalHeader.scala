package typings.antDesignProLayout.globalHeaderMod

import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalHeader
  extends Component[GlobalHeaderProps, js.Object, js.Any] {
  def renderCollapsedButton(): Element | Null = js.native
  def toggle(): Unit = js.native
  def triggerResizeEvent(): Unit = js.native
}

