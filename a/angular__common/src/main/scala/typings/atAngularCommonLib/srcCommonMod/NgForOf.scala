package typings
package atAngularCommonLib.srcCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/common", "NgForOf")
@js.native
class NgForOf[T] protected ()
  extends atAngularCommonLib.srcDirectivesNgUnderscoreForUnderscoreOfMod.NgForOf[T] {
  def this(_viewContainer: atAngularCoreLib.atAngularCoreMod.ViewContainerRef, _template: atAngularCoreLib.atAngularCoreMod.TemplateRef[atAngularCommonLib.srcDirectivesNgUnderscoreForUnderscoreOfMod.NgForOfContext[T]], _differs: atAngularCoreLib.atAngularCoreMod.IterableDiffers) = this()
}

@JSImport("@angular/common/src/common", "NgForOf")
@js.native
object NgForOf extends js.Object {
  /**
    * Asserts the correct type of the context for the template that `NgForOf` will render.
    *
    * The presence of this method is a signal to the Ivy template type-check compiler that the
    * `NgForOf` structural directive renders its template with a specific context type.
    */
  def ngTemplateContextGuard[T](dir: atAngularCommonLib.srcDirectivesNgUnderscoreForUnderscoreOfMod.NgForOf[T], ctx: js.Any): /* is @angular/common.@angular/common/src/directives/ng_for_of.NgForOfContext<T> */ scala.Boolean = js.native
}

