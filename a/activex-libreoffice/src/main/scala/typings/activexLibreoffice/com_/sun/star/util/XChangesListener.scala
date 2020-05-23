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
trait XChangesListener extends XEventListener {
  /** is invoked when a batch of changes occurred. */
  def changesOccurred(Event: ChangesEvent): Unit
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
}

