package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.FontSlant
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
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
import typings.activexLibreoffice.com_.sun.star.style.Style
import typings.activexLibreoffice.com_.sun.star.style.TabStop
import typings.activexLibreoffice.com_.sun.star.table.BorderLine
import typings.activexLibreoffice.com_.sun.star.table.BorderLine2
import typings.activexLibreoffice.com_.sun.star.table.CellHoriJustify
import typings.activexLibreoffice.com_.sun.star.table.CellOrientation
import typings.activexLibreoffice.com_.sun.star.table.ShadowFormat
import typings.activexLibreoffice.com_.sun.star.table.TableBorder
import typings.activexLibreoffice.com_.sun.star.table.TableBorder2
import typings.activexLibreoffice.com_.sun.star.util.CellProtection
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the properties of a table cell style.
  *
  * This service extends the service {@link com.sun.star.style.CellStyle} with spreadsheet specific properties.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
- typings.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
- typings.activexLibreoffice.com_.sun.star.style.ParagraphProperties because var conflicts: BottomBorder, LeftBorder, RightBorder, TopBorder. Inlined BorderDistance, BottomBorderDistance, BreakType, DropCapCharStyleName, DropCapFormat, DropCapWholeWord, LeftBorderDistance, ListId, NumberingIsNumber, NumberingLevel, NumberingRules, NumberingStartValue, NumberingStyleName, OutlineLevel, PageDescName, PageNumberOffset, PageStyleName, ParaAdjust, ParaBackColor, ParaBackGraphicFilter, ParaBackGraphicLocation, ParaBackGraphicURL, ParaBackTransparent, ParaBottomMargin, ParaContextMargin, ParaExpandSingleWord, ParaFirstLineIndent, ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars, ParaInteropGrabBag, ParaIsAutoFirstLineIndent, ParaIsConnectBorder, ParaIsHyphenation, ParaIsNumberingRestart, ParaKeepTogether, ParaLastLineAdjust, ParaLeftMargin, ParaLineNumberCount, ParaLineNumberStartValue, ParaLineSpacing, ParaOrphans, ParaRegisterModeActive, ParaRightMargin, ParaShadowFormat, ParaSplit, ParaStyleName, ParaTabStops, ParaTopMargin, ParaUserDefinedAttributes, ParaVertAlignment, ParaWidows, RightBorderDistance, TopBorderDistance
- typings.activexLibreoffice.com_.sun.star.table.CellProperties because var conflicts: UserDefinedAttributes. Inlined AsianVerticalMode, BottomBorder, BottomBorder2, CellBackColor, CellInteropGrabBag, CellProtection, CellStyle, DiagonalBLTR, DiagonalBLTR2, DiagonalTLBR, DiagonalTLBR2, HoriJustify, IsCellBackgroundTransparent, IsTextWrapped, LeftBorder, LeftBorder2, NumberFormat, Orientation, ParaIndent, RightBorder, RightBorder2, RotateAngle, RotateReference, ShadowFormat, ShrinkToFit, TableBorder, TableBorder2, TopBorder, TopBorder2, VertJustify */ @js.native
trait TableCellStyle
  extends Style
     with CharacterProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex {
  /**
    * selects Asian character orientation in vertical orientation.
    *
    * If the {@link CellProperties.Orientation} property is CellOrientation::STACKED, in Asian mode only Asian characters are printed in horizontal
    * orientation instead of all characters. For other values of {@link CellProperties.Orientation} , this value is not used.
    */
  var AsianVerticalMode: Boolean = js.native
  /** contains the distance from the border to the object. */
  var BorderDistance: Double = js.native
  /** contains a description of the bottom border line of each cell. */
  var BottomBorder: BorderLine = js.native
  /**
    * contains a description of the bottom border line of each cell. Preferred over {@link BorderLine}{@link BottomBorder} .
    * @since LibreOffice 3.6
    */
  var BottomBorder2: BorderLine2 = js.native
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: Double = js.native
  /**
    * determines the type of break that is applied at the beginning of the table.
    * @see com.sun.star.style.BreakType
    */
  var BreakType: typings.activexLibreoffice.com_.sun.star.style.BreakType = js.native
  /** contains the cell background color. */
  var CellBackColor: Color = js.native
  /**
    * Grab bag of cell properties, used as a string-any map for interim interop purposes.
    * @since LibreOffice 4.3  This property is intentionally not handled by the ODF filter. Any member that should be handled there should be first moved out
    */
  var CellInteropGrabBag: SafeArray[PropertyValue] = js.native
  /**
    * contains a description of the cell protection.
    *
    * {@link Cell} protection is active only if the sheet is protected.
    */
  var CellProtection: typings.activexLibreoffice.com_.sun.star.util.CellProtection = js.native
  /** contains the name of the style of the cell. */
  var CellStyle: String = js.native
  /** contains a description of the bottom left to top right diagonal line of each cell. */
  var DiagonalBLTR: BorderLine = js.native
  /**
    * contains a description of the bottom left to top right diagonal line of each cell. Preferred over {@link BorderLine}{@link DiagonalBLTR} .
    * @since LibreOffice 3.6
    */
  var DiagonalBLTR2: BorderLine2 = js.native
  /** contains a description of the top left to bottom right diagonal line of each cell. */
  var DiagonalTLBR: BorderLine = js.native
  /**
    * contains a description of the top left to bottom right diagonal line of each cell. Preferred over {@link BorderLine}{@link DiagonalTLBR} .
    * @since LibreOffice 3.6
    */
  var DiagonalTLBR2: BorderLine2 = js.native
  /** specifies the character style name for drop caps. */
  var DropCapCharStyleName: String = js.native
  /** specifies whether the first characters of the paragraph are displayed in capital letters and how they are formatted. */
  var DropCapFormat: typings.activexLibreoffice.com_.sun.star.style.DropCapFormat = js.native
  /** specifies if the property **DropCapFormat** is applied to the whole first word. */
  var DropCapWholeWord: Boolean = js.native
  /** contains the horizontal alignment of the cell contents. */
  var HoriJustify: CellHoriJustify = js.native
  /**
    * is `TRUE` , if the cell background is transparent.
    *
    * In this case the {@link CellProperties.CellBackColor} value is not used.
    */
  var IsCellBackgroundTransparent: Boolean = js.native
  /** is `TRUE` , if text in the cells will be wrapped automatically at the right border. */
  var IsTextWrapped: Boolean = js.native
  /** contains a description of the left border line of each cell. */
  var LeftBorder: BorderLine = js.native
  /**
    * contains a description of the left border line of each cell. Preferred over {@link BorderLine}{@link LeftBorder} .
    * @since LibreOffice 3.6
    */
  var LeftBorder2: BorderLine2 = js.native
  /** contains the distance from the left border to the object. */
  var LeftBorderDistance: Double = js.native
  /** specifies the id of the list to which the paragraph belongs */
  var ListId: String = js.native
  /**
    * contains the index of the number format that is used in the cells.
    *
    * The proper value can be determined by using the {@link com.sun.star.util.NumberFormatter} interface of the document.
    */
  var NumberFormat: Double = js.native
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
    * contains the orientation of the cell contents.
    *
    * If the {@link CellProperties.RotateAngle} property is non-zero, this value is not used.
    */
  var Orientation: CellOrientation = js.native
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
  /** defines the indentation of the cell contents (in 1/100 mm). */
  var ParaIndent: Double = js.native
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
  /** contains a description of the right border line of each cell. */
  var RightBorder: BorderLine = js.native
  /**
    * contains a description of the right border line of each cell. Preferred over {@link BorderLine}{@link RightBorder} .
    * @since LibreOffice 3.6
    */
  var RightBorder2: BorderLine2 = js.native
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: Double = js.native
  /** defines how much the content of cells is rotated (in 1/100 degrees). */
  var RotateAngle: Double = js.native
  /**
    * defines at which edge rotated cells are aligned.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var RotateReference: Double = js.native
  /** contains a description of the shadow. */
  var ShadowFormat: typings.activexLibreoffice.com_.sun.star.table.ShadowFormat = js.native
  /** is `TRUE` , if the cell content will be shrunk to fit in the cell. */
  var ShrinkToFit: Boolean = js.native
  /**
    * contains a description of the cell or cell range border.
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    */
  var TableBorder: typings.activexLibreoffice.com_.sun.star.table.TableBorder = js.native
  /**
    * contains a description of the cell or cell range border. Preferred over {@link TableBorder}{@link TableBorder} .
    *
    * If used with a cell range, the top, left, right, and bottom lines are at the edges of the entire range, not at the edges of the individual cell.
    * @since LibreOffice 3.6
    */
  var TableBorder2: typings.activexLibreoffice.com_.sun.star.table.TableBorder2 = js.native
  /** contains a description of the top border line of each cell. */
  var TopBorder: BorderLine = js.native
  /**
    * contains a description of the top border line of each cell. Preferred over {@link BorderLine}{@link TopBorder} .
    * @since LibreOffice 3.6
    */
  var TopBorder2: BorderLine2 = js.native
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: Double = js.native
  /**
    * contains the vertical alignment of the cell contents.
    *
    * changed from {@link com.sun.star.table.CellVertJustify} to long in LibO 3.5
    * @see com.sun.star.table.CellVertJustify2
    */
  var VertJustify: Double = js.native
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}

