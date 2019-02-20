package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts changes in the `RowSet` supplied by a component
  * @see XRowSetSupplier
  * @see XRowsChangeListener
  * @since OOo 3.3
  */
trait XRowsChangeBroadcaster extends js.Object {
  /** adds a listener to be notified when the `RowSet` supplied by the component changes. */
  def addRowsChangeListener(listener: XRowsChangeListener): scala.Unit
  /** removes a previously added listener. */
  def removeRowsChangeListener(listener: XRowsChangeListener): scala.Unit
}

