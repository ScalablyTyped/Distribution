package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** receives events which get fired whenever the state of a bound property is changed. */
@js.native
trait XPropertyStateChangeListener extends XEventListener {
  /**
    * is called when a bound property's state is changed.
    * @param aEvent describes the event source and the property that has changed.
    */
  def propertyStateChange(aEvent: PropertyStateChangeEvent): Unit = js.native
}

object XPropertyStateChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    propertyStateChange: PropertyStateChangeEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertyStateChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), propertyStateChange = js.Any.fromFunction1(propertyStateChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertyStateChangeListener]
  }
  @scala.inline
  implicit class XPropertyStateChangeListenerOps[Self <: XPropertyStateChangeListener] (val x: Self) extends AnyVal {
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
    def setPropertyStateChange(value: PropertyStateChangeEvent => Unit): Self = this.set("propertyStateChange", js.Any.fromFunction1(value))
  }
  
}

