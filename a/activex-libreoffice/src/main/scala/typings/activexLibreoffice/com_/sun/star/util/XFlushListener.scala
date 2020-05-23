package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive **flushed** events. */
trait XFlushListener extends XEventListener {
  /** is called when the object data is flushed. */
  def flushed(rEvent: EventObject): Unit
}

object XFlushListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    flushed: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFlushListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), flushed = js.Any.fromFunction1(flushed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFlushListener]
  }
}

