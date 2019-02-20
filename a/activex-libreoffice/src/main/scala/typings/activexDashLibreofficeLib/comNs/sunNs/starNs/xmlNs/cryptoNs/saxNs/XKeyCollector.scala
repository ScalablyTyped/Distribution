package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of Key Collector.
  *
  * This interface is used to manipulate key materials.
  */
trait XKeyCollector
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Set the keeper id of the key element.
    * @param id the keeper id of the key element. If the id is 0, then it represents that this security entity has included its key material internally.
    */
  def setKeyId(id: scala.Double): scala.Unit
}

