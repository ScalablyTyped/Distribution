package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interface to tunnel UNO. This means providing access to data or something else, which is not specified by UNO-IDL.
  *
  *
  *
  * Common usage: Getting a C++ object pointer in the same process, thus to use an implementation directly, most often because of a design flaw.
  */
trait XUnoTunnel
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Call this method to get something which is not specified in UNO, e.g. an address to some C++ object.
    * @param aIdentifier identifier
    * @returns something
    */
  def getSomething(aIdentifier: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Double
}

object XUnoTunnel {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getSomething: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XUnoTunnel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getSomething")(getSomething)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XUnoTunnel]
  }
}

