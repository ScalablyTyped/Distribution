package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Reference Resolved Listener.
  *
  * This interface is used to receive the collection completion notification for a element collector.
  */
trait XReferenceResolvedListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Notifies an element has been collected by an element collector.
    * @param referenceId the id of the element collector
    */
  def referenceResolved(referenceId: scala.Double): scala.Unit
}

object XReferenceResolvedListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    referenceResolved: js.Function1[scala.Double, scala.Unit],
    release: js.Function0[scala.Unit]
  ): XReferenceResolvedListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("referenceResolved")(referenceResolved)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XReferenceResolvedListener]
  }
}

