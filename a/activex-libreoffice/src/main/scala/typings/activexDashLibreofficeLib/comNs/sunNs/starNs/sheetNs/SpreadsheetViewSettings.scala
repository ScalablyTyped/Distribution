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
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): SpreadsheetViewSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GridColor")(GridColor)
    __obj.updateDynamic("HasColumnRowHeaders")(HasColumnRowHeaders)
    __obj.updateDynamic("HasHorizontalScrollBar")(HasHorizontalScrollBar)
    __obj.updateDynamic("HasSheetTabs")(HasSheetTabs)
    __obj.updateDynamic("HasVerticalScrollBar")(HasVerticalScrollBar)
    __obj.updateDynamic("HideSpellMarks")(HideSpellMarks)
    __obj.updateDynamic("IsOutlineSymbolsSet")(IsOutlineSymbolsSet)
    __obj.updateDynamic("IsValueHighlightingEnabled")(IsValueHighlightingEnabled)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("ShowAnchor")(ShowAnchor)
    __obj.updateDynamic("ShowCharts")(ShowCharts)
    __obj.updateDynamic("ShowDrawing")(ShowDrawing)
    __obj.updateDynamic("ShowFormulas")(ShowFormulas)
    __obj.updateDynamic("ShowGrid")(ShowGrid)
    __obj.updateDynamic("ShowHelpLines")(ShowHelpLines)
    __obj.updateDynamic("ShowNotes")(ShowNotes)
    __obj.updateDynamic("ShowObjects")(ShowObjects)
    __obj.updateDynamic("ShowPageBreaks")(ShowPageBreaks)
    __obj.updateDynamic("ShowZeroValues")(ShowZeroValues)
    __obj.updateDynamic("ZoomType")(ZoomType)
    __obj.updateDynamic("ZoomValue")(ZoomValue)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[SpreadsheetViewSettings]
  }
}

