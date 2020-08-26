package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
@js.native
trait XScenarioEnhanced extends XInterface {
  /** gets the ranges to the scenario. */
  val Ranges: SafeArray[CellRangeAddress] = js.native
  /** gets the ranges to the scenario. */
  def getRanges(): SafeArray[CellRangeAddress] = js.native
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
    val __obj = js.Dynamic.literal(Ranges = Ranges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRanges = js.Any.fromFunction0(getRanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScenarioEnhanced]
  }
  @scala.inline
  implicit class XScenarioEnhancedOps[Self <: XScenarioEnhanced] (val x: Self) extends AnyVal {
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
    def setRanges(value: SafeArray[CellRangeAddress]): Self = this.set("Ranges", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetRanges(value: () => SafeArray[CellRangeAddress]): Self = this.set("getRanges", js.Any.fromFunction0(value))
  }
  
}

