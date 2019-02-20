package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the settings of the controller of a text document. */
trait ViewSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * If this property is `TRUE` , whitespaces around pages are hidden.
    * @since LibreOffice 5.1
    */
  var HideWhitespace: scala.Boolean
  /**
    * metric unit of the horizontal ruler
    *
    * Uses values {@link com.sun.star.awt.FieldUnit}
    * @since OOo 3.1
    */
  var HorizontalRulerMetric: scala.Double
  /** If this property is `TRUE` hyperlinks in the document are executed (loaded) on mouse click. Otherwise they are handled like normal text. */
  var IsExecuteHyperlinks: scala.Boolean
  /**
    * Specifies whether to display the grid or not
    * @since OOo 2.0
    */
  var IsRasterVisible: scala.Boolean
  /**
    * Specifies whether to move frames, drawing elements, and form functions only between grid points.
    * @since OOo 2.0
    */
  var IsSnapToRaster: scala.Boolean
  /** If this property is `TRUE` , the vertical ruler is aligned to the right side of the view and the vertical scrollbar is on the left. */
  var IsVertRulerRightAligned: scala.Boolean
  /**
    * Defines the unit of measure for the spacing between grid points on the X-axis.
    *
    * The value must be greater than 0. The application may enforce more restricting bounds for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterResolutionX: scala.Double
  /**
    * Defines the unit of measure for the spacing between grid points on the Y-axis.
    *
    * The value must be greater than 0. The application may enforce more restricting bounds for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterResolutionY: scala.Double
  /**
    * Specifies the number of intervals between grid points on the X-axis.
    *
    * The value must be greater or equal to 0, and the application may enforce an upper bound for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterSubdivisionX: scala.Double
  /**
    * Specifies the number of intervals between grid points on the Y-axis.
    *
    * The value must be greater or equal to 0, and the application may enforce an upper bound for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterSubdivisionY: scala.Double
  /** If this property is `TRUE` , annotations (notes) are visible. */
  var ShowAnnotations: scala.Boolean
  /** If this property is `TRUE` , paragraph line breaks are visible. */
  var ShowBreaks: scala.Boolean
  /**
    * If this property is `TRUE` , tips for document content are shown, typically in a help balloon when the mouse is over the content.
    * @since LibreOffice 4.1
    */
  var ShowContentTips: scala.Boolean
  /** If this property is `TRUE` , shapes are visible. */
  var ShowDrawings: scala.Boolean
  /** If this property is `TRUE` , text fields are shown with their commands; otherwise the content is visible. */
  var ShowFieldCommands: scala.Boolean
  /** If this property is `TRUE` , footnotes symbols are displayed with gray background. */
  var ShowFootnoteBackground: scala.Boolean
  /** If this property is `TRUE` , graphic objects are visible. */
  var ShowGraphics: scala.Boolean
  /**
    * If this property is `TRUE` , hidden characters are displayed
    * @since OOo 3.0
    */
  var ShowHiddenCharacters: scala.Boolean
  /** If this property is `TRUE` , hidden paragraphs are displayed. */
  var ShowHiddenParagraphs: scala.Boolean
  /** If this property is `TRUE` , hidden text is displayed. */
  var ShowHiddenText: scala.Boolean
  /** If this property is `TRUE` and the property ShowRulers is `TRUE` , the horizontal ruler is displayed. */
  var ShowHoriRuler: scala.Boolean
  /** If this property is `TRUE` and the property ShowRulers is `TRUE` , the horizontal scroll bar is displayed. */
  var ShowHoriScrollBar: scala.Boolean
  /** If this property is `TRUE` , index marks are displayed with gray background. */
  var ShowIndexMarkBackground: scala.Boolean
  /**
    * If this property is `TRUE` , the settings of non-printing characters are applied.
    *
    * This option controls the use of the settings ShowHiddenCharacters, ShowTabstops, ShowSpaces, ShowBreaks and ShowParaBreaks
    * @since OOo 3.0
    */
  var ShowNonprintingCharacters: scala.Boolean
  /** If this property is `TRUE` the document will be displayed as if it were a HTML document. */
  var ShowOnlineLayout: scala.Boolean
  /** If this property is `TRUE` , paragraph breaks are visible. */
  var ShowParaBreaks: scala.Boolean
  /** If this property is `TRUE` , protected spaces (hard spaces) are displayed with gray background. */
  var ShowProtectedSpaces: scala.Boolean
  /** ShowHoriRuler and ShowVertRuler determine whether a ruler is visible. */
  var ShowRulers: scala.Boolean
  /**
    * If this property is `TRUE` , and the scroll bar is shown, a tool tip is displayed while scrolling.
    * @since LibreOffice 4.2
    */
  var ShowScrollBarTips: scala.Boolean
  /** If this property is `TRUE` , soft hyphens are displayed with gray background. */
  var ShowSoftHyphens: scala.Boolean
  /** If this property is `TRUE` , spaces are displayed with dots. */
  var ShowSpaces: scala.Boolean
  /** If this property is `TRUE` , table boundaries are displayed. */
  var ShowTableBoundaries: scala.Boolean
  /** If this property is `TRUE` , tables are visible. */
  var ShowTables: scala.Boolean
  /** If this property is `TRUE` , tab stops are visible. */
  var ShowTabstops: scala.Boolean
  /** If this property is `TRUE` , text boundaries are displayed. */
  var ShowTextBoundaries: scala.Boolean
  /** If this property is `TRUE` , text fields are displayed with gray background. */
  var ShowTextFieldBackground: scala.Boolean
  /** If this property is `TRUE` , the vertical ruler is displayed. */
  var ShowVertRuler: scala.Boolean
  /** If this property is `TRUE` , the vertical scroll bar is displayed. */
  var ShowVertScrollBar: scala.Boolean
  /** If this property is `TRUE` , smooth scrolling is active. */
  var SmoothScrolling: scala.Boolean
  /**
    * metric unit of the vertical ruler
    *
    * Uses values from {@link com.sun.star.awt.FieldUnit}
    * @since OOo 3.1
    */
  var VerticalRulerMetric: scala.Double
  /**
    * This property defines the zoom type for the document.
    * @see com.sun.star.view.DocumentZoomType
    */
  var ZoomType: scala.Double
  /** Defines the zoom value to use. Valid only if the ZoomType is set to {@link com.sun.star.view.DocumentZoomType.BY_VALUE} . */
  var ZoomValue: scala.Double
}

