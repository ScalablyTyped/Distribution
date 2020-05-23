package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events from a component when the state of an item changes. */
trait XItemListener extends XEventListener {
  /** is invoked when an item changes its state. */
  def itemStateChanged(rEvent: ItemEvent): Unit
}

object XItemListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    itemStateChanged: ItemEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XItemListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), itemStateChanged = js.Any.fromFunction1(itemStateChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XItemListener]
  }
}

