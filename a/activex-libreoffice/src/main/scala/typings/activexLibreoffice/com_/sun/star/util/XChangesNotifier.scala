package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts events about multiple changes that occur in bulk.
  * @see XChangesListener
  * @see XChangesBatch
  * @see ChangesEvent
  */
trait XChangesNotifier
  extends StObject
     with XInterface {
  
  /** adds the specified listener to receive events when changes occurred. */
  def addChangesListener(aListener: XChangesListener): Unit
  
  /** removes the specified listener. */
  def removeChangesListener(aListener: XChangesListener): Unit
}
object XChangesNotifier {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addChangesListener: XChangesListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChangesListener: XChangesListener => Unit
  ): XChangesNotifier = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addChangesListener = js.Any.fromFunction1(addChangesListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChangesListener = js.Any.fromFunction1(removeChangesListener))
    __obj.asInstanceOf[XChangesNotifier]
  }
  
  @scala.inline
  implicit class XChangesNotifierMutableBuilder[Self <: XChangesNotifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddChangesListener(value: XChangesListener => Unit): Self = StObject.set(x, "addChangesListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveChangesListener(value: XChangesListener => Unit): Self = StObject.set(x, "removeChangesListener", js.Any.fromFunction1(value))
  }
}
