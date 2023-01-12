package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the settings of the controller of a text document. */
trait ViewSettings
  extends StObject
     with XPropertySet {
  
  /**
    * If this property is `TRUE` , whitespaces around pages are hidden.
    * @since LibreOffice 5.1
    */
  var HideWhitespace: Boolean
  
  /**
    * metric unit of the horizontal ruler
    *
    * Uses values {@link com.sun.star.awt.FieldUnit}
    * @since OOo 3.1
    */
  var HorizontalRulerMetric: Double
  
  /** If this property is `TRUE` hyperlinks in the document are executed (loaded) on mouse click. Otherwise they are handled like normal text. */
  var IsExecuteHyperlinks: Boolean
  
  /**
    * Specifies whether to display the grid or not
    * @since OOo 2.0
    */
  var IsRasterVisible: Boolean
  
  /**
    * Specifies whether to move frames, drawing elements, and form functions only between grid points.
    * @since OOo 2.0
    */
  var IsSnapToRaster: Boolean
  
  /** If this property is `TRUE` , the vertical ruler is aligned to the right side of the view and the vertical scrollbar is on the left. */
  var IsVertRulerRightAligned: Boolean
  
  /**
    * Defines the unit of measure for the spacing between grid points on the X-axis.
    *
    * The value must be greater than 0. The application may enforce more restricting bounds for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterResolutionX: Double
  
  /**
    * Defines the unit of measure for the spacing between grid points on the Y-axis.
    *
    * The value must be greater than 0. The application may enforce more restricting bounds for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterResolutionY: Double
  
  /**
    * Specifies the number of intervals between grid points on the X-axis.
    *
    * The value must be greater or equal to 0, and the application may enforce an upper bound for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterSubdivisionX: Double
  
  /**
    * Specifies the number of intervals between grid points on the Y-axis.
    *
    * The value must be greater or equal to 0, and the application may enforce an upper bound for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterSubdivisionY: Double
  
  /** If this property is `TRUE` , annotations (notes) are visible. */
  var ShowAnnotations: Boolean
  
  /** If this property is `TRUE` , paragraph line breaks are visible. */
  var ShowBreaks: Boolean
  
  /**
    * If this property is `TRUE` , tips for document content are shown, typically in a help balloon when the mouse is over the content.
    * @since LibreOffice 4.1
    */
  var ShowContentTips: Boolean
  
  /** If this property is `TRUE` , shapes are visible. */
  var ShowDrawings: Boolean
  
  /** If this property is `TRUE` , text fields are shown with their commands; otherwise the content is visible. */
  var ShowFieldCommands: Boolean
  
  /** If this property is `TRUE` , footnotes symbols are displayed with gray background. */
  var ShowFootnoteBackground: Boolean
  
  /** If this property is `TRUE` , graphic objects are visible. */
  var ShowGraphics: Boolean
  
  /**
    * If this property is `TRUE` , hidden characters are displayed
    * @since OOo 3.0
    */
  var ShowHiddenCharacters: Boolean
  
  /** If this property is `TRUE` , hidden paragraphs are displayed. */
  var ShowHiddenParagraphs: Boolean
  
  /** If this property is `TRUE` , hidden text is displayed. */
  var ShowHiddenText: Boolean
  
  /** If this property is `TRUE` and the property ShowRulers is `TRUE` , the horizontal ruler is displayed. */
  var ShowHoriRuler: Boolean
  
  /** If this property is `TRUE` and the property ShowRulers is `TRUE` , the horizontal scroll bar is displayed. */
  var ShowHoriScrollBar: Boolean
  
  /** If this property is `TRUE` , index marks are displayed with gray background. */
  var ShowIndexMarkBackground: Boolean
  
  /**
    * If this property is `TRUE` , the settings of non-printing characters are applied.
    *
    * This option controls the use of the settings ShowHiddenCharacters, ShowTabstops, ShowSpaces, ShowBreaks and ShowParaBreaks
    * @since OOo 3.0
    */
  var ShowNonprintingCharacters: Boolean
  
  /** If this property is `TRUE` the document will be displayed as if it were a HTML document. */
  var ShowOnlineLayout: Boolean
  
  /** If this property is `TRUE` , paragraph breaks are visible. */
  var ShowParaBreaks: Boolean
  
  /** If this property is `TRUE` , protected spaces (hard spaces) are displayed with gray background. */
  var ShowProtectedSpaces: Boolean
  
  /** ShowHoriRuler and ShowVertRuler determine whether a ruler is visible. */
  var ShowRulers: Boolean
  
  /**
    * If this property is `TRUE` , and the scroll bar is shown, a tool tip is displayed while scrolling.
    * @since LibreOffice 4.2
    */
  var ShowScrollBarTips: Boolean
  
  /** If this property is `TRUE` , soft hyphens are displayed with gray background. */
  var ShowSoftHyphens: Boolean
  
  /** If this property is `TRUE` , spaces are displayed with dots. */
  var ShowSpaces: Boolean
  
  /** If this property is `TRUE` , table boundaries are displayed. */
  var ShowTableBoundaries: Boolean
  
  /** If this property is `TRUE` , tables are visible. */
  var ShowTables: Boolean
  
  /** If this property is `TRUE` , tab stops are visible. */
  var ShowTabstops: Boolean
  
  /** If this property is `TRUE` , text boundaries are displayed. */
  var ShowTextBoundaries: Boolean
  
  /** If this property is `TRUE` , text fields are displayed with gray background. */
  var ShowTextFieldBackground: Boolean
  
  /** If this property is `TRUE` , the vertical ruler is displayed. */
  var ShowVertRuler: Boolean
  
  /** If this property is `TRUE` , the vertical scroll bar is displayed. */
  var ShowVertScrollBar: Boolean
  
  /** If this property is `TRUE` , smooth scrolling is active. */
  var SmoothScrolling: Boolean
  
  /**
    * metric unit of the vertical ruler
    *
    * Uses values from {@link com.sun.star.awt.FieldUnit}
    * @since OOo 3.1
    */
  var VerticalRulerMetric: Double
  
  /**
    * This property defines the zoom type for the document.
    * @see com.sun.star.view.DocumentZoomType
    */
  var ZoomType: Double
  
  /** Defines the zoom value to use. Valid only if the ZoomType is set to {@link com.sun.star.view.DocumentZoomType.BY_VALUE} . */
  var ZoomValue: Double
}
object ViewSettings {
  
