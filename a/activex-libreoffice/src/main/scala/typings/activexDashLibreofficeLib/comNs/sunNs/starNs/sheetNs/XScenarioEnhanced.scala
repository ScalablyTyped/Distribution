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

