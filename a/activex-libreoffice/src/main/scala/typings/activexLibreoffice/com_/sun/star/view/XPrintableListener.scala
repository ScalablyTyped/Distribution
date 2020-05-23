package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * receives events about print job progress.
  *
  * {@link XPrintableListener} can be registered to {@link XPrintableBroadcaster} . Then, the client object will receive events about print progress.
  * @see XPrintableBroadcaster
  */
trait XPrintableListener extends XEventListener {
  /**
    * informs the user of the new state in print progress.
    * @param Event contains the {@link XPrintable} having changed state and the new state.
    */
  def stateChanged(Event: PrintableStateEvent): Unit
}

object XPrintableListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    stateChanged: PrintableStateEvent => Unit
  ): XPrintableListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), stateChanged = js.Any.fromFunction1(stateChanged))
    __obj.asInstanceOf[XPrintableListener]
  }
}

