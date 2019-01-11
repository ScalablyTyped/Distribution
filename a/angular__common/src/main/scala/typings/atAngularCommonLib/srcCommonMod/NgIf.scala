package typings
package atAngularCommonLib.srcCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/common", "NgIf")
@js.native
class NgIf protected ()
  extends atAngularCommonLib.srcDirectivesNgUnderscoreIfMod.NgIf {
  def this(_viewContainer: atAngularCoreLib.atAngularCoreMod.ViewContainerRef, templateRef: atAngularCoreLib.atAngularCoreMod.TemplateRef[atAngularCommonLib.srcDirectivesNgUnderscoreIfMod.NgIfContext]) = this()
}

@JSImport("@angular/common/src/common", "NgIf")
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
  def ngTemplateGuard_ngIf[E](dir: atAngularCommonLib.srcDirectivesNgUnderscoreIfMod.NgIf, expr: E): /* is std.NonNullable<E> */ scala.Boolean = js.native
}

