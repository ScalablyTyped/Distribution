package typings.activexLibreoffice.com_.sun.star.form.validation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the listener interface to be notified of changes of a {@link XValidatableFormComponent} */
@js.native
trait XFormComponentValidityListener extends XEventListener {
  /**
    * called when the validity and/or the value of the form component at which the listener is registered changed.
    * @param Source The member {@link com.sun.star.lang.EventObject.Source} represents the {@link XValidatableFormComponent} whose validity, value, or text ch
    */
  def componentValidityChanged(Source: EventObject): Unit = js.native
}

object XFormComponentValidityListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    componentValidityChanged: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFormComponentValidityListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), componentValidityChanged = js.Any.fromFunction1(componentValidityChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFormComponentValidityListener]
  }
  @scala.inline
  implicit class XFormComponentValidityListenerOps[Self <: XFormComponentValidityListener] (val x: Self) extends AnyVal {
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
    def setComponentValidityChanged(value: EventObject => Unit): Self = this.set("componentValidityChanged", js.Any.fromFunction1(value))
  }
  
}

