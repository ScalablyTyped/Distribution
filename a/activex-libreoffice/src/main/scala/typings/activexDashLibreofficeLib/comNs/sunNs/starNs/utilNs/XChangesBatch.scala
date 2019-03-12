package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * this interface enables applying a set of changes in one batch transaction.
  *
  * An object implementing this interface allows other interfaces to change its state locally. It will keep a list of pending changes until such changes
  * are committed or canceled.
  *
  * Only when they are explicitly committed will these changes take effect persistently or globally.
  * @see XChangesNotifier
  * @see XChangesSet
  * @see XCancellable
  */
trait XChangesBatch
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** queries for any pending changes that can be committed. */
  val PendingChanges: ChangesSet
  /**
    * commits any pending changes.
    *
    * The exact action depends on the concrete service.
    */
  def commitChanges(): scala.Unit
  /** queries for any pending changes that can be committed. */
  def getPendingChanges(): ChangesSet
  /** checks whether this object has any pending changes that can be committed. */
  def hasPendingChanges(): scala.Boolean
}

object XChangesBatch {
  @scala.inline
  def apply(
    PendingChanges: ChangesSet,
    acquire: () => scala.Unit,
    commitChanges: () => scala.Unit,
    getPendingChanges: () => ChangesSet,
    hasPendingChanges: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XChangesBatch = {
    val __obj = js.Dynamic.literal(PendingChanges = PendingChanges.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), commitChanges = js.Any.fromFunction0(commitChanges), getPendingChanges = js.Any.fromFunction0(getPendingChanges), hasPendingChanges = js.Any.fromFunction0(hasPendingChanges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XChangesBatch]
  }
}

