package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tooltip extends js.Object {
  val element: stdLib.HTMLElement
  val enabled: scala.Boolean
  val hoverState: atomLib.atomLibStrings.in | atomLib.atomLibStrings.out | scala.Null
  val options: TooltipOptions
  val timeout: scala.Double
  def disable(): scala.Unit
  def enable(): scala.Unit
  def getArrowElement(): stdLib.HTMLElement
  def getTitle(): java.lang.String
  def getTooltipElement(): stdLib.HTMLElement
  def recalculatePosition(): scala.Unit
  def toggle(): scala.Unit
  def toggleEnabled(): scala.Unit
}

