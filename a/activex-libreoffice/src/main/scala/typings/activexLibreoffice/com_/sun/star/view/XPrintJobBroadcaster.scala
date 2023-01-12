package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows for getting information about a print job.
  *
  * {@link XPrintJobBroadcaster} can be implemented by classes which implement {@link XPrintable} . It allows a {@link XPrintJobListener} to be
  * registered, thus a client object will learn about the print progress.
  * @see XPrintJobListener
  * @since OOo 1.1.2
  */
trait XPrintJobBroadcaster
  extends StObject
     with XInterface {
  
  /** adds an {@link XPrintJobListener} to be notified about print progress. */
  def addPrintJobListener(xListener: XPrintJobListener): Unit
  
  /** removes an {@link XPrintJobListener} . */
  def removePrintJobListener(xListener: XPrintJobListener): Unit
}
object XPrintJobBroadcaster {
  
  inline def apply(
    acquire: () => Unit,
    addPrintJobListener: XPrintJobListener => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePrintJobListener: XPrintJobListener => Unit
  ): XPrintJobBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addPrintJobListener = js.Any.fromFunction1(addPrintJobListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePrintJobListener = js.Any.fromFunction1(removePrintJobListener))
    __obj.asInstanceOf[XPrintJobBroadcaster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XPrintJobBroadcaster] (val x: Self) extends AnyVal {
    
    inline def setAddPrintJobListener(value: XPrintJobListener => Unit): Self = StObject.set(x, "addPrintJobListener", js.Any.fromFunction1(value))
    
    inline def setRemovePrintJobListener(value: XPrintJobListener => Unit): Self = StObject.set(x, "removePrintJobListener", js.Any.fromFunction1(value))
  }
}
