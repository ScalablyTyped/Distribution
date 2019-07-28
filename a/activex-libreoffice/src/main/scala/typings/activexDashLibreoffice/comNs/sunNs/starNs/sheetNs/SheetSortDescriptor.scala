package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertyChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySetInfo
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XVetoableChangeListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableOrientation
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.TableSortDescriptor
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.SortField
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a description of how a cell range is to be sorted.
  *
  * This service extends the {@link com.sun.star.table.TableSortDescriptor} service with spreadsheet specific properties.
  */
trait SheetSortDescriptor extends TableSortDescriptor {
  /** specifies if cell formats are moved with the contents they belong to. */
  var BindFormatsToContent: Boolean
  /** specifies if the sorted data should be copied to another position in the document. */
  var CopyOutputData: Boolean
  /** specifies if a user defined sorting list is used. */
  var IsUserListEnabled: Boolean
  /**
    * specifies the position where sorted data are to be copied.
    *
    * This property is only used, if {@link SheetSortDescriptor.CopyOutputData} is `TRUE` .
    */
  var OutputPosition: CellAddress
  /**
    * specifies which user defined sorting list is used.
    *
    * This property is only used, if {@link SheetSortDescriptor.IsUserListEnabled} is `TRUE` .
    */
  var UserListIndex: Double
}

object SheetSortDescriptor {
  @scala.inline
  def apply(
    BindFormatsToContent: Boolean,
    CollatorAlgorithm: String,
    CollatorLocale: Locale,
    ContainsHeader: Boolean,
    CopyOutputData: Boolean,
    IsCaseSensitive: Boolean,
    IsUserListEnabled: Boolean,
    MaxFieldCount: Double,
    Orientation: TableOrientation,
    OutputPosition: CellAddress,
    PropertySetInfo: XPropertySetInfo,
    SortAscending: Boolean,
    SortColumns: Boolean,
    SortFields: SafeArray[SortField],
    UserListIndex: Double,
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
  ): SheetSortDescriptor = {
    val __obj = js.Dynamic.literal(BindFormatsToContent = BindFormatsToContent, CollatorAlgorithm = CollatorAlgorithm, CollatorLocale = CollatorLocale, ContainsHeader = ContainsHeader, CopyOutputData = CopyOutputData, IsCaseSensitive = IsCaseSensitive, IsUserListEnabled = IsUserListEnabled, MaxFieldCount = MaxFieldCount, Orientation = Orientation, OutputPosition = OutputPosition, PropertySetInfo = PropertySetInfo, SortAscending = SortAscending, SortColumns = SortColumns, SortFields = SortFields, UserListIndex = UserListIndex, acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
  
    __obj.asInstanceOf[SheetSortDescriptor]
  }
}

