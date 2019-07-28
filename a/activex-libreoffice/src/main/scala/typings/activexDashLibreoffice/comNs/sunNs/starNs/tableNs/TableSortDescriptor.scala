package typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.SortDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.SortField
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains properties which describe sorting of rows or columns in a table.
  *
  * It extends the general {@link com.sun.star.util.SortDescriptor} with table-specific properties.
  * @deprecated Deprecated
  */
trait TableSortDescriptor extends SortDescriptor {
  /** specifies whether the first row or column (depending on {@link com.sun.star.util.SortDescriptor.SortColumns} ) is a header which should not be sorted. */
  var ContainsHeader: Boolean
  /** contains the maximum number of sort fields the descriptor can hold. */
  var MaxFieldCount: Double
  /**
    * specifies the sorting orientation (sort rows or columns).
    *
    * Some implementations may not support sorting columns.
    * @deprecated Deprecateduse the property com::sun::star::util::SortDescriptor::SortColumns instead.
    */
  var Orientation: TableOrientation
  /** specifies the descriptions of the individual sort fields. */
  var SortFields: SafeArray[SortField]
}

object TableSortDescriptor {
  @scala.inline
  def apply(
    CollatorAlgorithm: String,
    CollatorLocale: Locale,
    ContainsHeader: Boolean,
    IsCaseSensitive: Boolean,
    MaxFieldCount: Double,
    Orientation: TableOrientation,
    PropertySetInfo: XPropertySetInfo,
    SortAscending: Boolean,
    SortColumns: Boolean,
    SortFields: SafeArray[SortField],
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): TableSortDescriptor = {
    val __obj = js.Dynamic.literal(CollatorAlgorithm = CollatorAlgorithm, CollatorLocale = CollatorLocale, ContainsHeader = ContainsHeader, IsCaseSensitive = IsCaseSensitive, MaxFieldCount = MaxFieldCount, Orientation = Orientation, PropertySetInfo = PropertySetInfo, SortAscending = SortAscending, SortColumns = SortColumns, SortFields = SortFields, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[TableSortDescriptor]
  }
}

