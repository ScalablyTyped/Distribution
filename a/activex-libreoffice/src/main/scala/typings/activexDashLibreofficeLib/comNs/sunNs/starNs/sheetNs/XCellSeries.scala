package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to fill out a cell range automatically with values based on a start value, step count and fill mode.
  * @see com.sun.star.sheet.SheetCellRange
  */
trait XCellSeries
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * fills all cells in the range in a way that is specified by the first cell(s) in the range.
    * @param nFillDirection specifies the direction to fill the rows/columns of the range.
    * @param nSourceCount contains the number of cells in each row/column used to constitute the fill algorithm.
    */
  def fillAuto(nFillDirection: FillDirection, nSourceCount: scala.Double): scala.Unit
  /**
    * fills all cells in the range based on the specified settings.
    * @param nFillDirection specifies the direction to fill the rows/columns of the range.
    * @param nFillMode specifies the type of the series.
    * @param nFillDateMode specifies the calculation mode for date values.
    * @param fStep contains the value used to increase/decrease the series values.
    * @param fEndValue contains the threshold value on which the calculation of the current series stops.
    */
  def fillSeries(
    nFillDirection: FillDirection,
    nFillMode: FillMode,
    nFillDateMode: FillDateMode,
    fStep: scala.Double,
    fEndValue: scala.Double
  ): scala.Unit
}

