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

