package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.FontSlant
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XMultiPropertyStates
import typings.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.container.XIndexReplace
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.style.BreakType
import typings.activexLibreoffice.com_.sun.star.style.CharacterProperties
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesAsian
import typings.activexLibreoffice.com_.sun.star.style.CharacterPropertiesComplex
import typings.activexLibreoffice.com_.sun.star.style.DropCapFormat
import typings.activexLibreoffice.com_.sun.star.style.GraphicLocation
import typings.activexLibreoffice.com_.sun.star.style.LineSpacing
import typings.activexLibreoffice.com_.sun.star.style.ParagraphAdjust
import typings.activexLibreoffice.com_.sun.star.style.TabStop
import typings.activexLibreoffice.com_.sun.star.style.XStyle
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.BorderLine2
import typings.activexLibreoffice.com_.sun.star.table.CellHoriJustify
import typings.activexLibreoffice.com_.sun.star.table.CellOrientation
import typings.activexLibreoffice.com_.sun.star.table.CellProperties
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.table.TableBorder
import typings.activexLibreoffice.com_.sun.star.table.TableBorder2
import typings.activexLibreoffice.com_.sun.star.util.CellProtection
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the properties of a table cell style.
  *
  * This service extends the service {@link com.sun.star.style.CellStyle} with spreadsheet specific properties.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.xml.UserDefinedAttributesSupplier because var conflicts: UserDefinedAttributes. Inlined 
