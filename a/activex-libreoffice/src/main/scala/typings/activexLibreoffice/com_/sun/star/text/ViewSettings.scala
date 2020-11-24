package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides access to the settings of the controller of a text document. */
@js.native
trait ViewSettings extends XPropertySet {
  
  /**
    * If this property is `TRUE` , whitespaces around pages are hidden.
    * @since LibreOffice 5.1
    */
  var HideWhitespace: Boolean = js.native
  
  /**
    * metric unit of the horizontal ruler
    *
    * Uses values {@link com.sun.star.awt.FieldUnit}
    * @since OOo 3.1
    */
  var HorizontalRulerMetric: Double = js.native
  
  /** If this property is `TRUE` hyperlinks in the document are executed (loaded) on mouse click. Otherwise they are handled like normal text. */
  var IsExecuteHyperlinks: Boolean = js.native
  
  /**
    * Specifies whether to display the grid or not
    * @since OOo 2.0
    */
  var IsRasterVisible: Boolean = js.native
  
  /**
    * Specifies whether to move frames, drawing elements, and form functions only between grid points.
    * @since OOo 2.0
    */
  var IsSnapToRaster: Boolean = js.native
  
  /** If this property is `TRUE` , the vertical ruler is aligned to the right side of the view and the vertical scrollbar is on the left. */
  var IsVertRulerRightAligned: Boolean = js.native
  
  /**
    * Defines the unit of measure for the spacing between grid points on the X-axis.
    *
    * The value must be greater than 0. The application may enforce more restricting bounds for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterResolutionX: Double = js.native
  
  /**
    * Defines the unit of measure for the spacing between grid points on the Y-axis.
    *
    * The value must be greater than 0. The application may enforce more restricting bounds for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterResolutionY: Double = js.native
  
  /**
    * Specifies the number of intervals between grid points on the X-axis.
    *
    * The value must be greater or equal to 0, and the application may enforce an upper bound for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterSubdivisionX: Double = js.native
  
  /**
    * Specifies the number of intervals between grid points on the Y-axis.
    *
    * The value must be greater or equal to 0, and the application may enforce an upper bound for the value.
    * @since OOo 2.0
    * @throws com::sun::star::lang::IllegalArgumentException if the value is out of bounds.
    */
  var RasterSubdivisionY: Double = js.native
  
  /** If this property is `TRUE` , annotations (notes) are visible. */
  var ShowAnnotations: Boolean = js.native
  
  /** If this property is `TRUE` , paragraph line breaks are visible. */
  var ShowBreaks: Boolean = js.native
  
  /**
    * If this property is `TRUE` , tips for document content are shown, typically in a help balloon when the mouse is over the content.
    * @since LibreOffice 4.1
    */
  var ShowContentTips: Boolean = js.native
  
  /** If this property is `TRUE` , shapes are visible. */
  var ShowDrawings: Boolean = js.native
  
  /** If this property is `TRUE` , text fields are shown with their commands; otherwise the content is visible. */
  var ShowFieldCommands: Boolean = js.native
  
  /** If this property is `TRUE` , footnotes symbols are displayed with gray background. */
  var ShowFootnoteBackground: Boolean = js.native
  
  /** If this property is `TRUE` , graphic objects are visible. */
  var ShowGraphics: Boolean = js.native
  
  /**
    * If this property is `TRUE` , hidden characters are displayed
    * @since OOo 3.0
    */
  var ShowHiddenCharacters: Boolean = js.native
  
  /** If this property is `TRUE` , hidden paragraphs are displayed. */
  var ShowHiddenParagraphs: Boolean = js.native
  
  /** If this property is `TRUE` , hidden text is displayed. */
  var ShowHiddenText: Boolean = js.native
  
  /** If this property is `TRUE` and the property ShowRulers is `TRUE` , the horizontal ruler is displayed. */
  var ShowHoriRuler: Boolean = js.native
  
  /** If this property is `TRUE` and the property ShowRulers is `TRUE` , the horizontal scroll bar is displayed. */
  var ShowHoriScrollBar: Boolean = js.native
  
  /** If this property is `TRUE` , index marks are displayed with gray background. */
  var ShowIndexMarkBackground: Boolean = js.native
  
  /**
    * If this property is `TRUE` , the settings of non-printing characters are applied.
    *
    * This option controls the use of the settings ShowHiddenCharacters, ShowTabstops, ShowSpaces, ShowBreaks and ShowParaBreaks
    * @since OOo 3.0
    */
  var ShowNonprintingCharacters: Boolean = js.native
  
  /** If this property is `TRUE` the document will be displayed as if it were a HTML document. */
  var ShowOnlineLayout: Boolean = js.native
  
