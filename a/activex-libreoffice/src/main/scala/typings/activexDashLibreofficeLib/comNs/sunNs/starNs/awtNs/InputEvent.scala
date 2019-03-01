package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the root event class for all component-level input events.
  *
  * Input events are delivered to listeners before they are processed normally by the source where they originated.
  * @see WindowEvent
  */
trait InputEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * contains the modifier keys which were pressed while the event occurred.
    *
    * Zero or more constants from the {@link com.sun.star.awt.KeyModifier} group.
    */
  var Modifiers: scala.Double
}

object InputEvent {
  @scala.inline
  def apply(Modifiers: scala.Double, Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): InputEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Modifiers")(Modifiers)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[InputEvent]
  }
}

