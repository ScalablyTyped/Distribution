package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** broadcasts message in case embedded object object changes it's state. */
trait XStateChangeBroadcaster
  extends StObject
     with XInterface {
  
  /** adds the specified listener to receive events about states change */
  def addStateChangeListener(xListener: XStateChangeListener): Unit
  
  /** removes the specified listener */
  def removeStateChangeListener(xListener: XStateChangeListener): Unit
}
object XStateChangeBroadcaster {
  
  inline def apply(
    acquire: () => Unit,
    addStateChangeListener: XStateChangeListener => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    removeStateChangeListener: XStateChangeListener => Unit
  ): XStateChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addStateChangeListener = js.Any.fromFunction1(addStateChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeStateChangeListener = js.Any.fromFunction1(removeStateChangeListener))
    __obj.asInstanceOf[XStateChangeBroadcaster]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XStateChangeBroadcaster] (val x: Self) extends AnyVal {
    
    inline def setAddStateChangeListener(value: XStateChangeListener => Unit): Self = StObject.set(x, "addStateChangeListener", js.Any.fromFunction1(value))
    
    inline def setRemoveStateChangeListener(value: XStateChangeListener => Unit): Self = StObject.set(x, "removeStateChangeListener", js.Any.fromFunction1(value))
  }
}