object TableCellStyle {
  @scala.inline
  def apply(
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
  ): TableCellStyle = {
    val __obj = js.Dynamic.literal(AsianVerticalMode = AsianVerticalMode.asInstanceOf[js.Any], BorderDistance = BorderDistance.asInstanceOf[js.Any], BottomBorder = BottomBorder.asInstanceOf[js.Any], BottomBorder2 = BottomBorder2.asInstanceOf[js.Any], BottomBorderDistance = BottomBorderDistance.asInstanceOf[js.Any], BreakType = BreakType.asInstanceOf[js.Any], CellBackColor = CellBackColor.asInstanceOf[js.Any], CellInteropGrabBag = CellInteropGrabBag.asInstanceOf[js.Any], CellProtection = CellProtection.asInstanceOf[js.Any], CellStyle = CellStyle.asInstanceOf[js.Any], CharAutoKerning = CharAutoKerning.asInstanceOf[js.Any], CharBackColor = CharBackColor.asInstanceOf[js.Any], CharBackTransparent = CharBackTransparent.asInstanceOf[js.Any], CharBorderDistance = CharBorderDistance.asInstanceOf[js.Any], CharBottomBorder = CharBottomBorder.asInstanceOf[js.Any], CharBottomBorderDistance = CharBottomBorderDistance.asInstanceOf[js.Any], CharCaseMap = CharCaseMap.asInstanceOf[js.Any], CharColor = CharColor.asInstanceOf[js.Any], CharCombineIsOn = CharCombineIsOn.asInstanceOf[js.Any], CharCombinePrefix = CharCombinePrefix.asInstanceOf[js.Any], CharCombineSuffix = CharCombineSuffix.asInstanceOf[js.Any], CharContoured = CharContoured.asInstanceOf[js.Any], CharCrossedOut = CharCrossedOut.asInstanceOf[js.Any], CharEmphasis = CharEmphasis.asInstanceOf[js.Any], CharEscapement = CharEscapement.asInstanceOf[js.Any], CharEscapementHeight = CharEscapementHeight.asInstanceOf[js.Any], CharFlash = CharFlash.asInstanceOf[js.Any], CharFontCharSet = CharFontCharSet.asInstanceOf[js.Any], CharFontCharSetAsian = CharFontCharSetAsian.asInstanceOf[js.Any], CharFontCharSetComplex = CharFontCharSetComplex.asInstanceOf[js.Any], CharFontFamily = CharFontFamily.asInstanceOf[js.Any], CharFontFamilyAsian = CharFontFamilyAsian.asInstanceOf[js.Any], CharFontFamilyComplex = CharFontFamilyComplex.asInstanceOf[js.Any], CharFontName = CharFontName.asInstanceOf[js.Any], CharFontNameAsian = CharFontNameAsian.asInstanceOf[js.Any], CharFontNameComplex = CharFontNameComplex.asInstanceOf[js.Any], CharFontPitch = CharFontPitch.asInstanceOf[js.Any], CharFontPitchAsian = CharFontPitchAsian.asInstanceOf[js.Any], CharFontPitchComplex = CharFontPitchComplex.asInstanceOf[js.Any], CharFontStyleName = CharFontStyleName.asInstanceOf[js.Any], CharFontStyleNameAsian = CharFontStyleNameAsian.asInstanceOf[js.Any], CharFontStyleNameComplex = CharFontStyleNameComplex.asInstanceOf[js.Any], CharFontType = CharFontType.asInstanceOf[js.Any], CharHeight = CharHeight.asInstanceOf[js.Any], CharHeightAsian = CharHeightAsian.asInstanceOf[js.Any], CharHeightComplex = CharHeightComplex.asInstanceOf[js.Any], CharHidden = CharHidden.asInstanceOf[js.Any], CharHighlight = CharHighlight.asInstanceOf[js.Any], CharInteropGrabBag = CharInteropGrabBag.asInstanceOf[js.Any], CharKeepTogether = CharKeepTogether.asInstanceOf[js.Any], CharKerning = CharKerning.asInstanceOf[js.Any], CharLeftBorder = CharLeftBorder.asInstanceOf[js.Any], CharLeftBorderDistance = CharLeftBorderDistance.asInstanceOf[js.Any], CharLocale = CharLocale.asInstanceOf[js.Any], CharLocaleAsian = CharLocaleAsian.asInstanceOf[js.Any], CharLocaleComplex = CharLocaleComplex.asInstanceOf[js.Any], CharNoHyphenation = CharNoHyphenation.asInstanceOf[js.Any], CharNoLineBreak = CharNoLineBreak.asInstanceOf[js.Any], CharPosture = CharPosture.asInstanceOf[js.Any], CharPostureAsian = CharPostureAsian.asInstanceOf[js.Any], CharPostureComplex = CharPostureComplex.asInstanceOf[js.Any], CharRelief = CharRelief.asInstanceOf[js.Any], CharRightBorder = CharRightBorder.asInstanceOf[js.Any], CharRightBorderDistance = CharRightBorderDistance.asInstanceOf[js.Any], CharRotation = CharRotation.asInstanceOf[js.Any], CharRotationIsFitToLine = CharRotationIsFitToLine.asInstanceOf[js.Any], CharScaleWidth = CharScaleWidth.asInstanceOf[js.Any], CharShadingValue = CharShadingValue.asInstanceOf[js.Any], CharShadowFormat = CharShadowFormat.asInstanceOf[js.Any], CharShadowed = CharShadowed.asInstanceOf[js.Any], CharStrikeout = CharStrikeout.asInstanceOf[js.Any], CharStyleName = CharStyleName.asInstanceOf[js.Any], CharStyleNames = CharStyleNames.asInstanceOf[js.Any], CharTopBorder = CharTopBorder.asInstanceOf[js.Any], CharTopBorderDistance = CharTopBorderDistance.asInstanceOf[js.Any], CharUnderline = CharUnderline.asInstanceOf[js.Any], CharUnderlineColor = CharUnderlineColor.asInstanceOf[js.Any], CharUnderlineHasColor = CharUnderlineHasColor.asInstanceOf[js.Any], CharWeight = CharWeight.asInstanceOf[js.Any], CharWeightAsian = CharWeightAsian.asInstanceOf[js.Any], CharWeightComplex = CharWeightComplex.asInstanceOf[js.Any], CharWordMode = CharWordMode.asInstanceOf[js.Any], DiagonalBLTR = DiagonalBLTR.asInstanceOf[js.Any], DiagonalBLTR2 = DiagonalBLTR2.asInstanceOf[js.Any], DiagonalTLBR = DiagonalTLBR.asInstanceOf[js.Any], DiagonalTLBR2 = DiagonalTLBR2.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], DropCapCharStyleName = DropCapCharStyleName.asInstanceOf[js.Any], DropCapFormat = DropCapFormat.asInstanceOf[js.Any], DropCapWholeWord = DropCapWholeWord.asInstanceOf[js.Any], FollowStyle = FollowStyle.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], HoriJustify = HoriJustify.asInstanceOf[js.Any], HyperLinkName = HyperLinkName.asInstanceOf[js.Any], HyperLinkTarget = HyperLinkTarget.asInstanceOf[js.Any], HyperLinkURL = HyperLinkURL.asInstanceOf[js.Any], IsAutoUpdate = IsAutoUpdate.asInstanceOf[js.Any], IsCellBackgroundTransparent = IsCellBackgroundTransparent.asInstanceOf[js.Any], IsPhysical = IsPhysical.asInstanceOf[js.Any], IsTextWrapped = IsTextWrapped.asInstanceOf[js.Any], LeftBorder = LeftBorder.asInstanceOf[js.Any], LeftBorder2 = LeftBorder2.asInstanceOf[js.Any], LeftBorderDistance = LeftBorderDistance.asInstanceOf[js.Any], ListId = ListId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberingIsNumber = NumberingIsNumber.asInstanceOf[js.Any], NumberingLevel = NumberingLevel.asInstanceOf[js.Any], NumberingRules = NumberingRules.asInstanceOf[js.Any], NumberingStartValue = NumberingStartValue.asInstanceOf[js.Any], NumberingStyleName = NumberingStyleName.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], OutlineLevel = OutlineLevel.asInstanceOf[js.Any], PageDescName = PageDescName.asInstanceOf[js.Any], PageNumberOffset = PageNumberOffset.asInstanceOf[js.Any], PageStyleName = PageStyleName.asInstanceOf[js.Any], ParaAdjust = ParaAdjust.asInstanceOf[js.Any], ParaBackColor = ParaBackColor.asInstanceOf[js.Any], ParaBackGraphicFilter = ParaBackGraphicFilter.asInstanceOf[js.Any], ParaBackGraphicLocation = ParaBackGraphicLocation.asInstanceOf[js.Any], ParaBackGraphicURL = ParaBackGraphicURL.asInstanceOf[js.Any], ParaBackTransparent = ParaBackTransparent.asInstanceOf[js.Any], ParaBottomMargin = ParaBottomMargin.asInstanceOf[js.Any], ParaContextMargin = ParaContextMargin.asInstanceOf[js.Any], ParaExpandSingleWord = ParaExpandSingleWord.asInstanceOf[js.Any], ParaFirstLineIndent = ParaFirstLineIndent.asInstanceOf[js.Any], ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens.asInstanceOf[js.Any], ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars.asInstanceOf[js.Any], ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars.asInstanceOf[js.Any], ParaIndent = ParaIndent.asInstanceOf[js.Any], ParaInteropGrabBag = ParaInteropGrabBag.asInstanceOf[js.Any], ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent.asInstanceOf[js.Any], ParaIsConnectBorder = ParaIsConnectBorder.asInstanceOf[js.Any], ParaIsHyphenation = ParaIsHyphenation.asInstanceOf[js.Any], ParaIsNumberingRestart = ParaIsNumberingRestart.asInstanceOf[js.Any], ParaKeepTogether = ParaKeepTogether.asInstanceOf[js.Any], ParaLastLineAdjust = ParaLastLineAdjust.asInstanceOf[js.Any], ParaLeftMargin = ParaLeftMargin.asInstanceOf[js.Any], ParaLineNumberCount = ParaLineNumberCount.asInstanceOf[js.Any], ParaLineNumberStartValue = ParaLineNumberStartValue.asInstanceOf[js.Any], ParaLineSpacing = ParaLineSpacing.asInstanceOf[js.Any], ParaOrphans = ParaOrphans.asInstanceOf[js.Any], ParaRegisterModeActive = ParaRegisterModeActive.asInstanceOf[js.Any], ParaRightMargin = ParaRightMargin.asInstanceOf[js.Any], ParaShadowFormat = ParaShadowFormat.asInstanceOf[js.Any], ParaSplit = ParaSplit.asInstanceOf[js.Any], ParaStyleConditions = ParaStyleConditions.asInstanceOf[js.Any], ParaStyleName = ParaStyleName.asInstanceOf[js.Any], ParaTabStops = ParaTabStops.asInstanceOf[js.Any], ParaTopMargin = ParaTopMargin.asInstanceOf[js.Any], ParaUserDefinedAttributes = ParaUserDefinedAttributes.asInstanceOf[js.Any], ParaVertAlignment = ParaVertAlignment.asInstanceOf[js.Any], ParaWidows = ParaWidows.asInstanceOf[js.Any], ParentStyle = ParentStyle.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], RightBorder = RightBorder.asInstanceOf[js.Any], RightBorder2 = RightBorder2.asInstanceOf[js.Any], RightBorderDistance = RightBorderDistance.asInstanceOf[js.Any], RotateAngle = RotateAngle.asInstanceOf[js.Any], RotateReference = RotateReference.asInstanceOf[js.Any], RubyAdjust = RubyAdjust.asInstanceOf[js.Any], RubyCharStyleName = RubyCharStyleName.asInstanceOf[js.Any], RubyIsAbove = RubyIsAbove.asInstanceOf[js.Any], RubyText = RubyText.asInstanceOf[js.Any], ShadowFormat = ShadowFormat.asInstanceOf[js.Any], ShrinkToFit = ShrinkToFit.asInstanceOf[js.Any], StyleInteropGrabBag = StyleInteropGrabBag.asInstanceOf[js.Any], TableBorder = TableBorder.asInstanceOf[js.Any], TableBorder2 = TableBorder2.asInstanceOf[js.Any], TextUserDefinedAttributes = TextUserDefinedAttributes.asInstanceOf[js.Any], TopBorder = TopBorder.asInstanceOf[js.Any], TopBorder2 = TopBorder2.asInstanceOf[js.Any], TopBorderDistance = TopBorderDistance.asInstanceOf[js.Any], UnvisitedCharStyleName = UnvisitedCharStyleName.asInstanceOf[js.Any], UserDefinedAttributes = UserDefinedAttributes.asInstanceOf[js.Any], VertJustify = VertJustify.asInstanceOf[js.Any], VisitedCharStyleName = VisitedCharStyleName.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertiesChangeListener = js.Any.fromFunction2(addPropertiesChangeListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), firePropertiesChangeEvent = js.Any.fromFunction2(firePropertiesChangeEvent), getName = js.Any.fromFunction0(getName), getParentStyle = js.Any.fromFunction0(getParentStyle), getPropertyDefaults = js.Any.fromFunction1(getPropertyDefaults), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValues = js.Any.fromFunction1(getPropertyValues), isInUse = js.Any.fromFunction0(isInUse), isUserDefined = js.Any.fromFunction0(isUserDefined), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertiesChangeListener = js.Any.fromFunction1(removePropertiesChangeListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setAllPropertiesToDefault = js.Any.fromFunction0(setAllPropertiesToDefault), setName = js.Any.fromFunction1(setName), setParentStyle = js.Any.fromFunction1(setParentStyle), setPropertiesToDefault = js.Any.fromFunction1(setPropertiesToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValues = js.Any.fromFunction2(setPropertyValues))
    __obj.asInstanceOf[TableCellStyle]
  }
  @scala.inline
  implicit class TableCellStyleOps[Self <: TableCellStyle] (val x: Self) extends AnyVal {
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
    def setAsianVerticalMode(value: Boolean): Self = this.set("AsianVerticalMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderDistance(value: Double): Self = this.set("BorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomBorder(value: BorderLine): Self = this.set("BottomBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomBorder2(value: BorderLine2): Self = this.set("BottomBorder2", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomBorderDistance(value: Double): Self = this.set("BottomBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setBreakType(value: BreakType): Self = this.set("BreakType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellBackColor(value: Color): Self = this.set("CellBackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellInteropGrabBag(value: SafeArray[PropertyValue]): Self = this.set("CellInteropGrabBag", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellProtection(value: CellProtection): Self = this.set("CellProtection", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellStyle(value: String): Self = this.set("CellStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagonalBLTR(value: BorderLine): Self = this.set("DiagonalBLTR", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagonalBLTR2(value: BorderLine2): Self = this.set("DiagonalBLTR2", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagonalTLBR(value: BorderLine): Self = this.set("DiagonalTLBR", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagonalTLBR2(value: BorderLine2): Self = this.set("DiagonalTLBR2", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropCapCharStyleName(value: String): Self = this.set("DropCapCharStyleName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropCapFormat(value: DropCapFormat): Self = this.set("DropCapFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropCapWholeWord(value: Boolean): Self = this.set("DropCapWholeWord", value.asInstanceOf[js.Any])
    @scala.inline
    def setHoriJustify(value: CellHoriJustify): Self = this.set("HoriJustify", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCellBackgroundTransparent(value: Boolean): Self = this.set("IsCellBackgroundTransparent", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTextWrapped(value: Boolean): Self = this.set("IsTextWrapped", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftBorder(value: BorderLine): Self = this.set("LeftBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftBorder2(value: BorderLine2): Self = this.set("LeftBorder2", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeftBorderDistance(value: Double): Self = this.set("LeftBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setListId(value: String): Self = this.set("ListId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberFormat(value: Double): Self = this.set("NumberFormat", value.asInstanceOf[js.Any])
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
    def setOrientation(value: CellOrientation): Self = this.set("Orientation", value.asInstanceOf[js.Any])
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
    def setParaIndent(value: Double): Self = this.set("ParaIndent", value.asInstanceOf[js.Any])
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
    def setParaUserDefinedAttributes(value: XNameContainer): Self = this.set("ParaUserDefinedAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaVertAlignment(value: Double): Self = this.set("ParaVertAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setParaWidows(value: Double): Self = this.set("ParaWidows", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightBorder(value: BorderLine): Self = this.set("RightBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightBorder2(value: BorderLine2): Self = this.set("RightBorder2", value.asInstanceOf[js.Any])
    @scala.inline
    def setRightBorderDistance(value: Double): Self = this.set("RightBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateAngle(value: Double): Self = this.set("RotateAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotateReference(value: Double): Self = this.set("RotateReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setShadowFormat(value: ShadowFormat): Self = this.set("ShadowFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = this.set("ShrinkToFit", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableBorder(value: TableBorder): Self = this.set("TableBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setTableBorder2(value: TableBorder2): Self = this.set("TableBorder2", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopBorder(value: BorderLine): Self = this.set("TopBorder", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopBorder2(value: BorderLine2): Self = this.set("TopBorder2", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopBorderDistance(value: Double): Self = this.set("TopBorderDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def setVertJustify(value: Double): Self = this.set("VertJustify", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPropertySetInfo(value: () => XPropertySetInfo): Self = this.set("getPropertySetInfo", js.Any.fromFunction0(value))
  }
  
}

