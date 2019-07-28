package typings.antdDashMobile.libProgressMod

import typings.react.reactMod.Component
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress
  extends Component[ProgressProps, js.Any, js.Any] {
  var barRef: HTMLDivElement | Null = js.native
  var noAppearTransition: js.Any = js.native
  @JSName("componentDidMount")
  def componentDidMount_MProgress(): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MProgress(): Unit = js.native
}

