package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a page style for a spreadsheet.
  *
  * This service extends the service {@link com.sun.star.style.PageStyle} with spreadsheet specific properties.
  */
trait TablePageStyle
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageStyle {
  /** determines whether the table is centered horizontally on the page. */
  var CenterHorizontally: scala.Boolean
  /** determines whether the table is centered vertically on the page. */
  var CenterVertically: scala.Boolean
  /**
    * contains the page number applied to the first page for this sheet.
    *
    * The value 0 indicates that the page numbers are continued from the previous sheet.
    */
  var FirstPageNumber: scala.Double
  /**
    * contains the content of the footer for left pages.
    *
    * After changing the footer text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var LeftPageFooterContent: XHeaderFooterContent
  /**
    * contains the content of the header for left pages.
    *
    * After changing the header text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var LeftPageHeaderContent: XHeaderFooterContent
  /** contains the scaling factor (in percent) for printing the sheet. */
  var PageScale: scala.Double
  /** enables printing of cell annotations. */
  var PrintAnnotations: scala.Boolean
  /** enables printing of charts. */
  var PrintCharts: scala.Boolean
  /**
    * specifies the print order for the pages within each sheet.
    *
    * If `TRUE` , the order for printing pages begins with top-to-bottom, then continues with the next set of cell columns to the right. If `FALSE` , the
    * order for printing pages begins with left-to-right, then continues with the next set of cell rows to the bottom.
    */
  var PrintDownFirst: scala.Boolean
  /** enables printing of drawing objects. */
  var PrintDrawing: scala.Boolean
  /** enables printing of formulas instead of their results. */
  var PrintFormulas: scala.Boolean
  /** enables printing of the cell grid. */
  var PrintGrid: scala.Boolean
  /** enables printing of column and row headers. */
  var PrintHeaders: scala.Boolean
  /** enables printing of embedded objects. */
  var PrintObjects: scala.Boolean
  /** enables printing of zero-values. */
  var PrintZeroValues: scala.Boolean
  /**
    * contains the content of the footer for right pages.
    *
    * After changing the footer text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var RightPageFooterContent: XHeaderFooterContent
  /**
    * contains the content of the header for right pages.
    *
    * After changing the header text contents, this property has to be reinserted into the property set.
    * @see com.sun.star.sheet.HeaderFooterContent
    */
  var RightPageHeaderContent: XHeaderFooterContent
  /** contains the number of pages the sheet will printed. */
  var ScaleToPages: scala.Double
  /**
    * contains the number of horizontal pages the sheet will printed on.
    * @since OOo 2.0
    */
  var ScaleToPagesX: scala.Double
  /**
    * contains the number of vertical pages the sheet will printed on.
    * @since OOo 2.0
    */
  var ScaleToPagesY: scala.Double
}

