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

