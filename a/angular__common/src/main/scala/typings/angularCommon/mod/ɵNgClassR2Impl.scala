package typings.angularCommon.mod

import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.IterableDiffers
import typings.angularCore.mod.KeyValueDiffers
import typings.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "\u0275NgClassR2Impl")
@js.native
class ɵNgClassR2Impl protected () extends ɵNgClassImpl {
  def this(
    _iterableDiffers: IterableDiffers,
    _keyValueDiffers: KeyValueDiffers,
    _ngEl: ElementRef[_],
    _renderer: Renderer2
  ) = this()
  /**
    * Applies a collection of CSS classes to the DOM element.
    *
    * For argument of type Set and Array CSS class names contained in those collections are always
    * added.
    * For argument of type Map CSS class name in the map's key is toggled based on the value (added
    * for truthy and removed for falsy).
    */
  var _applyClasses: js.Any = js.native
  var _applyIterableChanges: js.Any = js.native
  var _applyKeyValueChanges: js.Any = js.native
  var _initialClasses: js.Any = js.native
  var _iterableDiffer: js.Any = js.native
  var _iterableDiffers: js.Any = js.native
  var _keyValueDiffer: js.Any = js.native
  var _keyValueDiffers: js.Any = js.native
  var _ngEl: js.Any = js.native
  var _rawClass: js.Any = js.native
  /**
    * Removes a collection of CSS classes from the DOM element. This is mostly useful for cleanup
    * purposes.
    */
  var _removeClasses: js.Any = js.native
  var _renderer: js.Any = js.native
  var _toggleClass: js.Any = js.native
}

