package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
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
trait XScenarioEnhanced extends XInterface {
  /** gets the ranges to the scenario. */
  val Ranges: SafeArray[CellRangeAddress]
  /** gets the ranges to the scenario. */
  def getRanges(): SafeArray[CellRangeAddress]
}

object XScenarioEnhanced {
  @scala.inline
  def apply(
    Ranges: SafeArray[CellRangeAddress],
    acquire: () => Unit,
    getRanges: () => SafeArray[CellRangeAddress],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScenarioEnhanced = {
    val __obj = js.Dynamic.literal(Ranges = Ranges, acquire = js.Any.fromFunction0(acquire), getRanges = js.Any.fromFunction0(getRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XScenarioEnhanced]
  }
}

