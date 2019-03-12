package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the layout settings of a data pilot table.
  *
  * This interface extends the interface {@link com.sun.star.container.XNamed} which provides access to the name of the data pilot table used e.g. in
  * collections.
  * @see com.sun.star.sheet.DataPilotDescriptor
  * @see com.sun.star.sheet.DataPilotTable
  */
trait XDataPilotDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed {
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val ColumnFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val DataFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the collection of all the data pilot fields. */
  val DataPilotFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  val FilterDescriptor: XSheetFilterDescriptor
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val HiddenFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val PageFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val RowFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the cell range containing the data for the data pilot table. */
  var SourceRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** returns an additional string stored in the data pilot table. */
  var Tag: java.lang.String
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getColumnFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getDataFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the collection of all the data pilot fields. */
  def getDataPilotFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  def getFilterDescriptor(): XSheetFilterDescriptor
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getHiddenFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getPageFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getRowFields(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
  /** returns the cell range containing the data for the data pilot table. */
  def getSourceRange(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress
  /** returns an additional string stored in the data pilot table. */
  def getTag(): java.lang.String
  /** sets the cell range containing the data for the data pilot table. */
  def setSourceRange(aSourceRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
  /** sets an additional string stored in the data pilot table. */
  def setTag(aTag: java.lang.String): scala.Unit
}

object XDataPilotDescriptor {
  @scala.inline
  def apply(
    ColumnFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    DataFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    DataPilotFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    FilterDescriptor: XSheetFilterDescriptor,
    HiddenFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    Name: java.lang.String,
    PageFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    RowFields: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    SourceRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    Tag: java.lang.String,
    acquire: () => scala.Unit,
    getColumnFields: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    getDataFields: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    getDataPilotFields: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    getFilterDescriptor: () => XSheetFilterDescriptor,
    getHiddenFields: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    getName: () => java.lang.String,
    getPageFields: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    getRowFields: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess,
    getSourceRange: () => activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    getTag: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setName: java.lang.String => scala.Unit,
    setSourceRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress => scala.Unit,
    setTag: java.lang.String => scala.Unit
  ): XDataPilotDescriptor = {
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields, DataFields = DataFields, DataPilotFields = DataPilotFields, FilterDescriptor = FilterDescriptor, HiddenFields = HiddenFields, Name = Name, PageFields = PageFields, RowFields = RowFields, SourceRange = SourceRange, Tag = Tag, acquire = js.Any.fromFunction0(acquire), getColumnFields = js.Any.fromFunction0(getColumnFields), getDataFields = js.Any.fromFunction0(getDataFields), getDataPilotFields = js.Any.fromFunction0(getDataPilotFields), getFilterDescriptor = js.Any.fromFunction0(getFilterDescriptor), getHiddenFields = js.Any.fromFunction0(getHiddenFields), getName = js.Any.fromFunction0(getName), getPageFields = js.Any.fromFunction0(getPageFields), getRowFields = js.Any.fromFunction0(getRowFields), getSourceRange = js.Any.fromFunction0(getSourceRange), getTag = js.Any.fromFunction0(getTag), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setSourceRange = js.Any.fromFunction1(setSourceRange), setTag = js.Any.fromFunction1(setTag))
  
    __obj.asInstanceOf[XDataPilotDescriptor]
  }
}