  /** If this property is `TRUE` , paragraph breaks are visible. */
  var ShowParaBreaks: Boolean = js.native
  
  /** If this property is `TRUE` , protected spaces (hard spaces) are displayed with gray background. */
  var ShowProtectedSpaces: Boolean = js.native
  
  /** ShowHoriRuler and ShowVertRuler determine whether a ruler is visible. */
  var ShowRulers: Boolean = js.native
  
  /**
    * If this property is `TRUE` , and the scroll bar is shown, a tool tip is displayed while scrolling.
    * @since LibreOffice 4.2
    */
  var ShowScrollBarTips: Boolean = js.native
  
  /** If this property is `TRUE` , soft hyphens are displayed with gray background. */
  var ShowSoftHyphens: Boolean = js.native
  
  /** If this property is `TRUE` , spaces are displayed with dots. */
  var ShowSpaces: Boolean = js.native
  
  /** If this property is `TRUE` , table boundaries are displayed. */
  var ShowTableBoundaries: Boolean = js.native
  
  /** If this property is `TRUE` , tables are visible. */
  var ShowTables: Boolean = js.native
  
  /** If this property is `TRUE` , tab stops are visible. */
  var ShowTabstops: Boolean = js.native
  
  /** If this property is `TRUE` , text boundaries are displayed. */
  var ShowTextBoundaries: Boolean = js.native
  
  /** If this property is `TRUE` , text fields are displayed with gray background. */
  var ShowTextFieldBackground: Boolean = js.native
  
  /** If this property is `TRUE` , the vertical ruler is displayed. */
  var ShowVertRuler: Boolean = js.native
  
  /** If this property is `TRUE` , the vertical scroll bar is displayed. */
  var ShowVertScrollBar: Boolean = js.native
  
  /** If this property is `TRUE` , smooth scrolling is active. */
  var SmoothScrolling: Boolean = js.native
  
  /**
    * metric unit of the vertical ruler
    *
    * Uses values from {@link com.sun.star.awt.FieldUnit}
    * @since OOo 3.1
    */
  var VerticalRulerMetric: Double = js.native
  
  /**
    * This property defines the zoom type for the document.
    * @see com.sun.star.view.DocumentZoomType
    */
  var ZoomType: Double = js.native
  
  /** Defines the zoom value to use. Valid only if the ZoomType is set to {@link com.sun.star.view.DocumentZoomType.BY_VALUE} . */
  var ZoomValue: Double = js.native
}
object ViewSettings {
  
