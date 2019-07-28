package typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XText
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextColumns
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the style of pages. */
trait PageProperties extends js.Object {
  /** contains the background color of the page. */
  var BackColor: Color
  /** contains the filter name of the background graphic. */
  var BackGraphicFilter: String
  /** determines the location of the background graphic. */
  var BackGraphicLocation: GraphicLocation
  /** contains the URL of the background graphic. */
  var BackGraphicURL: String
  /**
    * determines if the background color is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.BackColor} will not be used.
    */
  var BackTransparent: Boolean
  /** determines the distance of all borders of the page. */
  var BorderDistance: Double
  /** determines the style of the bottom border line of the page. */
  var BottomBorder: BorderLine
  /** determines the bottom border distance of the page. */
  var BottomBorderDistance: Double
  /** determines the bottom margin of the page. */
  var BottomMargin: Double
  /**
    * determines if the header/footer content on the first page and remaining pages is the same.
    * @since LibreOffice 4.0
    */
  var FirstIsShared: Boolean
  /** contains the color of the background of the footer. */
  var FooterBackColor: Color
  /** contains the filter name of the background graphic in the footer. */
  var FooterBackGraphicFilter: String
  /** determines the location of the background graphic in the footer. */
  var FooterBackGraphicLocation: GraphicLocation
  /** contains the URL of the background graphic in the footer. */
  var FooterBackGraphicURL: String
  /** determines if the background of the footer is transparent. */
  var FooterBackTransparent: Boolean
  /** determines the distance between the footer and the body text area. */
  var FooterBodyDistance: Double
  /** contains the distance of all borders of the footer. */
  var FooterBorderDistance: Double
  /** contains the style of the bottom border line of the footer. */
  var FooterBottomBorder: BorderLine
  /** contains the bottom border distance of the footer. */
  var FooterBottomBorderDistance: Double
  /** determines whether to use dynamic spacing in footer or not. */
  var FooterDynamicSpacing: Boolean
  /** determines the height of the footer. */
  var FooterHeight: Double
  /** determines if the height of the footer depends on the content. */
  var FooterIsDynamicHeight: Boolean
  /** determines if a footer is used on the page. */
  var FooterIsOn: Boolean
  /** determines if the footer content on left and right pages is the same. */
  var FooterIsShared: Boolean
  /** contains the style of the left border line of the footer. */
  var FooterLeftBorder: BorderLine
  /** contains the left border distance of the footer. */
  var FooterLeftBorderDistance: Double
  /** determines the left margin of the footer. */
  var FooterLeftMargin: Double
  /** contains the style of the right border line of the footer. */
  var FooterRightBorder: BorderLine
  /** contains the right border distance of the footer. */
  var FooterRightBorderDistance: Double
  /** determines the right margin of the footer. */
  var FooterRightMargin: Double
  /** determines the shadow of the footer. */
  var FooterShadowFormat: ShadowFormat
  /** contains the interface to the text of the footer. */
  var FooterText: XText
  /** contains the interface to the text of the footer of a left page. */
  var FooterTextLeft: XText
  /** contains the interface to the text of the footer of a right page.contains . */
  var FooterTextRight: XText
  /** contains the style of the top border line of the footer. */
  var FooterTopBorder: BorderLine
  /** contains the top border distance of the footer. */
  var FooterTopBorderDistance: Double
  /** contains the maximum height of the footnote area. If set to zero then the height of the current page is used as limit. */
  var FootnoteHeight: Double
  /**
    * contains the adjustment of the separator line between the text and the footnote area.
    *
    * com::sun::star::text::HorizontalAdjusts.
    */
  var FootnoteLineAdjust: Double
  /** contains the color of the separator line between the text and the footnote area. */
  var FootnoteLineColor: Color
  /** contains the distance between the footnote area and the separator line between the text and the footnote area. */
  var FootnoteLineDistance: Double
  /** contains the relative width of the separator line between the text and the footnote area. */
  var FootnoteLineRelativeWidth: Double
  /**
    * contains the style of the separator line between the text and the footnote area.
    * @see com.sun.star.style.FootnoteLineStyle for the possible values.
    */
  var FootnoteLineStyle: Double
  /** contains the distance between the text and the separator line between the text and the footnote area. */
  var FootnoteLineTextDistance: Double
  /** contains the weight of the separator line between the text and the footnote area. */
  var FootnoteLineWeight: Double
  /** contains the height of the base text line inside the text grid */
  var GridBaseHeight: Double
  /** contains the display color of the text grid */
  var GridColor: Color
  /** determines whether the text grid lines are visible or not */
  var GridDisplay: Boolean
  /** contains the number of lines in the text grid */
  var GridLines: Double
  /** contains the mode of the text grid (none, lines, ...), as represented by {@link com.sun.star.text.TextGridMode} constants */
  var GridMode: Double
  /** determines whether the text grid lines are printed */
  var GridPrint: Boolean
  /** determines whether the text grid's ruby line is located below or above the base line */
  var GridRubyBelow: Boolean
  /** contains the height of the ruby text line inside the text grid */
  var GridRubyHeight: Double
  /** contains the color of the background of the header. */
  var HeaderBackColor: Color
  /** contains the filter name of the background graphic of the header. */
  var HeaderBackGraphicFilter: String
  /** determines the location of the background graphic of the header. */
  var HeaderBackGraphicLocation: GraphicLocation
  /** contains the URL of the background graphic of the header. */
  var HeaderBackGraphicURL: String
  /**
    * determines if the background color of the header is transparent.
    *
    * If this property is set to `TRUE` , {@link PageStyle.HeaderBackColor} will not be used.
    */
  var HeaderBackTransparent: Boolean
  /** determines the distance between the header and the body text area. */
  var HeaderBodyDistance: Double
  /** determines the distance of all borders of the header. */
  var HeaderBorderDistance: Double
  /** determines the style of the bottom border line of the header. */
  var HeaderBottomBorder: BorderLine
  /** determines the bottom border distance of the header. */
  var HeaderBottomBorderDistance: Double
  /** determines whether to use dynamic spacing in header or not. */
  var HeaderDynamicSpacing: Boolean
  /** contains the height of the header. */
  var HeaderHeight: Double
  /** determines if the height of the header depends on the content. */
  var HeaderIsDynamicHeight: Boolean
  /** determines if a header is used on the page. */
  var HeaderIsOn: Boolean
  /** determines if the header content on left and right pages is the same. */
  var HeaderIsShared: Boolean
  /** determines the style of the left border line of the header. */
  var HeaderLeftBorder: BorderLine
  /** determines the left border distance of the header. */
  var HeaderLeftBorderDistance: Double
  /** contains the left margin of the header. */
  var HeaderLeftMargin: Double
  /** determines the style of the right border line of the header. */
  var HeaderRightBorder: BorderLine
  /** determines the right border distance of the header. */
  var HeaderRightBorderDistance: Double
  /** contains the right margin of the header. */
  var HeaderRightMargin: Double
  /** determines the shadow of the header. */
  var HeaderShadowFormat: ShadowFormat
  /** contains the interface to the text of the header. */
  var HeaderText: XText
  /** contains the interface to the text of the header of left pages. */
  var HeaderTextLeft: XText
  /** contains the interface to the text of the header of right pages. */
  var HeaderTextRight: XText
  /** determines the style of the top border line of the header. */
  var HeaderTopBorder: BorderLine
  /** determines the top border distance of the header. */
  var HeaderTopBorderDistance: Double
  /** contains the height of the page. */
  var Height: Double
  /** determines if the page format is landscape. */
  var IsLandscape: Boolean
  /** determines the style of the left border line of the page. */
  var LeftBorder: BorderLine
  /** determines the left border distance of the page. */
  var LeftBorderDistance: Double
  /** determines the left margin of the page. */
  var LeftMargin: Double
  /** determines the default numbering type for this page. */
  var NumberingType: Double
  /** determines the layout of the page. */
  var PageStyleLayout: typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.PageStyleLayout
  /** contains the name of a paper tray of the selected printer. */
  var PrinterPaperTray: String
  /** determines if the register mode is active on that page. */
  var RegisterModeActive: Boolean
  /** contains the name of the paragraph style that is used as reference of the register mode. */
  var RegisterParagraphStyle: String
  /** determines the style of the right border line of the page. */
  var RightBorder: BorderLine
  /** determines the right border distance of the page. */
  var RightBorderDistance: Double
  /** determines the right margin of the page. */
  var RightMargin: Double
  /** determines the shadow of the page. */
  var ShadowFormat: typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
  /** contains the paper size of the page. */
  var Size: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
  /** contains the column settings of the page. */
  var TextColumns: XTextColumns
  /** determines the style of the top border line of the page. */
  var TopBorder: BorderLine
  /** determines the top border distance of the page. */
  var TopBorderDistance: Double
  /** determines the top margin of the page. */
  var TopMargin: Double
  /**
    * contains user defined attributes.
    *
    * This {@link com.sun.star.container.XNameContainer} supports the service {@link com.sun.star.xml.AttributeContainer} .
    */
  var UserDefinedAttributes: XNameContainer
  /** contains the width of the page. */
  var Width: Double
  /** contains the writing direction, as represented by the {@link com.sun.star.text.WritingMode2} constants */
  var WritingMode: Double
}

