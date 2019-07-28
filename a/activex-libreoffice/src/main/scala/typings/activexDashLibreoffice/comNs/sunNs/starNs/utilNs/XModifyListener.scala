package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events when a model object changes. */
trait XModifyListener extends XEventListener {
  /**
    * is called when something changes in the object.
    *
    * Due to such an event, it may be necessary to update views or controllers.
    *
    * The source of the event may be the content of the object to which the listener is registered.
    */
  def modified(aEvent: EventObject): Unit
}

object XModifyListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    modified: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XModifyListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), modified = js.Any.fromFunction1(modified), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XModifyListener]
  }
}

