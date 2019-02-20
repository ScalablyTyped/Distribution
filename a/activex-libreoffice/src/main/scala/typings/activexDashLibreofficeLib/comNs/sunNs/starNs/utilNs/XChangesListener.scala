package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives events from batch change broadcaster objects.
  * @see ChangesEvent
  * @see XChangesNotifier
  * @see XChangesBatch
  */
trait XChangesListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when a batch of changes occurred. */
  def changesOccurred(Event: ChangesEvent): scala.Unit
}

