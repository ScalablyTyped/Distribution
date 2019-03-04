package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** offers printing related settings, which affect document rendering, but are not related to the printer itself. */
trait XPrintSettingsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns a set of properties which are related to printing.
    * @see PrintSettings
    */
  val PrintSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns a set of properties which are related to printing.
    * @see PrintSettings
    */
  def getPrintSettings(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object XPrintSettingsSupplier {
  @scala.inline
  def apply(
    PrintSettings: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    acquire: js.Function0[scala.Unit],
    getPrintSettings: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XPrintSettingsSupplier = {
    val __obj = js.Dynamic.literal(PrintSettings = PrintSettings, acquire = acquire, getPrintSettings = getPrintSettings, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XPrintSettingsSupplier]
  }
}

