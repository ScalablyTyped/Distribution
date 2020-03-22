package typings.angularForms.mod

import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "AbstractFormGroupDirective")
@js.native
class AbstractFormGroupDirective ()
  extends ControlContainer
     with OnInit
     with OnDestroy {
  /**
    * @description
    * The async validators registered with this group.
    */
  def asyncValidator(): AsyncValidatorFn | Null = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
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
  /**
    * @description
    * The synchronous validators registered with this group.
    */
  def validator(): ValidatorFn | Null = js.native
}

