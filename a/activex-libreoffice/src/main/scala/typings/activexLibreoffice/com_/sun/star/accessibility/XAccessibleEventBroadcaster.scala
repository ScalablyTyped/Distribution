package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to register listeners which are called whenever an accessibility event (see {@link AccessibleEventObject} ) occurs.
  * @see AccessibleEventObject
  * @see XAccessibleEventListener
  * @since OOo 1.1.2
  */
@js.native
trait XAccessibleEventBroadcaster extends XInterface {
  
  /** registers the given {@link XAccessibleEventListener} . */
  def addAccessibleEventListener(xListener: XAccessibleEventListener): Unit = js.native
  
  /** unregisters the given {@link XAccessibleEventListener} . */
  def removeAccessibleEventListener(xListener: XAccessibleEventListener): Unit = js.native
}
object XAccessibleEventBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addAccessibleEventListener: XAccessibleEventListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeAccessibleEventListener: XAccessibleEventListener => Unit
  ): XAccessibleEventBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addAccessibleEventListener = js.Any.fromFunction1(addAccessibleEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAccessibleEventListener = js.Any.fromFunction1(removeAccessibleEventListener))
    __obj.asInstanceOf[XAccessibleEventBroadcaster]
  }
  
  @scala.inline
  implicit class XAccessibleEventBroadcasterMutableBuilder[Self <: XAccessibleEventBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddAccessibleEventListener(value: XAccessibleEventListener => Unit): Self = StObject.set(x, "addAccessibleEventListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAccessibleEventListener(value: XAccessibleEventListener => Unit): Self = StObject.set(x, "removeAccessibleEventListener", js.Any.fromFunction1(value))
  }
}
