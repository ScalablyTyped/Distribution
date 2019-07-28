package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.PageStyle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.PageStyleLayout
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XText
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextColumns
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a page style for a spreadsheet.
  *
  * This service extends the service {@link com.sun.star.style.PageStyle} with spreadsheet specific properties.
  */
trait TablePageStyle extends PageStyle {
  /** determines whether the table is centered horizontally on the page. */
  var CenterHorizontally: Boolean
  /** determines whether the table is centered vertically on the page. */
  var CenterVertically: Boolean
  /**
    * contains the page number applied to the first page for this sheet.
    *
    * The value 0 indicates that the page numbers are continued from the previous sheet.
    */
  var FirstPageNumber: Double
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
  var PageScale: Double
  /** enables printing of cell annotations. */
  var PrintAnnotations: Boolean
  /** enables printing of charts. */
  var PrintCharts: Boolean
  /**
    * specifies the print order for the pages within each sheet.
    *
    * If `TRUE` , the order for printing pages begins with top-to-bottom, then continues with the next set of cell columns to the right. If `FALSE` , the
    * order for printing pages begins with left-to-right, then continues with the next set of cell rows to the bottom.
    */
  var PrintDownFirst: Boolean
  /** enables printing of drawing objects. */
  var PrintDrawing: Boolean
  /** enables printing of formulas instead of their results. */
  var PrintFormulas: Boolean
  /** enables printing of the cell grid. */
  var PrintGrid: Boolean
  /** enables printing of column and row headers. */
  var PrintHeaders: Boolean
  /** enables printing of embedded objects. */
  var PrintObjects: Boolean
  /** enables printing of zero-values. */
  var PrintZeroValues: Boolean
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
  var ScaleToPages: Double
  /**
    * contains the number of horizontal pages the sheet will printed on.
    * @since OOo 2.0
    */
  var ScaleToPagesX: Double
  /**
    * contains the number of vertical pages the sheet will printed on.
    * @since OOo 2.0
    */
  var ScaleToPagesY: Double
}

