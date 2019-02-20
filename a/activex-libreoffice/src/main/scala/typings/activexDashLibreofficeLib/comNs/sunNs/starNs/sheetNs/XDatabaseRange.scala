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

