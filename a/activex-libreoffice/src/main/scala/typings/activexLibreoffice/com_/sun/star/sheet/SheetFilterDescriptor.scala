package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.table.TableOrientation
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a description of how a cell range is to be filtered.
  *
  * The descriptor contains properties and a collection of filter conditions (filter fields) which control the behavior of a filter operation.
  */
@js.native
trait SheetFilterDescriptor
  extends XSheetFilterDescriptor
     with XSheetFilterDescriptor2
     with XPropertySet {
  /** specifies if the first row (or column) contains headers which should not be filtered. */
  var ContainsHeader: Boolean = js.native
  /** specifies if the filtered data should be copied to another position in the document. */
  var CopyOutputData: Boolean = js.native
  /** specifies if the case of letters is important when comparing entries. */
  var IsCaseSensitive: Boolean = js.native
  /**
    * returns the maximum number of filter fields in the descriptor.
    *
    * This read-only property indicates the maximum count of fields the current implementation supports.
    */
  var MaxFieldCount: Double = js.native
  /** specifies if columns or rows are filtered. */
  var Orientation: TableOrientation = js.native
  /**
    * specifies the position where filtered data are to be copied.
    *
    * This is only used if {@link SheetFilterDescriptor.CopyOutputData} is `TRUE` .
    */
  var OutputPosition: CellAddress = js.native
  /**
    * specifies if the {@link SheetFilterDescriptor.OutputPosition} position is saved for future calls.
    *
    * This is only used if {@link SheetFilterDescriptor.CopyOutputData} is `TRUE` .
    */
  var SaveOutputPosition: Boolean = js.native
  /** specifies if duplicate entries are left out of the result. */
  var SkipDuplicates: Boolean = js.native
  /** specifies if the {@link TableFilterField.StringValue} strings are interpreted as regular expressions. */
  var UseRegularExpressions: Boolean = js.native
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
    val __obj = js.Dynamic.literal(ContainsHeader = ContainsHeader.asInstanceOf[js.Any], CopyOutputData = CopyOutputData.asInstanceOf[js.Any], FilterFields = FilterFields.asInstanceOf[js.Any], FilterFields2 = FilterFields2.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], MaxFieldCount = MaxFieldCount.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], OutputPosition = OutputPosition.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SaveOutputPosition = SaveOutputPosition.asInstanceOf[js.Any], SkipDuplicates = SkipDuplicates.asInstanceOf[js.Any], UseRegularExpressions = UseRegularExpressions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getFilterFields = js.Any.fromFunction0(getFilterFields), getFilterFields2 = js.Any.fromFunction0(getFilterFields2), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFilterFields = js.Any.fromFunction1(setFilterFields), setFilterFields2 = js.Any.fromFunction1(setFilterFields2), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[SheetFilterDescriptor]
  }
  @scala.inline
  implicit class SheetFilterDescriptorOps[Self <: SheetFilterDescriptor] (val x: Self) extends AnyVal {
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
    def setContainsHeader(value: Boolean): Self = this.set("ContainsHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopyOutputData(value: Boolean): Self = this.set("CopyOutputData", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCaseSensitive(value: Boolean): Self = this.set("IsCaseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxFieldCount(value: Double): Self = this.set("MaxFieldCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: TableOrientation): Self = this.set("Orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputPosition(value: CellAddress): Self = this.set("OutputPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setSaveOutputPosition(value: Boolean): Self = this.set("SaveOutputPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipDuplicates(value: Boolean): Self = this.set("SkipDuplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseRegularExpressions(value: Boolean): Self = this.set("UseRegularExpressions", value.asInstanceOf[js.Any])
  }
  
}

