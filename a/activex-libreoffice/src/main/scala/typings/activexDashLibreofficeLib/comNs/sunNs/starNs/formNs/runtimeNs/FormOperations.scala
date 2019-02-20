package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulates operations on a database form which has a UI representation, and is interacting with the user.
  * @since OOo 2.2
  */
trait FormOperations extends XFormOperations {
  /**
    * creates a `FormOperations` instance which works on a {@link com.sun.star.form.component.DataForm} instance.
    * @throws IllegalArgumentException if the given form is `NULL` , or does not support the {@link com.sun.star.form.component.DataForm} service.
    */
  def createWithForm(Form: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XForm): scala.Unit
  /**
    * creates a `FormOperations` instance which works on a {@link com.sun.star.form.FormController} instance.
    * @throws IllegalArgumentException if the given form controller is `NULL` , or does not have a model denoting a valid {@link com.sun.star.form.component.Da
    */
  def createWithFormController(Controller: XFormController): scala.Unit
}

