package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface provides access to an XPropertySet of defaults. This can either be the parent of an XPropertySet or the global property defaults for a
  * document.
  */
trait XDefaultsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** This method returns an XPropertySet of defaults. */
  val Defaults: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /** This method returns an XPropertySet of defaults. */
  def getDefaults(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XDefaultsSupplier {
  @scala.inline
  def apply(
    Defaults: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getDefaults: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDefaultsSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Defaults")(Defaults)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getDefaults")(getDefaults)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XDefaultsSupplier]
  }
}

