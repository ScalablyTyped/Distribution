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

