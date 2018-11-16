package typings
package atAngularCoreLib.srcLinkerTemplateUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/linker/template_ref", "TemplateRef")
@js.native
abstract class TemplateRef[C] () extends js.Object {
  /**
       * The anchor element in the parent view for this embedded view.
       *
       * The data-binding and injection contexts of embedded views created from this `TemplateRef`
       * inherit from the contexts of this location.
       *
       * Typically new embedded views are attached to the view container of this location, but in
       * advanced use-cases, the view can be attached to a different container while keeping the
       * data-binding and injection context from the original location.
       *
       */
  val elementRef: atAngularCoreLib.srcLinkerElementUnderscoreRefMod.ElementRef[_] = js.native
  /**
       * Creates a view object and attaches it to the view container of the parent view.
       * @param context The context for the new view, inherited from the anchor element.
       * @returns The new view object.
       */
  def createEmbeddedView(context: C): atAngularCoreLib.srcLinkerViewUnderscoreRefMod.EmbeddedViewRef[C] = js.native
}

