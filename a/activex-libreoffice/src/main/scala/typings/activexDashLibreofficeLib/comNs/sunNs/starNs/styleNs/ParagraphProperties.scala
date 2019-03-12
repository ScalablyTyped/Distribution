package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** describes the style of paragraphs. */
trait ParagraphProperties extends js.Object {
  /** contains the distance from the border to the object. */
  var BorderDistance: scala.Double
  /** contains the bottom border of the object. */
  var BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: scala.Double
  /**
    * determines the type of break that is applied at the beginning of the table.
    * @see com.sun.star.style.BreakType
    */
  var BreakType: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType
  /** specifies the character style name for drop caps. */
  var DropCapCharStyleName: java.lang.String
  /** specifies whether the first characters of the paragraph are displayed in capital letters and how they are formatted. */
  var DropCapFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.DropCapFormat
  /** specifies if the property **DropCapFormat** is applied to the whole first word. */
  var DropCapWholeWord: scala.Boolean
  /** contains the left border of the object. */
  var LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance from the left border to the object. */
  var LeftBorderDistance: scala.Double
  /** specifies the id of the list to which the paragraph belongs */
  var ListId: java.lang.String
  /**
    * returns `FALSE` if the paragraph is part of a numbering, but has no numbering label.
    *
    * A paragraph is part of a numbering, if a style for a numbering is set - see NumberingStyleName.
    *
    * If the paragraph is not part of a numbering the property is void.
    */
  var NumberingIsNumber: scala.Boolean
  /** specifies the numbering level of the paragraph. */
  var NumberingLevel: scala.Double
  /** contains the numbering rules applied to this paragraph. */
  var NumberingRules: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace
  /** specifies the start value for numbering if a new numbering starts at this paragraph. */
  var NumberingStartValue: scala.Double
  /**
    * specifies the name of the style for the numbering.
    *
    * The name must be one of the names which are available via {@link XStyleFamiliesSupplier} .
    */
  var NumberingStyleName: java.lang.String
  /**
    * specifies the outline level to which the paragraph belongs
    * @since OOo 3.1  Value 0 indicates that the paragraph belongs to the body text.  Values [1..10] indicates that the paragraph belongs to the corresponding
    */
  var OutlineLevel: scala.Double
  /**
    * If this property is set, it creates a page break before the paragraph it belongs to and assigns the value as the name of the new page style sheet to
    * use.
    */
  var PageDescName: java.lang.String
  /** If a page break property is set at a paragraph, this property contains the new value for the page number. */
  var PageNumberOffset: scala.Double
  /** contains the name of the current page style. */
  var PageStyleName: java.lang.String
  /** determines the adjustment of a paragraph. */
  var ParaAdjust: ParagraphAdjust
  /** contains the paragraph background color. */
  var ParaBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the name of the graphic filter for the background graphic of a paragraph. */
  var ParaBackGraphicFilter: java.lang.String
  /**
    * contains the value for the position of a background graphic.
    * @see com.sun.star.style.GraphicLocation
    */
  var ParaBackGraphicLocation: GraphicLocation
  /** contains the value of a link for the background graphic of a paragraph. */
  var ParaBackGraphicURL: java.lang.String
  /** This value is `TRUE` if the paragraph background color is set to transparent. */
  var ParaBackTransparent: scala.Boolean
  /**
    * determines the bottom margin of the paragraph in 100th mm.
    *
    * The distance between two paragraphs is specified by:
    *
    * either the bottom margin of the previous paragraphor the top margin of the following paragraph. The greater one is chosen.
    */
  var ParaBottomMargin: scala.Double
  /**
    * determines if contextual spacing is used.
    * @since LibreOffice 3.6  If true, the top and bottom margins of the paragraph should not be applied when the previous and next paragraphs have the same style.
    */
  var ParaContextMargin: scala.Boolean
  /**
    * determines if single words are stretched.
    *
    * It is only valid if {@link ParagraphProperties.ParaAdjust} and {@link ParagraphProperties.ParaLastLineAdjust} are also valid.
    */
  var ParaExpandSingleWord: scala.Boolean
  /** specifies the indent for the first line. */
  var ParaFirstLineIndent: scala.Double
  /** specifies the maximum number of consecutive hyphens. */
  var ParaHyphenationMaxHyphens: scala.Double
  /** specifies the maximum number of characters to remain before the hyphen character (when hyphenation is applied). */
  var ParaHyphenationMaxLeadingChars: scala.Double
  /** specifies the maximum number of characters to remain after the hyphen character (when hyphenation is applied). */
  var ParaHyphenationMaxTrailingChars: scala.Double
  /**
    * Grab bag of paragraph properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var ParaInteropGrabBag: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /** determines if the first line should be indented automatically. */
  var ParaIsAutoFirstLineIndent: scala.Boolean
  /**
    * the property determines if borders set at a paragraph are merged with the next paragraph.
    *
    * Borders are only merged if they are identical.
    */
  var ParaIsConnectBorder: scala.Boolean
  /** specifies if automatic hyphenation is applied. */
  var ParaIsHyphenation: scala.Boolean
  /** determines if the numbering rules restart, counting at the current paragraph. */
  var ParaIsNumberingRestart: scala.Boolean
  /**
    * Setting this property to `TRUE` prevents page or column breaks between this and the following paragraph.
    *
    * This feature is useful for preventing title paragraphs to be the last line on a page or column.
    */
  var ParaKeepTogether: scala.Boolean
  /**
    * determines the adjustment of the last line.
    *
    * It is only valid if {@link ParagraphProperties.ParaAdjust} is set to ParagraphAdjust::BLOCK.
    */
  var ParaLastLineAdjust: scala.Double
  /** determines the left margin of the paragraph in 100th mm. */
  var ParaLeftMargin: scala.Double
  /** determines if the paragraph is included in the line numbering. */
  var ParaLineNumberCount: scala.Boolean
  /** contains the start value for the line numbering. */
  var ParaLineNumberStartValue: scala.Double
  /** contains the type of the line spacing of a paragraph. */
  var ParaLineSpacing: LineSpacing
  /** specifies the minimum number of lines of the paragraph that have to be at bottom of a page if the paragraph is spread over more than one page. */
  var ParaOrphans: scala.Double
  /**
    * determines if the register mode is applied to a paragraph.
    *
    * Remark: Register mode is only used if the register mode property of the page style is switched on.
    */
  var ParaRegisterModeActive: scala.Boolean
  /** determines the right margin of the paragraph in 100th mm. */
  var ParaRightMargin: scala.Double
  /**
    * determines the type, color, and size of the shadow.
    * @see com.sun.star.table.ShadowFormat
    */
  var ParaShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat
  /** Setting this property to `FALSE` prevents the paragraph from getting split into two pages or columns. */
  var ParaSplit: scala.Boolean
  /** contains the name of the current paragraph style. */
  var ParaStyleName: java.lang.String
  /** specifies the positions and kinds of the tab stops within this paragraph. */
  var ParaTabStops: stdLib.SafeArray[TabStop]
  /**
    * determines the top margin of the paragraph in 100th mm.
    *
    * The distance between two paragraphs is specified by:
    *
    * either the bottom margin of the previous paragraph.or the top margin of the following paragraph. The greater one is chosen.
    */
  var ParaTopMargin: scala.Double
  /**
    * this property stores xml attributes. They will be saved to and restored from automatic styles inside xml files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var ParaUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /**
    * specifies the vertical alignment of a paragraph.
    * @see com.sun.star.text.ParagraphVertAlign
    */
  var ParaVertAlignment: scala.Double
  /** specifies the minimum number of lines of the paragraph that have to be at top of a page if the paragraph is spread over more than one page. */
  var ParaWidows: scala.Double
  /** contains the right border of the object. */
  var RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: scala.Double
  /** contains the top border of the object. */
  var TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: scala.Double
}

