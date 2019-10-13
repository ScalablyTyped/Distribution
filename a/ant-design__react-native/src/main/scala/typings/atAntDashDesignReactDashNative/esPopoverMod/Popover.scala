package typings.atAntDashDesignReactDashNative.esPopoverMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Popover
  extends Component[PopoverProps, js.Any, js.Any] {
  def onSelect(value: js.Any, closePopover: js.Any): Unit = js.native
  def renderOverlay(closePopover: js.Any): js.UndefOr[js.Object | Null] = js.native
}

