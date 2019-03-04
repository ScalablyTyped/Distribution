package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an event from the mouse.
  * @see MouseEvent
  * @since OOo 2.0
  */
trait EnhancedMouseEvent extends MouseEvent {
  /** contains the object on the location of the mouse. */
  var Target: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

object EnhancedMouseEvent {
  @scala.inline
  def apply(
    Buttons: scala.Double,
    ClickCount: scala.Double,
    Modifiers: scala.Double,
    PopupTrigger: scala.Boolean,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Target: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    X: scala.Double,
    Y: scala.Double
  ): EnhancedMouseEvent = {
    val __obj = js.Dynamic.literal(Buttons = Buttons, ClickCount = ClickCount, Modifiers = Modifiers, PopupTrigger = PopupTrigger, Source = Source, Target = Target, X = X, Y = Y)
  
    __obj.asInstanceOf[EnhancedMouseEvent]
  }
}

