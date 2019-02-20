package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts events about multiple changes that occur in bulk.
  * @see XChangesListener
  * @see XChangesBatch
  * @see ChangesEvent
  */
trait XChangesNotifier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds the specified listener to receive events when changes occurred. */
  def addChangesListener(aListener: XChangesListener): scala.Unit
  /** removes the specified listener. */
  def removeChangesListener(aListener: XChangesListener): scala.Unit
}

