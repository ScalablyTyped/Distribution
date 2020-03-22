package typings.angularCommon.mod

import typings.angularCommon.angularCommonStrings.binding
import typings.angularCore.mod.TemplateRef
import typings.angularCore.mod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgIf")
@js.native
class NgIf[T] protected () extends js.Object {
  def this(_viewContainer: ViewContainerRef, templateRef: TemplateRef[NgIfContext[T]]) = this()
  var _context: js.Any = js.native
  var _elseTemplateRef: js.Any = js.native
  var _elseViewRef: js.Any = js.native
  var _thenTemplateRef: js.Any = js.native
  var _thenViewRef: js.Any = js.native
  var _updateView: js.Any = js.native
  var _viewContainer: js.Any = js.native
  /**
    * The Boolean expression to evaluate as the condition for showing a template.
    */
  def ngIf(condition: T): js.Any = js.native
  def ngIfElse(): js.Any = js.native
  /**
    * A template to show if the condition expression evaluates to false.
    */
  def ngIfElse(templateRef: TemplateRef[NgIfContext[T]]): js.Any = js.native
  def ngIfThen(): js.Any = js.native
  /**
    * A template to show if the condition expression evaluates to true.
    */
  def ngIfThen(templateRef: TemplateRef[NgIfContext[T]]): js.Any = js.native
}

/* static members */
@JSImport("@angular/common", "NgIf")
@js.native
object NgIf extends js.Object {
  /**
    * Assert the correct type of the expression bound to the `ngIf` input within the template.
    *
    * The presence of this static field is a signal to the Ivy template type check compiler that
    * when the `NgIf` structural directive renders its template, the type of the expression bound
    * to `ngIf` should be narrowed in some way. For `NgIf`, the binding expression itself is used to
    * narrow its type, which allows the strictNullChecks feature of TypeScript to work with `NgIf`.
    */
  var ngTemplateGuard_ngIf: binding = js.native
  /**
    * Asserts the correct type of the context for the template that `NgIf` will render.
    *
    * The presence of this method is a signal to the Ivy template type-check compiler that the
    * `NgIf` structural directive renders its template with a specific context type.
    */
  def ngTemplateContextGuard[T](dir: NgIf[T], ctx: js.Any): /* is @angular/common.@angular/common.NgIfContext<T> */ Boolean = js.native
}

