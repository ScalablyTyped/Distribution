package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents something that can recalculate. */
trait XCalculatable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * recalculates all dirty cells.
    *
    * This calculates all formula cells which have not yet been calculated after their precedents have changed.
    */
  def calculate(): scala.Unit
  /** recalculates all cells. */
  def calculateAll(): scala.Unit
  /**
    * enables automatic calculation.
    *
    * With automatic calculation, each formula cell is recalculated whenever its value is needed after its precedents have changed. The value is needed if
    * the cell is displayed or used in another calculation.
    * @param bEnabled `TRUE` to enable automatic calculation, `FALSE` to disable.
    */
  def enableAutomaticCalculation(bEnabled: scala.Boolean): scala.Unit
  /**
    * returns whether automatic calculation is enabled.
    *
    * With automatic calculation, each formula cell is recalculated whenever its value is needed after its precedents have changed. The value is needed if
    * the cell is displayed or used in another calculation.
    * @returns `TRUE` , if automatic calculation is enabled.
    */
  def isAutomaticCalculationEnabled(): scala.Boolean
}

object XCalculatable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    calculate: js.Function0[scala.Unit],
    calculateAll: js.Function0[scala.Unit],
    enableAutomaticCalculation: js.Function1[scala.Boolean, scala.Unit],
    isAutomaticCalculationEnabled: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCalculatable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("calculate")(calculate)
    __obj.updateDynamic("calculateAll")(calculateAll)
    __obj.updateDynamic("enableAutomaticCalculation")(enableAutomaticCalculation)
    __obj.updateDynamic("isAutomaticCalculationEnabled")(isAutomaticCalculationEnabled)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCalculatable]
  }
}

