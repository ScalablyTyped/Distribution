package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides handling of array formulas in a cell range. */
trait XArrayFormulaRange
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the array formula of the range or an empty string, if the range does not contain an array formula. */
  var ArrayFormula: java.lang.String
  /** returns the array formula of the range or an empty string, if the range does not contain an array formula. */
  def getArrayFormula(): java.lang.String
  /**
    * applies the array formula to the entire cell range.
    * @param aFormula the formula that will be applied as array formula. Passing an empty string erases an existing array formula.
    */
  def setArrayFormula(aFormula: java.lang.String): scala.Unit
}

