package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functionality to reset components to some default values.
  *
  * The semantics of **default value** depends on the providing service.
  */
trait XReset
  extends StObject
     with XInterface {
  
  /**
    * adds the specified listener to receive events related to resetting the component.
    * @param aListener the listener to add.
    */
  def addResetListener(aListener: XResetListener): Unit
  
  /**
    * removes the specified listener
    * @param aListener the listener to remove
    */
  def removeResetListener(aListener: XResetListener): Unit
  
  /** resets a component to some default value. */
  def reset(): Unit
}
object XReset {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addResetListener: XResetListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeResetListener: XResetListener => Unit,
    reset: () => Unit
  ): XReset = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addResetListener = js.Any.fromFunction1(addResetListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeResetListener = js.Any.fromFunction1(removeResetListener), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[XReset]
  }
  
  @scala.inline
  implicit class XResetMutableBuilder[Self <: XReset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddResetListener(value: XResetListener => Unit): Self = StObject.set(x, "addResetListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveResetListener(value: XResetListener => Unit): Self = StObject.set(x, "removeResetListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
