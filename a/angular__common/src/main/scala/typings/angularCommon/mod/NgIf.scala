package typings.angularCommon.mod

import typings.angularCommon.angularCommonStrings.binding
import typings.angularCore.mod.TemplateRef
import typings.angularCore.mod.ViewContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgIf")
@js.native
class NgIf[T] protected () extends StObject {
  def this(_viewContainer: ViewContainerRef, templateRef: TemplateRef[NgIfContext[T]]) = this()
  
  /* private */ var _context: js.Any = js.native
  
  /* private */ var _elseTemplateRef: js.Any = js.native
  
  /* private */ var _elseViewRef: js.Any = js.native
  
  /* private */ var _thenTemplateRef: js.Any = js.native
  
  /* private */ var _thenViewRef: js.Any = js.native
  
  /* private */ var _updateView: js.Any = js.native
  
  /* private */ var _viewContainer: js.Any = js.native
  
  /**
    * A template to show if the condition expression evaluates to false.
    */
  def ngIfElse_=(templateRef: TemplateRef[NgIfContext[T]] | Null): Unit = js.native
  
  /**
    * A template to show if the condition expression evaluates to true.
    */
  def ngIfThen_=(templateRef: TemplateRef[NgIfContext[T]] | Null): Unit = js.native
  
  /**
    * The Boolean expression to evaluate as the condition for showing a template.
    */
  def ngIf_=(condition: T): Unit = js.native
}
/* static members */
object NgIf {
  
  @JSImport("@angular/common", "NgIf")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asserts the correct type of the context for the template that `NgIf` will render.
    *
    * The presence of this method is a signal to the Ivy template type-check compiler that the
    * `NgIf` structural directive renders its template with a specific context type.
    */
  inline def ngTemplateContextGuard[T](dir: NgIf[T], ctx: js.Any): /* is @angular/common.@angular/common.NgIfContext<std.Exclude<T, false | 0 | '' | null | undefined>> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ngTemplateContextGuard")(dir.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/common.@angular/common.NgIfContext<std.Exclude<T, false | 0 | '' | null | undefined>> */ Boolean]
  
  /**
    * Assert the correct type of the expression bound to the `ngIf` input within the template.
    *
    * The presence of this static field is a signal to the Ivy template type check compiler that
    * when the `NgIf` structural directive renders its template, the type of the expression bound
    * to `ngIf` should be narrowed in some way. For `NgIf`, the binding expression itself is used to
    * narrow its type, which allows the strictNullChecks feature of TypeScript to work with `NgIf`.
    */
  @JSImport("@angular/common", "NgIf.ngTemplateGuard_ngIf")
  @js.native
  def ngTemplateGuard_ngIf: binding = js.native
  inline def ngTemplateGuard_ngIf_=(x: binding): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ngTemplateGuard_ngIf")(x.asInstanceOf[js.Any])
}
