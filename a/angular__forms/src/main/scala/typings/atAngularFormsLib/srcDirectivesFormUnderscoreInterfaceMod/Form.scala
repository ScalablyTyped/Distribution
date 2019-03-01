package typings
package atAngularFormsLib.srcDirectivesFormUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Form extends js.Object {
  /**
    * @description
    * Add a control to this form.
    *
    * @param dir The control directive to add to the form.
    */
  def addControl(dir: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl): scala.Unit
  /**
    * @description
    * Add a group of controls to this form.
    *
    * @param dir: The control group directive to add.
    */
  def addFormGroup(
    dir: atAngularFormsLib.srcDirectivesAbstractUnderscoreFormUnderscoreGroupUnderscoreDirectiveMod.AbstractFormGroupDirective
  ): scala.Unit
  /**
    * @description
    * The control directive from which to get the `FormControl`.
    *
    * @param dir: The control directive.
    */
  def getControl(dir: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl): atAngularFormsLib.srcModelMod.FormControl
  /**
    * @description
    * The `FormGroup` associated with a particular `AbstractFormGroupDirective`.
    *
    * @param dir: The form group directive from which to get the `FormGroup`.
    */
  def getFormGroup(
    dir: atAngularFormsLib.srcDirectivesAbstractUnderscoreFormUnderscoreGroupUnderscoreDirectiveMod.AbstractFormGroupDirective
  ): atAngularFormsLib.srcModelMod.FormGroup
  /**
    * @description
    * Remove a control from this form.
    *
    * @param dir: The control directive to remove from the form.
    */
  def removeControl(dir: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl): scala.Unit
  /**
    * @description
    * Remove a group of controls to this form.
    *
    * @param dir: The control group directive to remove.
    */
  def removeFormGroup(
    dir: atAngularFormsLib.srcDirectivesAbstractUnderscoreFormUnderscoreGroupUnderscoreDirectiveMod.AbstractFormGroupDirective
  ): scala.Unit
  /**
    * @description
    * Update the model for a particular control with a new value.
    *
    * @param dir: The control directive to update.
    * @param value: The new value for the control.
    */
  def updateModel(dir: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl, value: js.Any): scala.Unit
}

object Form {
  @scala.inline
  def apply(
    addControl: js.Function1[atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl, scala.Unit],
    addFormGroup: js.Function1[
      atAngularFormsLib.srcDirectivesAbstractUnderscoreFormUnderscoreGroupUnderscoreDirectiveMod.AbstractFormGroupDirective, 
      scala.Unit
    ],
    getControl: js.Function1[
      atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl, 
      atAngularFormsLib.srcModelMod.FormControl
    ],
    getFormGroup: js.Function1[
      atAngularFormsLib.srcDirectivesAbstractUnderscoreFormUnderscoreGroupUnderscoreDirectiveMod.AbstractFormGroupDirective, 
      atAngularFormsLib.srcModelMod.FormGroup
    ],
    removeControl: js.Function1[atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl, scala.Unit],
    removeFormGroup: js.Function1[
      atAngularFormsLib.srcDirectivesAbstractUnderscoreFormUnderscoreGroupUnderscoreDirectiveMod.AbstractFormGroupDirective, 
      scala.Unit
    ],
    updateModel: js.Function2[atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl, js.Any, scala.Unit]
  ): Form = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addControl")(addControl)
    __obj.updateDynamic("addFormGroup")(addFormGroup)
    __obj.updateDynamic("getControl")(getControl)
    __obj.updateDynamic("getFormGroup")(getFormGroup)
    __obj.updateDynamic("removeControl")(removeControl)
    __obj.updateDynamic("removeFormGroup")(removeFormGroup)
    __obj.updateDynamic("updateModel")(updateModel)
    __obj.asInstanceOf[Form]
  }
}

