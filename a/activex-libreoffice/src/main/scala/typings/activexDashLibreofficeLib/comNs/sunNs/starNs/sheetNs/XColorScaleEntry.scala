package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XColorScaleEntry extends js.Object {
  var Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var Formula: java.lang.String
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  var Type: scala.Double
  def getColor(): activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  def getFormula(): java.lang.String
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def getType(): scala.Double
  def setColor(Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color): scala.Unit
  def setFormula(Formula: java.lang.String): scala.Unit
  /** See {@link com.sun.star.sheet.ColorScaleEntryType} for possible values */
  def setType(Type: scala.Double): scala.Unit
}

object XColorScaleEntry {
  @scala.inline
  def apply(
    Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    Formula: java.lang.String,
    Type: scala.Double,
    getColor: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    getFormula: () => java.lang.String,
    getType: () => scala.Double,
    setColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color => scala.Unit,
    setFormula: java.lang.String => scala.Unit,
    setType: scala.Double => scala.Unit
  ): XColorScaleEntry = {
    val __obj = js.Dynamic.literal(Color = Color, Formula = Formula, Type = Type, getColor = js.Any.fromFunction0(getColor), getFormula = js.Any.fromFunction0(getFormula), getType = js.Any.fromFunction0(getType), setColor = js.Any.fromFunction1(setColor), setFormula = js.Any.fromFunction1(setFormula), setType = js.Any.fromFunction1(setType))
  
    __obj.asInstanceOf[XColorScaleEntry]
  }
}

