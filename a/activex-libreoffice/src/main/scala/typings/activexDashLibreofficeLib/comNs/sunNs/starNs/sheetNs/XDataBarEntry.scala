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
    getFormula: js.Function0[java.lang.String],
    getType: js.Function0[scala.Double],
    setFormula: js.Function1[java.lang.String, scala.Unit],
    setType: js.Function1[scala.Double, scala.Unit]
  ): XDataBarEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Formula")(Formula)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("getFormula")(getFormula)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("setFormula")(setFormula)
    __obj.updateDynamic("setType")(setType)
    __obj.asInstanceOf[XDataBarEntry]
  }
}

