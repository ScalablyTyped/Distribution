package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the style of paragraphs. */
@js.native
trait ParagraphProperties extends StObject {
  
  /** contains the distance from the border to the object. */
  var BorderDistance: Double = js.native
  
  /** contains the bottom border of the object. */
  var BottomBorder: BorderLine = js.native
  
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: Double = js.native
  
  /**
    * determines the type of break that is applied at the beginning of the table.
    * @see com.sun.star.style.BreakType
    */
  var BreakType: typings.activexLibreoffice.com_.sun.star.style.BreakType = js.native
  
  /** specifies the character style name for drop caps. */
  var DropCapCharStyleName: String = js.native
  
  /** specifies whether the first characters of the paragraph are displayed in capital letters and how they are formatted. */
  var DropCapFormat: typings.activexLibreoffice.com_.sun.star.style.DropCapFormat = js.native
  
  /** specifies if the property **DropCapFormat** is applied to the whole first word. */
  var DropCapWholeWord: Boolean = js.native
  
  /** contains the left border of the object. */
  var LeftBorder: BorderLine = js.native
  
  /** contains the distance from the left border to the object. */
  var LeftBorderDistance: Double = js.native
  
  /** specifies the id of the list to which the paragraph belongs */
  var ListId: String = js.native
  
  /**
    * returns `FALSE` if the paragraph is part of a numbering, but has no numbering label.
    *
    * A paragraph is part of a numbering, if a style for a numbering is set - see NumberingStyleName.
    *
    * If the paragraph is not part of a numbering the property is void.
    */
  var NumberingIsNumber: Boolean = js.native
  
  /** specifies the numbering level of the paragraph. */
  var NumberingLevel: Double = js.native
  
  /** contains the numbering rules applied to this paragraph. */
  var NumberingRules: XIndexReplace = js.native
  
  /** specifies the start value for numbering if a new numbering starts at this paragraph. */
  var NumberingStartValue: Double = js.native
  
  /**
    * specifies the name of the style for the numbering.
    *
    * The name must be one of the names which are available via {@link XStyleFamiliesSupplier} .
    */
  var NumberingStyleName: String = js.native
  
  /**
    * specifies the outline level to which the paragraph belongs
    * @since OOo 3.1  Value 0 indicates that the paragraph belongs to the body text.  Values [1..10] indicates that the paragraph belongs to the corresponding
    */
  var OutlineLevel: Double = js.native
  
  /**
    * If this property is set, it creates a page break before the paragraph it belongs to and assigns the value as the name of the new page style sheet to
    * use.
    */
  var PageDescName: String = js.native
  
  /** If a page break property is set at a paragraph, this property contains the new value for the page number. */
  var PageNumberOffset: Double = js.native
  
  /** contains the name of the current page style. */
  var PageStyleName: String = js.native
  
  /** determines the adjustment of a paragraph. */
  var ParaAdjust: ParagraphAdjust = js.native
  
  /** contains the paragraph background color. */
  var ParaBackColor: Color = js.native
  
  /** contains the name of the graphic filter for the background graphic of a paragraph. */
  var ParaBackGraphicFilter: String = js.native
  
  /**
    * contains the value for the position of a background graphic.
    * @see com.sun.star.style.GraphicLocation
    */
  var ParaBackGraphicLocation: GraphicLocation = js.native
  
  /** contains the value of a link for the background graphic of a paragraph. */
  var ParaBackGraphicURL: String = js.native
  
  /** This value is `TRUE` if the paragraph background color is set to transparent. */
  var ParaBackTransparent: Boolean = js.native
  
  /**
    * determines the bottom margin of the paragraph in 100th mm.
    *
    * The distance between two paragraphs is specified by:
    *
    * either the bottom margin of the previous paragraphor the top margin of the following paragraph. The greater one is chosen.
    */
  var ParaBottomMargin: Double = js.native
  
  /**
    * determines if contextual spacing is used.
    * @since LibreOffice 3.6  If true, the top and bottom margins of the paragraph should not be applied when the previous and next paragraphs have the same style.
    */
  var ParaContextMargin: Boolean = js.native
  
  /**
    * determines if single words are stretched.
    *
    * It is only valid if {@link ParagraphProperties.ParaAdjust} and {@link ParagraphProperties.ParaLastLineAdjust} are also valid.
    */
  var ParaExpandSingleWord: Boolean = js.native
  
  /** specifies the indent for the first line. */
  var ParaFirstLineIndent: Double = js.native
  
  /** specifies the maximum number of consecutive hyphens. */
  var ParaHyphenationMaxHyphens: Double = js.native
  
  /** specifies the maximum number of characters to remain before the hyphen character (when hyphenation is applied). */
  var ParaHyphenationMaxLeadingChars: Double = js.native
  
