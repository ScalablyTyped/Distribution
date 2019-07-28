package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XRowSet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs.dialogsNs.XExecutableDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface could be incomplete since I derived it from its places of use.
  * @since LibreOffice 4.1
  */
trait FilterDialog extends XExecutableDialog {
  def createDefault(): Unit
  def createWithQuery(QueryComposer: XSingleSelectQueryComposer, RowSet: XRowSet, ParentWindow: XWindow): Unit
}

object FilterDialog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createDefault: () => Unit,
    createWithQuery: (XSingleSelectQueryComposer, XRowSet, XWindow) => Unit,
    execute: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setTitle: String => Unit
  ): FilterDialog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createDefault = js.Any.fromFunction0(createDefault), createWithQuery = js.Any.fromFunction3(createWithQuery), execute = js.Any.fromFunction0(execute), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setTitle = js.Any.fromFunction1(setTitle))
  
    __obj.asInstanceOf[FilterDialog]
  }
}

