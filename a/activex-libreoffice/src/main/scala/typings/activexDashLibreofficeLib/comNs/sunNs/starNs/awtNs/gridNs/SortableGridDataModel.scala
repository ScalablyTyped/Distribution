package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides a default implementation of a {@link XSortableGridData} .
  *
  * This service must be created with a secondary grid data model, which all actual data requests are delegated to. But before providing this data to the
  * service's own clients, it is sorted, according to the sort order defined via the `XSortableGridData` interface.
  *
  * The service implementation is able to compare the default scalar types, plus strings.
  *
  * For determining the data type of a column which the data should be sorted by, the first non- `VOID` data encountered in this column is taken into
  * account. Further read requests to this column will assume that all non- `VOID` data is of the same type.
  *
  * Consequently, you cannot use this service with data sets containing heterogeneous data in a given column.
  *
  * All requests made via the {@link XMutableGridDataModel} are delegated to the `XMutableGridDataModel` instance passed in the service constructor.
  *
  * Note that changing the data might result in the sort order being destroyed. If you want to ensure that the data represented by the model is still
  * sorted after your modifications, you should call {@link XSortableGridData.sortByColumn()} , again.
  */
trait SortableGridDataModel extends XSortableMutableGridDataModel {
  /**
    * creates a new instance of the `SortableGridDataModel`
    *
    * For string comparison, a default {@link com.sun.star.i18n.Collator} , based on the system's locale, will be used.
    * @param DelegatorModel the data model to which read requests are delegated.
    * @throws com::sun::star::lang::IllegalArgumentException if the given `DelegatorModel` is `NULL`
    */
  def create(DelegatorModel: XMutableGridDataModel): scala.Unit
  /**
    * creates a new instance of the ScortableDefaultGridDataModel, passing a collator to be used for string comparison.
    * @param DelegatorModel is the data model to which read requests are delegated
    * @param Collator is the collator to be used for string comparison
    * @throws com::sun::star::lang::IllegalArgumentException if the given `DelegatorModel` is `NULL`
    */
  def createWithCollator(
    DelegatorModel: XMutableGridDataModel,
    Collator: activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XCollator
  ): scala.Unit
}

object SortableGridDataModel {
  @scala.inline
  def apply(
    ColumnCount: scala.Double,
    CurrentSortOrder: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, scala.Boolean],
    RowCount: scala.Double,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addGridDataListener: XGridDataListener => scala.Unit,
    addRow: (js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => scala.Unit,
    addRows: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]) => scala.Unit,
    create: XMutableGridDataModel => scala.Unit,
    createClone: () => activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable,
    createWithCollator: (XMutableGridDataModel, activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XCollator) => scala.Unit,
    dispose: () => scala.Unit,
    getCellData: (scala.Double, scala.Double) => js.Any,
    getCellToolTip: (scala.Double, scala.Double) => js.Any,
    getCurrentSortOrder: () => activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, scala.Boolean],
    getRowData: scala.Double => stdLib.SafeArray[_],
    getRowHeading: scala.Double => js.Any,
    insertRow: (scala.Double, js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => scala.Unit,
    insertRows: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]]) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeAllRows: () => scala.Unit,
    removeColumnSort: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeGridDataListener: XGridDataListener => scala.Unit,
    removeRow: scala.Double => scala.Unit,
    sortByColumn: (scala.Double, scala.Boolean) => scala.Unit,
    updateCellData: (scala.Double, scala.Double, js.Any) => scala.Unit,
    updateCellToolTip: (scala.Double, scala.Double, js.Any) => scala.Unit,
    updateRowData: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]) => scala.Unit,
    updateRowHeading: (scala.Double, js.Any) => scala.Unit,
    updateRowToolTip: (scala.Double, js.Any) => scala.Unit
  ): SortableGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount, CurrentSortOrder = CurrentSortOrder, RowCount = RowCount, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), addGridDataListener = js.Any.fromFunction1(addGridDataListener), addRow = js.Any.fromFunction2(addRow), addRows = js.Any.fromFunction2(addRows), create = js.Any.fromFunction1(create), createClone = js.Any.fromFunction0(createClone), createWithCollator = js.Any.fromFunction2(createWithCollator), dispose = js.Any.fromFunction0(dispose), getCellData = js.Any.fromFunction2(getCellData), getCellToolTip = js.Any.fromFunction2(getCellToolTip), getCurrentSortOrder = js.Any.fromFunction0(getCurrentSortOrder), getRowData = js.Any.fromFunction1(getRowData), getRowHeading = js.Any.fromFunction1(getRowHeading), insertRow = js.Any.fromFunction3(insertRow), insertRows = js.Any.fromFunction3(insertRows), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeAllRows = js.Any.fromFunction0(removeAllRows), removeColumnSort = js.Any.fromFunction0(removeColumnSort), removeEventListener = js.Any.fromFunction1(removeEventListener), removeGridDataListener = js.Any.fromFunction1(removeGridDataListener), removeRow = js.Any.fromFunction1(removeRow), sortByColumn = js.Any.fromFunction2(sortByColumn), updateCellData = js.Any.fromFunction3(updateCellData), updateCellToolTip = js.Any.fromFunction3(updateCellToolTip), updateRowData = js.Any.fromFunction3(updateRowData), updateRowHeading = js.Any.fromFunction2(updateRowHeading), updateRowToolTip = js.Any.fromFunction2(updateRowToolTip))
  
    __obj.asInstanceOf[SortableGridDataModel]
  }
}