  /** specifies the maximum number of characters to remain after the hyphen character (when hyphenation is applied). */
  var ParaHyphenationMaxTrailingChars: Double = js.native
  
  /**
    * Grab bag of paragraph properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var ParaInteropGrabBag: SafeArray[PropertyValue] = js.native
  
  /** determines if the first line should be indented automatically. */
  var ParaIsAutoFirstLineIndent: Boolean = js.native
  
  /**
    * the property determines if borders set at a paragraph are merged with the next paragraph.
    *
    * Borders are only merged if they are identical.
    */
  var ParaIsConnectBorder: Boolean = js.native
  
  /** specifies if automatic hyphenation is applied. */
  var ParaIsHyphenation: Boolean = js.native
  
  /** determines if the numbering rules restart, counting at the current paragraph. */
  var ParaIsNumberingRestart: Boolean = js.native
  
  /**
    * Setting this property to `TRUE` prevents page or column breaks between this and the following paragraph.
    *
    * This feature is useful for preventing title paragraphs to be the last line on a page or column.
    */
  var ParaKeepTogether: Boolean = js.native
  
  /**
    * determines the adjustment of the last line.
    *
    * It is only valid if {@link ParagraphProperties.ParaAdjust} is set to ParagraphAdjust::BLOCK.
    */
  var ParaLastLineAdjust: Double = js.native
  
  /** determines the left margin of the paragraph in 100th mm. */
  var ParaLeftMargin: Double = js.native
  
  /** determines if the paragraph is included in the line numbering. */
  var ParaLineNumberCount: Boolean = js.native
  
  /** contains the start value for the line numbering. */
  var ParaLineNumberStartValue: Double = js.native
  
  /** contains the type of the line spacing of a paragraph. */
  var ParaLineSpacing: LineSpacing = js.native
  
  /** specifies the minimum number of lines of the paragraph that have to be at bottom of a page if the paragraph is spread over more than one page. */
  var ParaOrphans: Double = js.native
  
  /**
    * determines if the register mode is applied to a paragraph.
    *
    * Remark: Register mode is only used if the register mode property of the page style is switched on.
    */
  var ParaRegisterModeActive: Boolean = js.native
  
  /** determines the right margin of the paragraph in 100th mm. */
  var ParaRightMargin: Double = js.native
  
  /**
    * determines the type, color, and size of the shadow.
    * @see com.sun.star.table.ShadowFormat
    */
  var ParaShadowFormat: ShadowFormat = js.native
  
  /** Setting this property to `FALSE` prevents the paragraph from getting split into two pages or columns. */
  var ParaSplit: Boolean = js.native
  
  /** contains the name of the current paragraph style. */
  var ParaStyleName: String = js.native
  
  /** specifies the positions and kinds of the tab stops within this paragraph. */
  var ParaTabStops: SafeArray[TabStop] = js.native
  
  /**
    * determines the top margin of the paragraph in 100th mm.
    *
    * The distance between two paragraphs is specified by:
    *
    * either the bottom margin of the previous paragraph.or the top margin of the following paragraph. The greater one is chosen.
    */
  var ParaTopMargin: Double = js.native
  
  /**
    * this property stores xml attributes. They will be saved to and restored from automatic styles inside xml files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var ParaUserDefinedAttributes: XNameContainer = js.native
  
  /**
    * specifies the vertical alignment of a paragraph.
    * @see com.sun.star.text.ParagraphVertAlign
    */
  var ParaVertAlignment: Double = js.native
  
  /** specifies the minimum number of lines of the paragraph that have to be at top of a page if the paragraph is spread over more than one page. */
  var ParaWidows: Double = js.native
  
  /** contains the right border of the object. */
  var RightBorder: BorderLine = js.native
  
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: Double = js.native
  
  /** contains the top border of the object. */
  var TopBorder: BorderLine = js.native
  
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: Double = js.native
}
object ParagraphProperties {
  
