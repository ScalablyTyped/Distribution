package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to control an active data source.
  *
  * This interface should be supported by objects which implement {@link XActiveDataSource} or {@link XActiveDataSink} .
  */
trait XActiveDataControl
  extends StObject
     with XInterface {
  
  /**
    * registers an object to receive events from this data source.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def addListener(aListener: XStreamListener): Unit
  
  /**
    * unregisters an object to receive events from this data source.
    *
    * It is suggested to allow multiple registration of the same listener, thus for each time a listener is added, it has to be removed.
    */
  def removeListener(aListener: XStreamListener): Unit
  
  /**
    * starts I/O.
    *
    * Either XActiveDataControl::setInputStream() or XActiveDataControl::setOutputStream() must be called beforehand.
    *
    * This method does not block the thread, so reading is generally not finished when the method returns.
    */
  def start(): Unit
  
  /**
    * does a weak abort.
    *
    * It closes all connected resources and calls XInputStream::close() or XOutputStream::close() and fires the {@link XStreamListener.terminated()} -event.
    */
  def terminate(): Unit
}
object XActiveDataControl {
  
  inline def apply(
    acquire: () => Unit,
    addListener: XStreamListener => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeListener: XStreamListener => Unit,
    start: () => Unit,
    terminate: () => Unit
  ): XActiveDataControl = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addListener = js.Any.fromFunction1(addListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeListener = js.Any.fromFunction1(removeListener), start = js.Any.fromFunction0(start), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[XActiveDataControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XActiveDataControl] (val x: Self) extends AnyVal {
    
    inline def setAddListener(value: XStreamListener => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction1(value))
    
    inline def setRemoveListener(value: XStreamListener => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction1(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    inline def setTerminate(value: () => Unit): Self = StObject.set(x, "terminate", js.Any.fromFunction0(value))
  }
}
