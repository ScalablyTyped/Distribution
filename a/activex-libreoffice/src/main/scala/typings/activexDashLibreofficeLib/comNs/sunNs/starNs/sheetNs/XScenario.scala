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
    acquire: js.Function0[scala.Unit],
    addRanges: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress], 
      scala.Unit
    ],
    apply: js.Function0[scala.Unit],
    getIsScenario: js.Function0[scala.Boolean],
    getScenarioComment: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setScenarioComment: js.Function1[java.lang.String, scala.Unit]
  ): XScenario = {
    val __obj = js.Dynamic.literal(IsScenario = IsScenario, ScenarioComment = ScenarioComment, acquire = acquire, addRanges = addRanges, apply = apply, getIsScenario = getIsScenario, getScenarioComment = getScenarioComment, queryInterface = queryInterface, release = release, setScenarioComment = setScenarioComment)
  
    __obj.asInstanceOf[XScenario]
  }
}

