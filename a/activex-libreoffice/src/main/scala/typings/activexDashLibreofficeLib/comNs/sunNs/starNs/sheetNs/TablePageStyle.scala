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

object TablePageStyle {
  @scala.inline
  def apply(
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    BorderDistance: scala.Double,
    BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    BottomBorderDistance: scala.Double,
    BottomMargin: scala.Double,
    CenterHorizontally: scala.Boolean,
    CenterVertically: scala.Boolean,
    DisplayName: java.lang.String,
    FirstIsShared: scala.Boolean,
    FirstPageNumber: scala.Double,
    FollowStyle: java.lang.String,
    FooterBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FooterBackGraphicFilter: java.lang.String,
    FooterBackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    FooterBackGraphicURL: java.lang.String,
    FooterBackTransparent: scala.Boolean,
    FooterBodyDistance: scala.Double,
    FooterBorderDistance: scala.Double,
    FooterBottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    FooterBottomBorderDistance: scala.Double,
    FooterDynamicSpacing: scala.Boolean,
    FooterHeight: scala.Double,
    FooterIsDynamicHeight: scala.Boolean,
    FooterIsOn: scala.Boolean,
    FooterIsShared: scala.Boolean,
    FooterLeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    FooterLeftBorderDistance: scala.Double,
    FooterLeftMargin: scala.Double,
    FooterRightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    FooterRightBorderDistance: scala.Double,
    FooterRightMargin: scala.Double,
    FooterShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    FooterText: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    FooterTextLeft: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    FooterTextRight: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    FooterTopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    FooterTopBorderDistance: scala.Double,
    FootnoteHeight: scala.Double,
    FootnoteLineAdjust: scala.Double,
    FootnoteLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FootnoteLineDistance: scala.Double,
    FootnoteLineRelativeWidth: scala.Double,
    FootnoteLineStyle: scala.Double,
    FootnoteLineTextDistance: scala.Double,
    FootnoteLineWeight: scala.Double,
    GridBaseHeight: scala.Double,
    GridColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    GridDisplay: scala.Boolean,
    GridLines: scala.Double,
    GridMode: scala.Double,
    GridPrint: scala.Boolean,
    GridRubyBelow: scala.Boolean,
    GridRubyHeight: scala.Double,
    HeaderBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    HeaderBackGraphicFilter: java.lang.String,
    HeaderBackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation,
    HeaderBackGraphicURL: java.lang.String,
    HeaderBackTransparent: scala.Boolean,
    HeaderBodyDistance: scala.Double,
    HeaderBorderDistance: scala.Double,
    HeaderBottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    HeaderBottomBorderDistance: scala.Double,
    HeaderDynamicSpacing: scala.Boolean,
    HeaderHeight: scala.Double,
    HeaderIsDynamicHeight: scala.Boolean,
    HeaderIsOn: scala.Boolean,
    HeaderIsShared: scala.Boolean,
    HeaderLeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    HeaderLeftBorderDistance: scala.Double,
    HeaderLeftMargin: scala.Double,
    HeaderRightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    HeaderRightBorderDistance: scala.Double,
    HeaderRightMargin: scala.Double,
    HeaderShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    HeaderText: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    HeaderTextLeft: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    HeaderTextRight: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText,
    HeaderTopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    HeaderTopBorderDistance: scala.Double,
    Height: scala.Double,
    Hidden: scala.Boolean,
    IsAutoUpdate: java.lang.String,
    IsLandscape: scala.Boolean,
    IsPhysical: scala.Boolean,
    LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    LeftBorderDistance: scala.Double,
    LeftMargin: scala.Double,
    LeftPageFooterContent: XHeaderFooterContent,
    LeftPageHeaderContent: XHeaderFooterContent,
    Name: java.lang.String,
    NumberingType: scala.Double,
    PageScale: scala.Double,
    PageStyleLayout: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageStyleLayout,
    ParaStyleConditions: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    ParentStyle: java.lang.String,
    PrintAnnotations: scala.Boolean,
    PrintCharts: scala.Boolean,
    PrintDownFirst: scala.Boolean,
    PrintDrawing: scala.Boolean,
    PrintFormulas: scala.Boolean,
    PrintGrid: scala.Boolean,
    PrintHeaders: scala.Boolean,
    PrintObjects: scala.Boolean,
    PrintZeroValues: scala.Boolean,
    PrinterPaperTray: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RegisterModeActive: scala.Boolean,
    RegisterParagraphStyle: java.lang.String,
    RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    RightBorderDistance: scala.Double,
    RightMargin: scala.Double,
    RightPageFooterContent: XHeaderFooterContent,
    RightPageHeaderContent: XHeaderFooterContent,
    ScaleToPages: scala.Double,
    ScaleToPagesX: scala.Double,
    ScaleToPagesY: scala.Double,
    ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    StyleInteropGrabBag: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    TextColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextColumns,
    TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    TopBorderDistance: scala.Double,
    TopMargin: scala.Double,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Width: scala.Double,
    WritingMode: scala.Double,
    acquire: () => scala.Unit,
    addPropertiesChangeListener: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener) => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    firePropertiesChangeEvent: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener) => scala.Unit,
    getName: () => java.lang.String,
    getParentStyle: () => java.lang.String,
    getPropertyDefaults: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => stdLib.SafeArray[_],
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyStates: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState],
    getPropertyValue: java.lang.String => js.Any,
    getPropertyValues: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => stdLib.SafeArray[_],
    isInUse: () => scala.Boolean,
    isUserDefined: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertiesChangeListener: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setAllPropertiesToDefault: () => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setParentStyle: java.lang.String => scala.Unit,
    setPropertiesToDefault: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit,
    setPropertyValues: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => scala.Unit
  ): TablePageStyle = {
    val __obj = js.Dynamic.literal(BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BottomMargin = BottomMargin, CenterHorizontally = CenterHorizontally, CenterVertically = CenterVertically, DisplayName = DisplayName, FirstIsShared = FirstIsShared, FirstPageNumber = FirstPageNumber, FollowStyle = FollowStyle, FooterBackColor = FooterBackColor, FooterBackGraphicFilter = FooterBackGraphicFilter, FooterBackGraphicLocation = FooterBackGraphicLocation, FooterBackGraphicURL = FooterBackGraphicURL, FooterBackTransparent = FooterBackTransparent, FooterBodyDistance = FooterBodyDistance, FooterBorderDistance = FooterBorderDistance, FooterBottomBorder = FooterBottomBorder, FooterBottomBorderDistance = FooterBottomBorderDistance, FooterDynamicSpacing = FooterDynamicSpacing, FooterHeight = FooterHeight, FooterIsDynamicHeight = FooterIsDynamicHeight, FooterIsOn = FooterIsOn, FooterIsShared = FooterIsShared, FooterLeftBorder = FooterLeftBorder, FooterLeftBorderDistance = FooterLeftBorderDistance, FooterLeftMargin = FooterLeftMargin, FooterRightBorder = FooterRightBorder, FooterRightBorderDistance = FooterRightBorderDistance, FooterRightMargin = FooterRightMargin, FooterShadowFormat = FooterShadowFormat, FooterText = FooterText, FooterTextLeft = FooterTextLeft, FooterTextRight = FooterTextRight, FooterTopBorder = FooterTopBorder, FooterTopBorderDistance = FooterTopBorderDistance, FootnoteHeight = FootnoteHeight, FootnoteLineAdjust = FootnoteLineAdjust, FootnoteLineColor = FootnoteLineColor, FootnoteLineDistance = FootnoteLineDistance, FootnoteLineRelativeWidth = FootnoteLineRelativeWidth, FootnoteLineStyle = FootnoteLineStyle, FootnoteLineTextDistance = FootnoteLineTextDistance, FootnoteLineWeight = FootnoteLineWeight, GridBaseHeight = GridBaseHeight, GridColor = GridColor, GridDisplay = GridDisplay, GridLines = GridLines, GridMode = GridMode, GridPrint = GridPrint, GridRubyBelow = GridRubyBelow, GridRubyHeight = GridRubyHeight, HeaderBackColor = HeaderBackColor, HeaderBackGraphicFilter = HeaderBackGraphicFilter, HeaderBackGraphicLocation = HeaderBackGraphicLocation, HeaderBackGraphicURL = HeaderBackGraphicURL, HeaderBackTransparent = HeaderBackTransparent, HeaderBodyDistance = HeaderBodyDistance, HeaderBorderDistance = HeaderBorderDistance, HeaderBottomBorder = HeaderBottomBorder, HeaderBottomBorderDistance = HeaderBottomBorderDistance, HeaderDynamicSpacing = HeaderDynamicSpacing, HeaderHeight = HeaderHeight, HeaderIsDynamicHeight = HeaderIsDynamicHeight, HeaderIsOn = HeaderIsOn, HeaderIsShared = HeaderIsShared, HeaderLeftBorder = HeaderLeftBorder, HeaderLeftBorderDistance = HeaderLeftBorderDistance, HeaderLeftMargin = HeaderLeftMargin, HeaderRightBorder = HeaderRightBorder, HeaderRightBorderDistance = HeaderRightBorderDistance, HeaderRightMargin = HeaderRightMargin, HeaderShadowFormat = HeaderShadowFormat, HeaderText = HeaderText, HeaderTextLeft = HeaderTextLeft, HeaderTextRight = HeaderTextRight, HeaderTopBorder = HeaderTopBorder, HeaderTopBorderDistance = HeaderTopBorderDistance, Height = Height, Hidden = Hidden, IsAutoUpdate = IsAutoUpdate, IsLandscape = IsLandscape, IsPhysical = IsPhysical, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, LeftMargin = LeftMargin, LeftPageFooterContent = LeftPageFooterContent, LeftPageHeaderContent = LeftPageHeaderContent, Name = Name, NumberingType = NumberingType, PageScale = PageScale, PageStyleLayout = PageStyleLayout, ParaStyleConditions = ParaStyleConditions, ParentStyle = ParentStyle, PrintAnnotations = PrintAnnotations, PrintCharts = PrintCharts, PrintDownFirst = PrintDownFirst, PrintDrawing = PrintDrawing, PrintFormulas = PrintFormulas, PrintGrid = PrintGrid, PrintHeaders = PrintHeaders, PrintObjects = PrintObjects, PrintZeroValues = PrintZeroValues, PrinterPaperTray = PrinterPaperTray, PropertySetInfo = PropertySetInfo, RegisterModeActive = RegisterModeActive, RegisterParagraphStyle = RegisterParagraphStyle, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RightMargin = RightMargin, RightPageFooterContent = RightPageFooterContent, RightPageHeaderContent = RightPageHeaderContent, ScaleToPages = ScaleToPages, ScaleToPagesX = ScaleToPagesX, ScaleToPagesY = ScaleToPagesY, ShadowFormat = ShadowFormat, Size = Size, StyleInteropGrabBag = StyleInteropGrabBag, TextColumns = TextColumns, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, TopMargin = TopMargin, UserDefinedAttributes = UserDefinedAttributes, Width = Width, WritingMode = WritingMode, acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
  
    __obj.asInstanceOf[TablePageStyle]
  }
}

