package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Signature Collector.
  *
  * This interface is used to control collecting a signature.
  */
trait XReferenceCollector
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Sets the reference count of the signature.
    * @param count the reference count of the signature
    */
  def setReferenceCount(count: scala.Double): scala.Unit
  /**
    * Set the keeper id of the element collector of the referenced element.
    * @param id the keeper id of the element collector, which is collecting a referenced element
    */
  def setReferenceId(id: scala.Double): scala.Unit
}

