package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Signature Collector.
  *
  * This interface is used to control collecting a signature.
  */
trait XReferenceCollector extends XInterface {
  /**
    * Sets the reference count of the signature.
    * @param count the reference count of the signature
    */
  def setReferenceCount(count: Double): Unit
  /**
    * Set the keeper id of the element collector of the referenced element.
    * @param id the keeper id of the element collector, which is collecting a referenced element
    */
  def setReferenceId(id: Double): Unit
}

object XReferenceCollector {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setReferenceCount: Double => Unit,
    setReferenceId: Double => Unit
  ): XReferenceCollector = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setReferenceCount = js.Any.fromFunction1(setReferenceCount), setReferenceId = js.Any.fromFunction1(setReferenceId))
  
    __obj.asInstanceOf[XReferenceCollector]
  }
}

