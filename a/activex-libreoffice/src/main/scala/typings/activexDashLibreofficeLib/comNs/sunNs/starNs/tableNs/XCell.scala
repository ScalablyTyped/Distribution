package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to access the contents of a cell in a table.
  * @see com.sun.star.table.Cell
  */
trait XCell
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the error value of the cell.
    *
    * If the cell does not contain a formula, the error is always zero.
    */
  val Error: scala.Double
  /**
    * returns the formula string of a cell.
    *
    * Even if the cell does not contain a formula, an assignment of this attribute's value to another cell's formula attribute would create the same cell
    * content. This is because this attribute contains the original text value of a string cell. The value of a **value cell** will be formatted using the
    * number format's default format or the formula string, including "=", of a formula cell.
    */
  var Formula: java.lang.String
  /** returns the type of the cell. */
  val Type: CellContentType
  /**
    * returns the floating point value of the cell.
    *
    * For a **value cell** the value is returned, for a **string cell** zero is returned and for a **formula cell** the result value of a formula is
    * returned.
    */
  var Value: scala.Double
  /**
    * returns the error value of the cell.
    *
    * If the cell does not contain a formula, the error is always zero.
    */
  def getError(): scala.Double
  /**
    * returns the formula string of a cell.
    *
    * Even if the cell does not contain a formula, an assignment of this attribute's value to another cell's formula attribute would create the same cell
    * content. This is because this attribute contains the original text value of a string cell. The value of a **value cell** will be formatted using the
    * number format's default format or the formula string, including "=", of a formula cell.
    */
  def getFormula(): java.lang.String
  /** returns the type of the cell. */
  def getType(): CellContentType
  /**
    * returns the floating point value of the cell.
    *
    * For a **value cell** the value is returned, for a **string cell** zero is returned and for a **formula cell** the result value of a formula is
    * returned.
    */
  def getValue(): scala.Double
  /**
    * sets a formula into the cell.
    *
    * When assigned, the string will be interpreted and a value, text or formula cell is created, depending on the text and the number format.
    */
  def setFormula(aFormula: java.lang.String): scala.Unit
  /**
    * sets a floating point value into the cell.
    *
    * After a call to this method the type of the cell is CellContentType::VALUE.
    */
  def setValue(nValue: scala.Double): scala.Unit
}

object XCell {
  @scala.inline
  def apply(
    Error: scala.Double,
    Formula: java.lang.String,
    Type: CellContentType,
    Value: scala.Double,
    acquire: js.Function0[scala.Unit],
    getError: js.Function0[scala.Double],
    getFormula: js.Function0[java.lang.String],
    getType: js.Function0[CellContentType],
    getValue: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFormula: js.Function1[java.lang.String, scala.Unit],
    setValue: js.Function1[scala.Double, scala.Unit]
  ): XCell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Error")(Error)
    __obj.updateDynamic("Formula")(Formula)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("Value")(Value)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getError")(getError)
    __obj.updateDynamic("getFormula")(getFormula)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setFormula")(setFormula)
    __obj.updateDynamic("setValue")(setValue)
    __obj.asInstanceOf[XCell]
  }
}

