package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is supported by objects with data that can be refreshed from a data source. */
trait XRefreshable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds the specified listener to receive the event "refreshed." */
  def addRefreshListener(l: XRefreshListener): scala.Unit
  /** refreshes the data of the object from the connected data source. */
  def refresh(): scala.Unit
  /** removes the specified listener. */
  def removeRefreshListener(l: XRefreshListener): scala.Unit
}

object XRefreshable {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addRefreshListener: XRefreshListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    refresh: () => scala.Unit,
    release: () => scala.Unit,
    removeRefreshListener: XRefreshListener => scala.Unit
  ): XRefreshable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addRefreshListener = js.Any.fromFunction1(addRefreshListener), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release), removeRefreshListener = js.Any.fromFunction1(removeRefreshListener))
  
    __obj.asInstanceOf[XRefreshable]
  }
}

