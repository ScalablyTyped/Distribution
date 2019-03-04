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
    acquire: js.Function0[scala.Unit],
    createDefault: js.Function0[scala.Unit],
    createWithQuery: js.Function3[
      XSingleSelectQueryComposer, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow, 
      scala.Unit
    ],
    execute: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setTitle: js.Function1[java.lang.String, scala.Unit]
  ): FilterDialog = {
    val __obj = js.Dynamic.literal(acquire = acquire, createDefault = createDefault, createWithQuery = createWithQuery, execute = execute, queryInterface = queryInterface, release = release, setTitle = setTitle)
  
    __obj.asInstanceOf[FilterDialog]
  }
}

