package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of parameters, typically used for a prepared statement. */
trait XParametersSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the container of parameters.
    * @returns the parameters
    */
  val Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the container of parameters.
    * @returns the parameters
    */
  def getParameters(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
}

object XParametersSupplier {
  @scala.inline
  def apply(
    Parameters: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    acquire: js.Function0[scala.Unit],
    getParameters: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XParametersSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Parameters")(Parameters)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getParameters")(getParameters)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XParametersSupplier]
  }
}

