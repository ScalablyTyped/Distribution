package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides enhanced access to the settings of a scenario sheet.
  * @see com.sun.star.sheet.Spreadsheet
  * @see com.sun.star.sheet.Scenario
  * @see com.sun.star.sheet.XScenario
  * @since OOo 2.0
  */
trait XScenarioEnhanced
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** gets the ranges to the scenario. */
  val Ranges: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
  /** gets the ranges to the scenario. */
  def getRanges(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
}

object XScenarioEnhanced {
  @scala.inline
  def apply(
    Ranges: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    acquire: js.Function0[scala.Unit],
    getRanges: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XScenarioEnhanced = {
    val __obj = js.Dynamic.literal(Ranges = Ranges, acquire = acquire, getRanges = getRanges, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XScenarioEnhanced]
  }
}

