package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBar extends XConditionEntry {
  var AxisColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** See {@link com.sun.star.sheet.DataBarAxis} for possible values */
  var AxisPosition: scala.Double
  var Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var DataBarEntries: activexDashInteropLib.SafeArray[XDataBarEntry]
  /**
    * Maximum databar length in percent of cell width.
    *
    * Allowed values are (0, 1000) but larger than MinimumLength.
    */
  var MaximumLength: scala.Double
  /**
    * Minimum databar length in percent of cell width.
    *
    * Allowed values are [0, 100) but smaller than MaximumLength.
    */
  var MinimumLength: scala.Double
  var NegativeColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var ShowValue: scala.Boolean
  var UseGradient: scala.Boolean
  var UseNegativeColor: scala.Boolean
}

