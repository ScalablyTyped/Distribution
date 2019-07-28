package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.FontSlant
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.GetDirectPropertyTolerantResult
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.GetPropertyTolerantResult
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.SetPropertyTolerantFailed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyState
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XTolerantMultiPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.XChartDataChangeEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumeration
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XEnumerationAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.BreakType
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.DropCapFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.LineSpacing
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphAdjust
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.TabStop
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.BorderLine2
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableBorder
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCell
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XCellRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XTableColumns
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XTableRows
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a piece of text which can take its own paragraph-specific attributes (technically, properties). */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphProperties because var conflicts: BreakType, PageDescName, PageNumberOffset. Inlined BorderDistance, BottomBorder, BottomBorderDistance, DropCapCharStyleName, DropCapFormat, DropCapWholeWord, LeftBorder, LeftBorderDistance, ListId, NumberingIsNumber, NumberingLevel, NumberingRules, NumberingStartValue, NumberingStyleName, OutlineLevel, PageStyleName, ParaAdjust, ParaBackColor, ParaBackGraphicFilter, ParaBackGraphicLocation, ParaBackGraphicURL, ParaBackTransparent, ParaBottomMargin, ParaContextMargin, ParaExpandSingleWord, ParaFirstLineIndent, ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars, ParaInteropGrabBag, ParaIsAutoFirstLineIndent, ParaIsConnectBorder, ParaIsHyphenation, ParaIsNumberingRestart, ParaKeepTogether, ParaLastLineAdjust, ParaLeftMargin, ParaLineNumberCount, ParaLineNumberStartValue, ParaLineSpacing, ParaOrphans, ParaRegisterModeActive, ParaRightMargin, ParaShadowFormat, ParaSplit, ParaStyleName, ParaTabStops, ParaTopMargin, ParaUserDefinedAttributes, ParaVertAlignment, ParaWidows, RightBorder, RightBorderDistance, TopBorder, TopBorderDistance */ trait Paragraph
  extends TextTable
     with ParagraphPropertiesAsian
     with ParagraphPropertiesComplex
     with CharacterProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex
     with XPropertySet
     with XPropertyState
     with XEnumerationAccess
     with XTolerantMultiPropertySet {
  /** contains the distance from the border to the object. */
  var BorderDistance: Double
  /** contains the bottom border of the object. */
  var BottomBorder: BorderLine
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: Double
  /** specifies the character style name for drop caps. */
  var DropCapCharStyleName: String
  /** specifies whether the first characters of the paragraph are displayed in capital letters and how they are formatted. */
  var DropCapFormat: typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.DropCapFormat
  /** specifies if the property **DropCapFormat** is applied to the whole first word. */
  var DropCapWholeWord: Boolean
  /** contains the left border of the object. */
  var LeftBorder: BorderLine
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
  /** contains the right border of the object. */
  var RightBorder: BorderLine
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: Double
  /** contains the top border of the object. */
  var TopBorder: BorderLine
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: Double
}

