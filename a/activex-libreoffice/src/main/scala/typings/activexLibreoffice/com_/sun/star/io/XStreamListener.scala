package typings.activexLibreoffice.com_.sun.star.io

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive events from an active data control. */
trait XStreamListener extends XEventListener {
  /**
    * gets called when data transfer terminates normally or when data transfer is terminated from outside.
    *
    * The termination could be done using the method {@link XActiveDataControl.terminate()} .
    */
  def closed(): Unit
  /**
    * gets called when an internal error in source or sink has occurred.
    *
    * After the method is called, the close is called on the connected streams.
    */
  def error(aException: js.Any): Unit
  /** gets called as soon as data transfer has started. */
  def started(): Unit
  /** gets called when {@link XActiveDataControl.terminate()} is called. */
  def terminated(): Unit
}

object XStreamListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    closed: () => Unit,
    disposing: EventObject => Unit,
    error: js.Any => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    started: () => Unit,
    terminated: () => Unit
  ): XStreamListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), closed = js.Any.fromFunction0(closed), disposing = js.Any.fromFunction1(disposing), error = js.Any.fromFunction1(error), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), started = js.Any.fromFunction0(started), terminated = js.Any.fromFunction0(terminated))
    __obj.asInstanceOf[XStreamListener]
  }
}

