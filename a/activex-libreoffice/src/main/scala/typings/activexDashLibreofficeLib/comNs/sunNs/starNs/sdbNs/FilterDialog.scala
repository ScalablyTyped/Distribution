package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface could be incomplete since I derived it from its places of use.
  * @since LibreOffice 4.1
  */
trait FilterDialog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog {
  def createDefault(): scala.Unit
  def createWithQuery(
    QueryComposer: XSingleSelectQueryComposer,
    RowSet: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet,
    ParentWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
  ): scala.Unit
}

object FilterDialog {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    createDefault: () => scala.Unit,
    createWithQuery: (XSingleSelectQueryComposer, activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow) => scala.Unit,
    execute: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setTitle: java.lang.String => scala.Unit
  ): FilterDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDefault = js.Any.fromFunction0(createDefault), createWithQuery = js.Any.fromFunction3(createWithQuery), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[FilterDialog]
  }
}

