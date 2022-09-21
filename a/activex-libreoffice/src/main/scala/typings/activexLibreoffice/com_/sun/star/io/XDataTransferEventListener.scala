package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to receive callbacks from an importer or exporter. */
trait XDataTransferEventListener
  extends StObject
     with XEventListener {
  
  /** is called when an import or export process has been cancelled. */
  def cancelled(aEvent: DataTransferEvent): Unit
  
  /** is called when an import or export process has finished. */
  def finished(aEvent: DataTransferEvent): Unit
}
object XDataTransferEventListener {
  
  inline def apply(
    acquire: () => Unit,
    cancelled: DataTransferEvent => Unit,
    disposing: EventObject => Unit,
    finished: DataTransferEvent => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XDataTransferEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), cancelled = js.Any.fromFunction1(cancelled), disposing = js.Any.fromFunction1(disposing), finished = js.Any.fromFunction1(finished), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDataTransferEventListener]
  }
  
  extension [Self <: XDataTransferEventListener](x: Self) {
    
    inline def setCancelled(value: DataTransferEvent => Unit): Self = StObject.set(x, "cancelled", js.Any.fromFunction1(value))
    
    inline def setFinished(value: DataTransferEvent => Unit): Self = StObject.set(x, "finished", js.Any.fromFunction1(value))
  }
}
