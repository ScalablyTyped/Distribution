package typings.activexDashLibreoffice.comNs.sunNs.starNs.accessibilityNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to register a component as a listener, which is called whenever an accessibility event occurs.
  * @see XAccessibleEventBroadcaster
  * @since OOo 1.1.2
  */
trait XAccessibleEventListener extends XEventListener {
  /** is called whenever a accessible event (see {@link AccessibleEventObject} ) occurs. */
  def notifyEvent(aEvent: AccessibleEventObject): Unit
}

object XAccessibleEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyEvent: AccessibleEventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAccessibleEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyEvent = js.Any.fromFunction1(notifyEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAccessibleEventListener]
  }
}

