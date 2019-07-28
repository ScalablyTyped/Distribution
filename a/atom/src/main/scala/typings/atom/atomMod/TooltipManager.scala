package typings.atom.atomMod

import typings.atom.Anon_Class
import typings.atom.Anon_Item
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipManager extends js.Object {
  def add(target: JQueryCompatible[HTMLElement], options: Anon_Class): Disposable = js.native
  def add(target: JQueryCompatible[HTMLElement], options: Anon_Item): Disposable = js.native
  def add(target: HTMLElement, options: Anon_Class): Disposable = js.native
  /** Add a tooltip to the given element. */
  def add(target: HTMLElement, options: Anon_Item): Disposable = js.native
  /** Find the tooltips that have been applied to the given element. */
  def findTooltips(target: HTMLElement): js.Array[Tooltip] = js.native
}

