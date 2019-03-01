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
    getColor: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color],
    getFormula: js.Function0[java.lang.String],
    getType: js.Function0[scala.Double],
    setColor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color, scala.Unit],
    setFormula: js.Function1[java.lang.String, scala.Unit],
    setType: js.Function1[scala.Double, scala.Unit]
  ): XColorScaleEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Color")(Color)
    __obj.updateDynamic("Formula")(Formula)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("getColor")(getColor)
    __obj.updateDynamic("getFormula")(getFormula)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setColor")(setColor)
    __obj.updateDynamic("setFormula")(setFormula)
    __obj.updateDynamic("setType")(setType)
    __obj.asInstanceOf[XColorScaleEntry]
  }
}

