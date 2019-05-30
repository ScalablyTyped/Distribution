package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgForOf")
@js.native
class NgForOf[T] protected ()
  extends atAngularCoreLib.atAngularCoreMod.DoCheck {
  def this(_viewContainer: atAngularCoreLib.atAngularCoreMod.ViewContainerRef, _template: atAngularCoreLib.atAngularCoreMod.TemplateRef[NgForOfContext[T]], _differs: atAngularCoreLib.atAngularCoreMod.IterableDiffers) = this()
  var _applyChanges: js.Any = js.native
  var _differ: js.Any = js.native
  var _differs: js.Any = js.native
  var _ngForOf: js.Any = js.native
  var _ngForOfDirty: js.Any = js.native
  var _perViewChange: js.Any = js.native
  var _template: js.Any = js.native
  var _trackByFn: js.Any = js.native
  var _viewContainer: js.Any = js.native
  /**
    * The value of the iterable expression, which can be used as a
    * [template input variable](guide/structural-directives#template-input-variable).
    */
  var ngForOf: atAngularCoreLib.atAngularCoreMod.NgIterable[T] = js.native
  /**
    * A reference to the template that is stamped out for each item in the iterable.
    * @see [template reference variable](guide/template-syntax#template-reference-variables--var-)
    */
  var ngForTemplate: atAngularCoreLib.atAngularCoreMod.TemplateRef[NgForOfContext[T]] = js.native
  /**
    * A function that defines how to track changes for items in the iterable.
    *
    * When items are added, moved, or removed in the iterable,
    * the directive must re-render the appropriate DOM nodes.
    * To minimize churn in the DOM, only nodes that have changed
    * are re-rendered.
    *
    * By default, the change detector assumes that
    * the object instance identifies the node in the iterable.
    * When this function is supplied, the directive uses
    * the result of calling this function to identify the item node,
    * rather than the identity of the object itself.
    *
    * The function receives two inputs,
    * the iteration index and the node object ID.
    */
  @JSName("ngForTrackBy")
  var ngForTrackBy_Original: atAngularCoreLib.atAngularCoreMod.TrackByFunction[T] = js.native
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): scala.Unit = js.native
  /**
    * A function that defines how to track changes for items in the iterable.
    *
    * When items are added, moved, or removed in the iterable,
    * the directive must re-render the appropriate DOM nodes.
    * To minimize churn in the DOM, only nodes that have changed
    * are re-rendered.
    *
    * By default, the change detector assumes that
    * the object instance identifies the node in the iterable.
    * When this function is supplied, the directive uses
    * the result of calling this function to identify the item node,
    * rather than the identity of the object itself.
    *
    * The function receives two inputs,
    * the iteration index and the node object ID.
    */
  def ngForTrackBy(index: scala.Double, item: T): js.Any = js.native
}

/* static members */
@JSImport("@angular/common", "NgForOf")
@js.native
object NgForOf extends js.Object {
  /**
    * Asserts the correct type of the context for the template that `NgForOf` will render.
    *
    * The presence of this method is a signal to the Ivy template type-check compiler that the
    * `NgForOf` structural directive renders its template with a specific context type.
    */
  def ngTemplateContextGuard[T](dir: atAngularCommonLib.atAngularCommonMod.NgForOf[T], ctx: js.Any): /* is @angular/common.@angular/common.NgForOfContext<T> */ scala.Boolean = js.native
}

