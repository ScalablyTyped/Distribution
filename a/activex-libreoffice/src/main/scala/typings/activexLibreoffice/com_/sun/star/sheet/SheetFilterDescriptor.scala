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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a description of how a cell range is to be filtered.
  *
  * The descriptor contains properties and a collection of filter conditions (filter fields) which control the behavior of a filter operation.
  */
trait SheetFilterDescriptor
  extends StObject
     with XSheetFilterDescriptor
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
  
  inline def apply(
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
    getPropertyValue: String => Any,
    queryInterface: `type` => Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setFilterFields: SeqEquiv[TableFilterField] => Unit,
    setFilterFields2: SeqEquiv[TableFilterField2] => Unit,
    setPropertyValue: (String, Any) => Unit
  ): SheetFilterDescriptor = {
    val __obj = js.Dynamic.literal(ContainsHeader = ContainsHeader.asInstanceOf[js.Any], CopyOutputData = CopyOutputData.asInstanceOf[js.Any], FilterFields = FilterFields.asInstanceOf[js.Any], FilterFields2 = FilterFields2.asInstanceOf[js.Any], IsCaseSensitive = IsCaseSensitive.asInstanceOf[js.Any], MaxFieldCount = MaxFieldCount.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], OutputPosition = OutputPosition.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], SaveOutputPosition = SaveOutputPosition.asInstanceOf[js.Any], SkipDuplicates = SkipDuplicates.asInstanceOf[js.Any], UseRegularExpressions = UseRegularExpressions.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getFilterFields = js.Any.fromFunction0(getFilterFields), getFilterFields2 = js.Any.fromFunction0(getFilterFields2), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setFilterFields = js.Any.fromFunction1(setFilterFields), setFilterFields2 = js.Any.fromFunction1(setFilterFields2), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[SheetFilterDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetFilterDescriptor] (val x: Self) extends AnyVal {
    
    inline def setContainsHeader(value: Boolean): Self = StObject.set(x, "ContainsHeader", value.asInstanceOf[js.Any])
    
    inline def setCopyOutputData(value: Boolean): Self = StObject.set(x, "CopyOutputData", value.asInstanceOf[js.Any])
    
    inline def setIsCaseSensitive(value: Boolean): Self = StObject.set(x, "IsCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setMaxFieldCount(value: Double): Self = StObject.set(x, "MaxFieldCount", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: TableOrientation): Self = StObject.set(x, "Orientation", value.asInstanceOf[js.Any])
    
    inline def setOutputPosition(value: CellAddress): Self = StObject.set(x, "OutputPosition", value.asInstanceOf[js.Any])
    
    inline def setSaveOutputPosition(value: Boolean): Self = StObject.set(x, "SaveOutputPosition", value.asInstanceOf[js.Any])
    
    inline def setSkipDuplicates(value: Boolean): Self = StObject.set(x, "SkipDuplicates", value.asInstanceOf[js.Any])
    
    inline def setUseRegularExpressions(value: Boolean): Self = StObject.set(x, "UseRegularExpressions", value.asInstanceOf[js.Any])
  }
}
