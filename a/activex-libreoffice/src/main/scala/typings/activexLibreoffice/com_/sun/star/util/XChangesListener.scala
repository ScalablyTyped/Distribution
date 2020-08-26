package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives events from batch change broadcaster objects.
  * @see ChangesEvent
  * @see XChangesNotifier
  * @see XChangesBatch
  */
@js.native
trait XChangesListener extends XEventListener {
  /** is invoked when a batch of changes occurred. */
  def changesOccurred(Event: ChangesEvent): Unit = js.native
}

object XChangesListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    changesOccurred: ChangesEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XChangesListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), changesOccurred = js.Any.fromFunction1(changesOccurred), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XChangesListener]
  }
  @scala.inline
  implicit class XChangesListenerOps[Self <: XChangesListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangesOccurred(value: ChangesEvent => Unit): Self = this.set("changesOccurred", js.Any.fromFunction1(value))
  }
  
}

