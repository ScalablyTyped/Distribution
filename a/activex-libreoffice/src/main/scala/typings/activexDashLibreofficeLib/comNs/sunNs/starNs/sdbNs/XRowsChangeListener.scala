package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for receiving "rowsChanged" events posted by, for example, a row set. */
trait XRowsChangeListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called when rows are inserted, updated, or deleted.
    * @param event contains information about the event
    */
  def rowsChanged(event: RowsChangeEvent): scala.Unit
}

object XRowsChangeListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    rowsChanged: js.Function1[RowsChangeEvent, scala.Unit]
  ): XRowsChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release, rowsChanged = rowsChanged)
  
    __obj.asInstanceOf[XRowsChangeListener]
  }
}

