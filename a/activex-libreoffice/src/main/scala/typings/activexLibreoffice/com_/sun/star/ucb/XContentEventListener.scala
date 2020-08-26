package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a listener for events related to XContents.
  * @author Kai Sommerfeld
  * @see XContent
  * @version 1.0
  */
@js.native
trait XContentEventListener extends XEventListener {
  /**
    * gets called whenever a content wishes to notify changes.
    * @param evt the event.
    */
  def contentEvent(evt: ContentEvent): Unit = js.native
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
  @scala.inline
  implicit class XContentEventListenerOps[Self <: XContentEventListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContentEvent(value: ContentEvent => Unit): Self = this.set("contentEvent", js.Any.fromFunction1(value))
  }
  
}

