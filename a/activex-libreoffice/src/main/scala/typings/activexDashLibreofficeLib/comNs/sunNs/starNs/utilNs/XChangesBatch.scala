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
    acquire: js.Function0[scala.Unit],
    commitChanges: js.Function0[scala.Unit],
    getPendingChanges: js.Function0[ChangesSet],
    hasPendingChanges: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XChangesBatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PendingChanges")(PendingChanges.asInstanceOf[js.Any])
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("commitChanges")(commitChanges)
    __obj.updateDynamic("getPendingChanges")(getPendingChanges)
    __obj.updateDynamic("hasPendingChanges")(hasPendingChanges)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XChangesBatch]
  }
}

