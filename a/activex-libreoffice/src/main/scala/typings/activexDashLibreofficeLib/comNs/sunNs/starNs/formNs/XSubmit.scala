package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

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
trait XSubmit
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds the specified listener to receive the "approveSubmit" event.
    * @param aListener the listener to add.
    * @see com.sun.star.form.XSubmitListener
    */
  def addSubmitListener(aListener: XSubmitListener): scala.Unit
  /**
    * removes the specified listener.
    * @param aListener the listener to remove.
    * @see com.sun.star.form.XSubmitListener
    */
  def removeSubmitListener(aListener: XSubmitListener): scala.Unit
  /**
    * submits the component's data to a specified target.
    * @param aControl the control whose data is to be submitted
    * @param aMouseEvt the event which triggered the submit, if it was a mouse event
    * @see com.sun.star.awt.MouseEvent
    */
  def submit(
    aControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    aMouseEvt: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent
  ): scala.Unit
}

object XSubmit {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addSubmitListener: XSubmitListener => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeSubmitListener: XSubmitListener => scala.Unit,
    submit: (activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl, activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.MouseEvent) => scala.Unit
  ): XSubmit = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addSubmitListener = js.Any.fromFunction1(addSubmitListener), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeSubmitListener = js.Any.fromFunction1(removeSubmitListener), submit = js.Any.fromFunction2(submit))
  
    __obj.asInstanceOf[XSubmit]
  }
}

