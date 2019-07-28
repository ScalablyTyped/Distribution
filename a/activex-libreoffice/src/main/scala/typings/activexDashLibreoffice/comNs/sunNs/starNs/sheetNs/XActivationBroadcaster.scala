package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to add and remove {@link XActivationEventListener}
  * @since OOo 2.0
  */
trait XActivationBroadcaster extends XInterface {
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
}

