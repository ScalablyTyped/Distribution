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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    transmit: js.Function3[java.lang.String, java.lang.String, scala.Double, scala.Unit]
  ): XContentTransmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("transmit")(transmit)
    __obj.asInstanceOf[XContentTransmitter]
  }
}

