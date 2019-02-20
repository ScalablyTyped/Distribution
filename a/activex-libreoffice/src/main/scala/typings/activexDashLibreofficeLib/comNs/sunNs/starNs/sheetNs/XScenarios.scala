package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access via name to the scenarios in a collection and inserting and removing scenarios.
  * @see com.sun.star.sheet.Scenarios
  * @see com.sun.star.sheet.Spreadsheet
  */
trait XScenarios
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess {
  /**
    * creates a new scenario and adds it to the collection.
    * @param aName the name of the scenario (used i.e. for collection access).
    * @param aRanges the cell ranges contained in the scenario.
    * @param aComment the user defined comment for the scenario.
    */
  def addNewByName(
    aName: java.lang.String,
    aRanges: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    aComment: java.lang.String
  ): scala.Unit
  /** removes a scenario from the collection. */
  def removeByName(aName: java.lang.String): scala.Unit
}

