package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents something that can recalculate. */
trait XCalculatable extends XInterface {
  /**
    * recalculates all dirty cells.
    *
    * This calculates all formula cells which have not yet been calculated after their precedents have changed.
    */
  def calculate(): Unit
  /** recalculates all cells. */
  def calculateAll(): Unit
  /**
    * enables automatic calculation.
    *
    * With automatic calculation, each formula cell is recalculated whenever its value is needed after its precedents have changed. The value is needed if
    * the cell is displayed or used in another calculation.
    * @param bEnabled `TRUE` to enable automatic calculation, `FALSE` to disable.
    */
  def enableAutomaticCalculation(bEnabled: Boolean): Unit
  /**
    * returns whether automatic calculation is enabled.
    *
    * With automatic calculation, each formula cell is recalculated whenever its value is needed after its precedents have changed. The value is needed if
    * the cell is displayed or used in another calculation.
    * @returns `TRUE` , if automatic calculation is enabled.
    */
  def isAutomaticCalculationEnabled(): Boolean
}

object XCalculatable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    calculate: () => Unit,
    calculateAll: () => Unit,
    enableAutomaticCalculation: Boolean => Unit,
    isAutomaticCalculationEnabled: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCalculatable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), calculate = js.Any.fromFunction0(calculate), calculateAll = js.Any.fromFunction0(calculateAll), enableAutomaticCalculation = js.Any.fromFunction1(enableAutomaticCalculation), isAutomaticCalculationEnabled = js.Any.fromFunction0(isAutomaticCalculationEnabled), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCalculatable]
  }
}

