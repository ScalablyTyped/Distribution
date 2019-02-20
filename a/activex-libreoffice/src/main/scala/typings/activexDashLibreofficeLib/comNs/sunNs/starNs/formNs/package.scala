package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object formNs {
  /**
    * is not used anymore, and superseded by {@link com.sun.star.form.runtime.FormController} and {@link com.sun.star.form.runtime.FormOperations} .
    * @deprecated Deprecated
    */
  type FormControllerDispatcher = activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProvider
  /**
    * specifies the capabilities of a collection of forms.
    *
    * Basically, a {@link Forms} is a {@link FormComponents} , with the additional restriction that the contained elements support the {@link
    * com.sun.star.form.component.Form} service.
    * @see com.sun.star.form.component.Form
    */
  type Forms = XForms
  /**
    * identifies a {@link FormComponent} as being a (sub-) form.
    *
    * This interface does not really provide an own functionality, it is only for easier runtime identification of form components.
    * @see XFormComponent
    */
  type XForm = XFormComponent
  /**
    * describes a component which may be part of a form.
    *
    * This interface does not really provide an own functionality, it is only for easier runtime identification of form components.
    * @see XForm
    */
  type XFormComponent = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild
}