  inline def apply(
    HideWhitespace: Boolean,
    HorizontalRulerMetric: Double,
    IsExecuteHyperlinks: Boolean,
    IsRasterVisible: Boolean,
    IsSnapToRaster: Boolean,
    IsVertRulerRightAligned: Boolean,
    PropertySetInfo: XPropertySetInfo,
    RasterResolutionX: Double,
    RasterResolutionY: Double,
    RasterSubdivisionX: Double,
    RasterSubdivisionY: Double,
    ShowAnnotations: Boolean,
    ShowBreaks: Boolean,
    ShowContentTips: Boolean,
    ShowDrawings: Boolean,
    ShowFieldCommands: Boolean,
    ShowFootnoteBackground: Boolean,
    ShowGraphics: Boolean,
    ShowHiddenCharacters: Boolean,
    ShowHiddenParagraphs: Boolean,
    ShowHiddenText: Boolean,
    ShowHoriRuler: Boolean,
    ShowHoriScrollBar: Boolean,
    ShowIndexMarkBackground: Boolean,
    ShowNonprintingCharacters: Boolean,
    ShowOnlineLayout: Boolean,
    ShowParaBreaks: Boolean,
    ShowProtectedSpaces: Boolean,
    ShowRulers: Boolean,
    ShowScrollBarTips: Boolean,
    ShowSoftHyphens: Boolean,
    ShowSpaces: Boolean,
    ShowTableBoundaries: Boolean,
    ShowTables: Boolean,
    ShowTabstops: Boolean,
    ShowTextBoundaries: Boolean,
    ShowTextFieldBackground: Boolean,
    ShowVertRuler: Boolean,
    ShowVertScrollBar: Boolean,
    SmoothScrolling: Boolean,
    VerticalRulerMetric: Double,
    ZoomType: Double,
    ZoomValue: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, Any) => Unit
  ): ViewSettings = {
    val __obj = js.Dynamic.literal(HideWhitespace = HideWhitespace.asInstanceOf[js.Any], HorizontalRulerMetric = HorizontalRulerMetric.asInstanceOf[js.Any], IsExecuteHyperlinks = IsExecuteHyperlinks.asInstanceOf[js.Any], IsRasterVisible = IsRasterVisible.asInstanceOf[js.Any], IsSnapToRaster = IsSnapToRaster.asInstanceOf[js.Any], IsVertRulerRightAligned = IsVertRulerRightAligned.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RasterResolutionX = RasterResolutionX.asInstanceOf[js.Any], RasterResolutionY = RasterResolutionY.asInstanceOf[js.Any], RasterSubdivisionX = RasterSubdivisionX.asInstanceOf[js.Any], RasterSubdivisionY = RasterSubdivisionY.asInstanceOf[js.Any], ShowAnnotations = ShowAnnotations.asInstanceOf[js.Any], ShowBreaks = ShowBreaks.asInstanceOf[js.Any], ShowContentTips = ShowContentTips.asInstanceOf[js.Any], ShowDrawings = ShowDrawings.asInstanceOf[js.Any], ShowFieldCommands = ShowFieldCommands.asInstanceOf[js.Any], ShowFootnoteBackground = ShowFootnoteBackground.asInstanceOf[js.Any], ShowGraphics = ShowGraphics.asInstanceOf[js.Any], ShowHiddenCharacters = ShowHiddenCharacters.asInstanceOf[js.Any], ShowHiddenParagraphs = ShowHiddenParagraphs.asInstanceOf[js.Any], ShowHiddenText = ShowHiddenText.asInstanceOf[js.Any], ShowHoriRuler = ShowHoriRuler.asInstanceOf[js.Any], ShowHoriScrollBar = ShowHoriScrollBar.asInstanceOf[js.Any], ShowIndexMarkBackground = ShowIndexMarkBackground.asInstanceOf[js.Any], ShowNonprintingCharacters = ShowNonprintingCharacters.asInstanceOf[js.Any], ShowOnlineLayout = ShowOnlineLayout.asInstanceOf[js.Any], ShowParaBreaks = ShowParaBreaks.asInstanceOf[js.Any], ShowProtectedSpaces = ShowProtectedSpaces.asInstanceOf[js.Any], ShowRulers = ShowRulers.asInstanceOf[js.Any], ShowScrollBarTips = ShowScrollBarTips.asInstanceOf[js.Any], ShowSoftHyphens = ShowSoftHyphens.asInstanceOf[js.Any], ShowSpaces = ShowSpaces.asInstanceOf[js.Any], ShowTableBoundaries = ShowTableBoundaries.asInstanceOf[js.Any], ShowTables = ShowTables.asInstanceOf[js.Any], ShowTabstops = ShowTabstops.asInstanceOf[js.Any], ShowTextBoundaries = ShowTextBoundaries.asInstanceOf[js.Any], ShowTextFieldBackground = ShowTextFieldBackground.asInstanceOf[js.Any], ShowVertRuler = ShowVertRuler.asInstanceOf[js.Any], ShowVertScrollBar = ShowVertScrollBar.asInstanceOf[js.Any], SmoothScrolling = SmoothScrolling.asInstanceOf[js.Any], VerticalRulerMetric = VerticalRulerMetric.asInstanceOf[js.Any], ZoomType = ZoomType.asInstanceOf[js.Any], ZoomValue = ZoomValue.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ViewSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewSettings] (val x: Self) extends AnyVal {
    
    inline def setHideWhitespace(value: Boolean): Self = StObject.set(x, "HideWhitespace", value.asInstanceOf[js.Any])
    
    inline def setHorizontalRulerMetric(value: Double): Self = StObject.set(x, "HorizontalRulerMetric", value.asInstanceOf[js.Any])
    
    inline def setIsExecuteHyperlinks(value: Boolean): Self = StObject.set(x, "IsExecuteHyperlinks", value.asInstanceOf[js.Any])
    
    inline def setIsRasterVisible(value: Boolean): Self = StObject.set(x, "IsRasterVisible", value.asInstanceOf[js.Any])
    
    inline def setIsSnapToRaster(value: Boolean): Self = StObject.set(x, "IsSnapToRaster", value.asInstanceOf[js.Any])
    
    inline def setIsVertRulerRightAligned(value: Boolean): Self = StObject.set(x, "IsVertRulerRightAligned", value.asInstanceOf[js.Any])
    
    inline def setRasterResolutionX(value: Double): Self = StObject.set(x, "RasterResolutionX", value.asInstanceOf[js.Any])
    
    inline def setRasterResolutionY(value: Double): Self = StObject.set(x, "RasterResolutionY", value.asInstanceOf[js.Any])
    
    inline def setRasterSubdivisionX(value: Double): Self = StObject.set(x, "RasterSubdivisionX", value.asInstanceOf[js.Any])
    
    inline def setRasterSubdivisionY(value: Double): Self = StObject.set(x, "RasterSubdivisionY", value.asInstanceOf[js.Any])
    
    inline def setShowAnnotations(value: Boolean): Self = StObject.set(x, "ShowAnnotations", value.asInstanceOf[js.Any])
    
    inline def setShowBreaks(value: Boolean): Self = StObject.set(x, "ShowBreaks", value.asInstanceOf[js.Any])
    
    inline def setShowContentTips(value: Boolean): Self = StObject.set(x, "ShowContentTips", value.asInstanceOf[js.Any])
    
    inline def setShowDrawings(value: Boolean): Self = StObject.set(x, "ShowDrawings", value.asInstanceOf[js.Any])
    
    inline def setShowFieldCommands(value: Boolean): Self = StObject.set(x, "ShowFieldCommands", value.asInstanceOf[js.Any])
    
    inline def setShowFootnoteBackground(value: Boolean): Self = StObject.set(x, "ShowFootnoteBackground", value.asInstanceOf[js.Any])
    
    inline def setShowGraphics(value: Boolean): Self = StObject.set(x, "ShowGraphics", value.asInstanceOf[js.Any])
    
    inline def setShowHiddenCharacters(value: Boolean): Self = StObject.set(x, "ShowHiddenCharacters", value.asInstanceOf[js.Any])
    
    inline def setShowHiddenParagraphs(value: Boolean): Self = StObject.set(x, "ShowHiddenParagraphs", value.asInstanceOf[js.Any])
    
    inline def setShowHiddenText(value: Boolean): Self = StObject.set(x, "ShowHiddenText", value.asInstanceOf[js.Any])
    
    inline def setShowHoriRuler(value: Boolean): Self = StObject.set(x, "ShowHoriRuler", value.asInstanceOf[js.Any])
    
    inline def setShowHoriScrollBar(value: Boolean): Self = StObject.set(x, "ShowHoriScrollBar", value.asInstanceOf[js.Any])
    
    inline def setShowIndexMarkBackground(value: Boolean): Self = StObject.set(x, "ShowIndexMarkBackground", value.asInstanceOf[js.Any])
    
    inline def setShowNonprintingCharacters(value: Boolean): Self = StObject.set(x, "ShowNonprintingCharacters", value.asInstanceOf[js.Any])
    
    inline def setShowOnlineLayout(value: Boolean): Self = StObject.set(x, "ShowOnlineLayout", value.asInstanceOf[js.Any])
    
    inline def setShowParaBreaks(value: Boolean): Self = StObject.set(x, "ShowParaBreaks", value.asInstanceOf[js.Any])
    
    inline def setShowProtectedSpaces(value: Boolean): Self = StObject.set(x, "ShowProtectedSpaces", value.asInstanceOf[js.Any])
    
    inline def setShowRulers(value: Boolean): Self = StObject.set(x, "ShowRulers", value.asInstanceOf[js.Any])
    
    inline def setShowScrollBarTips(value: Boolean): Self = StObject.set(x, "ShowScrollBarTips", value.asInstanceOf[js.Any])
    
    inline def setShowSoftHyphens(value: Boolean): Self = StObject.set(x, "ShowSoftHyphens", value.asInstanceOf[js.Any])
    
    inline def setShowSpaces(value: Boolean): Self = StObject.set(x, "ShowSpaces", value.asInstanceOf[js.Any])
    
    inline def setShowTableBoundaries(value: Boolean): Self = StObject.set(x, "ShowTableBoundaries", value.asInstanceOf[js.Any])
    
    inline def setShowTables(value: Boolean): Self = StObject.set(x, "ShowTables", value.asInstanceOf[js.Any])
    
    inline def setShowTabstops(value: Boolean): Self = StObject.set(x, "ShowTabstops", value.asInstanceOf[js.Any])
    
    inline def setShowTextBoundaries(value: Boolean): Self = StObject.set(x, "ShowTextBoundaries", value.asInstanceOf[js.Any])
    
    inline def setShowTextFieldBackground(value: Boolean): Self = StObject.set(x, "ShowTextFieldBackground", value.asInstanceOf[js.Any])
    
    inline def setShowVertRuler(value: Boolean): Self = StObject.set(x, "ShowVertRuler", value.asInstanceOf[js.Any])
    
    inline def setShowVertScrollBar(value: Boolean): Self = StObject.set(x, "ShowVertScrollBar", value.asInstanceOf[js.Any])
    
    inline def setSmoothScrolling(value: Boolean): Self = StObject.set(x, "SmoothScrolling", value.asInstanceOf[js.Any])
    
    inline def setVerticalRulerMetric(value: Double): Self = StObject.set(x, "VerticalRulerMetric", value.asInstanceOf[js.Any])
    
    inline def setZoomType(value: Double): Self = StObject.set(x, "ZoomType", value.asInstanceOf[js.Any])
    
    inline def setZoomValue(value: Double): Self = StObject.set(x, "ZoomValue", value.asInstanceOf[js.Any])
  }
}
