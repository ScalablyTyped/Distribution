package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Point
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XTolerantMultiPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XActionLockable
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterPropertiesAsian
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.CharacterPropertiesComplex
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphProperties
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphPropertiesAsian
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.ParagraphPropertiesComplex
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.Cell
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.XColumnRowRange
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.Text
import typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs.XTextFieldsSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XIndent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XReplaceable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a single addressable cell in a spreadsheet document. */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.Cell because var conflicts: String. Inlined  */ trait SheetCell
  extends Text
     with CharacterProperties
     with CharacterPropertiesAsian
     with CharacterPropertiesComplex
     with ParagraphProperties
     with ParagraphPropertiesAsian
     with ParagraphPropertiesComplex
     with SheetRangesQuery
     with XActionLockable
     with XReplaceable
     with XIndent
     with XColumnRowRange
     with XCellAddressable
     with XSheetAnnotationAnchor
     with XTextFieldsSupplier
     with XTolerantMultiPropertySet
     with XModifyBroadcaster {
  /** Returns the absolute address of the range as string, e.g. "$Sheet1.$B$2". */
  var AbsoluteName: String
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
  /**
    * contains the formula string with localized function names.
    *
    * This property can also be used to set a new localized formula.
    */
  var FormulaLocal: String
  /**
    * contains the result type of a formula.
    * @see com.sun.star.sheet.FormulaResult
    */
  var FormulaResultType: Double
  /**
    * contains the position of this cell in the sheet (in 1/100 mm).
    *
    * This property contains the absolute position in the whole sheet, not the position in the visible area.
    */
  var Position: Point
  /** contains the size of this cell (in 1/100 mm). */
  var Size: typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Size
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

object SheetCell {
  @scala.inline
  def apply(
    AbsoluteName: String,
    CharacterProperties: CharacterProperties = null,
    CharacterPropertiesAsian: CharacterPropertiesAsian = null,
    CharacterPropertiesComplex: CharacterPropertiesComplex = null,
    ConditionalFormat: XSheetConditionalEntries,
    ConditionalFormatLocal: XSheetConditionalEntries,
    FormulaLocal: String,
    FormulaResultType: Double,
    ParagraphProperties: ParagraphProperties = null,
    ParagraphPropertiesAsian: ParagraphPropertiesAsian = null,
    ParagraphPropertiesComplex: ParagraphPropertiesComplex = null,
    Position: Point,
    Size: Size,
    Text: Text = null,
    Validation: XPropertySet,
    ValidationLocal: XPropertySet,
    XActionLockable: XActionLockable = null,
    XCellAddressable: XCellAddressable = null,
    XColumnRowRange: XColumnRowRange = null,
    XIndent: XIndent = null,
    XModifyBroadcaster: XModifyBroadcaster = null,
    XReplaceable: XReplaceable = null,
    XSheetAnnotationAnchor: XSheetAnnotationAnchor = null,
    XTextFieldsSupplier: XTextFieldsSupplier = null,
    XTolerantMultiPropertySet: XTolerantMultiPropertySet = null,
    Cell: Cell = null,
    SheetRangesQuery: SheetRangesQuery = null
  ): SheetCell = {
    val __obj = js.Dynamic.literal(AbsoluteName = AbsoluteName, ConditionalFormat = ConditionalFormat, ConditionalFormatLocal = ConditionalFormatLocal, FormulaLocal = FormulaLocal, FormulaResultType = FormulaResultType, Position = Position, Size = Size, Validation = Validation, ValidationLocal = ValidationLocal)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesAsian)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, CharacterPropertiesComplex)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphProperties)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphPropertiesAsian)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, ParagraphPropertiesComplex)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, Text)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XActionLockable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XCellAddressable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XColumnRowRange)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XIndent)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XModifyBroadcaster)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XReplaceable)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XSheetAnnotationAnchor)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XTextFieldsSupplier)
    if (__obj != null) js.Dynamic.global.Object.assign(__obj, XTolerantMultiPropertySet)
    js.Dynamic.global.Object.assign(__obj, Cell)
    js.Dynamic.global.Object.assign(__obj, SheetRangesQuery)
    __obj.asInstanceOf[SheetCell]
  }
}

