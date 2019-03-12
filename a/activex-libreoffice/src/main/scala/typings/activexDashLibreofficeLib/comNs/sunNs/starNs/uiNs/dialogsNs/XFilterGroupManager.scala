package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies an interface which allows manipulation of groups of filters for the {@link FilePicker} service. */
trait XFilterGroupManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Appends a group of filters to the current filter list.
    *
    * It is implementation dependent how the filter groups are presented to the user. ;  It is not even guaranteed that the groups are visualized:
    * implementations are free to simply append all the filters separately, with ignoring the group title.
    * @param sGroupTitle The title of the filter group. Usually, the caller should localize this title, as it is to be presented to the user.
    * @param aFilters The filters which form a group. Every filter consists of two strings, where the first one is a display name (as for sGroupTitle, it hold
    * @see com.sun.star.ui.dialogs.XFilterManager
    * @see com.sun.star.ui.dialogs.FilePicker
    * @throws com::sun::star::lang::IllegalArgumentException if one or more filters in the given filter list already exist.
    */
  def appendFilterGroup(
    sGroupTitle: java.lang.String,
    aFilters: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]
  ): scala.Unit
}

object XFilterGroupManager {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    appendFilterGroup: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.StringPair]) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XFilterGroupManager = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), appendFilterGroup = js.Any.fromFunction2(appendFilterGroup), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFilterGroupManager]
  }
}