- typings.activexLibreoffice.com_.sun.star.style.ParagraphProperties because var conflicts: BottomBorder, LeftBorder, RightBorder, TopBorder. Inlined BorderDistance, BottomBorderDistance, BreakType, DropCapCharStyleName, DropCapFormat, DropCapWholeWord, LeftBorderDistance, ListId, NumberingIsNumber, NumberingLevel, NumberingRules, NumberingStartValue, NumberingStyleName, OutlineLevel, PageDescName, PageNumberOffset, PageStyleName, ParaAdjust, ParaBackColor, ParaBackGraphicFilter, ParaBackGraphicLocation, ParaBackGraphicURL, ParaBackTransparent, ParaBottomMargin, ParaContextMargin, ParaExpandSingleWord, ParaFirstLineIndent, ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars, ParaInteropGrabBag, ParaIsAutoFirstLineIndent, ParaIsConnectBorder, ParaIsHyphenation, ParaIsNumberingRestart, ParaKeepTogether, ParaLastLineAdjust, ParaLeftMargin, ParaLineNumberCount, ParaLineNumberStartValue, ParaLineSpacing, ParaOrphans, ParaRegisterModeActive, ParaRightMargin, ParaShadowFormat, ParaSplit, ParaStyleName, ParaTabStops, ParaTopMargin, ParaUserDefinedAttributes, ParaVertAlignment, ParaWidows, RightBorderDistance, TopBorderDistance
- typings.activexLibreoffice.com_.sun.star.style.Style because var conflicts: UserDefinedAttributes. Inlined DisplayName, FollowStyle, Hidden, IsAutoUpdate, IsPhysical, ParaStyleConditions, StyleInteropGrabBag */ trait TableCellStyle
  extends StObject
     with CellProperties
     with CharacterProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex
     with XStyle
     with XMultiPropertySet
     with XMultiPropertyStates {
  
  /** contains the distance from the border to the object. */
  var BorderDistance: Double
  
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: Double
  
  /**
    * determines the type of break that is applied at the beginning of the table.
    * @see com.sun.star.style.BreakType
    */
  var BreakType: typings.activexLibreoffice.com_.sun.star.style.BreakType
  
  /**
    * contains the name of the style as it is displayed in the user interface.
    *
    * The names of the styles at the API are language independent. The user interface names are localized.
    */
  var DisplayName: String
  
  /** specifies the character style name for drop caps. */
  var DropCapCharStyleName: String
  
  /** specifies whether the first characters of the paragraph are displayed in capital letters and how they are formatted. */
  var DropCapFormat: typings.activexLibreoffice.com_.sun.star.style.DropCapFormat
  
  /** specifies if the property **DropCapFormat** is applied to the whole first word. */
  var DropCapWholeWord: Boolean
  
  /**
    * contains the name of the style that is applied to the next paragraph.
    *
    * This property is usually available at paragraph styles only.
    */
  var FollowStyle: String
  
  /**
    * Flag indicating whether to hide the style in the UI.
    * @since LibreOffice 4.0
    */
  var Hidden: Boolean
  
  /**
    * determines if a style is automatically updated, if the properties of an object that the style is applied to are changed.
    *
    * For example, if the style is applied to a paragraph and the properties of the paragraph are changed then the style will be updated accordingly.
    */
  var IsAutoUpdate: String
  
  /**
    * determines if a style is physically created.
    *
    * Built in styles may not be created until they are needed. To prevent standard style properties from being exported, it may be useful to check if the
    * style is created first.
    */
  var IsPhysical: Boolean
  
  /** contains the distance from the left border to the object. */
  var LeftBorderDistance: Double
  
  /** specifies the id of the list to which the paragraph belongs */
  var ListId: String
  
  /**
    * returns `FALSE` if the paragraph is part of a numbering, but has no numbering label.
    *
    * A paragraph is part of a numbering, if a style for a numbering is set - see NumberingStyleName.
    *
    * If the paragraph is not part of a numbering the property is void.
    */
  var NumberingIsNumber: Boolean
  
  /** specifies the numbering level of the paragraph. */
  var NumberingLevel: Double
  
  /** contains the numbering rules applied to this paragraph. */
  var NumberingRules: XIndexReplace
  
  /** specifies the start value for numbering if a new numbering starts at this paragraph. */
  var NumberingStartValue: Double
  
  /**
    * specifies the name of the style for the numbering.
    *
    * The name must be one of the names which are available via {@link XStyleFamiliesSupplier} .
    */
  var NumberingStyleName: String
  
  /**
    * specifies the outline level to which the paragraph belongs
    * @since OOo 3.1  Value 0 indicates that the paragraph belongs to the body text.  Values [1..10] indicates that the paragraph belongs to the corresponding
    */
  var OutlineLevel: Double
  
  /**
    * If this property is set, it creates a page break before the paragraph it belongs to and assigns the value as the name of the new page style sheet to
    * use.
    */
  var PageDescName: String
  
  /** If a page break property is set at a paragraph, this property contains the new value for the page number. */
  var PageNumberOffset: Double
  
  /** contains the name of the current page style. */
  var PageStyleName: String
  
  /** determines the adjustment of a paragraph. */
  var ParaAdjust: ParagraphAdjust
  
  /** contains the paragraph background color. */
  var ParaBackColor: Color
  
  /** contains the name of the graphic filter for the background graphic of a paragraph. */
  var ParaBackGraphicFilter: String
  
  /**
    * contains the value for the position of a background graphic.
    * @see com.sun.star.style.GraphicLocation
    */
  var ParaBackGraphicLocation: GraphicLocation
  
  /** contains the value of a link for the background graphic of a paragraph. */
  var ParaBackGraphicURL: String
  
  /** This value is `TRUE` if the paragraph background color is set to transparent. */
  var ParaBackTransparent: Boolean
  
  /**
    * determines the bottom margin of the paragraph in 100th mm.
    *
    * The distance between two paragraphs is specified by:
    *
    * either the bottom margin of the previous paragraphor the top margin of the following paragraph. The greater one is chosen.
    */
  var ParaBottomMargin: Double
  
  /**
    * determines if contextual spacing is used.
    * @since LibreOffice 3.6  If true, the top and bottom margins of the paragraph should not be applied when the previous and next paragraphs have the same style.
    */
  var ParaContextMargin: Boolean
  
  /**
    * determines if single words are stretched.
    *
    * It is only valid if {@link ParagraphProperties.ParaAdjust} and {@link ParagraphProperties.ParaLastLineAdjust} are also valid.
    */
  var ParaExpandSingleWord: Boolean
  
  /** specifies the indent for the first line. */
  var ParaFirstLineIndent: Double
  
  /** specifies the maximum number of consecutive hyphens. */
  var ParaHyphenationMaxHyphens: Double
  
  /** specifies the maximum number of characters to remain before the hyphen character (when hyphenation is applied). */
  var ParaHyphenationMaxLeadingChars: Double
  
  /** specifies the maximum number of characters to remain after the hyphen character (when hyphenation is applied). */
  var ParaHyphenationMaxTrailingChars: Double
  
  /**
    * Grab bag of paragraph properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var ParaInteropGrabBag: SafeArray[PropertyValue]
  
  /** determines if the first line should be indented automatically. */
  var ParaIsAutoFirstLineIndent: Boolean
  
  /**
    * the property determines if borders set at a paragraph are merged with the next paragraph.
    *
    * Borders are only merged if they are identical.
    */
  var ParaIsConnectBorder: Boolean
  
  /** specifies if automatic hyphenation is applied. */
  var ParaIsHyphenation: Boolean
  
  /** determines if the numbering rules restart, counting at the current paragraph. */
  var ParaIsNumberingRestart: Boolean
  
  /**
    * Setting this property to `TRUE` prevents page or column breaks between this and the following paragraph.
    *
    * This feature is useful for preventing title paragraphs to be the last line on a page or column.
    */
  var ParaKeepTogether: Boolean
  
  /**
    * determines the adjustment of the last line.
    *
    * It is only valid if {@link ParagraphProperties.ParaAdjust} is set to ParagraphAdjust::BLOCK.
    */
  var ParaLastLineAdjust: Double
  
  /** determines the left margin of the paragraph in 100th mm. */
  var ParaLeftMargin: Double
  
  /** determines if the paragraph is included in the line numbering. */
  var ParaLineNumberCount: Boolean
  
  /** contains the start value for the line numbering. */
  var ParaLineNumberStartValue: Double
  
  /** contains the type of the line spacing of a paragraph. */
  var ParaLineSpacing: LineSpacing
  
  /** specifies the minimum number of lines of the paragraph that have to be at bottom of a page if the paragraph is spread over more than one page. */
  var ParaOrphans: Double
  
  /**
    * determines if the register mode is applied to a paragraph.
    *
    * Remark: Register mode is only used if the register mode property of the page style is switched on.
    */
  var ParaRegisterModeActive: Boolean
  
  /** determines the right margin of the paragraph in 100th mm. */
  var ParaRightMargin: Double
  
  /**
    * determines the type, color, and size of the shadow.
    * @see com.sun.star.table.ShadowFormat
    */
  var ParaShadowFormat: ShadowFormat
  
  /** Setting this property to `FALSE` prevents the paragraph from getting split into two pages or columns. */
  var ParaSplit: Boolean
  
  /**
    * defines the context and styles for conditional paragraphs.
    *
    * This property is only available if the style is a conditional paragraph style.
    *
    * The sequence consists of pairs where the name part of the pair defines the context where it should be applied and the value part is a string naming
    * the style to be used in that context.
    *
    * Assigning an empty string to the style name will disable the conditional style for that context.
    *
    * The allowed strings (contexts) for the name part of an entry of the sequence are:
    *
    * umberingLevel1NumberingLevel2NumberingLevel3NumberingLevel4NumberingLevel5NumberingLevel6NumberingLevel7NumberingLevel8NumberingLevel9NumberingLevel10
    * @since OOo 2.0.1
    */
  var ParaStyleConditions: SafeArray[NamedValue]
  
  /** contains the name of the current paragraph style. */
  var ParaStyleName: String
  
  /** specifies the positions and kinds of the tab stops within this paragraph. */
  var ParaTabStops: SafeArray[TabStop]
  
  /**
    * determines the top margin of the paragraph in 100th mm.
    *
    * The distance between two paragraphs is specified by:
    *
    * either the bottom margin of the previous paragraph.or the top margin of the following paragraph. The greater one is chosen.
    */
  var ParaTopMargin: Double
  
  /**
    * this property stores xml attributes. They will be saved to and restored from automatic styles inside xml files.
    * @see com.sun.star.xml.AttributeContainer
    */
  var ParaUserDefinedAttributes: XNameContainer
  
  /**
    * specifies the vertical alignment of a paragraph.
    * @see com.sun.star.text.ParagraphVertAlign
    */
  var ParaVertAlignment: Double
  
  /** specifies the minimum number of lines of the paragraph that have to be at top of a page if the paragraph is spread over more than one page. */
  var ParaWidows: Double
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object to which this interface belongs. NULL is returned if the obj
    * @see XPropertySet.getPropertySetInfo
    */
  /* InferMemberOverrides */
  override val PropertySetInfo: XPropertySetInfo
  
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: Double
  
  /**
    * Grab bag of style properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.2  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var StyleInteropGrabBag: SafeArray[PropertyValue]
  
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: Double
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo
}
object TableCellStyle {
  
  inline def apply(
    AsianVerticalMode: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorder2: BorderLine2,
    BottomBorderDistance: Double,
    BreakType: BreakType,
    CellBackColor: Color,
    CellInteropGrabBag: SafeArray[PropertyValue],
    CellProtection: CellProtection,
    CellStyle: String,
    CharAutoKerning: Boolean,
    CharBackColor: Color,
    CharBackTransparent: Boolean,
    CharBorderDistance: Double,
    CharBottomBorder: BorderLine2,
    CharBottomBorderDistance: Double,
    CharCaseMap: Double,
    CharColor: Color,
    CharCombineIsOn: Boolean,
    CharCombinePrefix: String,
    CharCombineSuffix: String,
    CharContoured: Boolean,
    CharCrossedOut: Boolean,
    CharEmphasis: Double,
    CharEscapement: Double,
    CharEscapementHeight: Double,
    CharFlash: Boolean,
    CharFontCharSet: Double,
    CharFontCharSetAsian: Double,
    CharFontCharSetComplex: Double,
    CharFontFamily: Double,
    CharFontFamilyAsian: Double,
    CharFontFamilyComplex: Double,
    CharFontName: String,
    CharFontNameAsian: String,
    CharFontNameComplex: String,
    CharFontPitch: Double,
    CharFontPitchAsian: Double,
    CharFontPitchComplex: Double,
    CharFontStyleName: String,
    CharFontStyleNameAsian: String,
    CharFontStyleNameComplex: String,
    CharFontType: Double,
    CharHeight: Double,
    CharHeightAsian: Double,
    CharHeightComplex: Double,
    CharHidden: Boolean,
    CharHighlight: Color,
    CharInteropGrabBag: SafeArray[PropertyValue],
    CharKeepTogether: Boolean,
    CharKerning: Double,
    CharLeftBorder: BorderLine2,
    CharLeftBorderDistance: Double,
    CharLocale: Locale,
    CharLocaleAsian: Locale,
    CharLocaleComplex: Locale,
    CharNoHyphenation: Boolean,
    CharNoLineBreak: Boolean,
    CharPosture: FontSlant,
    CharPostureAsian: FontSlant,
    CharPostureComplex: FontSlant,
    CharRelief: Double,
    CharRightBorder: BorderLine2,
    CharRightBorderDistance: Double,
    CharRotation: Double,
    CharRotationIsFitToLine: Boolean,
    CharScaleWidth: Double,
    CharShadingValue: Double,
    CharShadowFormat: ShadowFormat,
    CharShadowed: Boolean,
    CharStrikeout: Double,
    CharStyleName: String,
    CharStyleNames: SafeArray[String],
    CharTopBorder: BorderLine2,
    CharTopBorderDistance: Double,
    CharUnderline: Double,
    CharUnderlineColor: Color,
    CharUnderlineHasColor: Boolean,
    CharWeight: Double,
    CharWeightAsian: Double,
    CharWeightComplex: Double,
    CharWordMode: Boolean,
    DiagonalBLTR: BorderLine,
    DiagonalBLTR2: BorderLine2,
    DiagonalTLBR: BorderLine,
    DiagonalTLBR2: BorderLine2,
    DisplayName: String,
    DropCapCharStyleName: String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: Boolean,
    FollowStyle: String,
    Hidden: Boolean,
    HoriJustify: CellHoriJustify,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    IsAutoUpdate: String,
    IsCellBackgroundTransparent: Boolean,
    IsPhysical: Boolean,
    IsTextWrapped: Boolean,
    LeftBorder: BorderLine,
    LeftBorder2: BorderLine2,
    LeftBorderDistance: Double,
    ListId: String,
    Name: String,
    NumberFormat: Double,
    NumberingIsNumber: Boolean,
    NumberingLevel: Double,
    NumberingRules: XIndexReplace,
    NumberingStartValue: Double,
    NumberingStyleName: String,
    Orientation: CellOrientation,
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
    ParaIndent: Double,
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
    ParaStyleConditions: SafeArray[NamedValue],
    ParaStyleName: String,
    ParaTabStops: SafeArray[TabStop],
    ParaTopMargin: Double,
    ParaUserDefinedAttributes: XNameContainer,
    ParaVertAlignment: Double,
    ParaWidows: Double,
    ParentStyle: String,
    PropertySetInfo: XPropertySetInfo,
    RightBorder: BorderLine,
    RightBorder2: BorderLine2,
    RightBorderDistance: Double,
    RotateAngle: Double,
    RotateReference: Double,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    ShadowFormat: ShadowFormat,
    ShrinkToFit: Boolean,
    StyleInteropGrabBag: SafeArray[PropertyValue],
    TableBorder: TableBorder,
    TableBorder2: TableBorder2,
    TextUserDefinedAttributes: XNameContainer,
    TopBorder: BorderLine,
    TopBorder2: BorderLine2,
    TopBorderDistance: Double,
    UnvisitedCharStyleName: String,
    UserDefinedAttributes: XNameContainer,
    VertJustify: Double,
    VisitedCharStyleName: String,
    acquire: () => Unit,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    firePropertiesChangeEvent: (SeqEquiv[String], XPropertiesChangeListener) => Unit,
    getName: () => String,
    getParentStyle: () => String,
    getPropertyDefaults: SeqEquiv[String] => SafeArray[js.Any],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getPropertyValues: SeqEquiv[String] => SafeArray[js.Any],
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
    setPropertyValues: (SeqEquiv[String], SeqEquiv[js.Any]) => Unit
  ): TableCellStyle = {
    val __obj = js.Dynamic.literal(AsianVerticalMode = AsianVerticalMode.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorder2 = BottomBorder2.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BreakType = BreakType.asInstanceOf[js.Any], CellBackColor = CellBackColor.asInstanceOf[js.Any], CellInteropGrabBag = CellInteropGrabBag.asInstanceOf[js.Any], CellProtection = CellProtection.asInstanceOf[js.Any], CellStyle = CellStyle.asInstanceOf[js.Any], CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharBackColor = CharBackColor.asInstanceOf[js.Any], CharBackTransparent = CharBackTransparent.asInstanceOf[js.Any], CharBorderDistance = CharBorderDistance.asInstanceOf[js.Any], CharBottomBorder = CharBottomBorder.asInstanceOf[js.Any], CharBottomBorderDistance = CharBottomBorderDistance.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharFontType = CharFontType.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharHighlight = CharHighlight.asInstanceOf[js.Any], CharInteropGrabBag = CharInteropGrabBag.asInstanceOf[js.Any], CharKeepTogether = CharKeepTogether.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLeftBorder = CharLeftBorder.asInstanceOf[js.Any], CharLeftBorderDistance = CharLeftBorderDistance.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharNoHyphenation = CharNoHyphenation.asInstanceOf[js.Any], CharNoLineBreak = CharNoLineBreak.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRightBorder = CharRightBorder.asInstanceOf[js.Any], CharRightBorderDistance = CharRightBorderDistance.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharRotationIsFitToLine = CharRotationIsFitToLine.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadingValue = CharShadingValue.asInstanceOf[js.Any], CharShadowFormat = CharShadowFormat.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], CharStyleNames = CharStyleNames.asInstanceOf[js.Any], CharTopBorder = CharTopBorder.asInstanceOf[js.Any], CharTopBorderDistance = CharTopBorderDistance.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharUnderlineHasColor = CharUnderlineHasColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], DiagonalBLTR = DiagonalBLTR.asInstanceOf[js.Any], DiagonalBLTR2 = DiagonalBLTR2.asInstanceOf[js.Any], DiagonalTLBR = DiagonalTLBR.asInstanceOf[js.Any], DiagonalTLBR2 = DiagonalTLBR2.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], DropCapCharStyleName = DropCapCharStyleName.asInstanceOf[js.Any], DropCapFormat = DropCapFormat.asInstanceOf[js.Any], DropCapWholeWord = DropCapWholeWord.asInstanceOf[js.Any], FollowStyle = FollowStyle.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], HoriJustify = HoriJustify.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], IsAutoUpdate = IsAutoUpdate.asInstanceOf[js.Any], IsCellBackgroundTransparent = IsCellBackgroundTransparent.asInstanceOf[js.Any], IsPhysical = IsPhysical.asInstanceOf[js.Any], IsTextWrapped = IsTextWrapped.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorder2 = LeftBorder2.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberingIsNumber = NumberingIsNumber.asInstanceOf[js.Any], NumberingLevel = NumberingLevel.asInstanceOf[js.Any], NumberingRules = NumberingRules.asInstanceOf[js.Any], NumberingStartValue = NumberingStartValue.asInstanceOf[js.Any], NumberingStyleName = NumberingStyleName.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageDescName = PageDescName.asInstanceOf[js.Any], PageNumberOffset = PageNumberOffset.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], ParaBackColor = ParaBackColor.asInstanceOf[js.Any], ParaBackGraphicFilter = ParaBackGraphicFilter.asInstanceOf[js.Any], ParaBackGraphicLocation = ParaBackGraphicLocation.asInstanceOf[js.Any], ParaBackGraphicURL = ParaBackGraphicURL.asInstanceOf[js.Any], ParaBackTransparent = ParaBackTransparent.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaContextMargin = ParaContextMargin.asInstanceOf[js.Any], ParaExpandSingleWord = ParaExpandSingleWord.asInstanceOf[js.Any], ParaFirstLineIndent = ParaFirstLineIndent.asInstanceOf[js.Any], ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens.asInstanceOf[js.Any], ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars.asInstanceOf[js.Any], ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars.asInstanceOf[js.Any], ParaIndent = ParaIndent.asInstanceOf[js.Any], ParaInteropGrabBag = ParaInteropGrabBag.asInstanceOf[js.Any], ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent.asInstanceOf[js.Any], ParaIsConnectBorder = ParaIsConnectBorder.asInstanceOf[js.Any], ParaIsHyphenation = ParaIsHyphenation.asInstanceOf[js.Any], ParaIsNumberingRestart = ParaIsNumberingRestart.asInstanceOf[js.Any], ParaKeepTogether = ParaKeepTogether.asInstanceOf[js.Any], ParaLastLineAdjust = ParaLastLineAdjust.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaLineNumberCount = ParaLineNumberCount.asInstanceOf[js.Any], ParaLineNumberStartValue = ParaLineNumberStartValue.asInstanceOf[js.Any], ParaLineSpacing = ParaLineSpacing.asInstanceOf[js.Any], ParaOrphans = ParaOrphans.asInstanceOf[js.Any], ParaRegisterModeActive = ParaRegisterModeActive.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaShadowFormat = ParaShadowFormat.asInstanceOf[js.Any], ParaSplit = ParaSplit.asInstanceOf[js.Any], ParaStyleConditions = ParaStyleConditions.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], ParaTabStops = ParaTabStops.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any], ParaVertAlignment = ParaVertAlignment.asInstanceOf[js.Any], ParaWidows = ParaWidows.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorder2 = RightBorder2.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RotateAngle = RotateAngle.asInstanceOf[js.Any], RotateReference = RotateReference.asInstanceOf[js.Any], RubyAdjust = RubyAdjust.asInstanceOf[js.Any], RubyCharStyleName = RubyCharStyleName.asInstanceOf[js.Any], RubyIsAbove = RubyIsAbove.asInstanceOf[js.Any], RubyText = RubyText.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], ShrinkToFit = ShrinkToFit.asInstanceOf[js.Any], StyleInteropGrabBag = StyleInteropGrabBag.asInstanceOf[js.Any], TableBorder = TableBorder.asInstanceOf[js.Any], TableBorder2 = TableBorder2.asInstanceOf[js.Any], TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorder2 = TopBorder2.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], VertJustify = VertJustify.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[TableCellStyle]
  }
  
  extension [Self <: TableCellStyle](x: Self) {
    
    inline def setBorderDistance(value: Double): Self = StObject.set(x, "BorderDistance", value.asInstanceOf[js.Any])
    
    inline def setBottomBorderDistance(value: Double): Self = StObject.set(x, "BottomBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setBreakType(value: BreakType): Self = StObject.set(x, "BreakType", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDropCapCharStyleName(value: String): Self = StObject.set(x, "DropCapCharStyleName", value.asInstanceOf[js.Any])
    
    inline def setDropCapFormat(value: DropCapFormat): Self = StObject.set(x, "DropCapFormat", value.asInstanceOf[js.Any])
    
    inline def setDropCapWholeWord(value: Boolean): Self = StObject.set(x, "DropCapWholeWord", value.asInstanceOf[js.Any])
    
    inline def setFollowStyle(value: String): Self = StObject.set(x, "FollowStyle", value.asInstanceOf[js.Any])
    
    inline def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = StObject.set(x, "getPropertySetInfo", js.Any.fromFunction0(value))
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "Hidden", value.asInstanceOf[js.Any])
    
    inline def setIsAutoUpdate(value: String): Self = StObject.set(x, "IsAutoUpdate", value.asInstanceOf[js.Any])
    
    inline def setIsPhysical(value: Boolean): Self = StObject.set(x, "IsPhysical", value.asInstanceOf[js.Any])
    
    inline def setLeftBorderDistance(value: Double): Self = StObject.set(x, "LeftBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setListId(value: String): Self = StObject.set(x, "ListId", value.asInstanceOf[js.Any])
    
    inline def setNumberingIsNumber(value: Boolean): Self = StObject.set(x, "NumberingIsNumber", value.asInstanceOf[js.Any])
    
    inline def setNumberingLevel(value: Double): Self = StObject.set(x, "NumberingLevel", value.asInstanceOf[js.Any])
    
    inline def setNumberingRules(value: XIndexReplace): Self = StObject.set(x, "NumberingRules", value.asInstanceOf[js.Any])
    
    inline def setNumberingStartValue(value: Double): Self = StObject.set(x, "NumberingStartValue", value.asInstanceOf[js.Any])
    
    inline def setNumberingStyleName(value: String): Self = StObject.set(x, "NumberingStyleName", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevel(value: Double): Self = StObject.set(x, "OutlineLevel", value.asInstanceOf[js.Any])
    
    inline def setPageDescName(value: String): Self = StObject.set(x, "PageDescName", value.asInstanceOf[js.Any])
    
    inline def setPageNumberOffset(value: Double): Self = StObject.set(x, "PageNumberOffset", value.asInstanceOf[js.Any])
    
    inline def setPageStyleName(value: String): Self = StObject.set(x, "PageStyleName", value.asInstanceOf[js.Any])
    
    inline def setParaAdjust(value: ParagraphAdjust): Self = StObject.set(x, "ParaAdjust", value.asInstanceOf[js.Any])
    
    inline def setParaBackColor(value: Color): Self = StObject.set(x, "ParaBackColor", value.asInstanceOf[js.Any])
    
    inline def setParaBackGraphicFilter(value: String): Self = StObject.set(x, "ParaBackGraphicFilter", value.asInstanceOf[js.Any])
    
    inline def setParaBackGraphicLocation(value: GraphicLocation): Self = StObject.set(x, "ParaBackGraphicLocation", value.asInstanceOf[js.Any])
    
    inline def setParaBackGraphicURL(value: String): Self = StObject.set(x, "ParaBackGraphicURL", value.asInstanceOf[js.Any])
    
    inline def setParaBackTransparent(value: Boolean): Self = StObject.set(x, "ParaBackTransparent", value.asInstanceOf[js.Any])
    
    inline def setParaBottomMargin(value: Double): Self = StObject.set(x, "ParaBottomMargin", value.asInstanceOf[js.Any])
    
    inline def setParaContextMargin(value: Boolean): Self = StObject.set(x, "ParaContextMargin", value.asInstanceOf[js.Any])
    
    inline def setParaExpandSingleWord(value: Boolean): Self = StObject.set(x, "ParaExpandSingleWord", value.asInstanceOf[js.Any])
    
    inline def setParaFirstLineIndent(value: Double): Self = StObject.set(x, "ParaFirstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setParaHyphenationMaxHyphens(value: Double): Self = StObject.set(x, "ParaHyphenationMaxHyphens", value.asInstanceOf[js.Any])
    
    inline def setParaHyphenationMaxLeadingChars(value: Double): Self = StObject.set(x, "ParaHyphenationMaxLeadingChars", value.asInstanceOf[js.Any])
    
    inline def setParaHyphenationMaxTrailingChars(value: Double): Self = StObject.set(x, "ParaHyphenationMaxTrailingChars", value.asInstanceOf[js.Any])
    
    inline def setParaInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "ParaInteropGrabBag", value.asInstanceOf[js.Any])
    
    inline def setParaIsAutoFirstLineIndent(value: Boolean): Self = StObject.set(x, "ParaIsAutoFirstLineIndent", value.asInstanceOf[js.Any])
    
    inline def setParaIsConnectBorder(value: Boolean): Self = StObject.set(x, "ParaIsConnectBorder", value.asInstanceOf[js.Any])
    
    inline def setParaIsHyphenation(value: Boolean): Self = StObject.set(x, "ParaIsHyphenation", value.asInstanceOf[js.Any])
    
    inline def setParaIsNumberingRestart(value: Boolean): Self = StObject.set(x, "ParaIsNumberingRestart", value.asInstanceOf[js.Any])
    
    inline def setParaKeepTogether(value: Boolean): Self = StObject.set(x, "ParaKeepTogether", value.asInstanceOf[js.Any])
    
    inline def setParaLastLineAdjust(value: Double): Self = StObject.set(x, "ParaLastLineAdjust", value.asInstanceOf[js.Any])
    
    inline def setParaLeftMargin(value: Double): Self = StObject.set(x, "ParaLeftMargin", value.asInstanceOf[js.Any])
    
    inline def setParaLineNumberCount(value: Boolean): Self = StObject.set(x, "ParaLineNumberCount", value.asInstanceOf[js.Any])
    
    inline def setParaLineNumberStartValue(value: Double): Self = StObject.set(x, "ParaLineNumberStartValue", value.asInstanceOf[js.Any])
    
    inline def setParaLineSpacing(value: LineSpacing): Self = StObject.set(x, "ParaLineSpacing", value.asInstanceOf[js.Any])
    
    inline def setParaOrphans(value: Double): Self = StObject.set(x, "ParaOrphans", value.asInstanceOf[js.Any])
    
    inline def setParaRegisterModeActive(value: Boolean): Self = StObject.set(x, "ParaRegisterModeActive", value.asInstanceOf[js.Any])
    
    inline def setParaRightMargin(value: Double): Self = StObject.set(x, "ParaRightMargin", value.asInstanceOf[js.Any])
    
    inline def setParaShadowFormat(value: ShadowFormat): Self = StObject.set(x, "ParaShadowFormat", value.asInstanceOf[js.Any])
    
    inline def setParaSplit(value: Boolean): Self = StObject.set(x, "ParaSplit", value.asInstanceOf[js.Any])
    
    inline def setParaStyleConditions(value: SafeArray[NamedValue]): Self = StObject.set(x, "ParaStyleConditions", value.asInstanceOf[js.Any])
    
    inline def setParaStyleName(value: String): Self = StObject.set(x, "ParaStyleName", value.asInstanceOf[js.Any])
    
    inline def setParaTabStops(value: SafeArray[TabStop]): Self = StObject.set(x, "ParaTabStops", value.asInstanceOf[js.Any])
    
    inline def setParaTopMargin(value: Double): Self = StObject.set(x, "ParaTopMargin", value.asInstanceOf[js.Any])
    
    inline def setParaUserDefinedAttributes(value: XNameContainer): Self = StObject.set(x, "ParaUserDefinedAttributes", value.asInstanceOf[js.Any])
    
    inline def setParaVertAlignment(value: Double): Self = StObject.set(x, "ParaVertAlignment", value.asInstanceOf[js.Any])
    
    inline def setParaWidows(value: Double): Self = StObject.set(x, "ParaWidows", value.asInstanceOf[js.Any])
    
    inline def setPropertySetInfo(value: XPropertySetInfo): Self = StObject.set(x, "PropertySetInfo", value.asInstanceOf[js.Any])
    
    inline def setRightBorderDistance(value: Double): Self = StObject.set(x, "RightBorderDistance", value.asInstanceOf[js.Any])
    
    inline def setStyleInteropGrabBag(value: SafeArray[PropertyValue]): Self = StObject.set(x, "StyleInteropGrabBag", value.asInstanceOf[js.Any])
    
    inline def setTopBorderDistance(value: Double): Self = StObject.set(x, "TopBorderDistance", value.asInstanceOf[js.Any])
  }
}
