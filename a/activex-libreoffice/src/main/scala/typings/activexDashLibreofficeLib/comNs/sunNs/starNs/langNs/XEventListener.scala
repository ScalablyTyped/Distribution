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
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XEventListener]
  }
}

