package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.validationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.FormControlModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
     with XValidityConstraintListener

