package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes properties that apply to the whole spreadsheet document.
  *
  * For settings that affect view properties, these settings apply to subsequently created views and are saved with the document, while {@link
  * SpreadsheetViewSettings} can be used to alter a specific view that is already open.
  */
trait DocumentSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.Settings {
  /** specifies the color in which the cell grid is displayed. */
  var GridColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** enables the column and row headers of the view. */
  var HasColumnRowHeaders: scala.Boolean
  /** enables the sheet tabs of the view. */
  var HasSheetTabs: scala.Boolean
  /** enables the display of outline symbols. */
  var IsOutlineSymbolsSet: scala.Boolean
  /** enables the synchronization of horizontal and vertical grid settings in the user interface. */
  var IsRasterAxisSynchronized: scala.Boolean
  /** enables the restriction of object movement and resizing of drawing objects to the raster. */
  var IsSnapToRaster: scala.Boolean
  /** enables the display of the drawing object raster. */
  var RasterIsVisible: scala.Boolean
  /** specifies the distance between horizontal grid elements in 1/100 mm. */
  var RasterResolutionX: scala.Double
  /** specifies the distance between vertical grid elements in 1/100 mm. */
  var RasterResolutionY: scala.Double
  /** specifies the number of subdivisions between two horizontal grid elements. */
  var RasterSubdivisionX: scala.Double
  /** specifies the number of subdivisions between two vertical grid elements. */
  var RasterSubdivisionY: scala.Double
  /** enables the display of the cell grid. */
  var ShowGrid: scala.Boolean
  /** controls whether a marker is shown for notes in cells. */
  var ShowNotes: scala.Boolean
  /** enables display of page breaks. */
  var ShowPageBreaks: scala.Boolean
  /** enables display of zero-values. */
  var ShowZeroValues: scala.Boolean
}

