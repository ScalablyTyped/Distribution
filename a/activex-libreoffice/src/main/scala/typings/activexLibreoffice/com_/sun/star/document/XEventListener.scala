package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to register listeners, which are called whenever a document or document content event occurs
  *
  * Such events will be broadcasted by a {@link XEventBroadcaster} .
  * @deprecated Deprecated
  * @see XDocumentEventListener
  */
trait XEventListener
  extends typings.activexLibreoffice.com_.sun.star.lang.XEventListener {
  /**
    * is called whenever a document event (see {@link EventObject} ) occurs
    * @param Event specifies the event type
    */
  def notifyEvent(Event: EventObject): Unit
}

object XEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: typings.activexLibreoffice.com_.sun.star.lang.EventObject => Unit,
    notifyEvent: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyEvent = js.Any.fromFunction1(notifyEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEventListener]
  }
}

