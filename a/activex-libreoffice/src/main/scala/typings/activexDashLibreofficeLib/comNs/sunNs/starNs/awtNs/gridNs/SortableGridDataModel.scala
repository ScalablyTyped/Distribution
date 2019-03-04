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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    addGridDataListener: js.Function1[XGridDataListener, scala.Unit],
    addRow: js.Function2[js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    addRows: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      scala.Unit
    ],
    create: js.Function1[XMutableGridDataModel, scala.Unit],
    createClone: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XCloneable],
    createWithCollator: js.Function2[
      XMutableGridDataModel, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XCollator, 
      scala.Unit
    ],
    dispose: js.Function0[scala.Unit],
    getCellData: js.Function2[scala.Double, scala.Double, js.Any],
    getCellToolTip: js.Function2[scala.Double, scala.Double, js.Any],
    getCurrentSortOrder: js.Function0[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.Pair[scala.Double, scala.Boolean]
    ],
    getRowData: js.Function1[scala.Double, activexDashInteropLib.SafeArray[_]],
    getRowHeading: js.Function1[scala.Double, js.Any],
    insertRow: js.Function3[scala.Double, js.Any, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    insertRows: js.Function3[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_]], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeAllRows: js.Function0[scala.Unit],
    removeColumnSort: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeGridDataListener: js.Function1[XGridDataListener, scala.Unit],
    removeRow: js.Function1[scala.Double, scala.Unit],
    sortByColumn: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    updateCellData: js.Function3[scala.Double, scala.Double, js.Any, scala.Unit],
    updateCellToolTip: js.Function3[scala.Double, scala.Double, js.Any, scala.Unit],
    updateRowData: js.Function3[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], 
      scala.Unit
    ],
    updateRowHeading: js.Function2[scala.Double, js.Any, scala.Unit],
    updateRowToolTip: js.Function2[scala.Double, js.Any, scala.Unit]
  ): SortableGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount, CurrentSortOrder = CurrentSortOrder, RowCount = RowCount, acquire = acquire, addEventListener = addEventListener, addGridDataListener = addGridDataListener, addRow = addRow, addRows = addRows, create = create, createClone = createClone, createWithCollator = createWithCollator, dispose = dispose, getCellData = getCellData, getCellToolTip = getCellToolTip, getCurrentSortOrder = getCurrentSortOrder, getRowData = getRowData, getRowHeading = getRowHeading, insertRow = insertRow, insertRows = insertRows, queryInterface = queryInterface, release = release, removeAllRows = removeAllRows, removeColumnSort = removeColumnSort, removeEventListener = removeEventListener, removeGridDataListener = removeGridDataListener, removeRow = removeRow, sortByColumn = sortByColumn, updateCellData = updateCellData, updateCellToolTip = updateCellToolTip, updateRowData = updateRowData, updateRowHeading = updateRowHeading, updateRowToolTip = updateRowToolTip)
  
    __obj.asInstanceOf[SortableGridDataModel]
  }
}

