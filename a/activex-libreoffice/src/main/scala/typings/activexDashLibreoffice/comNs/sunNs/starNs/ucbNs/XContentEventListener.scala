package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a listener for events related to XContents.
  * @author Kai Sommerfeld
  * @see XContent
  * @version 1.0
  */
trait XContentEventListener extends XEventListener {
  /**
    * gets called whenever a content wishes to notify changes.
    * @param evt the event.
    */
  def contentEvent(evt: ContentEvent): Unit
}

object XContentEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    contentEvent: ContentEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContentEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), contentEvent = js.Any.fromFunction1(contentEvent), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XContentEventListener]
  }
}

