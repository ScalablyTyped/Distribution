package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contributes common properties of page styles.
  * @see com.sun.star.text.TextPageStyle
  * @see com.sun.star.sheet.TablePageStyle
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.PageProperties because var conflicts: UserDefinedAttributes. Inlined BackColor, BackGraphicFilter, BackGraphicLocation, BackGraphicURL, BackTransparent, BorderDistance, BottomBorder, BottomBorderDistance, BottomMargin, FirstIsShared, FooterBackColor, FooterBackGraphicFilter, FooterBackGraphicLocation, FooterBackGraphicURL, FooterBackTransparent, FooterBodyDistance, FooterBorderDistance, FooterBottomBorder, FooterBottomBorderDistance, FooterDynamicSpacing, FooterHeight, FooterIsDynamicHeight, FooterIsOn, FooterIsShared, FooterLeftBorder, FooterLeftBorderDistance, FooterLeftMargin, FooterRightBorder, FooterRightBorderDistance, FooterRightMargin, FooterShadowFormat, FooterText, FooterTextLeft, FooterTextRight, FooterTopBorder, FooterTopBorderDistance, FootnoteHeight, FootnoteLineAdjust, FootnoteLineColor, FootnoteLineDistance, FootnoteLineRelativeWidth, FootnoteLineStyle, FootnoteLineTextDistance, FootnoteLineWeight, GridBaseHeight, GridColor, GridDisplay, GridLines, GridMode, GridPrint, GridRubyBelow, GridRubyHeight, HeaderBackColor, HeaderBackGraphicFilter, HeaderBackGraphicLocation, HeaderBackGraphicURL, HeaderBackTransparent, HeaderBodyDistance, HeaderBorderDistance, HeaderBottomBorder, HeaderBottomBorderDistance, HeaderDynamicSpacing, HeaderHeight, HeaderIsDynamicHeight, HeaderIsOn, HeaderIsShared, HeaderLeftBorder, HeaderLeftBorderDistance, HeaderLeftMargin, HeaderRightBorder, HeaderRightBorderDistance, HeaderRightMargin, HeaderShadowFormat, HeaderText, HeaderTextLeft, HeaderTextRight, HeaderTopBorder, HeaderTopBorderDistance, Height, IsLandscape, LeftBorder, LeftBorderDistance, LeftMargin, NumberingType, PageStyleLayout, PrinterPaperTray, RegisterModeActive, RegisterParagraphStyle, RightBorder, RightBorderDistance, RightMargin, ShadowFormat, Size, TextColumns, TopBorder, TopBorderDistance, TopMargin, Width, WritingMode */ trait PageStyle extends Style {
  /** contains the background color of the page. */
  var BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the filter name of the background graphic. */
  var BackGraphicFilter: java.lang.String
  /** determines the location of the background graphic. */
  var BackGraphicLocation: GraphicLocation
  /** contains the URL of the background graphic. */
  var BackGraphicURL: java.lang.String
  /**
    * determines if the background color is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.BackColor} will not be used.
    */
  var BackTransparent: scala.Boolean
  /** determines the distance of all borders of the page. */
  var BorderDistance: scala.Double
  /** determines the style of the bottom border line of the page. */
  var BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** determines the bottom border distance of the page. */
  var BottomBorderDistance: scala.Double
  /** determines the bottom margin of the page. */
  var BottomMargin: scala.Double
  /**
    * determines if the header/footer content on the first page and remaining pages is the same.
    * @since LibreOffice 4.0
    */
  var FirstIsShared: scala.Boolean
  /** contains the color of the background of the footer. */
  var FooterBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the filter name of the background graphic in the footer. */
  var FooterBackGraphicFilter: java.lang.String
  /** determines the location of the background graphic in the footer. */
  var FooterBackGraphicLocation: GraphicLocation
  /** contains the URL of the background graphic in the footer. */
  var FooterBackGraphicURL: java.lang.String
  /** determines if the background of the footer is transparent. */
  var FooterBackTransparent: scala.Boolean
  /** determines the distance between the footer and the body text area. */
  var FooterBodyDistance: scala.Double
  /** contains the distance of all borders of the footer. */
  var FooterBorderDistance: scala.Double
  /** contains the style of the bottom border line of the footer. */
  var FooterBottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the bottom border distance of the footer. */
  var FooterBottomBorderDistance: scala.Double
  /** determines whether to use dynamic spacing in footer or not. */
  var FooterDynamicSpacing: scala.Boolean
  /** determines the height of the footer. */
  var FooterHeight: scala.Double
  /** determines if the height of the footer depends on the content. */
  var FooterIsDynamicHeight: scala.Boolean
  /** determines if a footer is used on the page. */
  var FooterIsOn: scala.Boolean
  /** determines if the footer content on left and right pages is the same. */
  var FooterIsShared: scala.Boolean
  /** contains the style of the left border line of the footer. */
  var FooterLeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the left border distance of the footer. */
  var FooterLeftBorderDistance: scala.Double
  /** determines the left margin of the footer. */
  var FooterLeftMargin: scala.Double
  /** contains the style of the right border line of the footer. */
  var FooterRightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the right border distance of the footer. */
  var FooterRightBorderDistance: scala.Double
  /** determines the right margin of the footer. */
  var FooterRightMargin: scala.Double
  /** determines the shadow of the footer. */
  var FooterShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat
  /** contains the interface to the text of the footer. */
  var FooterText: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
  /** contains the interface to the text of the footer of a left page. */
  var FooterTextLeft: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
  /** contains the interface to the text of the footer of a right page.contains . */
  var FooterTextRight: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
  /** contains the style of the top border line of the footer. */
  var FooterTopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the top border distance of the footer. */
  var FooterTopBorderDistance: scala.Double
  /** contains the maximum height of the footnote area. If set to zero then the height of the current page is used as limit. */
  var FootnoteHeight: scala.Double
  /**
    * contains the adjustment of the separator line between the text and the footnote area.
    *
    * com::sun::star::text::HorizontalAdjusts.
    */
  var FootnoteLineAdjust: scala.Double
  /** contains the color of the separator line between the text and the footnote area. */
  var FootnoteLineColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the distance between the footnote area and the separator line between the text and the footnote area. */
  var FootnoteLineDistance: scala.Double
  /** contains the relative width of the separator line between the text and the footnote area. */
  var FootnoteLineRelativeWidth: scala.Double
  /**
    * contains the style of the separator line between the text and the footnote area.
    * @see com.sun.star.style.FootnoteLineStyle for the possible values.
    */
  var FootnoteLineStyle: scala.Double
  /** contains the distance between the text and the separator line between the text and the footnote area. */
  var FootnoteLineTextDistance: scala.Double
  /** contains the weight of the separator line between the text and the footnote area. */
  var FootnoteLineWeight: scala.Double
  /** contains the height of the base text line inside the text grid */
  var GridBaseHeight: scala.Double
  /** contains the display color of the text grid */
  var GridColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** determines whether the text grid lines are visible or not */
  var GridDisplay: scala.Boolean
  /** contains the number of lines in the text grid */
  var GridLines: scala.Double
  /** contains the mode of the text grid (none, lines, ...), as represented by {@link com.sun.star.text.TextGridMode} constants */
  var GridMode: scala.Double
  /** determines whether the text grid lines are printed */
  var GridPrint: scala.Boolean
  /** determines whether the text grid's ruby line is located below or above the base line */
  var GridRubyBelow: scala.Boolean
  /** contains the height of the ruby text line inside the text grid */
  var GridRubyHeight: scala.Double
  /** contains the color of the background of the header. */
  var HeaderBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the filter name of the background graphic of the header. */
  var HeaderBackGraphicFilter: java.lang.String
  /** determines the location of the background graphic of the header. */
  var HeaderBackGraphicLocation: GraphicLocation
  /** contains the URL of the background graphic of the header. */
  var HeaderBackGraphicURL: java.lang.String
  /**
    * determines if the background color of the header is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.HeaderBackColor} will not be used.
    */
  var HeaderBackTransparent: scala.Boolean
  /** determines the distance between the header and the body text area. */
  var HeaderBodyDistance: scala.Double
  /** determines the distance of all borders of the header. */
  var HeaderBorderDistance: scala.Double
  /** determines the style of the bottom border line of the header. */
  var HeaderBottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** determines the bottom border distance of the header. */
  var HeaderBottomBorderDistance: scala.Double
  /** determines whether to use dynamic spacing in header or not. */
  var HeaderDynamicSpacing: scala.Boolean
  /** contains the height of the header. */
  var HeaderHeight: scala.Double
  /** determines if the height of the header depends on the content. */
  var HeaderIsDynamicHeight: scala.Boolean
  /** determines if a header is used on the page. */
  var HeaderIsOn: scala.Boolean
  /** determines if the header content on left and right pages is the same. */
  var HeaderIsShared: scala.Boolean
  /** determines the style of the left border line of the header. */
  var HeaderLeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** determines the left border distance of the header. */
  var HeaderLeftBorderDistance: scala.Double
  /** contains the left margin of the header. */
  var HeaderLeftMargin: scala.Double
  /** determines the style of the right border line of the header. */
  var HeaderRightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** determines the right border distance of the header. */
  var HeaderRightBorderDistance: scala.Double
  /** contains the right margin of the header. */
  var HeaderRightMargin: scala.Double
  /** determines the shadow of the header. */
  var HeaderShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat
  /** contains the interface to the text of the header. */
  var HeaderText: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
  /** contains the interface to the text of the header of left pages. */
  var HeaderTextLeft: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
  /** contains the interface to the text of the header of right pages. */
  var HeaderTextRight: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XText
  /** determines the style of the top border line of the header. */
  var HeaderTopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** determines the top border distance of the header. */
  var HeaderTopBorderDistance: scala.Double
  /** contains the height of the page. */
  var Height: scala.Double
  /** determines if the page format is landscape. */
  var IsLandscape: scala.Boolean
  /** determines the style of the left border line of the page. */
  var LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** determines the left border distance of the page. */
  var LeftBorderDistance: scala.Double
  /** determines the left margin of the page. */
  var LeftMargin: scala.Double
  /** determines the default numbering type for this page. */
  var NumberingType: scala.Double
  /** determines the layout of the page. */
  var PageStyleLayout: PageStyleLayout
  /** contains the name of a paper tray of the selected printer. */
  var PrinterPaperTray: java.lang.String
  /** determines if the register mode is active on that page. */
  var RegisterModeActive: scala.Boolean
  /** contains the name of the paragraph style that is used as reference of the register mode. */
  var RegisterParagraphStyle: java.lang.String
  /** determines the style of the right border line of the page. */
  var RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** determines the right border distance of the page. */
  var RightBorderDistance: scala.Double
  /** determines the right margin of the page. */
  var RightMargin: scala.Double
  /** determines the shadow of the page. */
  var ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat
  /** contains the paper size of the page. */
  var Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** contains the column settings of the page. */
  var TextColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextColumns
  /** determines the style of the top border line of the page. */
  var TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** determines the top border distance of the page. */
  var TopBorderDistance: scala.Double
  /** determines the top margin of the page. */
  var TopMargin: scala.Double
  /** contains the width of the page. */
  var Width: scala.Double
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: scala.Double
}

