package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the root event class for all component-level input events.
  *
  * Input events are delivered to listeners before they are processed normally by the source where they originated.
  * @see WindowEvent
  */
trait InputEvent extends EventObject {
  /**
    * contains the modifier keys which were pressed while the event occurred.
    *
    * Zero or more constants from the {@link com.sun.star.awt.KeyModifier} group.
    */
  var Modifiers: Double
}

object InputEvent {
  @scala.inline
  def apply(Modifiers: Double, Source: XInterface): InputEvent = {
    val __obj = js.Dynamic.literal(Modifiers = Modifiers, Source = Source)
  
    __obj.asInstanceOf[InputEvent]
  }
}

