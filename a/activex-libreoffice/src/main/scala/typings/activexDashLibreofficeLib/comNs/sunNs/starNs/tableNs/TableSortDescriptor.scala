package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains properties which describe sorting of rows or columns in a table.
  *
  * It extends the general {@link com.sun.star.util.SortDescriptor} with table-specific properties.
  * @deprecated Deprecated
  */
trait TableSortDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortDescriptor {
  /** specifies whether the first row or column (depending on {@link com.sun.star.util.SortDescriptor.SortColumns} ) is a header which should not be sorted. */
  var ContainsHeader: scala.Boolean
  /** contains the maximum number of sort fields the descriptor can hold. */
  var MaxFieldCount: scala.Double
  /**
    * specifies the sorting orientation (sort rows or columns).
    *
    * Some implementations may not support sorting columns.
    * @deprecated Deprecateduse the property com::sun::star::util::SortDescriptor::SortColumns instead.
    */
  var Orientation: TableOrientation
  /** specifies the descriptions of the individual sort fields. */
  var SortFields: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortField]
}

object TableSortDescriptor {
  @scala.inline
  def apply(
    CollatorAlgorithm: java.lang.String,
    CollatorLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    ContainsHeader: scala.Boolean,
    IsCaseSensitive: scala.Boolean,
    MaxFieldCount: scala.Double,
    Orientation: TableOrientation,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SortAscending: scala.Boolean,
    SortColumns: scala.Boolean,
    SortFields: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortField],
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
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): TableSortDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CollatorAlgorithm")(CollatorAlgorithm)
    __obj.updateDynamic("CollatorLocale")(CollatorLocale)
    __obj.updateDynamic("ContainsHeader")(ContainsHeader)
    __obj.updateDynamic("IsCaseSensitive")(IsCaseSensitive)
    __obj.updateDynamic("MaxFieldCount")(MaxFieldCount)
    __obj.updateDynamic("Orientation")(Orientation)
    __obj.updateDynamic("PropertySetInfo")(PropertySetInfo)
    __obj.updateDynamic("SortAscending")(SortAscending)
    __obj.updateDynamic("SortColumns")(SortColumns)
    __obj.updateDynamic("SortFields")(SortFields)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addPropertyChangeListener")(addPropertyChangeListener)
    __obj.updateDynamic("addVetoableChangeListener")(addVetoableChangeListener)
    __obj.updateDynamic("getPropertySetInfo")(getPropertySetInfo)
    __obj.updateDynamic("getPropertyValue")(getPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removePropertyChangeListener")(removePropertyChangeListener)
    __obj.updateDynamic("removeVetoableChangeListener")(removeVetoableChangeListener)
    __obj.updateDynamic("setPropertyValue")(setPropertyValue)
    __obj.asInstanceOf[TableSortDescriptor]
  }
}

