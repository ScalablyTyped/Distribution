package typings
package atAngularFormsLib.atAngularFormsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "AbstractFormGroupDirective")
@js.native
class AbstractFormGroupDirective ()
  extends ControlContainer
     with atAngularCoreLib.atAngularCoreMod.OnInit
     with atAngularCoreLib.atAngularCoreMod.OnDestroy {
  /**
    * @description
    * The async validators registered with this group.
    */
  val asyncValidator: AsyncValidatorFn | scala.Null = js.native
  /**
    * @description
    * The `FormGroup` bound to this directive.
    */
  @JSName("control")
  val control_AbstractFormGroupDirective: FormGroup = js.native
  /**
    * @description
    * The path to this group from the top-level directive.
    */
  @JSName("path")
  val path_AbstractFormGroupDirective: js.Array[java.lang.String] = js.native
  /**
    * @description
    * The synchronous validators registered with this group.
    */
  val validator: ValidatorFn | scala.Null = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  /* CompleteClass */
  override def ngOnInit(): scala.Unit = js.native
}