object ParagraphProperties {
  @scala.inline
  def apply(
    BorderDistance: scala.Double,
    BottomBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    BottomBorderDistance: scala.Double,
    BreakType: BreakType,
    DropCapCharStyleName: java.lang.String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: scala.Boolean,
    LeftBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    LeftBorderDistance: scala.Double,
    ListId: java.lang.String,
    NumberingIsNumber: scala.Boolean,
    NumberingLevel: scala.Double,
    NumberingRules: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexReplace,
    NumberingStartValue: scala.Double,
    NumberingStyleName: java.lang.String,
    OutlineLevel: scala.Double,
    PageDescName: java.lang.String,
    PageNumberOffset: scala.Double,
    PageStyleName: java.lang.String,
    ParaAdjust: ParagraphAdjust,
    ParaBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ParaBackGraphicFilter: java.lang.String,
    ParaBackGraphicLocation: GraphicLocation,
    ParaBackGraphicURL: java.lang.String,
    ParaBackTransparent: scala.Boolean,
    ParaBottomMargin: scala.Double,
    ParaContextMargin: scala.Boolean,
    ParaExpandSingleWord: scala.Boolean,
    ParaFirstLineIndent: scala.Double,
    ParaHyphenationMaxHyphens: scala.Double,
    ParaHyphenationMaxLeadingChars: scala.Double,
    ParaHyphenationMaxTrailingChars: scala.Double,
    ParaInteropGrabBag: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    ParaIsAutoFirstLineIndent: scala.Boolean,
    ParaIsConnectBorder: scala.Boolean,
    ParaIsHyphenation: scala.Boolean,
    ParaIsNumberingRestart: scala.Boolean,
    ParaKeepTogether: scala.Boolean,
    ParaLastLineAdjust: scala.Double,
    ParaLeftMargin: scala.Double,
    ParaLineNumberCount: scala.Boolean,
    ParaLineNumberStartValue: scala.Double,
    ParaLineSpacing: LineSpacing,
    ParaOrphans: scala.Double,
    ParaRegisterModeActive: scala.Boolean,
    ParaRightMargin: scala.Double,
    ParaShadowFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.ShadowFormat,
    ParaSplit: scala.Boolean,
    ParaStyleName: java.lang.String,
    ParaTabStops: stdLib.SafeArray[TabStop],
    ParaTopMargin: scala.Double,
    ParaUserDefinedAttributes: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    ParaVertAlignment: scala.Double,
    ParaWidows: scala.Double,
    RightBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    RightBorderDistance: scala.Double,
    TopBorder: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.BorderLine,
    TopBorderDistance: scala.Double
  ): ParagraphProperties = {
    val __obj = js.Dynamic.literal(BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BreakType = BreakType, DropCapCharStyleName = DropCapCharStyleName, DropCapFormat = DropCapFormat, DropCapWholeWord = DropCapWholeWord, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, ListId = ListId, NumberingIsNumber = NumberingIsNumber, NumberingLevel = NumberingLevel, NumberingRules = NumberingRules, NumberingStartValue = NumberingStartValue, NumberingStyleName = NumberingStyleName, OutlineLevel = OutlineLevel, PageDescName = PageDescName, PageNumberOffset = PageNumberOffset, PageStyleName = PageStyleName, ParaAdjust = ParaAdjust, ParaBackColor = ParaBackColor, ParaBackGraphicFilter = ParaBackGraphicFilter, ParaBackGraphicLocation = ParaBackGraphicLocation, ParaBackGraphicURL = ParaBackGraphicURL, ParaBackTransparent = ParaBackTransparent, ParaBottomMargin = ParaBottomMargin, ParaContextMargin = ParaContextMargin, ParaExpandSingleWord = ParaExpandSingleWord, ParaFirstLineIndent = ParaFirstLineIndent, ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars, ParaInteropGrabBag = ParaInteropGrabBag, ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent, ParaIsConnectBorder = ParaIsConnectBorder, ParaIsHyphenation = ParaIsHyphenation, ParaIsNumberingRestart = ParaIsNumberingRestart, ParaKeepTogether = ParaKeepTogether, ParaLastLineAdjust = ParaLastLineAdjust, ParaLeftMargin = ParaLeftMargin, ParaLineNumberCount = ParaLineNumberCount, ParaLineNumberStartValue = ParaLineNumberStartValue, ParaLineSpacing = ParaLineSpacing, ParaOrphans = ParaOrphans, ParaRegisterModeActive = ParaRegisterModeActive, ParaRightMargin = ParaRightMargin, ParaShadowFormat = ParaShadowFormat, ParaSplit = ParaSplit, ParaStyleName = ParaStyleName, ParaTabStops = ParaTabStops, ParaTopMargin = ParaTopMargin, ParaUserDefinedAttributes = ParaUserDefinedAttributes, ParaVertAlignment = ParaVertAlignment, ParaWidows = ParaWidows, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance)
  
    __obj.asInstanceOf[ParagraphProperties]
  }
}

