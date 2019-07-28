package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a scenario sheet.
  * @see com.sun.star.sheet.Spreadsheet
  */
trait XScenario extends XInterface {
  /** returns `TRUE` if the current object is a scenario. */
  val IsScenario: Boolean
  /** returns the comment for the scenario. */
  var ScenarioComment: String
  /** adds more ranges to the scenario. */
  def addRanges(aRanges: SeqEquiv[CellRangeAddress]): Unit
  /**
    * applies the scenario.
    *
    * The contents of the scenario ranges are copied into the first non-scenario sheet which is in front of the sheet containing the scenario by itself.
    */
  @JSName("apply")
  def apply(): Unit
  /** returns `TRUE` if the current object is a scenario. */
  def getIsScenario(): Boolean
  /** returns the comment for the scenario. */
  def getScenarioComment(): String
  /** sets a new comment for the scenario. */
  def setScenarioComment(aScenarioComment: String): Unit
}

object XScenario {
  @scala.inline
  def apply(
    IsScenario: Boolean,
    ScenarioComment: String,
    acquire: () => Unit,
    addRanges: SeqEquiv[CellRangeAddress] => Unit,
    apply: () => Unit,
    getIsScenario: () => Boolean,
    getScenarioComment: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setScenarioComment: String => Unit
  ): XScenario = {
    val __obj = js.Dynamic.literal(IsScenario = IsScenario, ScenarioComment = ScenarioComment, acquire = js.Any.fromFunction0(acquire), addRanges = js.Any.fromFunction1(addRanges), apply = js.Any.fromFunction0(apply), getIsScenario = js.Any.fromFunction0(getIsScenario), getScenarioComment = js.Any.fromFunction0(getScenarioComment), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setScenarioComment = js.Any.fromFunction1(setScenarioComment))
  
    __obj.asInstanceOf[XScenario]
  }
}

