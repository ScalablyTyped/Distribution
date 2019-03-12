package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a scenario sheet.
  * @see com.sun.star.sheet.Spreadsheet
  */
trait XScenario
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns `TRUE` if the current object is a scenario. */
  val IsScenario: scala.Boolean
  /** returns the comment for the scenario. */
  var ScenarioComment: java.lang.String
  /** adds more ranges to the scenario. */
  def addRanges(
    aRanges: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
  ): scala.Unit
  /**
    * applies the scenario.
    *
    * The contents of the scenario ranges are copied into the first non-scenario sheet which is in front of the sheet containing the scenario by itself.
    */
  @JSName("apply")
  def apply(): scala.Unit
  /** returns `TRUE` if the current object is a scenario. */
  def getIsScenario(): scala.Boolean
  /** returns the comment for the scenario. */
  def getScenarioComment(): java.lang.String
  /** sets a new comment for the scenario. */
  def setScenarioComment(aScenarioComment: java.lang.String): scala.Unit
}

object XScenario {
  @scala.inline
  def apply(
    IsScenario: scala.Boolean,
    ScenarioComment: java.lang.String,
    acquire: () => scala.Unit,
    addRanges: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress] => scala.Unit,
    apply: () => scala.Unit,
    getIsScenario: () => scala.Boolean,
    getScenarioComment: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setScenarioComment: java.lang.String => scala.Unit
  ): XScenario = {
    val __obj = js.Dynamic.literal(IsScenario = IsScenario, ScenarioComment = ScenarioComment, acquire = js.Any.fromFunction0(acquire), addRanges = js.Any.fromFunction1(addRanges), apply = js.Any.fromFunction0(apply), getIsScenario = js.Any.fromFunction0(getIsScenario), getScenarioComment = js.Any.fromFunction0(getScenarioComment), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setScenarioComment = js.Any.fromFunction1(setScenarioComment))
  
    __obj.asInstanceOf[XScenario]
  }
}

