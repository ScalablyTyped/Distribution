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

object XChangesNotifier {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addChangesListener: js.Function1[XChangesListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeChangesListener: js.Function1[XChangesListener, scala.Unit]
  ): XChangesNotifier = {
    val __obj = js.Dynamic.literal(acquire = acquire, addChangesListener = addChangesListener, queryInterface = queryInterface, release = release, removeChangesListener = removeChangesListener)
  
    __obj.asInstanceOf[XChangesNotifier]
  }
}

