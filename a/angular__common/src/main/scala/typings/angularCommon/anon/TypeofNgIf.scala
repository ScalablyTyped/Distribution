package typings.angularCommon.anon

import org.scalablytyped.runtime.Instantiable2
import typings.angularCommon.angularCommonBooleans.`true`
import typings.angularCommon.angularCommonStrings.`[ngIf]`
import typings.angularCommon.angularCommonStrings.binding
import typings.angularCommon.mod.NgIfContext
import typings.angularCore.mod.TemplateRef
import typings.angularCore.mod.ViewContainerRef
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNgIf
  extends StObject
     with Instantiable2[
      /* _viewContainer */ ViewContainerRef, 
      /* templateRef */ TemplateRef[NgIfContext[/* import warning: RewrittenClass.unapply cls was tparam T */ Any]], 
      typings.angularCommon.mod.NgIf[js.Object]
    ] {
  
  /**
    * Asserts the correct type of the context for the template that `NgIf` will render.
    *
    * The presence of this method is a signal to the Ivy template type-check compiler that the
    * `NgIf` structural directive renders its template with a specific context type.
    */
  def ngTemplateContextGuard[T](dir: typings.angularCommon.mod.NgIf[T], ctx: Any): /* is @angular/common.@angular/common.NgIfContext<std.Exclude<T, false | 0 | '' | null | undefined>> */ Boolean = js.native
  
  /**
    * Assert the correct type of the expression bound to the `ngIf` input within the template.
    *
    * The presence of this static field is a signal to the Ivy template type check compiler that
    * when the `NgIf` structural directive renders its template, the type of the expression bound
    * to `ngIf` should be narrowed in some way. For `NgIf`, the binding expression itself is used to
    * narrow its type, which allows the strictNullChecks feature of TypeScript to work with `NgIf`.
    */
  var ngTemplateGuard_ngIf: binding = js.native
  
  var ɵdir: ɵɵDirectiveDeclaration[
    typings.angularCommon.mod.NgIf[Any], 
    `[ngIf]`, 
    scala.Nothing, 
    NgIf, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`, 
    scala.Nothing
  ] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[typings.angularCommon.mod.NgIf[Any], scala.Nothing] = js.native
}
