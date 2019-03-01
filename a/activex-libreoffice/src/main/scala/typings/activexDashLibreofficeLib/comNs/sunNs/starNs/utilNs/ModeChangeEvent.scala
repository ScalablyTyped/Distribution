package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to veto changes in an object's internal mode.
  * @see XModeChangeBroadcaster
  * @see XModeChangeListener
  * @since OOo 1.1.2
  */
trait ModeChangeEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * denotes the new internal mode of a component
    *
    * The semantics of the mode string is to be defined by the component broadcasting this event.
    */
  var NewMode: java.lang.String
}

object ModeChangeEvent {
  @scala.inline
  def apply(NewMode: java.lang.String, Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): ModeChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("NewMode")(NewMode)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[ModeChangeEvent]
  }
}

