package typings.activexLibreoffice.com_.sun.star.style

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.activexLibreoffice.com_.sun.star.xml.ParaUserDefinedAttributesSupplier
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a style sheet for paragraphs within a {@link com.sun.star.text.Text} . */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.style.ParagraphProperties because var conflicts: ParaUserDefinedAttributes. Inlined BorderDistance, BottomBorder, BottomBorderDistance, BreakType, DropCapCharStyleName, DropCapFormat, DropCapWholeWord, LeftBorder, LeftBorderDistance, ListId, NumberingIsNumber, NumberingLevel, NumberingRules, NumberingStartValue, NumberingStyleName, OutlineLevel, PageDescName, PageNumberOffset, PageStyleName, ParaAdjust, ParaBackColor, ParaBackGraphicFilter, ParaBackGraphicLocation, ParaBackGraphicURL, ParaBackTransparent, ParaBottomMargin, ParaContextMargin, ParaExpandSingleWord, ParaFirstLineIndent, ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars, ParaInteropGrabBag, ParaIsAutoFirstLineIndent, ParaIsConnectBorder, ParaIsHyphenation, ParaIsNumberingRestart, ParaKeepTogether, ParaLastLineAdjust, ParaLeftMargin, ParaLineNumberCount, ParaLineNumberStartValue, ParaLineSpacing, ParaOrphans, ParaRegisterModeActive, ParaRightMargin, ParaShadowFormat, ParaSplit, ParaStyleName, ParaTabStops, ParaTopMargin, ParaVertAlignment, ParaWidows, RightBorder, RightBorderDistance, TopBorder, TopBorderDistance */ @js.native
trait ParagraphStyle
  extends Style
     with ParaUserDefinedAttributesSupplier {
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
  /**
    * determines the category of a paragraph style.
    * @see com.sun.star.style.ParagraphStyleCategory
    */
  var Category: Double = js.native
  var CharDiffHeight: Double = js.native
  /** This value contains the character height as difference in point to the height of the character in the parent style in Asian text. */
  var CharDiffHeightAsian: Double = js.native
  /** This value contains the character height as difference in point to the height of the character in the parent style in complex text. */
  var CharDiffHeightComplex: Double = js.native
  /** This value contains the character height as percentage value relative to the height of the character in the parent style. */
  var CharPropHeight: Double = js.native
  /** This value contains the character height as percentage value relative to the height of the character in the parent style in Asian text. */
  var CharPropHeightAsian: Double = js.native
  /** This value contains the character height as percentage value relative to the height of the character in the parent style in complex text. */
  var CharPropHeightComplex: Double = js.native
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
  /**
    * returns the name of the page style in use
    *
    * For setting the page style you have to use the com::sun::star::text::PageDescName properties.
    */
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
    * determines the Bottom margin of the paragraph relative to the ParaBottomMargin of the parent style.
    *
    * If the value of ParaBottomMarginRelative is 100 the current ParaBottomMargin value is used.
    */
  var ParaBottomMarginRelative: Double = js.native
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
  /**
    * determines the left margin of the paragraph relative to the ParaLeftMargin of the parent style.
    *
    * If the value of ParaLeftMarginRelative is 100 the current ParaLeftMargin value is used.
    */
  var ParaLeftMarginRelative: Double = js.native
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
    * determines the right margin of the paragraph relative to the ParaRightMargin of the parent style.
    *
    * If the value of ParaRightMarginRelative is 100 the current ParaRightMargin value is used.
    */
  var ParaRightMarginRelative: Double = js.native
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
    * determines the top margin of the paragraph relative to the ParaTopMargin of the parent style.
    *
    * If the value of ParaTopMarginRelative is 100 the current ParaTopMargin value is used.
    */
  var ParaTopMarginRelative: Double = js.native
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
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

object ParagraphStyle {
  @scala.inline
  def apply(
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BreakType: BreakType,
    Category: Double,
    CharDiffHeight: Double,
    CharDiffHeightAsian: Double,
    CharDiffHeightComplex: Double,
    CharPropHeight: Double,
    CharPropHeightAsian: Double,
    CharPropHeightComplex: Double,
    DisplayName: String,
    DropCapCharStyleName: String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: Boolean,
    FollowStyle: String,
    Hidden: Boolean,
    IsAutoUpdate: String,
    IsPhysical: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    ListId: String,
    Name: String,
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
    ParaBottomMarginRelative: Double,
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
    ParaLeftMarginRelative: Double,
    ParaLineNumberCount: Boolean,
    ParaLineNumberStartValue: Double,
    ParaLineSpacing: LineSpacing,
    ParaOrphans: Double,
    ParaRegisterModeActive: Boolean,
    ParaRightMargin: Double,
    ParaRightMarginRelative: Double,
    ParaShadowFormat: ShadowFormat,
    ParaSplit: Boolean,
    ParaStyleConditions: SafeArray[NamedValue],
    ParaStyleName: String,
    ParaTabStops: SafeArray[TabStop],
    ParaTopMargin: Double,
    ParaTopMarginRelative: Double,
    ParaUserDefinedAttributes: XNameContainer,
    ParaVertAlignment: Double,
    ParaWidows: Double,
    ParentStyle: String,
    PropertySetInfo: XPropertySetInfo,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    StyleInteropGrabBag: SafeArray[PropertyValue],
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    UserDefinedAttributes: XNameContainer,
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
  ): ParagraphStyle = {
    val __obj = js.Dynamic.literal(BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BreakType = BreakType.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], CharDiffHeight = CharDiffHeight.asInstanceOf[js.Any], CharDiffHeightAsian = CharDiffHeightAsian.asInstanceOf[js.Any], CharDiffHeightComplex = CharDiffHeightComplex.asInstanceOf[js.Any], CharPropHeight = CharPropHeight.asInstanceOf[js.Any], CharPropHeightAsian = CharPropHeightAsian.asInstanceOf[js.Any], CharPropHeightComplex = CharPropHeightComplex.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], DropCapCharStyleName = DropCapCharStyleName.asInstanceOf[js.Any], DropCapFormat = DropCapFormat.asInstanceOf[js.Any], DropCapWholeWord = DropCapWholeWord.asInstanceOf[js.Any], FollowStyle = FollowStyle.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IsAutoUpdate = IsAutoUpdate.asInstanceOf[js.Any], IsPhysical = IsPhysical.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberingIsNumber = NumberingIsNumber.asInstanceOf[js.Any], NumberingLevel = NumberingLevel.asInstanceOf[js.Any], NumberingRules = NumberingRules.asInstanceOf[js.Any], NumberingStartValue = NumberingStartValue.asInstanceOf[js.Any], NumberingStyleName = NumberingStyleName.asInstanceOf[js.Any], OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageDescName = PageDescName.asInstanceOf[js.Any], PageNumberOffset = PageNumberOffset.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], ParaBackColor = ParaBackColor.asInstanceOf[js.Any], ParaBackGraphicFilter = ParaBackGraphicFilter.asInstanceOf[js.Any], ParaBackGraphicLocation = ParaBackGraphicLocation.asInstanceOf[js.Any], ParaBackGraphicURL = ParaBackGraphicURL.asInstanceOf[js.Any], ParaBackTransparent = ParaBackTransparent.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaBottomMarginRelative = ParaBottomMarginRelative.asInstanceOf[js.Any], ParaContextMargin = ParaContextMargin.asInstanceOf[js.Any], ParaExpandSingleWord = ParaExpandSingleWord.asInstanceOf[js.Any], ParaFirstLineIndent = ParaFirstLineIndent.asInstanceOf[js.Any], ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens.asInstanceOf[js.Any], ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars.asInstanceOf[js.Any], ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars.asInstanceOf[js.Any], ParaInteropGrabBag = ParaInteropGrabBag.asInstanceOf[js.Any], ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent.asInstanceOf[js.Any], ParaIsConnectBorder = ParaIsConnectBorder.asInstanceOf[js.Any], ParaIsHyphenation = ParaIsHyphenation.asInstanceOf[js.Any], ParaIsNumberingRestart = ParaIsNumberingRestart.asInstanceOf[js.Any], ParaKeepTogether = ParaKeepTogether.asInstanceOf[js.Any], ParaLastLineAdjust = ParaLastLineAdjust.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaLeftMarginRelative = ParaLeftMarginRelative.asInstanceOf[js.Any], ParaLineNumberCount = ParaLineNumberCount.asInstanceOf[js.Any], ParaLineNumberStartValue = ParaLineNumberStartValue.asInstanceOf[js.Any], ParaLineSpacing = ParaLineSpacing.asInstanceOf[js.Any], ParaOrphans = ParaOrphans.asInstanceOf[js.Any], ParaRegisterModeActive = ParaRegisterModeActive.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaRightMarginRelative = ParaRightMarginRelative.asInstanceOf[js.Any], ParaShadowFormat = ParaShadowFormat.asInstanceOf[js.Any], ParaSplit = ParaSplit.asInstanceOf[js.Any], ParaStyleConditions = ParaStyleConditions.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], ParaTabStops = ParaTabStops.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], ParaTopMarginRelative = ParaTopMarginRelative.asInstanceOf[js.Any], ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any], ParaVertAlignment = ParaVertAlignment.asInstanceOf[js.Any], ParaWidows = ParaWidows.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], StyleInteropGrabBag = StyleInteropGrabBag.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[ParagraphStyle]
  }
  @scala.inline
  implicit class ParagraphStyleOps[Self <: ParagraphStyle] (val x: Self) extends AnyVal {
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
    def setBorderDistance(value: Double): Self = this.set("BorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomBorder(value: BorderLine): Self = this.set("BottomBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomBorderDistance(value: Double): Self = this.set("BottomBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setBreakType(value: BreakType): Self = this.set("BreakType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: Double): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharDiffHeight(value: Double): Self = this.set("CharDiffHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharDiffHeightAsian(value: Double): Self = this.set("CharDiffHeightAsian", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharDiffHeightComplex(value: Double): Self = this.set("CharDiffHeightComplex", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharPropHeight(value: Double): Self = this.set("CharPropHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharPropHeightAsian(value: Double): Self = this.set("CharPropHeightAsian", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharPropHeightComplex(value: Double): Self = this.set("CharPropHeightComplex", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropCapCharStyleName(value: String): Self = this.set("DropCapCharStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropCapFormat(value: DropCapFormat): Self = this.set("DropCapFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropCapWholeWord(value: Boolean): Self = this.set("DropCapWholeWord", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftBorder(value: BorderLine): Self = this.set("LeftBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftBorderDistance(value: Double): Self = this.set("LeftBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setListId(value: String): Self = this.set("ListId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberingIsNumber(value: Boolean): Self = this.set("NumberingIsNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberingLevel(value: Double): Self = this.set("NumberingLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberingRules(value: XIndexReplace): Self = this.set("NumberingRules", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberingStartValue(value: Double): Self = this.set("NumberingStartValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberingStyleName(value: String): Self = this.set("NumberingStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlineLevel(value: Double): Self = this.set("OutlineLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageDescName(value: String): Self = this.set("PageDescName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageNumberOffset(value: Double): Self = this.set("PageNumberOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageStyleName(value: String): Self = this.set("PageStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaAdjust(value: ParagraphAdjust): Self = this.set("ParaAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaBackColor(value: Color): Self = this.set("ParaBackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaBackGraphicFilter(value: String): Self = this.set("ParaBackGraphicFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaBackGraphicLocation(value: GraphicLocation): Self = this.set("ParaBackGraphicLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaBackGraphicURL(value: String): Self = this.set("ParaBackGraphicURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaBackTransparent(value: Boolean): Self = this.set("ParaBackTransparent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaBottomMargin(value: Double): Self = this.set("ParaBottomMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaBottomMarginRelative(value: Double): Self = this.set("ParaBottomMarginRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaContextMargin(value: Boolean): Self = this.set("ParaContextMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaExpandSingleWord(value: Boolean): Self = this.set("ParaExpandSingleWord", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaFirstLineIndent(value: Double): Self = this.set("ParaFirstLineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaHyphenationMaxHyphens(value: Double): Self = this.set("ParaHyphenationMaxHyphens", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaHyphenationMaxLeadingChars(value: Double): Self = this.set("ParaHyphenationMaxLeadingChars", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaHyphenationMaxTrailingChars(value: Double): Self = this.set("ParaHyphenationMaxTrailingChars", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaInteropGrabBag(value: SafeArray[PropertyValue]): Self = this.set("ParaInteropGrabBag", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaIsAutoFirstLineIndent(value: Boolean): Self = this.set("ParaIsAutoFirstLineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaIsConnectBorder(value: Boolean): Self = this.set("ParaIsConnectBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaIsHyphenation(value: Boolean): Self = this.set("ParaIsHyphenation", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaIsNumberingRestart(value: Boolean): Self = this.set("ParaIsNumberingRestart", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaKeepTogether(value: Boolean): Self = this.set("ParaKeepTogether", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaLastLineAdjust(value: Double): Self = this.set("ParaLastLineAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaLeftMargin(value: Double): Self = this.set("ParaLeftMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaLeftMarginRelative(value: Double): Self = this.set("ParaLeftMarginRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaLineNumberCount(value: Boolean): Self = this.set("ParaLineNumberCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaLineNumberStartValue(value: Double): Self = this.set("ParaLineNumberStartValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaLineSpacing(value: LineSpacing): Self = this.set("ParaLineSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaOrphans(value: Double): Self = this.set("ParaOrphans", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaRegisterModeActive(value: Boolean): Self = this.set("ParaRegisterModeActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaRightMargin(value: Double): Self = this.set("ParaRightMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaRightMarginRelative(value: Double): Self = this.set("ParaRightMarginRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaShadowFormat(value: ShadowFormat): Self = this.set("ParaShadowFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaSplit(value: Boolean): Self = this.set("ParaSplit", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaStyleName(value: String): Self = this.set("ParaStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaTabStops(value: SafeArray[TabStop]): Self = this.set("ParaTabStops", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaTopMargin(value: Double): Self = this.set("ParaTopMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaTopMarginRelative(value: Double): Self = this.set("ParaTopMarginRelative", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaVertAlignment(value: Double): Self = this.set("ParaVertAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaWidows(value: Double): Self = this.set("ParaWidows", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightBorder(value: BorderLine): Self = this.set("RightBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightBorderDistance(value: Double): Self = this.set("RightBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopBorder(value: BorderLine): Self = this.set("TopBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopBorderDistance(value: Double): Self = this.set("TopBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = this.set("getPropertySetInfo", js.Any.fromFunction0(value))
  }
  
}

