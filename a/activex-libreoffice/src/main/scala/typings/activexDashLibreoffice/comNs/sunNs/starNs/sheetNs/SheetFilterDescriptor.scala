package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableOrientation
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a description of how a cell range is to be filtered.
  *
  * The descriptor contains properties and a collection of filter conditions (filter fields) which control the behavior of a filter operation.
  */
trait SheetFilterDescriptor
  extends XSheetFilterDescriptor
     with XSheetFilterDescriptor2
     with XPropertySet {
  /** specifies if the first row (or column) contains headers which should not be filtered. */
  var ContainsHeader: Boolean
  /** specifies if the filtered data should be copied to another position in the document. */
  var CopyOutputData: Boolean
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: Boolean
  /**
    * returns the maximum number of filter fields in the descriptor.
    *
    * This read-only property indicates the maximum count of fields the current implementation supports.
    */
  var MaxFieldCount: Double
  /** specifies if columns or rows are filtered. */
  var Orientation: TableOrientation
  /**
    * specifies the position where filtered data are to be copied.
    *
    * This is only used if {@link SheetFilterDescriptor.CopyOutputData} is `TRUE` .
    */
  var OutputPosition: CellAddress
  /**
    * specifies if the {@link SheetFilterDescriptor.OutputPosition} position is saved for future calls.
    *
    * This is only used if {@link SheetFilterDescriptor.CopyOutputData} is `TRUE` .
    */
  var SaveOutputPosition: Boolean
  /** specifies if duplicate entries are left out of the result. */
  var SkipDuplicates: Boolean
  /** specifies if the {@link TableFilterField.StringValue} strings are interpreted as regular expressions. */
  var UseRegularExpressions: Boolean
}

object SheetFilterDescriptor {
  @scala.inline
  def apply(
    ContainsHeader: Boolean,
    CopyOutputData: Boolean,
    FilterFields: SafeArray[TableFilterField],
    FilterFields2: SafeArray[TableFilterField2],
    IsCaseSensitive: Boolean,
    MaxFieldCount: Double,
    Orientation: TableOrientation,
    OutputPosition: CellAddress,
    PropertySetInfo: XPropertySetInfo,
    SaveOutputPosition: Boolean,
    SkipDuplicates: Boolean,
    UseRegularExpressions: Boolean,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getFilterFields: () => SafeArray[TableFilterField],
    getFilterFields2: () => SafeArray[TableFilterField2],
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setFilterFields: SeqEquiv[TableFilterField] => Unit,
    setFilterFields2: SeqEquiv[TableFilterField2] => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): SheetFilterDescriptor = {
    val __obj = js.Dynamic.literal(ContainsHeader = ContainsHeader, CopyOutputData = CopyOutputData, FilterFields = FilterFields, FilterFields2 = FilterFields2, IsCaseSensitive = IsCaseSensitive, MaxFieldCount = MaxFieldCount, Orientation = Orientation, OutputPosition = OutputPosition, PropertySetInfo = PropertySetInfo, SaveOutputPosition = SaveOutputPosition, SkipDuplicates = SkipDuplicates, UseRegularExpressions = UseRegularExpressions, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getFilterFields = js.Any.fromFunction0(getFilterFields), getFilterFields2 = js.Any.fromFunction0(getFilterFields2), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFilterFields = js.Any.fromFunction1(setFilterFields), setFilterFields2 = js.Any.fromFunction1(setFilterFields2), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[SheetFilterDescriptor]
  }
}

