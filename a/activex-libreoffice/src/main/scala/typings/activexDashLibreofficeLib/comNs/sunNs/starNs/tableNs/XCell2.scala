package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends {@link XCell} methods to access the contents of a cell in a table.
  * @see com.sun.star.table.Cell
  */
trait XCell2 extends XCell {
  /**
    * sets a formula result into the cell.
    *
    * When assigned, the formula cell's result will be set to this value and will not be calculated - unless a HardRecalc is executed.
    */
  def setFormulaResult(nValue: scala.Double): scala.Unit
  /**
    * sets a formula string into the cell.
    *
    * When assigned, the formula is set into the string. But is not compiled, tokenized or calculated. Its useful when loading a document and {@link
    * setFormulaResult()} is used. Otherwise it is compiled on trying to fetch a result value.
    */
  def setFormulaString(aFormula: java.lang.String): scala.Unit
}