object Paragraph {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    BackColor: Color,
    BackGraphicFilter: String,
    BackGraphicLocation: GraphicLocation,
    BackGraphicURL: String,
    BackTransparent: Boolean,
    BorderDistance: Double,
    BottomBorder: BorderLine,
    BottomBorderDistance: Double,
    BottomMargin: Double,
    BreakType: BreakType,
    CellNames: SafeArray[String],
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
    ChartColumnAsLabel: Boolean,
    ChartRowAsLabel: Boolean,
    CollapsingBorders: Boolean,
    ColumnDescriptions: SafeArray[String],
    Columns: XTableColumns,
    Data: SafeArray[SafeArray[Double]],
    DataArray: SafeArray[SafeArray[_]],
    DropCapCharStyleName: String,
    DropCapFormat: DropCapFormat,
    DropCapWholeWord: Boolean,
    ElementType: `type`,
    HeaderRowCount: Double,
    HoriOrient: Double,
    HyperLinkName: String,
    HyperLinkTarget: String,
    HyperLinkURL: String,
    IsWidthRelative: Boolean,
    KeepTogether: Boolean,
    LeftBorder: BorderLine,
    LeftBorderDistance: Double,
    LeftMargin: Double,
    ListId: String,
    Name: String,
    NotANumber: Double,
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
    ParaIsCharacterDistance: Boolean,
    ParaIsConnectBorder: Boolean,
    ParaIsForbiddenRules: Boolean,
    ParaIsHangingPunctuation: Boolean,
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
    PropertySetInfo: XPropertySetInfo,
    RelativeWidth: Double,
    RepeatHeadline: Boolean,
    RightBorder: BorderLine,
    RightBorderDistance: Double,
    RightMargin: Double,
    RowDescriptions: SafeArray[String],
    Rows: XTableRows,
    RubyAdjust: Double,
    RubyCharStyleName: String,
    RubyIsAbove: Boolean,
    RubyText: String,
    ShadowFormat: ShadowFormat,
    Split: Boolean,
    TableBorder: TableBorder,
    TableColumnRelativeSum: Double,
    TableColumnSeparators: SafeArray[TableColumnSeparator],
    TableInteropGrabBag: SafeArray[PropertyValue],
    TableTemplateName: String,
    TextUserDefinedAttributes: XNameContainer,
    TextWrap: WrapTextMode,
    TopBorder: BorderLine,
    TopBorderDistance: Double,
    TopMargin: Double,
    UnvisitedCharStyleName: String,
    UserDefinedAttributes: XNameContainer,
    VisitedCharStyleName: String,
    Width: Double,
    WritingMode: Double,
    acquire: () => Unit,
    addChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    addEventListener: XEventListener => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    attach: XTextRange => Unit,
    autoFormat: String => Unit,
    createCursorByCellName: String => XTextTableCursor,
    createEnumeration: () => XEnumeration,
    createSortDescriptor: () => SafeArray[PropertyValue],
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getCellByName: String => XCell,
    getCellByPosition: (Double, Double) => XCell,
    getCellNames: () => SafeArray[String],
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    getColumnDescriptions: () => SafeArray[String],
    getColumns: () => XTableColumns,
    getData: () => SafeArray[SafeArray[Double]],
    getDataArray: () => SafeArray[SafeArray[_]],
    getDirectPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetDirectPropertyTolerantResult],
    getElementType: () => `type`,
    getName: () => String,
    getNotANumber: () => Double,
    getPropertyDefault: String => js.Any,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyState: String => PropertyState,
    getPropertyStates: SeqEquiv[String] => SafeArray[PropertyState],
    getPropertyValue: String => js.Any,
    getPropertyValuesTolerant: SeqEquiv[String] => SafeArray[GetPropertyTolerantResult],
    getRowDescriptions: () => SafeArray[String],
    getRows: () => XTableRows,
    hasElements: () => Boolean,
    initialize: (Double, Double) => Unit,
    isNotANumber: Double => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeChartDataChangeEventListener: XChartDataChangeEventListener => Unit,
    removeEventListener: XEventListener => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setColumnDescriptions: SeqEquiv[String] => Unit,
    setData: SeqEquiv[SeqEquiv[Double]] => Unit,
    setDataArray: SeqEquiv[SeqEquiv[_]] => Unit,
    setName: String => Unit,
    setPropertyToDefault: String => Unit,
    setPropertyValue: (String, js.Any) => Unit,
    setPropertyValuesTolerant: (SeqEquiv[String], SeqEquiv[_]) => SafeArray[SetPropertyTolerantFailed],
    setRowDescriptions: SeqEquiv[String] => Unit,
    sort: SeqEquiv[PropertyValue] => Unit
  ): Paragraph = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, BackColor = BackColor, BackGraphicFilter = BackGraphicFilter, BackGraphicLocation = BackGraphicLocation, BackGraphicURL = BackGraphicURL, BackTransparent = BackTransparent, BorderDistance = BorderDistance, BottomBorder = BottomBorder, BottomBorderDistance = BottomBorderDistance, BottomMargin = BottomMargin, BreakType = BreakType, CellNames = CellNames, CharAutoKerning = CharAutoKerning, CharBackColor = CharBackColor, CharBackTransparent = CharBackTransparent, CharBorderDistance = CharBorderDistance, CharBottomBorder = CharBottomBorder, CharBottomBorderDistance = CharBottomBorderDistance, CharCaseMap = CharCaseMap, CharColor = CharColor, CharCombineIsOn = CharCombineIsOn, CharCombinePrefix = CharCombinePrefix, CharCombineSuffix = CharCombineSuffix, CharContoured = CharContoured, CharCrossedOut = CharCrossedOut, CharEmphasis = CharEmphasis, CharEscapement = CharEscapement, CharEscapementHeight = CharEscapementHeight, CharFlash = CharFlash, CharFontCharSet = CharFontCharSet, CharFontCharSetAsian = CharFontCharSetAsian, CharFontCharSetComplex = CharFontCharSetComplex, CharFontFamily = CharFontFamily, CharFontFamilyAsian = CharFontFamilyAsian, CharFontFamilyComplex = CharFontFamilyComplex, CharFontName = CharFontName, CharFontNameAsian = CharFontNameAsian, CharFontNameComplex = CharFontNameComplex, CharFontPitch = CharFontPitch, CharFontPitchAsian = CharFontPitchAsian, CharFontPitchComplex = CharFontPitchComplex, CharFontStyleName = CharFontStyleName, CharFontStyleNameAsian = CharFontStyleNameAsian, CharFontStyleNameComplex = CharFontStyleNameComplex, CharFontType = CharFontType, CharHeight = CharHeight, CharHeightAsian = CharHeightAsian, CharHeightComplex = CharHeightComplex, CharHidden = CharHidden, CharHighlight = CharHighlight, CharInteropGrabBag = CharInteropGrabBag, CharKeepTogether = CharKeepTogether, CharKerning = CharKerning, CharLeftBorder = CharLeftBorder, CharLeftBorderDistance = CharLeftBorderDistance, CharLocale = CharLocale, CharLocaleAsian = CharLocaleAsian, CharLocaleComplex = CharLocaleComplex, CharNoHyphenation = CharNoHyphenation, CharNoLineBreak = CharNoLineBreak, CharPosture = CharPosture, CharPostureAsian = CharPostureAsian, CharPostureComplex = CharPostureComplex, CharRelief = CharRelief, CharRightBorder = CharRightBorder, CharRightBorderDistance = CharRightBorderDistance, CharRotation = CharRotation, CharRotationIsFitToLine = CharRotationIsFitToLine, CharScaleWidth = CharScaleWidth, CharShadingValue = CharShadingValue, CharShadowFormat = CharShadowFormat, CharShadowed = CharShadowed, CharStrikeout = CharStrikeout, CharStyleName = CharStyleName, CharStyleNames = CharStyleNames, CharTopBorder = CharTopBorder, CharTopBorderDistance = CharTopBorderDistance, CharUnderline = CharUnderline, CharUnderlineColor = CharUnderlineColor, CharUnderlineHasColor = CharUnderlineHasColor, CharWeight = CharWeight, CharWeightAsian = CharWeightAsian, CharWeightComplex = CharWeightComplex, CharWordMode = CharWordMode, ChartColumnAsLabel = ChartColumnAsLabel, ChartRowAsLabel = ChartRowAsLabel, CollapsingBorders = CollapsingBorders, ColumnDescriptions = ColumnDescriptions, Columns = Columns, Data = Data, DataArray = DataArray, DropCapCharStyleName = DropCapCharStyleName, DropCapFormat = DropCapFormat, DropCapWholeWord = DropCapWholeWord, ElementType = ElementType, HeaderRowCount = HeaderRowCount, HoriOrient = HoriOrient, HyperLinkName = HyperLinkName, HyperLinkTarget = HyperLinkTarget, HyperLinkURL = HyperLinkURL, IsWidthRelative = IsWidthRelative, KeepTogether = KeepTogether, LeftBorder = LeftBorder, LeftBorderDistance = LeftBorderDistance, LeftMargin = LeftMargin, ListId = ListId, Name = Name, NotANumber = NotANumber, NumberingIsNumber = NumberingIsNumber, NumberingLevel = NumberingLevel, NumberingRules = NumberingRules, NumberingStartValue = NumberingStartValue, NumberingStyleName = NumberingStyleName, OutlineLevel = OutlineLevel, PageDescName = PageDescName, PageNumberOffset = PageNumberOffset, PageStyleName = PageStyleName, ParaAdjust = ParaAdjust, ParaBackColor = ParaBackColor, ParaBackGraphicFilter = ParaBackGraphicFilter, ParaBackGraphicLocation = ParaBackGraphicLocation, ParaBackGraphicURL = ParaBackGraphicURL, ParaBackTransparent = ParaBackTransparent, ParaBottomMargin = ParaBottomMargin, ParaContextMargin = ParaContextMargin, ParaExpandSingleWord = ParaExpandSingleWord, ParaFirstLineIndent = ParaFirstLineIndent, ParaHyphenationMaxHyphens = ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars = ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars = ParaHyphenationMaxTrailingChars, ParaInteropGrabBag = ParaInteropGrabBag, ParaIsAutoFirstLineIndent = ParaIsAutoFirstLineIndent, ParaIsCharacterDistance = ParaIsCharacterDistance, ParaIsConnectBorder = ParaIsConnectBorder, ParaIsForbiddenRules = ParaIsForbiddenRules, ParaIsHangingPunctuation = ParaIsHangingPunctuation, ParaIsHyphenation = ParaIsHyphenation, ParaIsNumberingRestart = ParaIsNumberingRestart, ParaKeepTogether = ParaKeepTogether, ParaLastLineAdjust = ParaLastLineAdjust, ParaLeftMargin = ParaLeftMargin, ParaLineNumberCount = ParaLineNumberCount, ParaLineNumberStartValue = ParaLineNumberStartValue, ParaLineSpacing = ParaLineSpacing, ParaOrphans = ParaOrphans, ParaRegisterModeActive = ParaRegisterModeActive, ParaRightMargin = ParaRightMargin, ParaShadowFormat = ParaShadowFormat, ParaSplit = ParaSplit, ParaStyleName = ParaStyleName, ParaTabStops = ParaTabStops, ParaTopMargin = ParaTopMargin, ParaUserDefinedAttributes = ParaUserDefinedAttributes, ParaVertAlignment = ParaVertAlignment, ParaWidows = ParaWidows, PropertySetInfo = PropertySetInfo, RelativeWidth = RelativeWidth, RepeatHeadline = RepeatHeadline, RightBorder = RightBorder, RightBorderDistance = RightBorderDistance, RightMargin = RightMargin, RowDescriptions = RowDescriptions, Rows = Rows, RubyAdjust = RubyAdjust, RubyCharStyleName = RubyCharStyleName, RubyIsAbove = RubyIsAbove, RubyText = RubyText, ShadowFormat = ShadowFormat, Split = Split, TableBorder = TableBorder, TableColumnRelativeSum = TableColumnRelativeSum, TableColumnSeparators = TableColumnSeparators, TableInteropGrabBag = TableInteropGrabBag, TableTemplateName = TableTemplateName, TextUserDefinedAttributes = TextUserDefinedAttributes, TextWrap = TextWrap, TopBorder = TopBorder, TopBorderDistance = TopBorderDistance, TopMargin = TopMargin, UnvisitedCharStyleName = UnvisitedCharStyleName, UserDefinedAttributes = UserDefinedAttributes, VisitedCharStyleName = VisitedCharStyleName, Width = Width, WritingMode = WritingMode, acquire = js.Any.fromFunction0(acquire), addChartDataChangeEventListener = js.Any.fromFunction1(addChartDataChangeEventListener), addEventListener = js.Any.fromFunction1(addEventListener), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), attach = js.Any.fromFunction1(attach), autoFormat = js.Any.fromFunction1(autoFormat), createCursorByCellName = js.Any.fromFunction1(createCursorByCellName), createEnumeration = js.Any.fromFunction0(createEnumeration), createSortDescriptor = js.Any.fromFunction0(createSortDescriptor), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getCellByName = js.Any.fromFunction1(getCellByName), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellNames = js.Any.fromFunction0(getCellNames), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getColumnDescriptions = js.Any.fromFunction0(getColumnDescriptions), getColumns = js.Any.fromFunction0(getColumns), getData = js.Any.fromFunction0(getData), getDataArray = js.Any.fromFunction0(getDataArray), getDirectPropertyValuesTolerant = js.Any.fromFunction1(getDirectPropertyValuesTolerant), getElementType = js.Any.fromFunction0(getElementType), getName = js.Any.fromFunction0(getName), getNotANumber = js.Any.fromFunction0(getNotANumber), getPropertyDefault = js.Any.fromFunction1(getPropertyDefault), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyState = js.Any.fromFunction1(getPropertyState), getPropertyStates = js.Any.fromFunction1(getPropertyStates), getPropertyValue = js.Any.fromFunction1(getPropertyValue), getPropertyValuesTolerant = js.Any.fromFunction1(getPropertyValuesTolerant), getRowDescriptions = js.Any.fromFunction0(getRowDescriptions), getRows = js.Any.fromFunction0(getRows), hasElements = js.Any.fromFunction0(hasElements), initialize = js.Any.fromFunction2(initialize), isNotANumber = js.Any.fromFunction1(isNotANumber), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeChartDataChangeEventListener = js.Any.fromFunction1(removeChartDataChangeEventListener), removeEventListener = js.Any.fromFunction1(removeEventListener), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setColumnDescriptions = js.Any.fromFunction1(setColumnDescriptions), setData = js.Any.fromFunction1(setData), setDataArray = js.Any.fromFunction1(setDataArray), setName = js.Any.fromFunction1(setName), setPropertyToDefault = js.Any.fromFunction1(setPropertyToDefault), setPropertyValue = js.Any.fromFunction2(setPropertyValue), setPropertyValuesTolerant = js.Any.fromFunction2(setPropertyValuesTolerant), setRowDescriptions = js.Any.fromFunction1(setRowDescriptions), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[Paragraph]
  }
}

