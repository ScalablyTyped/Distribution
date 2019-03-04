package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XIconSetEntry extends js.Object {
  var Formula: java.lang.String
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  var Type: scala.Double
  def getFormula(): java.lang.String
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  def getType(): scala.Double
  def setFormula(Formula: java.lang.String): scala.Unit
  /** See com.sun.star.sheet.IconSetEntryType for possible values. */
  def setType(Type: scala.Double): scala.Unit
}

object XIconSetEntry {
  @scala.inline
  def apply(
    Formula: java.lang.String,
    Type: scala.Double,
    getFormula: js.Function0[java.lang.String],
    getType: js.Function0[scala.Double],
    setFormula: js.Function1[java.lang.String, scala.Unit],
    setType: js.Function1[scala.Double, scala.Unit]
  ): XIconSetEntry = {
    val __obj = js.Dynamic.literal(Formula = Formula, Type = Type, getFormula = getFormula, getType = getType, setFormula = setFormula, setType = setType)
  
    __obj.asInstanceOf[XIconSetEntry]
  }
}

