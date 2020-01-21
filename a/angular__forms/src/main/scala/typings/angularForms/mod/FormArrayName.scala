package typings.angularForms.mod

import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "FormArrayName")
@js.native
class FormArrayName protected ()
  extends ControlContainer
     with OnInit
     with OnDestroy {
  def this(parent: ControlContainer, validators: js.Array[_], asyncValidators: js.Array[_]) = this()
  var _checkParentType: js.Any = js.native
  /**
    * @description
    * Async validator function composed of all the async validators registered with this directive.
    */
  val asyncValidator: AsyncValidatorFn | Null = js.native
  /**
    * @description
    * The `FormArray` bound to this directive.
    */
  @JSName("control")
  val control_FormArrayName: FormArray = js.native
  /**
    * @description
    * The top-level directive for this group if present, otherwise null.
    */
  @JSName("formDirective")
  val formDirective_FormArrayName: FormGroupDirective | Null = js.native
  /**
    * @description
    * Returns an array that represents the path from the top-level form to this control.
    * Each index is the string name of the control on that level.
    */
  @JSName("path")
  val path_FormArrayName: js.Array[String] = js.native
  /**
    * @description
    * Synchronous validator function composed of all the synchronous validators registered with this
    * directive.
    */
  val validator: ValidatorFn | Null = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  /* CompleteClass */
  override def ngOnInit(): Unit = js.native
}

