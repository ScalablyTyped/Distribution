package typings
package atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreGroupUnderscoreDirectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/directives/reactive_directives/form_group_directive", "FormGroupDirective")
@js.native
class FormGroupDirective protected ()
  extends atAngularFormsLib.srcDirectivesControlUnderscoreContainerMod.ControlContainer
     with atAngularFormsLib.srcDirectivesFormUnderscoreInterfaceMod.Form
     with atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.OnChanges {
  def this(_validators: js.Array[_], _asyncValidators: js.Array[_]) = this()
  var _asyncValidators: js.Any = js.native
  var _checkFormPresent: js.Any = js.native
  var _oldForm: js.Any = js.native
  var _updateRegistrations: js.Any = js.native
  var _updateValidators: js.Any = js.native
  var _validators: js.Any = js.native
  @JSName("control")
  val control_FormGroupDirective: atAngularFormsLib.srcModelMod.FormGroup = js.native
  var directives: js.Array[
    atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreControlUnderscoreNameMod.FormControlName
  ] = js.native
  var form: atAngularFormsLib.srcModelMod.FormGroup = js.native
  @JSName("formDirective")
  val formDirective_FormGroupDirective: atAngularFormsLib.srcDirectivesFormUnderscoreInterfaceMod.Form = js.native
  var ngSubmit: atAngularCoreLib.coreMod.EventEmitter[js.Object] = js.native
  @JSName("path")
  val path_FormGroupDirective: js.Array[java.lang.String] = js.native
  val submitted: scala.Boolean = js.native
  /**
       * @description
       * Add a control to this form.
       *
       * @param dir The control directive to add to the form.
       */
  /* CompleteClass */
  override def addControl(dir: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl): scala.Unit = js.native
  def addControl(
    dir: atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreControlUnderscoreNameMod.FormControlName
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  def addFormArray(
    dir: atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreGroupUnderscoreNameMod.FormArrayName
  ): scala.Unit = js.native
  /**
       * @description
       * Add a group of controls to this form.
       *
       * @param dir: The control group directive to add.
       */
  /* CompleteClass */
  override def addFormGroup(
    dir: atAngularFormsLib.srcDirectivesAbstractUnderscoreFormUnderscoreGroupUnderscoreDirectiveMod.AbstractFormGroupDirective
  ): scala.Unit = js.native
  def addFormGroup(
    dir: atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreGroupUnderscoreNameMod.FormGroupName
  ): scala.Unit = js.native
  /**
       * @description
       * The control directive from which to get the `FormControl`.
       *
       * @param dir: The control directive.
       */
  /* CompleteClass */
  override def getControl(dir: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl): atAngularFormsLib.srcModelMod.FormControl = js.native
  def getControl(
    dir: atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreControlUnderscoreNameMod.FormControlName
  ): atAngularFormsLib.srcModelMod.FormControl = js.native
  def getFormArray(
    dir: atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreGroupUnderscoreNameMod.FormArrayName
  ): atAngularFormsLib.srcModelMod.FormArray = js.native
  /**
       * @description
       * The `FormGroup` associated with a particular `AbstractFormGroupDirective`.
       *
       * @param dir: The form group directive from which to get the `FormGroup`.
       */
  /* CompleteClass */
  override def getFormGroup(
    dir: atAngularFormsLib.srcDirectivesAbstractUnderscoreFormUnderscoreGroupUnderscoreDirectiveMod.AbstractFormGroupDirective
  ): atAngularFormsLib.srcModelMod.FormGroup = js.native
  def getFormGroup(
    dir: atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreGroupUnderscoreNameMod.FormGroupName
  ): atAngularFormsLib.srcModelMod.FormGroup = js.native
  /**
       * A callback method that is invoked immediately after the
       * default change detector has checked data-bound properties
       * if at least one has changed, and before the view and content
       * children are checked.
       * @param changes The changed properties.
       */
  /* CompleteClass */
  override def ngOnChanges(changes: atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.SimpleChanges): scala.Unit = js.native
  def onReset(): scala.Unit = js.native
  def onSubmit($event: stdLib.Event): scala.Boolean = js.native
  /**
       * @description
       * Remove a control from this form.
       *
       * @param dir: The control directive to remove from the form.
       */
  /* CompleteClass */
  override def removeControl(dir: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl): scala.Unit = js.native
  def removeControl(
    dir: atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreControlUnderscoreNameMod.FormControlName
  ): scala.Unit = js.native
  def removeFormArray(
    dir: atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreGroupUnderscoreNameMod.FormArrayName
  ): scala.Unit = js.native
  /**
       * @description
       * Remove a group of controls to this form.
       *
       * @param dir: The control group directive to remove.
       */
  /* CompleteClass */
  override def removeFormGroup(
    dir: atAngularFormsLib.srcDirectivesAbstractUnderscoreFormUnderscoreGroupUnderscoreDirectiveMod.AbstractFormGroupDirective
  ): scala.Unit = js.native
  def removeFormGroup(
    dir: atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreGroupUnderscoreNameMod.FormGroupName
  ): scala.Unit = js.native
  def resetForm(): scala.Unit = js.native
  def resetForm(value: js.Any): scala.Unit = js.native
  /**
       * @description
       * Update the model for a particular control with a new value.
       *
       * @param dir: The control directive to update.
       * @param value: The new value for the control.
       */
  /* CompleteClass */
  override def updateModel(dir: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl, value: js.Any): scala.Unit = js.native
  def updateModel(
    dir: atAngularFormsLib.srcDirectivesReactiveUnderscoreDirectivesFormUnderscoreControlUnderscoreNameMod.FormControlName,
    value: js.Any
  ): scala.Unit = js.native
}

