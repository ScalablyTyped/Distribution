package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a style sheet for paragraphs within a {@link com.sun.star.text.Text} . */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties because var conflicts: ParaUserDefinedAttributes. Inlined BorderDistance, BottomBorder, BottomBorderDistance, BreakType, DropCapCharStyleName, DropCapFormat, DropCapWholeWord, LeftBorder, LeftBorderDistance, ListId, NumberingIsNumber, NumberingLevel, NumberingRules, NumberingStartValue, NumberingStyleName, OutlineLevel, PageDescName, PageNumberOffset, PageStyleName, ParaAdjust, ParaBackColor, ParaBackGraphicFilter, ParaBackGraphicLocation, ParaBackGraphicURL, ParaBackTransparent, ParaBottomMargin, ParaContextMargin, ParaExpandSingleWord, ParaFirstLineIndent, ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars, ParaInteropGrabBag, ParaIsAutoFirstLineIndent, ParaIsConnectBorder, ParaIsHyphenation, ParaIsNumberingRestart, ParaKeepTogether, ParaLastLineAdjust, ParaLeftMargin, ParaLineNumberCount, ParaLineNumberStartValue, ParaLineSpacing, ParaOrphans, ParaRegisterModeActive, ParaRightMargin, ParaShadowFormat, ParaSplit, ParaStyleName, ParaTabStops, ParaTopMargin, ParaVertAlignment, ParaWidows, RightBorder, RightBorderDistance, TopBorder, TopBorderDistance */ trait ParagraphStyle
  extends Style
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.ParaUserDefinedAttributesSupplier {
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
  var BreakType: BreakType
  /**
    * determines the category of a paragraph style.
    * @see com.sun.star.style.ParagraphStyleCategory
    */
  var Category: scala.Double
  var CharDiffHeight: scala.Double
  /** This value contains the character height as difference in point to the height of the character in the parent style in Asian text. */
  var CharDiffHeightAsian: scala.Double
  /** This value contains the character height as difference in point to the height of the character in the parent style in complex text. */
  var CharDiffHeightComplex: scala.Double
  /** This value contains the character height as percentage value relative to the height of the character in the parent style. */
  var CharPropHeight: scala.Double
  /** This value contains the character height as percentage value relative to the height of the character in the parent style in Asian text. */
  var CharPropHeightAsian: scala.Double
  /** This value contains the character height as percentage value relative to the height of the character in the parent style in complex text. */
  var CharPropHeightComplex: scala.Double
  /** specifies the character style name for drop caps. */
  var DropCapCharStyleName: java.lang.String
  /** specifies whether the first characters of the paragraph are displayed in capital letters and how they are formatted. */
  var DropCapFormat: DropCapFormat
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
  /**
    * returns the name of the page style in use
    *
    * For setting the page style you have to use the com::sun::star::text::PageDescName properties.
    */
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
    * determines the Bottom margin of the paragraph relative to the ParaBottomMargin of the parent style.
    *
    * If the value of ParaBottomMarginRelative is 100 the current ParaBottomMargin value is used.
    */
  var ParaBottomMarginRelative: scala.Double
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
  var ParaInteropGrabBag: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
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
  /**
    * determines the left margin of the paragraph relative to the ParaLeftMargin of the parent style.
    *
    * If the value of ParaLeftMarginRelative is 100 the current ParaLeftMargin value is used.
    */
  var ParaLeftMarginRelative: scala.Double
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
    * determines the right margin of the paragraph relative to the ParaRightMargin of the parent style.
    *
    * If the value of ParaRightMarginRelative is 100 the current ParaRightMargin value is used.
    */
  var ParaRightMarginRelative: scala.Double
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
  var ParaTabStops: activexDashInteropLib.SafeArray[TabStop]
  /**
    * determines the top margin of the paragraph in 100th mm.
    *
    * The distance between two paragraphs is specified by:
    *
    * either the bottom margin of the previous paragraph.or the top margin of the following paragraph. The greater one is chosen.
    */
  var ParaTopMargin: scala.Double
  /**
    * determines the top margin of the paragraph relative to the ParaTopMargin of the parent style.
    *
    * If the value of ParaTopMarginRelative is 100 the current ParaTopMargin value is used.
    */
  var ParaTopMarginRelative: scala.Double
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
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo
}

