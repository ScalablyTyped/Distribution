package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a description of how a cell range is to be sorted.
  *
  * This service extends the {@link com.sun.star.table.TableSortDescriptor} service with spreadsheet specific properties.
  */
trait SheetSortDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableSortDescriptor {
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: scala.Boolean
  /** specifies if the sorted data should be copied to another position in the document. */
  var CopyOutputData: scala.Boolean
  /** specifies if a user defined sorting list is used. */
  var IsUserListEnabled: scala.Boolean
  /**
    * specifies the position where sorted data are to be copied.
    *
    * This property is only used, if {@link SheetSortDescriptor.CopyOutputData} is `TRUE` .
    */
  var OutputPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /**
    * specifies which user defined sorting list is used.
    *
    * This property is only used, if {@link SheetSortDescriptor.IsUserListEnabled} is `TRUE` .
    */
  var UserListIndex: scala.Double
}

object SheetSortDescriptor {
  @scala.inline
  def apply(
    BindFormatsToContent: scala.Boolean,
    CollatorAlgorithm: java.lang.String,
    CollatorLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    ContainsHeader: scala.Boolean,
    CopyOutputData: scala.Boolean,
    IsCaseSensitive: scala.Boolean,
    IsUserListEnabled: scala.Boolean,
    MaxFieldCount: scala.Double,
    Orientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation,
    OutputPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    SortAscending: scala.Boolean,
    SortColumns: scala.Boolean,
    SortFields: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.SortField],
    UserListIndex: scala.Double,
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
  ): SheetSortDescriptor = {
    val __obj = js.Dynamic.literal(BindFormatsToContent = BindFormatsToContent, CollatorAlgorithm = CollatorAlgorithm, CollatorLocale = CollatorLocale, ContainsHeader = ContainsHeader, CopyOutputData = CopyOutputData, IsCaseSensitive = IsCaseSensitive, IsUserListEnabled = IsUserListEnabled, MaxFieldCount = MaxFieldCount, Orientation = Orientation, OutputPosition = OutputPosition, PropertySetInfo = PropertySetInfo, SortAscending = SortAscending, SortColumns = SortColumns, SortFields = SortFields, UserListIndex = UserListIndex, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[SheetSortDescriptor]
  }
}