  @scala.inline
  def apply(
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
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ViewSettings = {
    val __obj = js.Dynamic.literal(HideWhitespace = HideWhitespace.asInstanceOf[js.Any], HorizontalRulerMetric = HorizontalRulerMetric.asInstanceOf[js.Any], IsExecuteHyperlinks = IsExecuteHyperlinks.asInstanceOf[js.Any], IsRasterVisible = IsRasterVisible.asInstanceOf[js.Any], IsSnapToRaster = IsSnapToRaster.asInstanceOf[js.Any], IsVertRulerRightAligned = IsVertRulerRightAligned.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RasterResolutionX = RasterResolutionX.asInstanceOf[js.Any], RasterResolutionY = RasterResolutionY.asInstanceOf[js.Any], RasterSubdivisionX = RasterSubdivisionX.asInstanceOf[js.Any], RasterSubdivisionY = RasterSubdivisionY.asInstanceOf[js.Any], ShowAnnotations = ShowAnnotations.asInstanceOf[js.Any], ShowBreaks = ShowBreaks.asInstanceOf[js.Any], ShowContentTips = ShowContentTips.asInstanceOf[js.Any], ShowDrawings = ShowDrawings.asInstanceOf[js.Any], ShowFieldCommands = ShowFieldCommands.asInstanceOf[js.Any], ShowFootnoteBackground = ShowFootnoteBackground.asInstanceOf[js.Any], ShowGraphics = ShowGraphics.asInstanceOf[js.Any], ShowHiddenCharacters = ShowHiddenCharacters.asInstanceOf[js.Any], ShowHiddenParagraphs = ShowHiddenParagraphs.asInstanceOf[js.Any], ShowHiddenText = ShowHiddenText.asInstanceOf[js.Any], ShowHoriRuler = ShowHoriRuler.asInstanceOf[js.Any], ShowHoriScrollBar = ShowHoriScrollBar.asInstanceOf[js.Any], ShowIndexMarkBackground = ShowIndexMarkBackground.asInstanceOf[js.Any], ShowNonprintingCharacters = ShowNonprintingCharacters.asInstanceOf[js.Any], ShowOnlineLayout = ShowOnlineLayout.asInstanceOf[js.Any], ShowParaBreaks = ShowParaBreaks.asInstanceOf[js.Any], ShowProtectedSpaces = ShowProtectedSpaces.asInstanceOf[js.Any], ShowRulers = ShowRulers.asInstanceOf[js.Any], ShowScrollBarTips = ShowScrollBarTips.asInstanceOf[js.Any], ShowSoftHyphens = ShowSoftHyphens.asInstanceOf[js.Any], ShowSpaces = ShowSpaces.asInstanceOf[js.Any], ShowTableBoundaries = ShowTableBoundaries.asInstanceOf[js.Any], ShowTables = ShowTables.asInstanceOf[js.Any], ShowTabstops = ShowTabstops.asInstanceOf[js.Any], ShowTextBoundaries = ShowTextBoundaries.asInstanceOf[js.Any], ShowTextFieldBackground = ShowTextFieldBackground.asInstanceOf[js.Any], ShowVertRuler = ShowVertRuler.asInstanceOf[js.Any], ShowVertScrollBar = ShowVertScrollBar.asInstanceOf[js.Any], SmoothScrolling = SmoothScrolling.asInstanceOf[js.Any], VerticalRulerMetric = VerticalRulerMetric.asInstanceOf[js.Any], ZoomType = ZoomType.asInstanceOf[js.Any], ZoomValue = ZoomValue.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ViewSettings]
  }
  
  @scala.inline
  implicit class ViewSettingsOps[Self <: ViewSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHideWhitespace(value: Boolean): Self = this.set("HideWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalRulerMetric(value: Double): Self = this.set("HorizontalRulerMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExecuteHyperlinks(value: Boolean): Self = this.set("IsExecuteHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRasterVisible(value: Boolean): Self = this.set("IsRasterVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSnapToRaster(value: Boolean): Self = this.set("IsSnapToRaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVertRulerRightAligned(value: Boolean): Self = this.set("IsVertRulerRightAligned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRasterResolutionX(value: Double): Self = this.set("RasterResolutionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRasterResolutionY(value: Double): Self = this.set("RasterResolutionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRasterSubdivisionX(value: Double): Self = this.set("RasterSubdivisionX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRasterSubdivisionY(value: Double): Self = this.set("RasterSubdivisionY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAnnotations(value: Boolean): Self = this.set("ShowAnnotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBreaks(value: Boolean): Self = this.set("ShowBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowContentTips(value: Boolean): Self = this.set("ShowContentTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDrawings(value: Boolean): Self = this.set("ShowDrawings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFieldCommands(value: Boolean): Self = this.set("ShowFieldCommands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFootnoteBackground(value: Boolean): Self = this.set("ShowFootnoteBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGraphics(value: Boolean): Self = this.set("ShowGraphics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHiddenCharacters(value: Boolean): Self = this.set("ShowHiddenCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHiddenParagraphs(value: Boolean): Self = this.set("ShowHiddenParagraphs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHiddenText(value: Boolean): Self = this.set("ShowHiddenText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHoriRuler(value: Boolean): Self = this.set("ShowHoriRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHoriScrollBar(value: Boolean): Self = this.set("ShowHoriScrollBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIndexMarkBackground(value: Boolean): Self = this.set("ShowIndexMarkBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNonprintingCharacters(value: Boolean): Self = this.set("ShowNonprintingCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnlineLayout(value: Boolean): Self = this.set("ShowOnlineLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowParaBreaks(value: Boolean): Self = this.set("ShowParaBreaks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowProtectedSpaces(value: Boolean): Self = this.set("ShowProtectedSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRulers(value: Boolean): Self = this.set("ShowRulers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowScrollBarTips(value: Boolean): Self = this.set("ShowScrollBarTips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSoftHyphens(value: Boolean): Self = this.set("ShowSoftHyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSpaces(value: Boolean): Self = this.set("ShowSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTableBoundaries(value: Boolean): Self = this.set("ShowTableBoundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTables(value: Boolean): Self = this.set("ShowTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTabstops(value: Boolean): Self = this.set("ShowTabstops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTextBoundaries(value: Boolean): Self = this.set("ShowTextBoundaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTextFieldBackground(value: Boolean): Self = this.set("ShowTextFieldBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowVertRuler(value: Boolean): Self = this.set("ShowVertRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowVertScrollBar(value: Boolean): Self = this.set("ShowVertScrollBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothScrolling(value: Boolean): Self = this.set("SmoothScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalRulerMetric(value: Double): Self = this.set("VerticalRulerMetric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomType(value: Double): Self = this.set("ZoomType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomValue(value: Double): Self = this.set("ZoomValue", value.asInstanceOf[js.Any])
  }
}
