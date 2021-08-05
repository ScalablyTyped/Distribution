package typings.angularCommon.mod

import typings.angularCore.mod.DoCheck
import typings.angularCore.mod.IterableDiffers
import typings.angularCore.mod.NgIterable
import typings.angularCore.mod.TemplateRef
import typings.angularCore.mod.TrackByFunction
import typings.angularCore.mod.ViewContainerRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/common", "NgForOf")
@js.native
class NgForOf[T, U /* <: NgIterable[T] */] protected ()
  extends StObject
     with DoCheck {
  def this(
    _viewContainer: ViewContainerRef,
    _template: TemplateRef[NgForOfContext[T, U]],
    _differs: IterableDiffers
  ) = this()
  
  /* private */ var _applyChanges: js.Any = js.native
  
  /* private */ var _differ: js.Any = js.native
  
  /* private */ var _differs: js.Any = js.native
  
  /* private */ var _ngForOf: js.Any = js.native
  
  /* private */ var _ngForOfDirty: js.Any = js.native
  
  /* private */ var _perViewChange: js.Any = js.native
  
  /* private */ var _template: js.Any = js.native
  
  /* private */ var _trackByFn: js.Any = js.native
  
  /* private */ var _viewContainer: js.Any = js.native
  
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  /* CompleteClass */
  override def ngDoCheck(): Unit = js.native
  
  /**
    * The value of the iterable expression, which can be used as a
    * [template input variable](guide/structural-directives#template-input-variable).
    */
  def ngForOf_=(ngForOf: js.UndefOr[(U & NgIterable[T]) | Null]): Unit = js.native
  
  /**
    * A reference to the template that is stamped out for each item in the iterable.
    * @see [template reference variable](guide/template-reference-variables)
    */
  def ngForTemplate_=(value: TemplateRef[NgForOfContext[T, U]]): Unit = js.native
  
  def ngForTrackBy: TrackByFunction[T] = js.native
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
    * the iteration index and the associated node data.
    */
  def ngForTrackBy_=(fn: TrackByFunction[T]): Unit = js.native
}
/* static members */
object NgForOf {
  
  @JSImport("@angular/common", "NgForOf")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asserts the correct type of the context for the template that `NgForOf` will render.
    *
    * The presence of this method is a signal to the Ivy template type-check compiler that the
    * `NgForOf` structural directive renders its template with a specific context type.
    */
  inline def ngTemplateContextGuard[T, U /* <: NgIterable[T] */](dir: NgForOf[T, U], ctx: js.Any): /* is @angular/common.@angular/common.NgForOfContext<T, U> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ngTemplateContextGuard")(dir.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/common.@angular/common.NgForOfContext<T, U> */ Boolean]
}