  @scala.inline
  def apply(
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BreakType: BreakType,
    DropCapCharStyleName: String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    ListId: String,
    NumberingIsNumber: Boolean,
    NumberingLevel: Double,
    NumberingRules: XIndexReplace,
    NumberingStartValue: Double,
    NumberingStyleName: String,
    OutlineLevel: Double,
    PageDescName: String,
    PageNumberOffset: Double,
    PageStyleName: String,
    ParaAdjust: ParagraphAdjust,
    ParaBackColor: Color,
    ParaBackGraphicFilter: String,
    ParaBackGraphicLocation: GraphicLocation,
    ParaBackGraphicURL: String,
    ParaBackTransparent: Boolean,
    ParaBottomMargin: Double,
    ParaContextMargin: Boolean,
    ParaExpandSingleWord: Boolean,
    ParaFirstLineIndent: Double,
    ParaHyphenationMaxHyphens: Double,
    ParaHyphenationMaxLeadingChars: Double,
    ParaHyphenationMaxTrailingChars: Double,
    ParaInteropGrabBag: SafeArray[PropertyValue],
    ParaIsAutoFirstLineIndent: Boolean,
    ParaIsConnectBorder: Boolean,
    ParaIsHyphenation: Boolean,
    ParaIsNumberingRestart: Boolean,
    ParaKeepTogether: Boolean,
    ParaLastLineAdjust: Double,
    ParaLeftMargin: Double,
    ParaLineNumberCount: Boolean,
    ParaLineNumberStartValue: Double,
    ParaLineSpacing: LineSpacing,
    ParaOrphans: Double,
    ParaRegisterModeActive: Boolean,
    ParaRightMargin: Double,
    ParaShadowFormat: ShadowFormat,
    ParaSplit: Boolean,
    ParaStyleName: String,
    ParaTabStops: SafeArray[TabStop],
    ParaTopMargin: Double,
    ParaUserDefinedAttributes: XNameContainer,
    ParaVertAlignment: Double,
    ParaWidows: Double,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    TopBorder: BorderLine,
    TopBorderDistance: Double
  ): ParagraphProperties = {
    val __obj = js.Dynamic.literal(BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BreakType = BreakType.asInstanceOf[js.Any], DropCapCharStyleName = DropCapCharStyleName.asInstanceOf[js.Any], DropCapFormat = DropCapFormat.asInstanceOf[js.Any], DropCapWholeWord = DropCapWholeWord.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], NumberingIsNumber = NumberingIsNumber.asInstanceOf[js.Any], NumberingLevel = NumberingLevel.asInstanceOf[js.Any], NumberingRules = NumberingRules.asInstanceOf[js.Any], NumberingStartValue = NumberingStartValue.asInstanceOf[js.Any], NumberingStyleName = NumberingStyleName.asInstanceOf[js.Any], OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageDescName = PageDescName.asInstanceOf[js.Any], PageNumberOffset = PageNumberOffset.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], ParaBackColor = ParaBackColor.asInstanceOf[js.Any], ParaBackGraphicFilter = ParaBackGraphicFilter.asInstanceOf[js.Any], ParaBackGraphicLocation = ParaBackGraphicLocation.asInstanceOf[js.Any], ParaBackGraphicURL = ParaBackGraphicURL.asInstanceOf[js.Any], ParaBackTransparent = ParaBackTransparent.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaContextMargin = ParaContextMargin.asInstanceOf[js.Any], ParaExpandSingleWord = ParaExpandSingleWord.asInstanceOf[js.Any], ParaFirstLineIndent = ParaFirstLineIndent.asInstanceOf[js.Any], ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens.asInstanceOf[js.Any], ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars.asInstanceOf[js.Any], ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars.asInstanceOf[js.Any], ParaInteropGrabBag = ParaInteropGrabBag.asInstanceOf[js.Any], ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent.asInstanceOf[js.Any], ParaIsConnectBorder = ParaIsConnectBorder.asInstanceOf[js.Any], ParaIsHyphenation = ParaIsHyphenation.asInstanceOf[js.Any], ParaIsNumberingRestart = ParaIsNumberingRestart.asInstanceOf[js.Any], ParaKeepTogether = ParaKeepTogether.asInstanceOf[js.Any], ParaLastLineAdjust = ParaLastLineAdjust.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaLineNumberCount = ParaLineNumberCount.asInstanceOf[js.Any], ParaLineNumberStartValue = ParaLineNumberStartValue.asInstanceOf[js.Any], ParaLineSpacing = ParaLineSpacing.asInstanceOf[js.Any], ParaOrphans = ParaOrphans.asInstanceOf[js.Any], ParaRegisterModeActive = ParaRegisterModeActive.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaShadowFormat = ParaShadowFormat.asInstanceOf[js.Any], ParaSplit = ParaSplit.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], ParaTabStops = ParaTabStops.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any], ParaVertAlignment = ParaVertAlignment.asInstanceOf[js.Any], ParaWidows = ParaWidows.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParagraphProperties]
  }
  
  @scala.inline
  implicit class ParagraphPropertiesMutableBuilder[Self <: ParagraphProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderDistance(value: Double): Self = StObject.set(x, "BorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBorder(value: BorderLine): Self = StObject.set(x, "BottomBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBorderDistance(value: Double): Self = StObject.set(x, "BottomBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakType(value: BreakType): Self = StObject.set(x, "BreakType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropCapCharStyleName(value: String): Self = StObject.set(x, "DropCapCharStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropCapFormat(value: DropCapFormat): Self = StObject.set(x, "DropCapFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropCapWholeWord(value: Boolean): Self = StObject.set(x, "DropCapWholeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftBorder(value: BorderLine): Self = StObject.set(x, "LeftBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftBorderDistance(value: Double): Self = StObject.set(x, "LeftBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListId(value: String): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingIsNumber(value: Boolean): Self = StObject.set(x, "NumberingIsNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingLevel(value: Double): Self = StObject.set(x, "NumberingLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingRules(value: XIndexReplace): Self = StObject.set(x, "NumberingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingStartValue(value: Double): Self = StObject.set(x, "NumberingStartValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingStyleName(value: String): Self = StObject.set(x, "NumberingStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineLevel(value: Double): Self = StObject.set(x, "OutlineLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageDescName(value: String): Self = StObject.set(x, "PageDescName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageNumberOffset(value: Double): Self = StObject.set(x, "PageNumberOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStyleName(value: String): Self = StObject.set(x, "PageStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaAdjust(value: ParagraphAdjust): Self = StObject.set(x, "ParaAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBackColor(value: Color): Self = StObject.set(x, "ParaBackColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBackGraphicFilter(value: String): Self = StObject.set(x, "ParaBackGraphicFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "ParaBackGraphicLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBackGraphicURL(value: String): Self = StObject.set(x, "ParaBackGraphicURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBackTransparent(value: Boolean): Self = StObject.set(x, "ParaBackTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaBottomMargin(value: Double): Self = StObject.set(x, "ParaBottomMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaContextMargin(value: Boolean): Self = StObject.set(x, "ParaContextMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaExpandSingleWord(value: Boolean): Self = StObject.set(x, "ParaExpandSingleWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaFirstLineIndent(value: Double): Self = StObject.set(x, "ParaFirstLineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaHyphenationMaxHyphens(value: Double): Self = StObject.set(x, "ParaHyphenationMaxHyphens", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaHyphenationMaxLeadingChars(value: Double): Self = StObject.set(x, "ParaHyphenationMaxLeadingChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaHyphenationMaxTrailingChars(value: Double): Self = StObject.set(x, "ParaHyphenationMaxTrailingChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ParaInteropGrabBag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaIsAutoFirstLineIndent(value: Boolean): Self = StObject.set(x, "ParaIsAutoFirstLineIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaIsConnectBorder(value: Boolean): Self = StObject.set(x, "ParaIsConnectBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaIsHyphenation(value: Boolean): Self = StObject.set(x, "ParaIsHyphenation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaIsNumberingRestart(value: Boolean): Self = StObject.set(x, "ParaIsNumberingRestart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaKeepTogether(value: Boolean): Self = StObject.set(x, "ParaKeepTogether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaLastLineAdjust(value: Double): Self = StObject.set(x, "ParaLastLineAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaLeftMargin(value: Double): Self = StObject.set(x, "ParaLeftMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaLineNumberCount(value: Boolean): Self = StObject.set(x, "ParaLineNumberCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaLineNumberStartValue(value: Double): Self = StObject.set(x, "ParaLineNumberStartValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaLineSpacing(value: LineSpacing): Self = StObject.set(x, "ParaLineSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaOrphans(value: Double): Self = StObject.set(x, "ParaOrphans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaRegisterModeActive(value: Boolean): Self = StObject.set(x, "ParaRegisterModeActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaRightMargin(value: Double): Self = StObject.set(x, "ParaRightMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaShadowFormat(value: ShadowFormat): Self = StObject.set(x, "ParaShadowFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaSplit(value: Boolean): Self = StObject.set(x, "ParaSplit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaStyleName(value: String): Self = StObject.set(x, "ParaStyleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaTabStops(value: SafeArray[TabStop]): Self = StObject.set(x, "ParaTabStops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaTopMargin(value: Double): Self = StObject.set(x, "ParaTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaUserDefinedAttributes(value: XNameContainer): Self = StObject.set(x, "ParaUserDefinedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaVertAlignment(value: Double): Self = StObject.set(x, "ParaVertAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParaWidows(value: Double): Self = StObject.set(x, "ParaWidows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBorder(value: BorderLine): Self = StObject.set(x, "RightBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightBorderDistance(value: Double): Self = StObject.set(x, "RightBorderDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBorder(value: BorderLine): Self = StObject.set(x, "TopBorder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBorderDistance(value: Double): Self = StObject.set(x, "TopBorderDistance", value.asInstanceOf[js.Any])
  }
}
