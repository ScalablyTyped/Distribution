package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the print progress of an {@link XPrintable} .
  *
  * {@link com.sun.star.lang.EventObject.Source} contains the {@link XPrintable} having changed its state
  *
  * .
  */
trait PrintableStateEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  var State: PrintableState
}

object PrintableStateEvent {
  @scala.inline
  def apply(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, State: PrintableState): PrintableStateEvent = {
    val __obj = js.Dynamic.literal(Source = Source, State = State)
  
    __obj.asInstanceOf[PrintableStateEvent]
  }
}

