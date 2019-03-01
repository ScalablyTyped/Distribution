package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chart2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to set a default size. This size will be used in case no further information si available. */
trait XDefaultSizeTransmitter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * set a default size
    * @param aSize100ThMm specifies a size in hundredth mm.
    */
  def setDefaultSize(aSize100ThMm: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size): scala.Unit
}

object XDefaultSizeTransmitter {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDefaultSize: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size, scala.Unit]
  ): XDefaultSizeTransmitter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setDefaultSize")(setDefaultSize)
    __obj.asInstanceOf[XDefaultSizeTransmitter]
  }
}

