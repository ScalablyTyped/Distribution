package typings.activexLibreoffice.com_.sun.star.xml.crypto.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of {@link SAXEventKeeper} Status Change Listener.
  *
  * This interface is used to receive the {@link SAXEventKeeper} status change notification.
  */
trait XSAXEventKeeperStatusChangeListener extends XInterface {
  /**
    * Notifies the {@link SAXEventKeeper} is entering/leaving blocking state.
    * @param isBlocking `true` if the {@link SAXEventKeeper} is entering blocking state, `false` otherwise
    */
  def blockingStatusChanged(isBlocking: Boolean): Unit
  /**
    * Notifies the {@link SAXEventKeeper} 's buffer is empty/not empty
    * @param isBufferEmpty `true` if the {@link SAXEventKeeper} has no buffer at all; `false` otherwise.
    */
  def bufferStatusChanged(isBufferEmpty: Boolean): Unit
  /**
    * Notifies the {@link SAXEventKeeper} is entering/leaving collecting state.
    * @param isInsideCollectedElement `true` if the {@link SAXEventKeeper} is collecting some element, `false` otherwise
    */
  def collectionStatusChanged(isInsideCollectedElement: Boolean): Unit
}

object XSAXEventKeeperStatusChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    blockingStatusChanged: Boolean => Unit,
    bufferStatusChanged: Boolean => Unit,
    collectionStatusChanged: Boolean => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSAXEventKeeperStatusChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), blockingStatusChanged = js.Any.fromFunction1(blockingStatusChanged), bufferStatusChanged = js.Any.fromFunction1(bufferStatusChanged), collectionStatusChanged = js.Any.fromFunction1(collectionStatusChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSAXEventKeeperStatusChangeListener]
  }
}

