package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** specifies if the first row (or column) contains headers which should not be filtered. */
  var ContainsHeader: scala.Boolean
  /** specifies if the filtered data should be copied to another position in the document. */
  var CopyOutputData: scala.Boolean
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: scala.Boolean
  /**
    * returns the maximum number of filter fields in the descriptor.
    *
    * This read-only property indicates the maximum count of fields the current implementation supports.
    */
  var MaxFieldCount: scala.Double
  /** specifies if columns or rows are filtered. */
  var Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation
  /**
    * specifies the position where filtered data are to be copied.
    *
    * This is only used if {@link SheetFilterDescriptor.CopyOutputData} is `TRUE` .
    */
  var OutputPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /**
    * specifies if the {@link SheetFilterDescriptor.OutputPosition} position is saved for future calls.
    *
    * This is only used if {@link SheetFilterDescriptor.CopyOutputData} is `TRUE` .
    */
  var SaveOutputPosition: scala.Boolean
  /** specifies if duplicate entries are left out of the result. */
  var SkipDuplicates: scala.Boolean
  /** specifies if the {@link TableFilterField.StringValue} strings are interpreted as regular expressions. */
  var UseRegularExpressions: scala.Boolean
}

object SheetFilterDescriptor {
  @scala.inline
  def apply(
    ContainsHeader: scala.Boolean,
    CopyOutputData: scala.Boolean,
    FilterFields: stdLib.SafeArray[TableFilterField],
    FilterFields2: stdLib.SafeArray[TableFilterField2],
    IsCaseSensitive: scala.Boolean,
    MaxFieldCount: scala.Double,
    Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation,
    OutputPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SaveOutputPosition: scala.Boolean,
    SkipDuplicates: scala.Boolean,
    UseRegularExpressions: scala.Boolean,
    acquire: () => scala.Unit,
    addPropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    addVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    getFilterFields: () => stdLib.SafeArray[TableFilterField],
    getFilterFields2: () => stdLib.SafeArray[TableFilterField2],
    getPropertySetInfo: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    getPropertyValue: java.lang.String => js.Any,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removePropertyChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener) => scala.Unit,
    removeVetoableChangeListener: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener) => scala.Unit,
    setFilterFields: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField] => scala.Unit,
    setFilterFields2: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField2] => scala.Unit,
    setPropertyValue: (java.lang.String, js.Any) => scala.Unit
  ): SheetFilterDescriptor = {
    val __obj = js.Dynamic.literal(ContainsHeader = ContainsHeader, CopyOutputData = CopyOutputData, FilterFields = FilterFields, FilterFields2 = FilterFields2, IsCaseSensitive = IsCaseSensitive, MaxFieldCount = MaxFieldCount, Orientation = Orientation, OutputPosition = OutputPosition, PropertySetInfo = PropertySetInfo, SaveOutputPosition = SaveOutputPosition, SkipDuplicates = SkipDuplicates, UseRegularExpressions = UseRegularExpressions, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getFilterFields = js.Any.fromFunction0(getFilterFields), getFilterFields2 = js.Any.fromFunction0(getFilterFields2), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFilterFields = js.Any.fromFunction1(setFilterFields), setFilterFields2 = js.Any.fromFunction1(setFilterFields2), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[SheetFilterDescriptor]
  }
}