object TablePageStyle {
  @scala.inline
  def apply(
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BottomMargin: Double,
    CenterHorizontally: Boolean,
    CenterVertically: Boolean,
    DisplayName: String,
    FirstIsShared: Boolean,
    FirstPageNumber: Double,
    FollowStyle: String,
    FooterBackColor: Color,
    FooterBackGraphicFilter: String,
    FooterBackGraphicLocation: GraphicLocation,
    FooterBackGraphicURL: String,
    FooterBackTransparent: Boolean,
    FooterBodyDistance: Double,
    FooterBorderDistance: Double,
    FooterBottomBorder: BorderLine,
    FooterBottomBorderDistance: Double,
    FooterDynamicSpacing: Boolean,
    FooterHeight: Double,
    FooterIsDynamicHeight: Boolean,
    FooterIsOn: Boolean,
    FooterIsShared: Boolean,
    FooterLeftBorder: BorderLine,
    FooterLeftBorderDistance: Double,
    FooterLeftMargin: Double,
    FooterRightBorder: BorderLine,
    FooterRightBorderDistance: Double,
    FooterRightMargin: Double,
    FooterShadowFormat: ShadowFormat,
    FooterText: XText,
    FooterTextLeft: XText,
    FooterTextRight: XText,
    FooterTopBorder: BorderLine,
    FooterTopBorderDistance: Double,
    FootnoteHeight: Double,
    FootnoteLineAdjust: Double,
    FootnoteLineColor: Color,
    FootnoteLineDistance: Double,
    FootnoteLineRelativeWidth: Double,
    FootnoteLineStyle: Double,
    FootnoteLineTextDistance: Double,
    FootnoteLineWeight: Double,
    GridBaseHeight: Double,
    GridColor: Color,
    GridDisplay: Boolean,
    GridLines: Double,
    GridMode: Double,
    GridPrint: Boolean,
    GridRubyBelow: Boolean,
    GridRubyHeight: Double,
    HeaderBackColor: Color,
    HeaderBackGraphicFilter: String,
    HeaderBackGraphicLocation: GraphicLocation,
    HeaderBackGraphicURL: String,
    HeaderBackTransparent: Boolean,
    HeaderBodyDistance: Double,
    HeaderBorderDistance: Double,
    HeaderBottomBorder: BorderLine,
    HeaderBottomBorderDistance: Double,
    HeaderDynamicSpacing: Boolean,
    HeaderHeight: Double,
    HeaderIsDynamicHeight: Boolean,
    HeaderIsOn: Boolean,
    HeaderIsShared: Boolean,
    HeaderLeftBorder: BorderLine,
    HeaderLeftBorderDistance: Double,
    HeaderLeftMargin: Double,
    HeaderRightBorder: BorderLine,
    HeaderRightBorderDistance: Double,
    HeaderRightMargin: Double,
    HeaderShadowFormat: ShadowFormat,
    HeaderText: XText,
    HeaderTextLeft: XText,
    HeaderTextRight: XText,
    HeaderTopBorder: BorderLine,
    HeaderTopBorderDistance: Double,
    Height: Double,
    Hidden: Boolean,
    IsAutoUpdate: String,
    IsLandscape: Boolean,
    IsPhysical: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    LeftPageFooterContent: XHeaderFooterContent,
    LeftPageHeaderContent: XHeaderFooterContent,
    Name: String,
    NumberingType: Double,
    PageScale: Double,
    PageStyleLayout: PageStyleLayout,
    ParaStyleConditions: SafeArray[NamedValue],
    ParentStyle: String,
    PrintAnnotations: Boolean,
    PrintCharts: Boolean,
    PrintDownFirst: Boolean,
    PrintDrawing: Boolean,
    PrintFormulas: Boolean,
    PrintGrid: Boolean,
    PrintHeaders: Boolean,
    PrintObjects: Boolean,
    PrintZeroValues: Boolean,
    PrinterPaperTray: String,
    PropertySetInfo: XPropertySetInfo,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    RightPageFooterContent: XHeaderFooterContent,
    RightPageHeaderContent: XHeaderFooterContent,
    ScaleToPages: Double,
    ScaleToPagesX: Double,
    ScaleToPagesY: Double,
    ShadowFormat: ShadowFormat,
    Size: Size,
    StyleInteropGrabBag: SafeArray[PropertyValue],
    TextColumns: XTextColumns,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    UserDefinedAttributes: XNameContainer,
    Width: Double,
    WritingMode: Double,
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getName: () => String,
    getParentStyle: () => String,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[_],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[_],
    isInUse: () => Boolean,
    isUserDefined: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertiesChangeListener: XPropertiesChangeListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setAllPropertiesToDefault: () => Unit,
    setName: String => Unit,
    setParentStyle: String => Unit,
    setPropertiesToDefault: SeqEquiv[String] => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValues: (SeqEquiv[String], SeqEquiv[_]) => Unit
  ): TablePageStyle = {
    val __obj = js.Dynamic.literal(BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BottomMargin = BottomMargin, CenterHorizontally = CenterHorizontally, CenterVertically = CenterVertically, DisplayName = DisplayName, FirstIsShared = FirstIsShared, FirstPageNumber = FirstPageNumber, FollowStyle = FollowStyle, FooterBackColor = FooterBackColor, FooterBackGraphicFilter = FooterBackGraphicFilter, FooterBackGraphicLocation = FooterBackGraphicLocation, FooterBackGraphicURL = FooterBackGraphicURL, FooterBackTransparent = FooterBackTransparent, FooterBodyDistance = FooterBodyDistance, FooterBorderDistance = FooterBorderDistance, FooterBottomBorder = FooterBottomBorder, FooterBottomBorderDistance = FooterBottomBorderDistance, FooterDynamicSpacing = FooterDynamicSpacing, FooterHeight = FooterHeight, FooterIsDynamicHeight = FooterIsDynamicHeight, FooterIsOn = FooterIsOn, FooterIsShared = FooterIsShared, FooterLeftBorder = FooterLeftBorder, FooterLeftBorderDistance = FooterLeftBorderDistance, FooterLeftMargin = FooterLeftMargin, FooterRightBorder = FooterRightBorder, FooterRightBorderDistance = FooterRightBorderDistance, FooterRightMargin = FooterRightMargin, FooterShadowFormat = FooterShadowFormat, FooterText = FooterText, FooterTextLeft = FooterTextLeft, FooterTextRight = FooterTextRight, FooterTopBorder = FooterTopBorder, FooterTopBorderDistance = FooterTopBorderDistance, FootnoteHeight = FootnoteHeight, FootnoteLineAdjust = FootnoteLineAdjust, FootnoteLineColor = FootnoteLineColor, FootnoteLineDistance = FootnoteLineDistance, FootnoteLineRelativeWidth = FootnoteLineRelativeWidth, FootnoteLineStyle = FootnoteLineStyle, FootnoteLineTextDistance = FootnoteLineTextDistance, FootnoteLineWeight = FootnoteLineWeight, GridBaseHeight = GridBaseHeight, GridColor = GridColor, GridDisplay = GridDisplay, GridLines = GridLines, GridMode = GridMode, GridPrint = GridPrint, GridRubyBelow = GridRubyBelow, GridRubyHeight = GridRubyHeight, HeaderBackColor = HeaderBackColor, HeaderBackGraphicFilter = HeaderBackGraphicFilter, HeaderBackGraphicLocation = HeaderBackGraphicLocation, HeaderBackGraphicURL = HeaderBackGraphicURL, HeaderBackTransparent = HeaderBackTransparent, HeaderBodyDistance = HeaderBodyDistance, HeaderBorderDistance = HeaderBorderDistance, HeaderBottomBorder = HeaderBottomBorder, HeaderBottomBorderDistance = HeaderBottomBorderDistance, HeaderDynamicSpacing = HeaderDynamicSpacing, HeaderHeight = HeaderHeight, HeaderIsDynamicHeight = HeaderIsDynamicHeight, HeaderIsOn = HeaderIsOn, HeaderIsShared = HeaderIsShared, HeaderLeftBorder = HeaderLeftBorder, HeaderLeftBorderDistance = HeaderLeftBorderDistance, HeaderLeftMargin = HeaderLeftMargin, HeaderRightBorder = HeaderRightBorder, HeaderRightBorderDistance = HeaderRightBorderDistance, HeaderRightMargin = HeaderRightMargin, HeaderShadowFormat = HeaderShadowFormat, HeaderText = HeaderText, HeaderTextLeft = HeaderTextLeft, HeaderTextRight = HeaderTextRight, HeaderTopBorder = HeaderTopBorder, HeaderTopBorderDistance = HeaderTopBorderDistance, Height = Height, Hidden = Hidden, IsAutoUpdate = IsAutoUpdate, IsLandscape = IsLandscape, IsPhysical = IsPhysical, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, LeftMargin = LeftMargin, LeftPageFooterContent = LeftPageFooterContent, LeftPageHeaderContent = LeftPageHeaderContent, Name = Name, NumberingType = NumberingType, PageScale = PageScale, PageStyleLayout = PageStyleLayout, ParaStyleConditions = ParaStyleConditions, ParentStyle = ParentStyle, PrintAnnotations = PrintAnnotations, PrintCharts = PrintCharts, PrintDownFirst = PrintDownFirst, PrintDrawing = PrintDrawing, PrintFormulas = PrintFormulas, PrintGrid = PrintGrid, PrintHeaders = PrintHeaders, PrintObjects = PrintObjects, PrintZeroValues = PrintZeroValues, PrinterPaperTray = PrinterPaperTray, PropertySetInfo = PropertySetInfo, RegisterModeActive = RegisterModeActive, RegisterParagraphStyle = RegisterParagraphStyle, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RightMargin = RightMargin, RightPageFooterContent = RightPageFooterContent, RightPageHeaderContent = RightPageHeaderContent, ScaleToPages = ScaleToPages, ScaleToPagesX = ScaleToPagesX, ScaleToPagesY = ScaleToPagesY, ShadowFormat = ShadowFormat, Size = Size, StyleInteropGrabBag = StyleInteropGrabBag, TextColumns = TextColumns, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, TopMargin = TopMargin, UserDefinedAttributes = UserDefinedAttributes, Width = Width, WritingMode = WritingMode, acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
  
    __obj.asInstanceOf[TablePageStyle]
  }
}