object PageProperties {
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
    FirstIsShared: Boolean,
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
    IsLandscape: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    NumberingType: Double,
    PageStyleLayout: PageStyleLayout,
    PrinterPaperTray: String,
    RegisterModeActive: Boolean,
    RegisterParagraphStyle: String,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    ShadowFormat: ShadowFormat,
    Size: Size,
    TextColumns: XTextColumns,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    UserDefinedAttributes: XNameContainer,
    Width: Double,
    WritingMode: Double
  ): PageProperties = {
    val __obj = js.Dynamic.literal(BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BottomMargin = BottomMargin, FirstIsShared = FirstIsShared, FooterBackColor = FooterBackColor, FooterBackGraphicFilter = FooterBackGraphicFilter, FooterBackGraphicLocation = FooterBackGraphicLocation, FooterBackGraphicURL = FooterBackGraphicURL, FooterBackTransparent = FooterBackTransparent, FooterBodyDistance = FooterBodyDistance, FooterBorderDistance = FooterBorderDistance, FooterBottomBorder = FooterBottomBorder, FooterBottomBorderDistance = FooterBottomBorderDistance, FooterDynamicSpacing = FooterDynamicSpacing, FooterHeight = FooterHeight, FooterIsDynamicHeight = FooterIsDynamicHeight, FooterIsOn = FooterIsOn, FooterIsShared = FooterIsShared, FooterLeftBorder = FooterLeftBorder, FooterLeftBorderDistance = FooterLeftBorderDistance, FooterLeftMargin = FooterLeftMargin, FooterRightBorder = FooterRightBorder, FooterRightBorderDistance = FooterRightBorderDistance, FooterRightMargin = FooterRightMargin, FooterShadowFormat = FooterShadowFormat, FooterText = FooterText, FooterTextLeft = FooterTextLeft, FooterTextRight = FooterTextRight, FooterTopBorder = FooterTopBorder, FooterTopBorderDistance = FooterTopBorderDistance, FootnoteHeight = FootnoteHeight, FootnoteLineAdjust = FootnoteLineAdjust, FootnoteLineColor = FootnoteLineColor, FootnoteLineDistance = FootnoteLineDistance, FootnoteLineRelativeWidth = FootnoteLineRelativeWidth, FootnoteLineStyle = FootnoteLineStyle, FootnoteLineTextDistance = FootnoteLineTextDistance, FootnoteLineWeight = FootnoteLineWeight, GridBaseHeight = GridBaseHeight, GridColor = GridColor, GridDisplay = GridDisplay, GridLines = GridLines, GridMode = GridMode, GridPrint = GridPrint, GridRubyBelow = GridRubyBelow, GridRubyHeight = GridRubyHeight, HeaderBackColor = HeaderBackColor, HeaderBackGraphicFilter = HeaderBackGraphicFilter, HeaderBackGraphicLocation = HeaderBackGraphicLocation, HeaderBackGraphicURL = HeaderBackGraphicURL, HeaderBackTransparent = HeaderBackTransparent, HeaderBodyDistance = HeaderBodyDistance, HeaderBorderDistance = HeaderBorderDistance, HeaderBottomBorder = HeaderBottomBorder, HeaderBottomBorderDistance = HeaderBottomBorderDistance, HeaderDynamicSpacing = HeaderDynamicSpacing, HeaderHeight = HeaderHeight, HeaderIsDynamicHeight = HeaderIsDynamicHeight, HeaderIsOn = HeaderIsOn, HeaderIsShared = HeaderIsShared, HeaderLeftBorder = HeaderLeftBorder, HeaderLeftBorderDistance = HeaderLeftBorderDistance, HeaderLeftMargin = HeaderLeftMargin, HeaderRightBorder = HeaderRightBorder, HeaderRightBorderDistance = HeaderRightBorderDistance, HeaderRightMargin = HeaderRightMargin, HeaderShadowFormat = HeaderShadowFormat, HeaderText = HeaderText, HeaderTextLeft = HeaderTextLeft, HeaderTextRight = HeaderTextRight, HeaderTopBorder = HeaderTopBorder, HeaderTopBorderDistance = HeaderTopBorderDistance, Height = Height, IsLandscape = IsLandscape, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, LeftMargin = LeftMargin, NumberingType = NumberingType, PageStyleLayout = PageStyleLayout, PrinterPaperTray = PrinterPaperTray, RegisterModeActive = RegisterModeActive, RegisterParagraphStyle = RegisterParagraphStyle, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RightMargin = RightMargin, ShadowFormat = ShadowFormat, Size = Size, TextColumns = TextColumns, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, TopMargin = TopMargin, UserDefinedAttributes = UserDefinedAttributes, Width = Width, WritingMode = WritingMode)
  
    __obj.asInstanceOf[PageProperties]
  }
}

