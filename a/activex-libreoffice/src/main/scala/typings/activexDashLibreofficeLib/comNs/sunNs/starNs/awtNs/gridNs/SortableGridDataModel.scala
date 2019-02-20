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

