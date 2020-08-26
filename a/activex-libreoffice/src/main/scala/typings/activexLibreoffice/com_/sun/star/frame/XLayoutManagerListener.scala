package typings.activexLibreoffice.com_.sun.star.frame

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to receive events from a layout manager.
  *
  * Events are provided **only** for notification purposes only. All operations are handled internally by the layout manager component, so that GUI layout
  * works properly regardless of whether a component registers such a listener or not.
  * @see com.sun.star.frame.LayoutManager
  * @see com.sun.star.frame.LayoutManagerEvents
  * @since OOo 2.0
  */
@js.native
trait XLayoutManagerListener extends XEventListener {
  /**
    * is invoked when a layout manager has made a certain operation.
    * @param aSource reference to the layout manager which invoked the event.
    * @param eLayoutEvent identifies the layout event that has occurred.
    * @param aInfo provides additional information about the event. The type of info depends on the event.
    */
  def layoutEvent(aSource: EventObject, eLayoutEvent: Double, aInfo: js.Any): Unit = js.native
}

object XLayoutManagerListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    layoutEvent: (EventObject, Double, js.Any) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLayoutManagerListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), layoutEvent = js.Any.fromFunction3(layoutEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XLayoutManagerListener]
  }
  @scala.inline
  implicit class XLayoutManagerListenerOps[Self <: XLayoutManagerListener] (val x: Self) extends AnyVal {
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
    def setLayoutEvent(value: (EventObject, Double, js.Any) => Unit): Self = this.set("layoutEvent", js.Any.fromFunction3(value))
  }
  
}

