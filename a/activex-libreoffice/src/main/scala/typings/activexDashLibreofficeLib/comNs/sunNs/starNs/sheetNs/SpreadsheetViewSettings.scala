package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains settings which are specific to each view of a spreadsheet */
trait SpreadsheetViewSettings
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies the color in which the cell grid is displayed. */
  var GridColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** enables the column and row headers of the view. */
  var HasColumnRowHeaders: scala.Boolean
  /** enables the horizontal scroll bar of the view. */
  var HasHorizontalScrollBar: scala.Boolean
  /** enables the sheet tabs of the view. */
  var HasSheetTabs: scala.Boolean
  /** enables the vertical scroll bar of the view. */
  var HasVerticalScrollBar: scala.Boolean
  /** disables the display of marks from online spelling. */
  var HideSpellMarks: scala.Boolean
  /** enables the display of outline symbols. */
  var IsOutlineSymbolsSet: scala.Boolean
  /** controls whether strings, values, and formulas are displayed in different colors. */
  var IsValueHighlightingEnabled: scala.Boolean
  /** enables display of anchor symbols when drawing objects are selected. */
  var ShowAnchor: scala.Boolean
  /**
    * enables the display of charts in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowCharts: scala.Double
  /**
    * enables the display of drawing objects in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowDrawing: scala.Double
  /** controls whether formulas are displayed instead of their results. */
  var ShowFormulas: scala.Boolean
  /** enables the display of the cell grid. */
  var ShowGrid: scala.Boolean
  /** enables display of help lines when moving drawing objects. */
  var ShowHelpLines: scala.Boolean
  /** controls whether a marker is shown for notes in cells. */
  var ShowNotes: scala.Boolean
  /**
    * enables display of embedded objects in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowObjects: scala.Double
  /** enables display of page breaks. */
  var ShowPageBreaks: scala.Boolean
  /** enables display of zero-values. */
  var ShowZeroValues: scala.Boolean
  /**
    * This property defines the zoom type for the document.
    * @see com.sun.star.view.DocumentZoomType
    */
  var ZoomType: scala.Double
  /** Defines the zoom value to use. Valid only if the ZoomType is set to {@link com.sun.star.view.DocumentZoomType.BY_VALUE} . */
  var ZoomValue: scala.Double
}

object SpreadsheetViewSettings {
  @scala.inline
  def apply(
    GridColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    HasColumnRowHeaders: scala.Boolean,
    HasHorizontalScrollBar: scala.Boolean,
    HasSheetTabs: scala.Boolean,
    HasVerticalScrollBar: scala.Boolean,
    HideSpellMarks: scala.Boolean,
    IsOutlineSymbolsSet: scala.Boolean,
    IsValueHighlightingEnabled: scala.Boolean,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    ShowAnchor: scala.Boolean,
    ShowCharts: scala.Double,
    ShowDrawing: scala.Double,
    ShowFormulas: scala.Boolean,
    ShowGrid: scala.Boolean,
    ShowHelpLines: scala.Boolean,
    ShowNotes: scala.Boolean,
    ShowObjects: scala.Double,
    ShowPageBreaks: scala.Boolean,
    ShowZeroValues: scala.Boolean,
    ZoomType: scala.Double,
    ZoomValue: scala.Double,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): SpreadsheetViewSettings = {
    val __obj = js.Dynamic.literal(GridColor = GridColor, HasColumnRowHeaders = HasColumnRowHeaders, HasHorizontalScrollBar = HasHorizontalScrollBar, HasSheetTabs = HasSheetTabs, HasVerticalScrollBar = HasVerticalScrollBar, HideSpellMarks = HideSpellMarks, IsOutlineSymbolsSet = IsOutlineSymbolsSet, IsValueHighlightingEnabled = IsValueHighlightingEnabled, PropertySetInfo = PropertySetInfo, ShowAnchor = ShowAnchor, ShowCharts = ShowCharts, ShowDrawing = ShowDrawing, ShowFormulas = ShowFormulas, ShowGrid = ShowGrid, ShowHelpLines = ShowHelpLines, ShowNotes = ShowNotes, ShowObjects = ShowObjects, ShowPageBreaks = ShowPageBreaks, ShowZeroValues = ShowZeroValues, ZoomType = ZoomType, ZoomValue = ZoomValue, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[SpreadsheetViewSettings]
  }
}

