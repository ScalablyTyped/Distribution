package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings and options of a database range.
  * @see com.sun.star.sheet.DatabaseRange
  */
trait XDatabaseRange
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the data area of the database range in the spreadsheet document. */
  var DataArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /**
    * returns the filter descriptor stored with the database range.
    *
    * If the filter descriptor is modified, the new filtering is carried out when {@link XDatabaseRange.refresh()} is called.
    * @see SheetFilterDescriptor
    */
  val FilterDescriptor: XSheetFilterDescriptor
  /**
    * returns the database import descriptor stored with this database range.
    * @see DatabaseImportDescriptor
    */
  val ImportDescriptor: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * returns the sort descriptor stored with the database range.
    * @see SheetSortDescriptor2
    */
  val SortDescriptor: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * returns the subtotal descriptor stored with the database range.
    *
    * If the subtotal descriptor is modified, the new subtotals are inserted when {@link XDatabaseRange.refresh()} is called.
    * @see SubTotalDescriptor
    */
  val SubTotalDescriptor: XSubTotalDescriptor
  /** returns the data area of the database range in the spreadsheet document. */
  def getDataArea(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /**
    * returns the filter descriptor stored with the database range.
    *
    * If the filter descriptor is modified, the new filtering is carried out when {@link XDatabaseRange.refresh()} is called.
    * @see SheetFilterDescriptor
    */
  def getFilterDescriptor(): XSheetFilterDescriptor
  /**
    * returns the database import descriptor stored with this database range.
    * @see DatabaseImportDescriptor
    */
  def getImportDescriptor(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * returns the sort descriptor stored with the database range.
    * @see SheetSortDescriptor2
    */
  def getSortDescriptor(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  /**
    * returns the subtotal descriptor stored with the database range.
    *
    * If the subtotal descriptor is modified, the new subtotals are inserted when {@link XDatabaseRange.refresh()} is called.
    * @see SubTotalDescriptor
    */
  def getSubTotalDescriptor(): XSubTotalDescriptor
  /** executes the stored import, filter, sorting, and subtotals descriptors again. */
  def refresh(): scala.Unit
  /** sets the data area of the database range. */
  def setDataArea(aDataArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
}

object XDatabaseRange {
  @scala.inline
  def apply(
    DataArea: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    FilterDescriptor: XSheetFilterDescriptor,
    ImportDescriptor: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    SortDescriptor: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue],
    SubTotalDescriptor: XSubTotalDescriptor,
    acquire: js.Function0[scala.Unit],
    getDataArea: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    getFilterDescriptor: js.Function0[XSheetFilterDescriptor],
    getImportDescriptor: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getSortDescriptor: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
    ],
    getSubTotalDescriptor: js.Function0[XSubTotalDescriptor],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    refresh: js.Function0[scala.Unit],
    release: js.Function0[scala.Unit],
    setDataArea: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit]
  ): XDatabaseRange = {
    val __obj = js.Dynamic.literal(DataArea = DataArea, FilterDescriptor = FilterDescriptor, ImportDescriptor = ImportDescriptor, SortDescriptor = SortDescriptor, SubTotalDescriptor = SubTotalDescriptor, acquire = acquire, getDataArea = getDataArea, getFilterDescriptor = getFilterDescriptor, getImportDescriptor = getImportDescriptor, getSortDescriptor = getSortDescriptor, getSubTotalDescriptor = getSubTotalDescriptor, queryInterface = queryInterface, refresh = refresh, release = release, setDataArea = setDataArea)
  
    __obj.asInstanceOf[XDatabaseRange]
  }
}

