package typings.antDesignReactNative.popoverMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Popover
  extends Component[PopoverProps, js.Any, js.Any] {
  
  def onSelect(value: js.Any, closePopover: js.Any): Unit = js.native
  
  def renderOverlay(closePopover: js.Any): js.UndefOr[js.Object | Null] = js.native
}
