package typings.angularCommon.mod

import typings.angularCommon.angularCommonBooleans.`true`
import typings.angularCommon.angularCommonStrings.`[ngFor][ngForOf]`
import typings.angularCore.mod.IterableDiffers
import typings.angularCore.mod.NgIterable
import typings.angularCore.mod.TemplateRef
import typings.angularCore.mod.ViewContainerRef
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A [structural directive](guide/structural-directives) that renders
  * a template for each item in a collection.
  * The directive is placed on an element, which becomes the parent
  * of the cloned templates.
  *
  * The `ngForOf` directive is generally used in the
  * [shorthand form](guide/structural-directives#asterisk) `*ngFor`.
  * In this form, the template to be rendered for each iteration is the content
  * of an anchor element containing the directive.
  *
  * The following example shows the shorthand syntax with some options,
  * contained in an `<li>` element.
  *
  * ```
  * <li *ngFor="let item of items; index as i; trackBy: trackByFn">...</li>
  * ```
  *
  * The shorthand form expands into a long form that uses the `ngForOf` selector
  * on an `<ng-template>` element.
  * The content of the `<ng-template>` element is the `<li>` element that held the
  * short-form directive.
  *
  * Here is the expanded version of the short-form example.
  *
  * ```
  * <ng-template ngFor let-item [ngForOf]="items" let-i="index" [ngForTrackBy]="trackByFn">
  *   <li>...</li>
  * </ng-template>
  * ```
  *
  * Angular automatically expands the shorthand syntax as it compiles the template.
  * The context for each embedded view is logically merged to the current component
  * context according to its lexical position.
  *
  * When using the shorthand syntax, Angular allows only [one structural directive
  * on an element](guide/structural-directives#one-per-element).
  * If you want to iterate conditionally, for example,
  * put the `*ngIf` on a container element that wraps the `*ngFor` element.
  * For further discussion, see
  * [Structural Directives](guide/structural-directives#one-per-element).
  *
  * @usageNotes
  *
  * ### Local variables
  *
  * `NgForOf` provides exported values that can be aliased to local variables.
  * For example:
  *
  *  ```
  * <li *ngFor="let user of users; index as i; first as isFirst">
  *    {{i}}/{{users.length}}. {{user}} <span *ngIf="isFirst">default</span>
  * </li>
  * ```
  *
  * The following exported values can be aliased to local variables:
  *
  * - `$implicit: T`: The value of the individual items in the iterable (`ngForOf`).
  * - `ngForOf: NgIterable<T>`: The value of the iterable expression. Useful when the expression is
  * more complex then a property access, for example when using the async pipe (`userStreams |
  * async`).
  * - `index: number`: The index of the current item in the iterable.
  * - `count: number`: The length of the iterable.
  * - `first: boolean`: True when the item is the first item in the iterable.
  * - `last: boolean`: True when the item is the last item in the iterable.
  * - `even: boolean`: True when the item has an even index in the iterable.
  * - `odd: boolean`: True when the item has an odd index in the iterable.
  *
  * ### Change propagation
  *
  * When the contents of the iterator changes, `NgForOf` makes the corresponding changes to the DOM:
  *
  * * When an item is added, a new instance of the template is added to the DOM.
  * * When an item is removed, its template instance is removed from the DOM.
  * * When items are reordered, their respective templates are reordered in the DOM.
  *
  * Angular uses object identity to track insertions and deletions within the iterator and reproduce
  * those changes in the DOM. This has important implications for animations and any stateful
  * controls that are present, such as `<input>` elements that accept user input. Inserted rows can
  * be animated in, deleted rows can be animated out, and unchanged rows retain any unsaved state
  * such as user input.
  * For more on animations, see [Transitions and Triggers](guide/transition-and-triggers).
  *
  * The identities of elements in the iterator can change while the data does not.
  * This can happen, for example, if the iterator is produced from an RPC to the server, and that
  * RPC is re-run. Even if the data hasn't changed, the second response produces objects with
  * different identities, and Angular must tear down the entire DOM and rebuild it (as if all old
  * elements were deleted and all new elements inserted).
  *
  * To avoid this expensive operation, you can customize the default tracking algorithm.
  * by supplying the `trackBy` option to `NgForOf`.
  * `trackBy` takes a function that has two arguments: `index` and `item`.
  * If `trackBy` is given, Angular tracks changes by the return value of the function.
  *
  * @see [Structural Directives](guide/structural-directives)
  * @ngModule CommonModule
  * @publicApi
  */
@JSImport("@angular/common", "NgFor")
@js.native
open class NgFor[T, U /* <: NgIterable[T] */] protected () extends NgForOf[T, U] {
  def this(
    _viewContainer: ViewContainerRef,
    _template: TemplateRef[NgForOfContext[T, U]],
    _differs: IterableDiffers
  ) = this()
}
object NgFor {
  
  @JSImport("@angular/common", "NgFor")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asserts the correct type of the context for the template that `NgForOf` will render.
    *
    * The presence of this method is a signal to the Ivy template type-check compiler that the
    * `NgForOf` structural directive renders its template with a specific context type.
    */
  /* static member */
  inline def ngTemplateContextGuard[T, U /* <: NgIterable[T] */](dir: NgForOf[T, U], ctx: Any): /* is @angular/common.@angular/common.NgForOfContext<T, U> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ngTemplateContextGuard")(dir.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[/* is @angular/common.@angular/common.NgForOfContext<T, U> */ Boolean]
  
  /* static member */
  @JSImport("@angular/common", "NgFor.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgForOf[Any, Any], 
    `[ngFor][ngForOf]`, 
    scala.Nothing, 
    typings.angularCommon.anon.NgForOf, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    `true`, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgForOf[Any, Any], 
      `[ngFor][ngForOf]`, 
      scala.Nothing, 
      typings.angularCommon.anon.NgForOf, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      `true`, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("@angular/common", "NgFor.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgForOf[Any, Any], scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgForOf[Any, Any], scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
