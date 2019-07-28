package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Key Collector.
  *
  * This interface is used to manipulate key materials.
  */
trait XKeyCollector extends XInterface {
  /**
    * Set the keeper id of the key element.
    * @param id the keeper id of the key element. If the id is 0, then it represents that this security entity has included its key material internally.
    */
  def setKeyId(id: Double): Unit
}

object XKeyCollector {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setKeyId: Double => Unit
  ): XKeyCollector = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setKeyId = js.Any.fromFunction1(setKeyId))
  
    __obj.asInstanceOf[XKeyCollector]
  }
}

