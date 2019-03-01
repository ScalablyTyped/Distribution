package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Reference Resolved Broadcaster.
  *
  * This interface is used to manipulate reference resolved listener.
  */
trait XReferenceResolvedBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Adds a new reference resolved listener for a element collector.
    *
    * When the element collector has completely collected that element, this listener will receive a notification.
    * @param referenceId the id of the element collector for which the new listener is added
    * @param listener the listener to be added
    */
  def addReferenceResolvedListener(referenceId: scala.Double, listener: XReferenceResolvedListener): scala.Unit
  /**
    * Removes a listener from a element collector.
    *
    * When a listener is removed, it will not receive notification when collection completes.
    * @param referenceId the id of the element collector from which the listener is removed
    * @param listener the listener to be removed
    */
  def removeReferenceResolvedListener(referenceId: scala.Double, listener: XReferenceResolvedListener): scala.Unit
}

object XReferenceResolvedBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addReferenceResolvedListener: js.Function2[scala.Double, XReferenceResolvedListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeReferenceResolvedListener: js.Function2[scala.Double, XReferenceResolvedListener, scala.Unit]
  ): XReferenceResolvedBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addReferenceResolvedListener")(addReferenceResolvedListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeReferenceResolvedListener")(removeReferenceResolvedListener)
    __obj.asInstanceOf[XReferenceResolvedBroadcaster]
  }
}

