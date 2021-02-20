package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the broadcaster interface for sending "approveUpdate" and "updated" events.
  *
  * The component supporting this interface must do approval calls ( {@link XUpdateListener.approveUpdate()} ) immediately before the data is updated, and
  * notification calls ( {@link XUpdateListener.updated()} ) immediately afterwards.
  * @see XUpdateListener
  */
@js.native
trait XUpdateBroadcaster extends XInterface {
  
  /**
    * adds the specified listener to receive the events "approveUpdate" and "updated".
    * @param aListener the listener to add.
    * @see com.sun.star.form.XUpdateListener
    */
  def addUpdateListener(aListener: XUpdateListener): Unit = js.native
  
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XUpdateListener
    */
  def removeUpdateListener(aListener: XUpdateListener): Unit = js.native
}
object XUpdateBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addUpdateListener: XUpdateListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeUpdateListener: XUpdateListener => Unit
  ): XUpdateBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addUpdateListener = js.Any.fromFunction1(addUpdateListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeUpdateListener = js.Any.fromFunction1(removeUpdateListener))
    __obj.asInstanceOf[XUpdateBroadcaster]
  }
  
  @scala.inline
  implicit class XUpdateBroadcasterMutableBuilder[Self <: XUpdateBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddUpdateListener(value: XUpdateListener => Unit): Self = StObject.set(x, "addUpdateListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUpdateListener(value: XUpdateListener => Unit): Self = StObject.set(x, "removeUpdateListener", js.Any.fromFunction1(value))
  }
}
