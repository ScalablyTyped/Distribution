package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.langNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** base interface for all event listeners interfaces. */
trait XEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * gets called when the broadcaster is about to be disposed.
    *
    * All listeners and all other objects, which reference the broadcaster should release the reference to the source. No method should be invoked anymore
    * on this object ( including {@link XComponent.removeEventListener()} ).
    *
    * This method is called for every listener registration of derived listener interfaced, not only for registrations at {@link XComponent} .
    */
  def disposing(Source: EventObject): scala.Unit
}

object XEventListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    disposing: EventObject => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEventListener]
  }
}

