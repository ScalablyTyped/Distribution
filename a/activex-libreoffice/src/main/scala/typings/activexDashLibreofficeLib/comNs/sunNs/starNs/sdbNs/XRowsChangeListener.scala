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

