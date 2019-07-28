package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XColorScaleEntry extends js.Object {
  var Color: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
  var Formula: String
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  var Type: Double
  def getColor(): Color
  def getFormula(): String
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def getType(): Double
  def setColor(Color: Color): Unit
  def setFormula(Formula: String): Unit
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def setType(Type: Double): Unit
}

object XColorScaleEntry {
  @scala.inline
  def apply(
    Color: Color,
    Formula: String,
    Type: Double,
    getColor: () => Color,
    getFormula: () => String,
    getType: () => Double,
    setColor: Color => Unit,
    setFormula: String => Unit,
    setType: Double => Unit
  ): XColorScaleEntry = {
    val __obj = js.Dynamic.literal(Color = Color, Formula = Formula, Type = Type, getColor = js.Any.fromFunction0(getColor), getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), setColor = js.Any.fromFunction1(setColor), setFormula = js.Any.fromFunction1(setFormula), setType = js.Any.fromFunction1(setType))
  
    __obj.asInstanceOf[XColorScaleEntry]
  }
}

