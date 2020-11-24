package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents something that can recalculate. */
@js.native
trait XCalculatable extends XInterface {
  
  /**
    * recalculates all dirty cells.
    *
    * This calculates all formula cells which have not yet been calculated after their precedents have changed.
    */
  def calculate(): Unit = js.native
  
  /** recalculates all cells. */
  def calculateAll(): Unit = js.native
  
  /**
    * enables automatic calculation.
    *
    * With automatic calculation, each formula cell is recalculated whenever its value is needed after its precedents have changed. The value is needed if
    * the cell is displayed or used in another calculation.
    * @param bEnabled `TRUE` to enable automatic calculation, `FALSE` to disable.
    */
  def enableAutomaticCalculation(bEnabled: Boolean): Unit = js.native
  
  /**
    * returns whether automatic calculation is enabled.
    *
    * With automatic calculation, each formula cell is recalculated whenever its value is needed after its precedents have changed. The value is needed if
    * the cell is displayed or used in another calculation.
    * @returns `TRUE` , if automatic calculation is enabled.
    */
  def isAutomaticCalculationEnabled(): Boolean = js.native
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
  
  @scala.inline
  implicit class XCalculatableOps[Self <: XCalculatable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCalculate(value: () => Unit): Self = this.set("calculate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCalculateAll(value: () => Unit): Self = this.set("calculateAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnableAutomaticCalculation(value: Boolean => Unit): Self = this.set("enableAutomaticCalculation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsAutomaticCalculationEnabled(value: () => Boolean): Self = this.set("isAutomaticCalculationEnabled", js.Any.fromFunction0(value))
  }
}
