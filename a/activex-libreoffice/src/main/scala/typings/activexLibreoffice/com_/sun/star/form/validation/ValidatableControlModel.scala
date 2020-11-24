package typings.activexLibreoffice.com_.sun.star.form.validation

import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.form.FormControlModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies the model of a form control which supports live validation of its input.
  *
  * Validatable control models support setting a validator with dynamic validity constraints, and broadcasting changes in their value as well as the
  * validity of their value.
  */
@js.native
trait ValidatableControlModel
  extends FormControlModel
     with XValidatableFormComponent
     with XValidityConstraintListener {
  
  /**
    * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
    * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
    */
  /* InferMemberOverrides */
  override def getPropertySetInfo(): XPropertySetInfo = js.native
}
