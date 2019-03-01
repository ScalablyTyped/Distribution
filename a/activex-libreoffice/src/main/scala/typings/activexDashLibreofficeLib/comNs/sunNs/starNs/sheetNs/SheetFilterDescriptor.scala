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
    FilterFields: activexDashInteropLib.SafeArray[TableFilterField],
    FilterFields2: activexDashInteropLib.SafeArray[TableFilterField2],
    IsCaseSensitive: scala.Boolean,
    MaxFieldCount: scala.Double,
    Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation,
    OutputPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SaveOutputPosition: scala.Boolean,
    SkipDuplicates: scala.Boolean,
    UseRegularExpressions: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getFilterFields: js.Function0[activexDashInteropLib.SafeArray[TableFilterField]],
    getFilterFields2: js.Function0[activexDashInteropLib.SafeArray[TableFilterField2]],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setFilterFields: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField], scala.Unit],
    setFilterFields2: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[TableFilterField2], scala.Unit],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): SheetFilterDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ContainsHeader")(ContainsHeader)
    __obj.updateDynamic("CopyOutputData")(CopyOutputData)
    __obj.updateDynamic("FilterFields")(FilterFields)
    __obj.updateDynamic("FilterFields2")(FilterFields2)
    __obj.updateDynamic("IsCaseSensitive")(IsCaseSensitive)
    __obj.updateDynamic("MaxFieldCount")(MaxFieldCount)
    __obj.updateDynamic("Orientation")(Orientation)
    __obj.updateDynamic("OutputPosition")(OutputPosition)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("SaveOutputPosition")(SaveOutputPosition)
    __obj.updateDynamic("SkipDuplicates")(SkipDuplicates)
    __obj.updateDynamic("UseRegularExpressions")(UseRegularExpressions)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getFilterFields")(getFilterFields)
    __obj.updateDynamic("getFilterFields2")(getFilterFields2)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setFilterFields")(setFilterFields)
    __obj.updateDynamic("setFilterFields2")(setFilterFields2)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[SheetFilterDescriptor]
  }
}

