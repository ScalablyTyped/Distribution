package typings.activexLibreoffice.com_.sun.star.beans

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to receive PropertyChangeEvents whenever a bound property is changed. */
@js.native
trait XPropertyChangeListener extends XEventListener {
  /** is called when a bound property is changed. */
  def propertyChange(evt: PropertyChangeEvent): Unit = js.native
}

object XPropertyChangeListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    propertyChange: PropertyChangeEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XPropertyChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), propertyChange = js.Any.fromFunction1(propertyChange), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XPropertyChangeListener]
  }
  @scala.inline
  implicit class XPropertyChangeListenerOps[Self <: XPropertyChangeListener] (val x: Self) extends AnyVal {
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
    def setPropertyChange(value: PropertyChangeEvent => Unit): Self = this.set("propertyChange", js.Any.fromFunction1(value))
  }
  
}

