package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XTolerantMultiPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.chartNs.XChartDataArray
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexReplace
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.GraphicLocation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.LineSpacing
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphAdjust
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.TabStop
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.ShadowFormat
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XAutoFormattable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XColumnRowRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XImportable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XIndent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XMergeable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XReplaceable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XSortable
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a rectangular range of cells in a spreadsheet document.
  *
  * This service is an extension of the CellRange service for use in spreadsheet documents.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphProperties because var conflicts: BottomBorder, LeftBorder, RightBorder, TopBorder. Inlined BorderDistance, BottomBorderDistance, BreakType, DropCapCharStyleName, DropCapFormat, DropCapWholeWord, LeftBorderDistance, ListId, NumberingIsNumber, NumberingLevel, NumberingRules, NumberingStartValue, NumberingStyleName, OutlineLevel, PageDescName, PageNumberOffset, PageStyleName, ParaAdjust, ParaBackColor, ParaBackGraphicFilter, ParaBackGraphicLocation, ParaBackGraphicURL, ParaBackTransparent, ParaBottomMargin, ParaContextMargin, ParaExpandSingleWord, ParaFirstLineIndent, ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars, ParaInteropGrabBag, ParaIsAutoFirstLineIndent, ParaIsConnectBorder, ParaIsHyphenation, ParaIsNumberingRestart, ParaKeepTogether, ParaLastLineAdjust, ParaLeftMargin, ParaLineNumberCount, ParaLineNumberStartValue, ParaLineSpacing, ParaOrphans, ParaRegisterModeActive, ParaRightMargin, ParaShadowFormat, ParaSplit, ParaStyleName, ParaTabStops, ParaTopMargin, ParaUserDefinedAttributes, ParaVertAlignment, ParaWidows, RightBorderDistance, TopBorderDistance */ trait SheetCellRange
  extends CellRange
     with CharacterProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex
     with SheetRangesQuery
     with XReplaceable
     with XMergeable
     with XIndent
     with XColumnRowRange
     with XAutoFormattable
     with XSheetCellRange
     with XCellRangeData
     with XCellRangeFormula
     with XCellRangeAddressable
     with XSheetOperation
     with XCellSeries
     with XArrayFormulaRange
     with XMultipleOperation
     with XSortable
     with XImportable
     with XSubTotalCalculatable
     with XSheetFilterableEx
     with XCellFormatRangesSupplier
     with XUniqueCellFormatRangesSupplier
     with XChartDataArray
     with XTolerantMultiPropertySet
     with XModifyBroadcaster {
  /** Returns the absolute address of the range as string, e.g. "$Sheet1.$B$2:$D$5". */
  var AbsoluteName: String
  /** contains the distance from the border to the object. */
  var BorderDistance: Double
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: Double
  /**
    * determines the type of break that is applied at the beginning of the table.
    * @see com.sun.star.style.BreakType
    */
  var BreakType: typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.BreakType
  /**
    * contains the conditional formatting settings for this cell.
    *
    * After a conditional format has been changed it has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableConditionalFormat
    */
  var ConditionalFormat: XSheetConditionalEntries
  /**
    * contains the conditional formatting settings for this cell, using localized formulas.
    *
    * After a conditional format has been changed it has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableConditionalFormat
    */
  var ConditionalFormatLocal: XSheetConditionalEntries
  /** specifies the character style name for drop caps. */
  var DropCapCharStyleName: String
  /** specifies whether the first characters of the paragraph are displayed in capital letters and how they are formatted. */
  var DropCapFormat: typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.DropCapFormat
  /** specifies if the property **DropCapFormat** is applied to the whole first word. */
  var DropCapWholeWord: Boolean
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
    * contains the position of the top left cell of this range in the sheet (in 1/100 mm).
    *
    * This property contains the absolute position in the whole sheet, not the position in the visible area.
    */
  var Position: Point
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: Double
  /** contains the size of this range (in 1/100 mm). */
  var Size: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: Double
  /**
    * contains the data validation settings for this cell.
    *
    * After the data validation settings have been changed the validation has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableValidation
    */
  var Validation: XPropertySet
  /**
    * contains the data validation settings for this cell, using localized formulas.
    *
    * After the data validation settings have been changed the validation has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableValidation
    */
  var ValidationLocal: XPropertySet
}

object SheetCellRange {
  @scala.inline
  def apply(
    AbsoluteName: String,
    CharacterProperties: CharacterProperties = null,
    CharacterPropertiesAsian: CharacterPropertiesAsian = null,
    CharacterPropertiesComplex: CharacterPropertiesComplex = null,
    ConditionalFormat: XSheetConditionalEntries,
    ConditionalFormatLocal: XSheetConditionalEntries,
    ParagraphProperties: ParagraphProperties = null,
    Position: Point,
    Size: Size,
    Validation: XPropertySet,
    ValidationLocal: XPropertySet,
    XArrayFormulaRange: XArrayFormulaRange = null,
    XAutoFormattable: XAutoFormattable = null,
    XCellFormatRangesSupplier: XCellFormatRangesSupplier = null,
    XCellRangeAddressable: XCellRangeAddressable = null,
    XCellRangeData: XCellRangeData = null,
    XCellRangeFormula: XCellRangeFormula = null,
    XCellSeries: XCellSeries = null,
    XChartDataArray: XChartDataArray = null,
    XColumnRowRange: XColumnRowRange = null,
    XImportable: XImportable = null,
    XIndent: XIndent = null,
    XMergeable: XMergeable = null,
    XModifyBroadcaster: XModifyBroadcaster = null,
    XMultipleOperation: XMultipleOperation = null,
    XReplaceable: XReplaceable = null,
    XSheetCellRange: XSheetCellRange = null,
    XSheetFilterableEx: XSheetFilterableEx = null,
    XSheetOperation: XSheetOperation = null,
    XSortable: XSortable = null,
    XSubTotalCalculatable: XSubTotalCalculatable = null,
    XTolerantMultiPropertySet: XTolerantMultiPropertySet = null,
    XUniqueCellFormatRangesSupplier: XUniqueCellFormatRangesSupplier = null,
    CellRange: CellRange = null,
    SheetRangesQuery: SheetRangesQuery = null
  ): SheetCellRange = {
    val __obj = js.Dynamic.literal(AbsoluteName = AbsoluteName, ConditionalFormat = ConditionalFormat, ConditionalFormatLocal = ConditionalFormatLocal, Position = Position, Size = Size, Validation = Validation, ValidationLocal = ValidationLocal)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesAsian)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesComplex)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XArrayFormulaRange)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XAutoFormattable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XCellFormatRangesSupplier)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XCellRangeAddressable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XCellRangeData)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XCellRangeFormula)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XCellSeries)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XChartDataArray)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XColumnRowRange)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XImportable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XIndent)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XMergeable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XModifyBroadcaster)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XMultipleOperation)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XReplaceable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSheetCellRange)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSheetFilterableEx)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSheetOperation)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSortable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSubTotalCalculatable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XTolerantMultiPropertySet)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XUniqueCellFormatRangesSupplier)
    js.Dynamic.global.Object.assign(__obj, CellRange)
    js.Dynamic.global.Object.assign(__obj, SheetRangesQuery)
    __obj.asInstanceOf[SheetCellRange]
  }
}

