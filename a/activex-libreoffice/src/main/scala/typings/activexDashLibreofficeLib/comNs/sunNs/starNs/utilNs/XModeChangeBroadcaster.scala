package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts changes in an object's internal mode.
  * @see XModeSelector
  * @see XModeChangeListener
  * @see XModeChangeApproveListener
  * @since OOo 1.1.2
  */
trait XModeChangeBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the given listener to the list of components to be notified when the mode is about to change.
    * @throws com::sun::star::lang::NoSupportException if the component does not allow vetoing mode changes
    */
  def addModeChangeApproveListener(rxListener: XModeChangeApproveListener): scala.Unit
  /** adds the given listener to the list of components to be notified when the mode changes. */
  def addModeChangeListener(rxListener: XModeChangeListener): scala.Unit
  /**
    * remove the given listener from the list of components to be notified when the mode is about to change.
    * @throws com::sun::star::lang::NoSupportException if the component does not allow vetoing mode changes
    */
  def removeModeChangeApproveListener(rxListener: XModeChangeApproveListener): scala.Unit
  /** removes the given listener from the list of components to be notified when the mode changes. */
  def removeModeChangeListener(rxListener: XModeChangeListener): scala.Unit
}

object XModeChangeBroadcaster {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addModeChangeApproveListener: XModeChangeApproveListener => scala.Unit,
    addModeChangeListener: XModeChangeListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeModeChangeApproveListener: XModeChangeApproveListener => scala.Unit,
    removeModeChangeListener: XModeChangeListener => scala.Unit
  ): XModeChangeBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addModeChangeApproveListener = js.Any.fromFunction1(addModeChangeApproveListener), addModeChangeListener = js.Any.fromFunction1(addModeChangeListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeModeChangeApproveListener = js.Any.fromFunction1(removeModeChangeApproveListener), removeModeChangeListener = js.Any.fromFunction1(removeModeChangeListener))
  
    __obj.asInstanceOf[XModeChangeBroadcaster]
  }
}

