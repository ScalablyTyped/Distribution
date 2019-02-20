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

