package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides handling of array formulas in a cell range. */
trait XArrayFormulaRange extends XInterface {
  /** returns the array formula of the range or an empty string, if the range does not contain an array formula. */
  var ArrayFormula: String
  /** returns the array formula of the range or an empty string, if the range does not contain an array formula. */
  def getArrayFormula(): String
  /**
    * applies the array formula to the entire cell range.
    * @param aFormula the formula that will be applied as array formula. Passing an empty string erases an existing array formula.
    */
  def setArrayFormula(aFormula: String): Unit
}

object XArrayFormulaRange {
  @scala.inline
  def apply(
    ArrayFormula: String,
    acquire: () => Unit,
    getArrayFormula: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setArrayFormula: String => Unit
  ): XArrayFormulaRange = {
    val __obj = js.Dynamic.literal(ArrayFormula = ArrayFormula, acquire = js.Any.fromFunction0(acquire), getArrayFormula = js.Any.fromFunction0(getArrayFormula), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setArrayFormula = js.Any.fromFunction1(setArrayFormula))
  
    __obj.asInstanceOf[XArrayFormulaRange]
  }
}

