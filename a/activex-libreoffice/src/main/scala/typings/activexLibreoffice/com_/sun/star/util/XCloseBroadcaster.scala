package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * broadcasts each tried closing of an object to all interest listener
  *
  * The called object for closing must post the closing events immediately and before any internal cancel operations will be started. If a listener
  * disagree with that it should throw a {@link CloseVetoException} and called function {@link XCloseable.close()} must be broken immediately. It's not
  * allowed to catch it inside the close() request. If no listener nor internal processes hinder the object on closing all listeners get a notification
  * about real closing.
  * @see
  */
trait XCloseBroadcaster extends XInterface {
  /**
    * adds the specified listener to receive or have a veto for "close" events
    * @param Listener the listener which is interest on closing events
    */
  def addCloseListener(Listener: XCloseListener): Unit
  /**
    * removes the specified listener
    * @param Listener the listener which isn't interest on closing events any longer
    */
  def removeCloseListener(Listener: XCloseListener): Unit
}

object XCloseBroadcaster {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addCloseListener: XCloseListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeCloseListener: XCloseListener => Unit
  ): XCloseBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addCloseListener = js.Any.fromFunction1(addCloseListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeCloseListener = js.Any.fromFunction1(removeCloseListener))
    __obj.asInstanceOf[XCloseBroadcaster]
  }
}

