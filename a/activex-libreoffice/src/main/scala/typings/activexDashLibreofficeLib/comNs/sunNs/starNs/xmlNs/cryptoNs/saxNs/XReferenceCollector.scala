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

object XReferenceCollector {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setReferenceCount: js.Function1[scala.Double, scala.Unit],
    setReferenceId: js.Function1[scala.Double, scala.Unit]
  ): XReferenceCollector = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, setReferenceCount = setReferenceCount, setReferenceId = setReferenceId)
  
    __obj.asInstanceOf[XReferenceCollector]
  }
}

