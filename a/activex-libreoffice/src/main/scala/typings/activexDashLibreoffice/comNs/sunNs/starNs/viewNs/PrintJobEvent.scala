package typings.activexDashLibreoffice.comNs.sunNs.starNs.viewNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the print progress of an {@link XPrintJob} .
  *
  * {@link com.sun.star.lang.EventObject.Source} contains the {@link XPrintJob} having changed its state
  *
  * .
  * @since OOo 1.1.2
  */
trait PrintJobEvent extends EventObject {
  var State: PrintableState
}

object PrintJobEvent {
  @scala.inline
  def apply(Source: XInterface, State: PrintableState): PrintJobEvent = {
    val __obj = js.Dynamic.literal(Source = Source, State = State)
  
    __obj.asInstanceOf[PrintJobEvent]
  }
}

