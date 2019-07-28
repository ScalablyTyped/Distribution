package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XIndexAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNamed
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
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
trait XDataPilotDescriptor extends XNamed {
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val ColumnFields: XIndexAccess
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val DataFields: XIndexAccess
  /** returns the collection of all the data pilot fields. */
  val DataPilotFields: XIndexAccess
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  val FilterDescriptor: XSheetFilterDescriptor
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val HiddenFields: XIndexAccess
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val PageFields: XIndexAccess
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  val RowFields: XIndexAccess
  /** returns the cell range containing the data for the data pilot table. */
  var SourceRange: CellRangeAddress
  /** returns an additional string stored in the data pilot table. */
  var Tag: String
  /**
    * returns the collection of the data pilot fields used as column fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getColumnFields(): XIndexAccess
  /**
    * returns the collection of the data pilot fields used as data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getDataFields(): XIndexAccess
  /** returns the collection of all the data pilot fields. */
  def getDataPilotFields(): XIndexAccess
  /** returns the filter descriptor specifying which data from the source cell range are used for the data pilot table. */
  def getFilterDescriptor(): XSheetFilterDescriptor
  /**
    * returns the collection of the data pilot fields not used as column, row, page, or data fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getHiddenFields(): XIndexAccess
  /**
    * returns the collection of the data pilot fields used as page fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getPageFields(): XIndexAccess
  /**
    * returns the collection of the data pilot fields used as row fields.
    * @see com.sun.star.sheet.DataPilotFields
    */
  def getRowFields(): XIndexAccess
  /** returns the cell range containing the data for the data pilot table. */
  def getSourceRange(): CellRangeAddress
  /** returns an additional string stored in the data pilot table. */
  def getTag(): String
  /** sets the cell range containing the data for the data pilot table. */
  def setSourceRange(aSourceRange: CellRangeAddress): Unit
  /** sets an additional string stored in the data pilot table. */
  def setTag(aTag: String): Unit
}

object XDataPilotDescriptor {
  @scala.inline
  def apply(
    ColumnFields: XIndexAccess,
    DataFields: XIndexAccess,
    DataPilotFields: XIndexAccess,
    FilterDescriptor: XSheetFilterDescriptor,
    HiddenFields: XIndexAccess,
    Name: String,
    PageFields: XIndexAccess,
    RowFields: XIndexAccess,
    SourceRange: CellRangeAddress,
    Tag: String,
    acquire: () => Unit,
    getColumnFields: () => XIndexAccess,
    getDataFields: () => XIndexAccess,
    getDataPilotFields: () => XIndexAccess,
    getFilterDescriptor: () => XSheetFilterDescriptor,
    getHiddenFields: () => XIndexAccess,
    getName: () => String,
    getPageFields: () => XIndexAccess,
    getRowFields: () => XIndexAccess,
    getSourceRange: () => CellRangeAddress,
    getTag: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setName: String => Unit,
    setSourceRange: CellRangeAddress => Unit,
    setTag: String => Unit
  ): XDataPilotDescriptor = {
    val __obj = js.Dynamic.literal(ColumnFields = ColumnFields, DataFields = DataFields, DataPilotFields = DataPilotFields, FilterDescriptor = FilterDescriptor, HiddenFields = HiddenFields, Name = Name, PageFields = PageFields, RowFields = RowFields, SourceRange = SourceRange, Tag = Tag, acquire = js.Any.fromFunction0(acquire), getColumnFields = js.Any.fromFunction0(getColumnFields), getDataFields = js.Any.fromFunction0(getDataFields), getDataPilotFields = js.Any.fromFunction0(getDataPilotFields), getFilterDescriptor = js.Any.fromFunction0(getFilterDescriptor), getHiddenFields = js.Any.fromFunction0(getHiddenFields), getName = js.Any.fromFunction0(getName), getPageFields = js.Any.fromFunction0(getPageFields), getRowFields = js.Any.fromFunction0(getRowFields), getSourceRange = js.Any.fromFunction0(getSourceRange), getTag = js.Any.fromFunction0(getTag), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setName = js.Any.fromFunction1(setName), setSourceRange = js.Any.fromFunction1(setSourceRange), setTag = js.Any.fromFunction1(setTag))
  
    __obj.asInstanceOf[XDataPilotDescriptor]
  }
}

