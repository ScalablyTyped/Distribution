package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains settings which are specific to each view of a spreadsheet */
trait SpreadsheetViewSettings extends XPropertySet {
  /** specifies the color in which the cell grid is displayed. */
  var GridColor: Color
  /** enables the column and row headers of the view. */
  var HasColumnRowHeaders: Boolean
  /** enables the horizontal scroll bar of the view. */
  var HasHorizontalScrollBar: Boolean
  /** enables the sheet tabs of the view. */
  var HasSheetTabs: Boolean
  /** enables the vertical scroll bar of the view. */
  var HasVerticalScrollBar: Boolean
  /** disables the display of marks from online spelling. */
  var HideSpellMarks: Boolean
  /** enables the display of outline symbols. */
  var IsOutlineSymbolsSet: Boolean
  /** controls whether strings, values, and formulas are displayed in different colors. */
  var IsValueHighlightingEnabled: Boolean
  /** enables display of anchor symbols when drawing objects are selected. */
  var ShowAnchor: Boolean
  /**
    * enables the display of charts in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowCharts: Double
  /**
    * enables the display of drawing objects in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowDrawing: Double
  /** controls whether formulas are displayed instead of their results. */
  var ShowFormulas: Boolean
  /** enables the display of the cell grid. */
  var ShowGrid: Boolean
  /** enables display of help lines when moving drawing objects. */
  var ShowHelpLines: Boolean
  /** controls whether a marker is shown for notes in cells. */
  var ShowNotes: Boolean
  /**
    * enables display of embedded objects in the view.
    * @see SpreadsheetViewObjectsMode
    */
  var ShowObjects: Double
  /** enables display of page breaks. */
  var ShowPageBreaks: Boolean
  /** enables display of zero-values. */
  var ShowZeroValues: Boolean
  /**
    * This property defines the zoom type for the document.
    * @see com.sun.star.view.DocumentZoomType
    */
  var ZoomType: Double
  /** Defines the zoom value to use. Valid only if the ZoomType is set to {@link com.sun.star.view.DocumentZoomType.BY_VALUE} . */
  var ZoomValue: Double
}

object SpreadsheetViewSettings {
  @scala.inline
  def apply(
    GridColor: Color,
    HasColumnRowHeaders: Boolean,
    HasHorizontalScrollBar: Boolean,
    HasSheetTabs: Boolean,
    HasVerticalScrollBar: Boolean,
    HideSpellMarks: Boolean,
    IsOutlineSymbolsSet: Boolean,
    IsValueHighlightingEnabled: Boolean,
    PropertySetInfo: XPropertySetInfo,
    ShowAnchor: Boolean,
    ShowCharts: Double,
    ShowDrawing: Double,
    ShowFormulas: Boolean,
    ShowGrid: Boolean,
    ShowHelpLines: Boolean,
    ShowNotes: Boolean,
    ShowObjects: Double,
    ShowPageBreaks: Boolean,
    ShowZeroValues: Boolean,
    ZoomType: Double,
    ZoomValue: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): SpreadsheetViewSettings = {
    val __obj = js.Dynamic.literal(GridColor = GridColor, HasColumnRowHeaders = HasColumnRowHeaders, HasHorizontalScrollBar = HasHorizontalScrollBar, HasSheetTabs = HasSheetTabs, HasVerticalScrollBar = HasVerticalScrollBar, HideSpellMarks = HideSpellMarks, IsOutlineSymbolsSet = IsOutlineSymbolsSet, IsValueHighlightingEnabled = IsValueHighlightingEnabled, PropertySetInfo = PropertySetInfo, ShowAnchor = ShowAnchor, ShowCharts = ShowCharts, ShowDrawing = ShowDrawing, ShowFormulas = ShowFormulas, ShowGrid = ShowGrid, ShowHelpLines = ShowHelpLines, ShowNotes = ShowNotes, ShowObjects = ShowObjects, ShowPageBreaks = ShowPageBreaks, ShowZeroValues = ShowZeroValues, ZoomType = ZoomType, ZoomValue = ZoomValue, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[SpreadsheetViewSettings]
  }
}

