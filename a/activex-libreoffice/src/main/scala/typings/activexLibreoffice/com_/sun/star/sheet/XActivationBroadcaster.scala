package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to add and remove {@link XActivationEventListener}
  * @since OOo 2.0
  */
trait XActivationBroadcaster
  extends StObject
     with XInterface {
  
  /**
    * allows a component supporting the {@link XActivationEventListener} interface to register as listener. The component will be notified with a {@link
    * ActivationEvent} every time the active sheet changes.
    * @param aListener the component that is to be added as listener
    * @see XActivationEventListener
    * @see ActivationEvent
    */
  def addActivationEventListener(aListener: XActivationEventListener): Unit
  
  /**
    * removes a previously registered listener.
    * @param aListener the component that is to be removed
    */
  def removeActivationEventListener(aListener: XActivationEventListener): Unit
}
object XActivationBroadcaster {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addActivationEventListener: XActivationEventListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActivationEventListener: XActivationEventListener => Unit
  ): XActivationBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addActivationEventListener = js.Any.fromFunction1(addActivationEventListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActivationEventListener = js.Any.fromFunction1(removeActivationEventListener))
    __obj.asInstanceOf[XActivationBroadcaster]
  }
  
  @scala.inline
  implicit class XActivationBroadcasterMutableBuilder[Self <: XActivationBroadcaster] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddActivationEventListener(value: XActivationEventListener => Unit): Self = StObject.set(x, "addActivationEventListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveActivationEventListener(value: XActivationEventListener => Unit): Self = StObject.set(x, "removeActivationEventListener", js.Any.fromFunction1(value))
  }
}
