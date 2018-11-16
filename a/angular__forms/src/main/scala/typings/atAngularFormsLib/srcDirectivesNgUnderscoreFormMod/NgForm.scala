package typings
package atAngularFormsLib.srcDirectivesNgUnderscoreFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms/src/directives/ng_form", "NgForm")
@js.native
class NgForm protected ()
  extends atAngularFormsLib.srcDirectivesControlUnderscoreContainerMod.ControlContainer
     with atAngularFormsLib.srcDirectivesFormUnderscoreInterfaceMod.Form
     with atAngularCoreLib.srcMetadataLifecycleUnderscoreHooksMod.AfterViewInit {
  def this(validators: js.Array[_], asyncValidators: js.Array[_]) = this()
  var _directives: js.Any = js.native
  var _setUpdateStrategy: js.Any = js.native
  @JSName("control")
  val control_NgForm: atAngularFormsLib.srcModelMod.FormGroup = js.native
  val controls: ScalablyTyped.runtime.StringDictionary[atAngularFormsLib.srcModelMod.AbstractControl] = js.native
  var form: atAngularFormsLib.srcModelMod.FormGroup = js.native
  @JSName("formDirective")
  val formDirective_NgForm: atAngularFormsLib.srcDirectivesFormUnderscoreInterfaceMod.Form = js.native
  var ngSubmit: atAngularCoreLib.coreMod.EventEmitter[js.Object] = js.native
  /**
       * Options for the `NgForm` instance. Accepts the following properties:
       *
       * **updateOn**: Serves as the default `updateOn` value for all child `NgModels` below it
       * (unless a child has explicitly set its own value for this in `ngModelOptions`).
       * Potential values: `'change'` | `'blur'` | `'submit'`
       *
       * ```html
       * <form [ngFormOptions]="{updateOn: 'blur'}">
       *    <input name="one" ngModel>  <!-- this ngModel will update on blur -->
       * </form>
       * ```
       *
       */
  var options: atAngularFormsLib.Anon_UpdateOn = js.native
  @JSName("path")
  val path_NgForm: js.Array[java.lang.String] = js.native
  val submitted: scala.Boolean = js.native
  /**
       * @description
       * Add a control to this form.
       *
       * @param dir The control directive to add to the form.
       */
  /* CompleteClass */
  override def addControl(dir: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl): scala.Unit = js.native
  def addControl(dir: atAngularFormsLib.srcDirectivesNgUnderscoreModelMod.NgModel): scala.Unit = js.native
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
  def addFormGroup(dir: atAngularFormsLib.srcDirectivesNgUnderscoreModelUnderscoreGroupMod.NgModelGroup): scala.Unit = js.native
  /**
       * @description
       * The control directive from which to get the `FormControl`.
       *
       * @param dir: The control directive.
       */
  /* CompleteClass */
  override def getControl(dir: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl): atAngularFormsLib.srcModelMod.FormControl = js.native
  def getControl(dir: atAngularFormsLib.srcDirectivesNgUnderscoreModelMod.NgModel): atAngularFormsLib.srcModelMod.FormControl = js.native
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
  def getFormGroup(dir: atAngularFormsLib.srcDirectivesNgUnderscoreModelUnderscoreGroupMod.NgModelGroup): atAngularFormsLib.srcModelMod.FormGroup = js.native
  /**
       * A callback method that is invoked immediately after
       * Angular has completed initialization of a component's view.
       * It is invoked only once when the view is instantiated.
       *
       */
  /* CompleteClass */
  override def ngAfterViewInit(): scala.Unit = js.native
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
  def removeControl(dir: atAngularFormsLib.srcDirectivesNgUnderscoreModelMod.NgModel): scala.Unit = js.native
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
  def removeFormGroup(dir: atAngularFormsLib.srcDirectivesNgUnderscoreModelUnderscoreGroupMod.NgModelGroup): scala.Unit = js.native
  def resetForm(): scala.Unit = js.native
  def resetForm(value: js.Any): scala.Unit = js.native
  def setValue(value: ScalablyTyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  /**
       * @description
       * Update the model for a particular control with a new value.
       *
       * @param dir: The control directive to update.
       * @param value: The new value for the control.
       */
  /* CompleteClass */
  override def updateModel(dir: atAngularFormsLib.srcDirectivesNgUnderscoreControlMod.NgControl, value: js.Any): scala.Unit = js.native
}

