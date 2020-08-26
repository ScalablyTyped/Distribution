package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.MouseEvent
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides functionality to submit data from a component.
  *
  * Usually, this is used by com::sun::star::form::component::HTMLForms.
  *
  * See the [HTML specification]{@link url="http://www.w3.org/TR/1999/REC-html401-19991224/interact/forms.html#h-17.13"} to learn about submitting forms.
  */
@js.native
trait XSubmit extends XInterface {
  /**
    * adds the specified listener to receive the "approveSubmit" event.
    * @param aListener the listener to add.
    * @see com.sun.star.form.XSubmitListener
    */
  def addSubmitListener(aListener: XSubmitListener): Unit = js.native
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XSubmitListener
    */
  def removeSubmitListener(aListener: XSubmitListener): Unit = js.native
  /**
    * submits the component's data to a specified target.
    * @param aControl the control whose data is to be submitted
    * @param aMouseEvt the event which triggered the submit, if it was a mouse event
    * @see com.sun.star.awt.MouseEvent
    */
  def submit(aControl: XControl, aMouseEvt: MouseEvent): Unit = js.native
}

object XSubmit {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addSubmitListener: XSubmitListener => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeSubmitListener: XSubmitListener => Unit,
    submit: (XControl, MouseEvent) => Unit
  ): XSubmit = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSubmitListener = js.Any.fromFunction1(addSubmitListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSubmitListener = js.Any.fromFunction1(removeSubmitListener), submit = js.Any.fromFunction2(submit))
    __obj.asInstanceOf[XSubmit]
  }
  @scala.inline
  implicit class XSubmitOps[Self <: XSubmit] (val x: Self) extends AnyVal {
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
    def setAddSubmitListener(value: XSubmitListener => Unit): Self = this.set("addSubmitListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveSubmitListener(value: XSubmitListener => Unit): Self = this.set("removeSubmitListener", js.Any.fromFunction1(value))
    @scala.inline
    def setSubmit(value: (XControl, MouseEvent) => Unit): Self = this.set("submit", js.Any.fromFunction2(value))
  }
  
}

