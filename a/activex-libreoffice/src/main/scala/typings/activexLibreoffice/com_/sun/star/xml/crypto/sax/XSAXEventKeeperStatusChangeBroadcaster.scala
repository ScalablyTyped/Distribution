package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of {@link SAXEventKeeper} Status Change Broadcaster.
  *
  * This interface is used to manipulate {@link SAXEventKeeper} status change listener.
  */
trait XSAXEventKeeperStatusChangeBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * Adds a new status change listener.
    *
    * When the {@link SAXEventKeeper} 's status changes, the listener will receive a notification.
    * @param listener the listener to be added
    */
  def addSAXEventKeeperStatusChangeListener(listener: XSAXEventKeeperStatusChangeListener): Unit
  
  /**
    * Removes a status change listener.
    *
    * After a listener is removed, no status change notification will be sent to it.
    * @param listener the listener to be removed
    */
  def removeSAXEventKeeperStatusChangeListener(listener: XSAXEventKeeperStatusChangeListener): Unit
}
object XSAXEventKeeperStatusChangeBroadcaster {
  
  inline def apply(
    acquire: () => Unit,
    addSAXEventKeeperStatusChangeListener: XSAXEventKeeperStatusChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSAXEventKeeperStatusChangeListener: XSAXEventKeeperStatusChangeListener => Unit
  ): XSAXEventKeeperStatusChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSAXEventKeeperStatusChangeListener = js.Any.fromFunction1(addSAXEventKeeperStatusChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSAXEventKeeperStatusChangeListener = js.Any.fromFunction1(removeSAXEventKeeperStatusChangeListener))
    __obj.asInstanceOf[XSAXEventKeeperStatusChangeBroadcaster]
  }
  
  extension [Self <: XSAXEventKeeperStatusChangeBroadcaster](x: Self) {
    
    inline def setAddSAXEventKeeperStatusChangeListener(value: XSAXEventKeeperStatusChangeListener => Unit): Self = StObject.set(x, "addSAXEventKeeperStatusChangeListener", js.Any.fromFunction1(value))
    
    inline def setRemoveSAXEventKeeperStatusChangeListener(value: XSAXEventKeeperStatusChangeListener => Unit): Self = StObject.set(x, "removeSAXEventKeeperStatusChangeListener", js.Any.fromFunction1(value))
  }
}
