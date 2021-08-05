package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to notify listeners of data changes.
  *
  * The concrete semantics of a change (i.e. the conditions for when a change event is fired) must be specified in the service description of the
  * providing service.
  * @see XChangeListener
  */
trait XChangeBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive the "changed" event.
    * @param aListener the listener to add.
    * @see com.sun.star.form.XChangeListener
    */
  def addChangeListener(aListener: XChangeListener): Unit
  
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XChangeListener
    */
  def removeChangeListener(aListener: XChangeListener): Unit
}
object XChangeBroadcaster {
  
  inline def apply(
    acquire: () => Unit,
    addChangeListener: XChangeListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChangeListener: XChangeListener => Unit
  ): XChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addChangeListener = js.Any.fromFunction1(addChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangeListener = js.Any.fromFunction1(removeChangeListener))
    __obj.asInstanceOf[XChangeBroadcaster]
  }
  
  extension [Self <: XChangeBroadcaster](x: Self) {
    
    inline def setAddChangeListener(value: XChangeListener => Unit): Self = StObject.set(x, "addChangeListener", js.Any.fromFunction1(value))
    
    inline def setRemoveChangeListener(value: XChangeListener => Unit): Self = StObject.set(x, "removeChangeListener", js.Any.fromFunction1(value))
  }
}
