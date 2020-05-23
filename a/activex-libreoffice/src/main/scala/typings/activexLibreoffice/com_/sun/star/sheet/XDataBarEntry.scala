package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XDataBarEntry extends js.Object {
  var Formula: String
  /** See {@link com.sun.star.sheet.DataBarEntryType} for possible values */
  var Type: Double
  def getFormula(): String
  /** See {@link com.sun.star.sheet.DataBarEntryType} for possible values */
  def getType(): Double
  def setFormula(Formula: String): Unit
  /** See {@link com.sun.star.sheet.DataBarEntryType} for possible values */
  def setType(Type: Double): Unit
}

object XDataBarEntry {
  @scala.inline
  def apply(
    Formula: String,
    Type: Double,
    getFormula: () => String,
    getType: () => Double,
    setFormula: String => Unit,
    setType: Double => Unit
  ): XDataBarEntry = {
    val __obj = js.Dynamic.literal(Formula = Formula.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), setFormula = js.Any.fromFunction1(setFormula), setType = js.Any.fromFunction1(setType))
    __obj.asInstanceOf[XDataBarEntry]
  }
}

