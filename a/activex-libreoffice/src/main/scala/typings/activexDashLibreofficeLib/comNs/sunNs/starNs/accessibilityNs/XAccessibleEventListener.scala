package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to register a component as a listener, which is called whenever an accessibility event occurs.
  * @see XAccessibleEventBroadcaster
  * @since OOo 1.1.2
  */
trait XAccessibleEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is called whenever a accessible event (see {@link AccessibleEventObject} ) occurs. */
  def notifyEvent(aEvent: AccessibleEventObject): scala.Unit
}

object XAccessibleEventListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    notifyEvent: js.Function1[AccessibleEventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAccessibleEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, notifyEvent = notifyEvent, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAccessibleEventListener]
  }
}

