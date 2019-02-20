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

