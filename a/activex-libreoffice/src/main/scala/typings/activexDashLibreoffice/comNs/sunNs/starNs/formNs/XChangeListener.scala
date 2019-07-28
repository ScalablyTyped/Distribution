package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the listener interface for receiving notifications about data changes.
  *
  * The concrete semantics of a change (i.e. the conditions for when a change event is fired) must be specified in the description of the service
  * broadcasting the change.
  * @see XChangeBroadcaster
  */
trait XChangeListener extends XEventListener {
  /**
    * is invoked when the data of a component has been changed.
    * @param rEvent A descriptor specifying the source of the event.
    */
  def changed(rEvent: EventObject): Unit
}

object XChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    changed: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), changed = js.Any.fromFunction1(changed), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XChangeListener]
  }
}

