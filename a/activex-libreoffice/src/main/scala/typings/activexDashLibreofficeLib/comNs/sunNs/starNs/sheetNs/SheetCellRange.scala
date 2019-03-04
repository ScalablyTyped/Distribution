package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a rectangular range of cells in a spreadsheet document.
  *
  * This service is an extension of the CellRange service for use in spreadsheet documents.
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties because var conflicts: BottomBorder, LeftBorder, RightBorder, TopBorder. Inlined BorderDistance, BottomBorderDistance, BreakType, DropCapCharStyleName, DropCapFormat, DropCapWholeWord, LeftBorderDistance, ListId, NumberingIsNumber, NumberingLevel, NumberingRules, NumberingStartValue, NumberingStyleName, OutlineLevel, PageDescName, PageNumberOffset, PageStyleName, ParaAdjust, ParaBackColor, ParaBackGraphicFilter, ParaBackGraphicLocation, ParaBackGraphicURL, ParaBackTransparent, ParaBottomMargin, ParaContextMargin, ParaExpandSingleWord, ParaFirstLineIndent, ParaHyphenationMaxHyphens, ParaHyphenationMaxLeadingChars, ParaHyphenationMaxTrailingChars, ParaInteropGrabBag, ParaIsAutoFirstLineIndent, ParaIsConnectBorder, ParaIsHyphenation, ParaIsNumberingRestart, ParaKeepTogether, ParaLastLineAdjust, ParaLeftMargin, ParaLineNumberCount, ParaLineNumberStartValue, ParaLineSpacing, ParaOrphans, ParaRegisterModeActive, ParaRightMargin, ParaShadowFormat, ParaSplit, ParaStyleName, ParaTabStops, ParaTopMargin, ParaUserDefinedAttributes, ParaVertAlignment, ParaWidows, RightBorderDistance, TopBorderDistance */ trait SheetCellRange
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
     with SheetRangesQuery
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XReplaceable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XMergeable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XIndent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XColumnRowRange
     with activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XAutoFormattable
     with XSheetCellRange
     with XCellRangeData
     with XCellRangeFormula
     with XCellRangeAddressable
     with XSheetOperation
     with XCellSeries
     with XArrayFormulaRange
     with XMultipleOperation
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XSortable
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XImportable
     with XSubTotalCalculatable
     with XSheetFilterableEx
     with XCellFormatRangesSupplier
     with XUniqueCellFormatRangesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataArray
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XTolerantMultiPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster {
  /** Returns the absolute address of the range as string, e.g. "$Sheet1.$B$2:$D$5". */
  var AbsoluteName: java.lang.String
  /** contains the distance from the border to the object. */
  var BorderDistance: scala.Double
  /** contains the distance from the bottom border to the object. */
  var BottomBorderDistance: scala.Double
  /**
    * determines the type of break that is applied at the beginning of the table.
    * @see com.sun.star.style.BreakType
    */
  var BreakType: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.BreakType
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
  var DropCapCharStyleName: java.lang.String
  /** specifies whether the first characters of the paragraph are displayed in capital letters and how they are formatted. */
  var DropCapFormat: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.DropCapFormat
  /** specifies if the property **DropCapFormat** is applied to the whole first word. */
  var DropCapWholeWord: scala.Boolean
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
  var ParaAdjust: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphAdjust
  /** contains the paragraph background color. */
  var ParaBackColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** contains the name of the graphic filter for the background graphic of a paragraph. */
  var ParaBackGraphicFilter: java.lang.String
  /**
    * contains the value for the position of a background graphic.
    * @see com.sun.star.style.GraphicLocation
    */
  var ParaBackGraphicLocation: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.GraphicLocation
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
  /** determines if the paragraph is included in the line numbering. */
  var ParaLineNumberCount: scala.Boolean
  /** contains the start value for the line numbering. */
  var ParaLineNumberStartValue: scala.Double
  /** contains the type of the line spacing of a paragraph. */
  var ParaLineSpacing: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.LineSpacing
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
  var ParaTabStops: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.TabStop]
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
  /**
    * contains the position of the top left cell of this range in the sheet (in 1/100 mm).
    *
    * This property contains the absolute position in the whole sheet, not the position in the visible area.
    */
  var Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** contains the distance from the right border to the object. */
  var RightBorderDistance: scala.Double
  /** contains the size of this range (in 1/100 mm). */
  var Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size
  /** contains the distance from the top border to the object. */
  var TopBorderDistance: scala.Double
  /**
    * contains the data validation settings for this cell.
    *
    * After the data validation settings have been changed the validation has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableValidation
    */
  var Validation: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * contains the data validation settings for this cell, using localized formulas.
    *
    * After the data validation settings have been changed the validation has to be reinserted into the property set.
    * @see com.sun.star.sheet.TableValidation
    */
  var ValidationLocal: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}

object SheetCellRange {
  @scala.inline
  def apply(
    AbsoluteName: java.lang.String,
    CharacterProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterProperties = null,
    CharacterPropertiesAsian: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian = null,
    CharacterPropertiesComplex: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex = null,
    ConditionalFormat: XSheetConditionalEntries,
    ConditionalFormatLocal: XSheetConditionalEntries,
    ParagraphProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.ParagraphProperties = null,
    Position: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point,
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Size,
    Validation: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    ValidationLocal: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet,
    XArrayFormulaRange: XArrayFormulaRange = null,
    XAutoFormattable: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XAutoFormattable = null,
    XCellFormatRangesSupplier: XCellFormatRangesSupplier = null,
    XCellRangeAddressable: XCellRangeAddressable = null,
    XCellRangeData: XCellRangeData = null,
    XCellRangeFormula: XCellRangeFormula = null,
    XCellSeries: XCellSeries = null,
    XChartDataArray: activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs.XChartDataArray = null,
    XColumnRowRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.XColumnRowRange = null,
    XImportable: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XImportable = null,
    XIndent: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XIndent = null,
    XMergeable: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XMergeable = null,
    XModifyBroadcaster: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster = null,
    XMultipleOperation: XMultipleOperation = null,
    XReplaceable: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XReplaceable = null,
    XSheetCellRange: XSheetCellRange = null,
    XSheetFilterableEx: XSheetFilterableEx = null,
    XSheetOperation: XSheetOperation = null,
    XSortable: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XSortable = null,
    XSubTotalCalculatable: XSubTotalCalculatable = null,
    XTolerantMultiPropertySet: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XTolerantMultiPropertySet = null,
    XUniqueCellFormatRangesSupplier: XUniqueCellFormatRangesSupplier = null,
    CellRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRange = null,
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

