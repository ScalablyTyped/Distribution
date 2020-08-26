package typings.angularForms.mod

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/forms", "NgSelectOption")
@js.native
class NgSelectOption protected () extends OnDestroy {
  def this(_element: ElementRef[_], _renderer: Renderer2, _select: SelectControlValueAccessor) = this()
  var _element: js.Any = js.native
  var _renderer: js.Any = js.native
  var _select: js.Any = js.native
  /**
    * @description
    * ID of the option element
    */
  var id: String = js.native
  /**
    * @description
    * Tracks the value bound to the option element. Unlike the value binding,
    * ngValue supports binding to objects.
    */
  def ngValue_=(value: js.Any): Unit = js.native
  /**
    * @description
    * Tracks simple string values bound to the option element.
    * For objects, use the `ngValue` input binding.
    */
  def value_=(value: js.Any): Unit = js.native
}

