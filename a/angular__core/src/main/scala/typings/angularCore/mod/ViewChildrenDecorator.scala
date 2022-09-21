package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.angularCore.anon.EmitDistinctChangesOnlyRead
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewChildrenDecorator
  extends StObject
     with Instantiable1[
      (/* selector */ js.Function) | (/* selector */ ProviderToken[Any]) | (/* selector */ String), 
      typings.angularCore.mod.ViewChildren
    ]
     with Instantiable2[
      (/* selector */ js.Function) | (/* selector */ ProviderToken[Any]) | (/* selector */ String), 
      /* opts */ EmitDistinctChangesOnlyRead, 
      typings.angularCore.mod.ViewChildren
    ] {
  
  def apply(selector: String): Any = js.native
  def apply(selector: String, opts: EmitDistinctChangesOnlyRead): Any = js.native
  def apply(selector: js.Function): Any = js.native
  def apply(selector: js.Function, opts: EmitDistinctChangesOnlyRead): Any = js.native
  /**
    * @description
    * Property decorator that configures a view query.
    *
    * Use to get the `QueryList` of elements or directives from the view DOM.
    * Any time a child element is added, removed, or moved, the query list will be updated,
    * and the changes observable of the query list will emit a new value.
    *
    * View queries are set before the `ngAfterViewInit` callback is called.
    *
    * **Metadata Properties**:
    *
    * * **selector** - The directive type or the name used for querying.
    * * **read** - Used to read a different token from the queried elements.
    * * **emitDistinctChangesOnly** - The ` QueryList#changes` observable will emit new values only
    *   if the QueryList result has changed. When `false` the `changes` observable might emit even
    *   if the QueryList has not changed.
    *   ** Note: *** This config option is **deprecated**, it will be permanently set to `true` and
    * removed in future versions of Angular.
    *
    * The following selectors are supported.
    *   * Any class with the `@Component` or `@Directive` decorator
    *   * A template reference variable as a string (e.g. query `<my-component #cmp></my-component>`
    * with `@ViewChildren('cmp')`)
    *   * Any provider defined in the child component tree of the current component (e.g.
    * `@ViewChildren(SomeService) someService!: SomeService`)
    *   * Any provider defined through a string token (e.g. `@ViewChildren('someToken')
    * someTokenVal!: any`)
    *   * A `TemplateRef` (e.g. query `<ng-template></ng-template>` with `@ViewChildren(TemplateRef)
    * template;`)
    *
    * In addition, multiple string selectors can be separated with a comma (e.g.
    * `@ViewChildren('cmp1,cmp2')`)
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
    * {@example core/di/ts/viewChildren/view_children_howto.ts region='HowTo'}
    *
    * ### Another example
    *
    * {@example core/di/ts/viewChildren/view_children_example.ts region='Component'}
    *
    * @Annotation
    */
  def apply(selector: ProviderToken[Any]): Any = js.native
  def apply(selector: ProviderToken[Any], opts: EmitDistinctChangesOnlyRead): Any = js.native
}
