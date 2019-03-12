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

object XReference {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    dispose: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XReference = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dispose = js.Any.fromFunction0(dispose), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XReference]
  }
}