object PageStyle {
  @scala.inline
  def apply(
    BackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    BackGraphicFilter: java.lang.String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: java.lang.String,
    BackTransparent: scala.Boolean,
    BorderDistance: scala.Double,
    BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    BottomBorderDistance: scala.Double,
    BottomMargin: scala.Double,
    DisplayName: java.lang.String,
    FirstIsShared: scala.Boolean,
    FollowStyle: java.lang.String,
    FooterBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    FooterBackGraphicFilter: java.lang.String,
    FooterBackGraphicLocation: GraphicLocation,
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
    HeaderBackGraphicLocation: GraphicLocation,
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
    Name: java.lang.String,
    NumberingType: scala.Double,
    PageStyleLayout: PageStyleLayout,
    ParaStyleConditions: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    ParentStyle: java.lang.String,
    PrinterPaperTray: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    RegisterModeActive: scala.Boolean,
    RegisterParagraphStyle: java.lang.String,
    RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    RightBorderDistance: scala.Double,
    RightMargin: scala.Double,
    ShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    StyleInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    TextColumns: activexDashLibreofficeLib.comNs.sunNs.starNs.textNs.XTextColumns,
    TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    TopBorderDistance: scala.Double,
    TopMargin: scala.Double,
    UserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    Width: scala.Double,
    WritingMode: scala.Double,
    acquire: js.Function0[scala.Unit],
    addPropertiesChangeListener: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
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
    firePropertiesChangeEvent: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
    getName: js.Function0[java.lang.String],
    getParentStyle: js.Function0[java.lang.String],
    getPropertyDefaults: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyStates: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyState]
    ],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getPropertyValues: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[_]
    ],
    isInUse: js.Function0[scala.Boolean],
    isUserDefined: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertiesChangeListener: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertiesChangeListener, 
      scala.Unit
    ],
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
    setAllPropertiesToDefault: js.Function0[scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit],
    setParentStyle: js.Function1[java.lang.String, scala.Unit],
    setPropertiesToDefault: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit],
    setPropertyValues: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ]
  ): PageStyle = {
    val __obj = js.Dynamic.literal(BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BottomMargin = BottomMargin, DisplayName = DisplayName, FirstIsShared = FirstIsShared, FollowStyle = FollowStyle, FooterBackColor = FooterBackColor, FooterBackGraphicFilter = FooterBackGraphicFilter, FooterBackGraphicLocation = FooterBackGraphicLocation, FooterBackGraphicURL = FooterBackGraphicURL, FooterBackTransparent = FooterBackTransparent, FooterBodyDistance = FooterBodyDistance, FooterBorderDistance = FooterBorderDistance, FooterBottomBorder = FooterBottomBorder, FooterBottomBorderDistance = FooterBottomBorderDistance, FooterDynamicSpacing = FooterDynamicSpacing, FooterHeight = FooterHeight, FooterIsDynamicHeight = FooterIsDynamicHeight, FooterIsOn = FooterIsOn, FooterIsShared = FooterIsShared, FooterLeftBorder = FooterLeftBorder, FooterLeftBorderDistance = FooterLeftBorderDistance, FooterLeftMargin = FooterLeftMargin, FooterRightBorder = FooterRightBorder, FooterRightBorderDistance = FooterRightBorderDistance, FooterRightMargin = FooterRightMargin, FooterShadowFormat = FooterShadowFormat, FooterText = FooterText, FooterTextLeft = FooterTextLeft, FooterTextRight = FooterTextRight, FooterTopBorder = FooterTopBorder, FooterTopBorderDistance = FooterTopBorderDistance, FootnoteHeight = FootnoteHeight, FootnoteLineAdjust = FootnoteLineAdjust, FootnoteLineColor = FootnoteLineColor, FootnoteLineDistance = FootnoteLineDistance, FootnoteLineRelativeWidth = FootnoteLineRelativeWidth, FootnoteLineStyle = FootnoteLineStyle, FootnoteLineTextDistance = FootnoteLineTextDistance, FootnoteLineWeight = FootnoteLineWeight, GridBaseHeight = GridBaseHeight, GridColor = GridColor, GridDisplay = GridDisplay, GridLines = GridLines, GridMode = GridMode, GridPrint = GridPrint, GridRubyBelow = GridRubyBelow, GridRubyHeight = GridRubyHeight, HeaderBackColor = HeaderBackColor, HeaderBackGraphicFilter = HeaderBackGraphicFilter, HeaderBackGraphicLocation = HeaderBackGraphicLocation, HeaderBackGraphicURL = HeaderBackGraphicURL, HeaderBackTransparent = HeaderBackTransparent, HeaderBodyDistance = HeaderBodyDistance, HeaderBorderDistance = HeaderBorderDistance, HeaderBottomBorder = HeaderBottomBorder, HeaderBottomBorderDistance = HeaderBottomBorderDistance, HeaderDynamicSpacing = HeaderDynamicSpacing, HeaderHeight = HeaderHeight, HeaderIsDynamicHeight = HeaderIsDynamicHeight, HeaderIsOn = HeaderIsOn, HeaderIsShared = HeaderIsShared, HeaderLeftBorder = HeaderLeftBorder, HeaderLeftBorderDistance = HeaderLeftBorderDistance, HeaderLeftMargin = HeaderLeftMargin, HeaderRightBorder = HeaderRightBorder, HeaderRightBorderDistance = HeaderRightBorderDistance, HeaderRightMargin = HeaderRightMargin, HeaderShadowFormat = HeaderShadowFormat, HeaderText = HeaderText, HeaderTextLeft = HeaderTextLeft, HeaderTextRight = HeaderTextRight, HeaderTopBorder = HeaderTopBorder, HeaderTopBorderDistance = HeaderTopBorderDistance, Height = Height, Hidden = Hidden, IsAutoUpdate = IsAutoUpdate, IsLandscape = IsLandscape, IsPhysical = IsPhysical, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, LeftMargin = LeftMargin, Name = Name, NumberingType = NumberingType, PageStyleLayout = PageStyleLayout, ParaStyleConditions = ParaStyleConditions, ParentStyle = ParentStyle, PrinterPaperTray = PrinterPaperTray, PropertySetInfo = PropertySetInfo, RegisterModeActive = RegisterModeActive, RegisterParagraphStyle = RegisterParagraphStyle, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RightMargin = RightMargin, ShadowFormat = ShadowFormat, Size = Size, StyleInteropGrabBag = StyleInteropGrabBag, TextColumns = TextColumns, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, TopMargin = TopMargin, UserDefinedAttributes = UserDefinedAttributes, Width = Width, WritingMode = WritingMode, acquire = acquire, addPropertiesChangeListener = addPropertiesChangeListener, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, firePropertiesChangeEvent = firePropertiesChangeEvent, getName = getName, getParentStyle = getParentStyle, getPropertyDefaults = getPropertyDefaults, getPropertySetInfo = getPropertySetInfo, getPropertyStates = getPropertyStates, getPropertyValue = getPropertyValue, getPropertyValues = getPropertyValues, isInUse = isInUse, isUserDefined = isUserDefined, queryInterface = queryInterface, release = release, removePropertiesChangeListener = removePropertiesChangeListener, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setAllPropertiesToDefault = setAllPropertiesToDefault, setName = setName, setParentStyle = setParentStyle, setPropertiesToDefault = setPropertiesToDefault, setPropertyValue = setPropertyValue, setPropertyValues = setPropertyValues)
  
    __obj.asInstanceOf[PageStyle]
  }
}

