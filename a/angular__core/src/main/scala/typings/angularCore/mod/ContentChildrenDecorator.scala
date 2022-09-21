package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.angularCore.anon.EmitDistinctChangesOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentChildrenDecorator
  extends StObject
     with Instantiable1[
      (/* selector */ js.Function) | (/* selector */ ProviderToken[Any]) | (/* selector */ String), 
      Query
    ]
     with Instantiable2[
      (/* selector */ js.Function) | (/* selector */ ProviderToken[Any]) | (/* selector */ String), 
      /* opts */ EmitDistinctChangesOnly, 
      Query
    ] {
  
  def apply(selector: String): Any = js.native
  def apply(selector: String, opts: EmitDistinctChangesOnly): Any = js.native
  def apply(selector: js.Function): Any = js.native
  def apply(selector: js.Function, opts: EmitDistinctChangesOnly): Any = js.native
  /**
    * @description
    * Property decorator that configures a content query.
    *
    * Use to get the `QueryList` of elements or directives from the content DOM.
    * Any time a child element is added, removed, or moved, the query list will be
    * updated, and the changes observable of the query list will emit a new value.
    *
    * Content queries are set before the `ngAfterContentInit` callback is called.
    *
    * Does not retrieve elements or directives that are in other components' templates,
    * since a component's template is always a black box to its ancestors.
    *
    * **Metadata Properties**:
    *
    * * **selector** - The directive type or the name used for querying.
    * * **descendants** - If `true` include all descendants of the element. If `false` then only
    * query direct children of the element.
    * * **emitDistinctChangesOnly** - The ` QueryList#changes` observable will emit new values only
    *   if the QueryList result has changed. When `false` the `changes` observable might emit even
    *   if the QueryList has not changed.
    *   ** Note: *** This config option is **deprecated**, it will be permanently set to `true` and
    *   removed in future versions of Angular.
    * * **read** - Used to read a different token from the queried elements.
    *
    * The following selectors are supported.
    *   * Any class with the `@Component` or `@Directive` decorator
    *   * A template reference variable as a string (e.g. query `<my-component #cmp></my-component>`
    * with `@ContentChildren('cmp')`)
    *   * Any provider defined in the child component tree of the current component (e.g.
    * `@ContentChildren(SomeService) someService: SomeService`)
    *   * Any provider defined through a string token (e.g. `@ContentChildren('someToken')
    * someTokenVal: any`)
    *   * A `TemplateRef` (e.g. query `<ng-template></ng-template>` with
    * `@ContentChildren(TemplateRef) template;`)
    *
    * In addition, multiple string selectors can be separated with a comma (e.g.
    * `@ContentChildren('cmp1,cmp2')`)
    *
    * The following values are supported by `read`:
    *   * Any class with the `@Component` or `@Directive` decorator
    *   * Any provider defined on the injector of the component that is matched by the `selector` of
    * this query
    *   * Any provider defined through a string token (e.g. `{provide: 'token', useValue: 'val'}`)
    *   * `TemplateRef`, `ElementRef`, and `ViewContainerRef`
    *
    * @usageNotes
    *
    * Here is a simple demonstration of how the `ContentChildren` decorator can be used.
    *
    * {@example core/di/ts/contentChildren/content_children_howto.ts region='HowTo'}
    *
    * ### Tab-pane example
    *
    * Here is a slightly more realistic example that shows how `ContentChildren` decorators
    * can be used to implement a tab pane component.
    *
    * {@example core/di/ts/contentChildren/content_children_example.ts region='Component'}
    *
    * @Annotation
    */
  def apply(selector: ProviderToken[Any]): Any = js.native
  def apply(selector: ProviderToken[Any], opts: EmitDistinctChangesOnly): Any = js.native
}
