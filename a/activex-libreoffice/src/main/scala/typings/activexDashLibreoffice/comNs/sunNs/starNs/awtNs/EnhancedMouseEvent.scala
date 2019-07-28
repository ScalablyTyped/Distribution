package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
  var Target: XInterface
}

object EnhancedMouseEvent {
  @scala.inline
  def apply(
    Buttons: Double,
    ClickCount: Double,
    Modifiers: Double,
    PopupTrigger: Boolean,
    Source: XInterface,
    Target: XInterface,
    X: Double,
    Y: Double
  ): EnhancedMouseEvent = {
    val __obj = js.Dynamic.literal(Buttons = Buttons, ClickCount = ClickCount, Modifiers = Modifiers, PopupTrigger = PopupTrigger, Source = Source, Target = Target, X = X, Y = Y)
  
    __obj.asInstanceOf[EnhancedMouseEvent]
  }
}

