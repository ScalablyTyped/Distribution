package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @author Dirk Voelzke
  * @deprecated Deprecated
  * @see
  * @version 1.0
  */
trait XContentTransmitter extends XInterface {
  def transmit(Source: String, Destination: String, Flags: Double): Unit
}

object XContentTransmitter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    transmit: (String, String, Double) => Unit
  ): XContentTransmitter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), transmit = js.Any.fromFunction3(transmit))
  
    __obj.asInstanceOf[XContentTransmitter]
  }
}

