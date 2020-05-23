package typings.activexLibreoffice.com_.sun.star.awt.grid

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of this interface is used by the {@link XGridColumnModel} to get notifications about column model changes.
  * @since OOo 3.3
  */
trait XGridColumnListener extends XEventListener {
  /** Invoked after a column was modified. */
  def columnChanged(event: GridColumnEvent): Unit
}

object XGridColumnListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    columnChanged: GridColumnEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XGridColumnListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), columnChanged = js.Any.fromFunction1(columnChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XGridColumnListener]
  }
}

