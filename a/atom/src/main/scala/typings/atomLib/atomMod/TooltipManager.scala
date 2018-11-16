package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipManager extends js.Object {
  /** Add a tooltip to the given element. */
  def add(
    target: JQueryCompatible[stdLib.HTMLElement],
    options: (atomLib.Anon_Item | atomLib.Anon_KeyBindingCommand) with atomLib.Anon_Placement
  ): Disposable = js.native
  /** Add a tooltip to the given element. */
  def add(
    target: stdLib.HTMLElement,
    options: (atomLib.Anon_Item | atomLib.Anon_KeyBindingCommand) with atomLib.Anon_Placement
  ): Disposable = js.native
  /** Find the tooltips that have been applied to the given element. */
  def findTooltips(target: stdLib.HTMLElement): js.Array[Tooltip] = js.native
}

