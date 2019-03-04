package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * area of cells within a text table.
  * @see com.sun.star.text.TextTable
  */
trait CellRange
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataArray
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex
     with activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XCellRangeData {
  /** contains color of the background. */
  var BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the filter name of the background graphic. */
  var BackGraphicFilter: java.lang.String
  /** determines the location of the background graphic. */
  var BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
  /** contains the URL of the background graphic. */
  var BackGraphicURL: java.lang.String
  /** determines if the background color is transparent. */
  var BackTransparent: scala.Boolean
  /** determines if the first column of the table should be treated as axis labels when a chart is to be created. */
  var ChartColumnAsLabel: scala.Boolean
  /** determines if the first row of the table should be treated as axis labels when a chart is to be created. */
  var ChartRowAsLabel: scala.Boolean
  /** contains the number format. */
  var NumberFormat: scala.Double
}

object CellRange {
  @scala.inline
  def apply(
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    CharacterProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties = null,
    CharacterPropertiesAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian = null,
    CharacterPropertiesComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex = null,
    ChartColumnAsLabel: scala.Boolean,
    ChartRowAsLabel: scala.Boolean,
    NumberFormat: scala.Double,
    ParagraphProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties = null,
    ParagraphPropertiesAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian = null,
    ParagraphPropertiesComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex = null,
    XCellRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XCellRange = null,
    XCellRangeData: activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs.XCellRangeData = null,
    XChartDataArray: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataArray = null
  ): CellRange = {
    val __obj = js.Dynamic.literal(BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, ChartColumnAsLabel = ChartColumnAsLabel, ChartRowAsLabel = ChartRowAsLabel, NumberFormat = NumberFormat)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesAsian)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesComplex)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphPropertiesAsian)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphPropertiesComplex)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XCellRange)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XCellRangeData)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XChartDataArray)
    __obj.asInstanceOf[CellRange]
  }
}

