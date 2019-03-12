package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDataBarEntry extends js.Object {
  var Formula: java.lang.String
  /** See {@link com.sun.star.sheet.DataBarEntryType} for possible values */
  var Type: scala.Double
  def getFormula(): java.lang.String
  /** See {@link com.sun.star.sheet.DataBarEntryType} for possible values */
  def getType(): scala.Double
  def setFormula(Formula: java.lang.String): scala.Unit
  /** See {@link com.sun.star.sheet.DataBarEntryType} for possible values */
  def setType(Type: scala.Double): scala.Unit
}

object XDataBarEntry {
  @scala.inline
  def apply(
    Formula: java.lang.String,
    Type: scala.Double,
    getFormula: () => java.lang.String,
    getType: () => scala.Double,
    setFormula: java.lang.String => scala.Unit,
    setType: scala.Double => scala.Unit
  ): XDataBarEntry = {
    val __obj = js.Dynamic.literal(Formula = Formula, Type = Type, getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), setFormula = js.Any.fromFunction1(setFormula), setType = js.Any.fromFunction1(setType))
  
    __obj.asInstanceOf[XDataBarEntry]
  }
}

