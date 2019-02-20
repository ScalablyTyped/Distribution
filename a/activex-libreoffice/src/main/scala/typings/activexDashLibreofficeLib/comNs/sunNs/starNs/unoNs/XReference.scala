package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * must be implemented by anyone who holds the adapter on the client side.
  * @see XWeak for description af concepts.
  */
trait XReference extends XInterface {
  /**
    * removes all references to the adapter.
    *
    * This method is called when the adapted object dies. The implementation of the client-side's weak reference must include removal of all references to
    * the adapter. Otherwise, the adapted object will be destroyed, but the adapter will be alive.
    */
  def dispose(): scala.Unit
}

