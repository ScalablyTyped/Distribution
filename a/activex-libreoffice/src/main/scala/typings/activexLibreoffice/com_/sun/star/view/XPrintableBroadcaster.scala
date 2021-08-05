package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows for getting information about a print job.
  *
  * {@link XPrintableBroadcaster} can be implemented by classes which implement {@link XPrintable} . It allows a {@link XPrintableListener} to be
  * registered, thus a client object will learn about the print progress.
  * @see XPrintableListener
  */
trait XPrintableBroadcaster
  extends StObject
     with XInterface {
  
  /** adds an {@link XPrintableListener} to be notified about print progress. */
  def addPrintableListener(xListener: XPrintableListener): Unit
  
  /** removes an {@link XPrintableListener} . */
  def removePrintableListener(xListener: XPrintableListener): Unit
}
object XPrintableBroadcaster {
  
  inline def apply(
    acquire: () => Unit,
    addPrintableListener: XPrintableListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePrintableListener: XPrintableListener => Unit
  ): XPrintableBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPrintableListener = js.Any.fromFunction1(addPrintableListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePrintableListener = js.Any.fromFunction1(removePrintableListener))
    __obj.asInstanceOf[XPrintableBroadcaster]
  }
  
  extension [Self <: XPrintableBroadcaster](x: Self) {
    
    inline def setAddPrintableListener(value: XPrintableListener => Unit): Self = StObject.set(x, "addPrintableListener", js.Any.fromFunction1(value))
    
    inline def setRemovePrintableListener(value: XPrintableListener => Unit): Self = StObject.set(x, "removePrintableListener", js.Any.fromFunction1(value))
  }
}
