package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @author Dirk Voelzke
  * @deprecated Deprecated
  * @see
  * @version 1.0
  */
trait XContentTransmitter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def transmit(Source: java.lang.String, Destination: java.lang.String, Flags: scala.Double): scala.Unit
}

object XContentTransmitter {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    transmit: (java.lang.String, java.lang.String, scala.Double) => scala.Unit
  ): XContentTransmitter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), transmit = js.Any.fromFunction3(transmit))
  
    __obj.asInstanceOf[XContentTransmitter]
  }
}

