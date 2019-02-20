package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to add and remove {@link XActivationEventListener}
  * @since OOo 2.0
  */
trait XActivationBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows a component supporting the {@link XActivationEventListener} interface to register as listener. The component will be notified with a {@link
    * ActivationEvent} every time the active sheet changes.
    * @param aListener the component that is to be added as listener
    * @see XActivationEventListener
    * @see ActivationEvent
    */
  def addActivationEventListener(aListener: XActivationEventListener): scala.Unit
  /**
    * removes a previously registered listener.
    * @param aListener the component that is to be removed
    */
  def removeActivationEventListener(aListener: XActivationEventListener): scala.Unit
}

