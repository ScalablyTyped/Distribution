package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgIf")
@js.native
class NgIf protected () extends js.Object {
  def this(_viewContainer: atAngularCoreLib.atAngularCoreMod.ViewContainerRef, templateRef: atAngularCoreLib.atAngularCoreMod.TemplateRef[NgIfContext]) = this()
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
  var ngIf: js.Any = js.native
  /**
    * A template to show if the condition expression evaluates to false.
    */
  var ngIfElse: atAngularCoreLib.atAngularCoreMod.TemplateRef[NgIfContext] | scala.Null = js.native
  /**
    * A template to show if the condition expression evaluates to true.
    */
  var ngIfThen: atAngularCoreLib.atAngularCoreMod.TemplateRef[NgIfContext] | scala.Null = js.native
}

/* static members */
@JSImport("@angular/common", "NgIf")
@js.native
object NgIf extends js.Object {
  /**
    * Assert the correct type of the expression bound to the `ngIf` input within the template.
    *
    * The presence of this method is a signal to the Ivy template type check compiler that when the
    * `NgIf` structural directive renders its template, the type of the expression bound to `ngIf`
    * should be narrowed in some way. For `NgIf`, it is narrowed to be non-null, which allows the
    * strictNullChecks feature of TypeScript to work with `NgIf`.
    */
  def ngTemplateGuard_ngIf[E](dir: atAngularCommonLib.atAngularCommonMod.NgIf, expr: E): /* is std.NonNullable<E> */ scala.Boolean = js.native
}

