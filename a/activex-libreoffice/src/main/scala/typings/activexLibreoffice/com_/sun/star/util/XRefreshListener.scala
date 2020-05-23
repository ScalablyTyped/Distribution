package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive **refreshed** events. */
trait XRefreshListener extends XEventListener {
  /** is called when the object data is refreshed. */
  def refreshed(rEvent: EventObject): Unit
}

object XRefreshListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    refreshed: EventObject => Unit,
    release: () => Unit
  ): XRefreshListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), refreshed = js.Any.fromFunction1(refreshed), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRefreshListener]
  }
}

