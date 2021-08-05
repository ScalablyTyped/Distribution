package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives events about print job progress.
  *
  * {@link XPrintJobListener} can be registered to {@link XPrintJobBroadcaster} . Then, the client object will be notified when a new print job starts or
  * its state changes.
  * @see XPrintJobBroadcaster
  * @see XPrintJob
  * @since OOo 1.1.2
  */
trait XPrintJobListener
  extends StObject
     with XEventListener {
  
  /**
    * informs the user about the creation or the progress of a PrintJob
    * @param Event contains the {@link XPrintJob} having changed state and the new state.
    */
  def printJobEvent(Event: PrintJobEvent): Unit
}
object XPrintJobListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    printJobEvent: PrintJobEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPrintJobListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), printJobEvent = js.Any.fromFunction1(printJobEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPrintJobListener]
  }
  
  extension [Self <: XPrintJobListener](x: Self) {
    
    inline def setPrintJobEvent(value: PrintJobEvent => Unit): Self = StObject.set(x, "printJobEvent", js.Any.fromFunction1(value))
  }
}
