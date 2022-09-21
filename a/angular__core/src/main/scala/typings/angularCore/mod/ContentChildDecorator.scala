package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.angularCore.anon.Descendants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentChildDecorator
  extends StObject
     with Instantiable1[
      (/* selector */ js.Function) | (/* selector */ ProviderToken[Any]) | (/* selector */ String), 
      typings.angularCore.mod.ContentChild
    ]
     with Instantiable2[
      (/* selector */ js.Function) | (/* selector */ ProviderToken[Any]) | (/* selector */ String), 
      /* opts */ Descendants, 
      typings.angularCore.mod.ContentChild
    ] {
  
  def apply(selector: String): Any = js.native
  def apply(selector: String, opts: Descendants): Any = js.native
  def apply(selector: js.Function): Any = js.native
  def apply(selector: js.Function, opts: Descendants): Any = js.native
  /**
    * @description
    * Property decorator that configures a content query.
    *
    * Use to get the first element or the directive matching the selector from the content DOM.
    * If the content DOM changes, and a new child matches the selector,
    * the property will be updated.
    *
    * Content queries are set before the `ngAfterContentInit` callback is called.
    *
    * Does not retrieve elements or directives that are in other components' templates,
    * since a component's template is always a black box to its ancestors.
    *
    * **Metadata Properties**:
    *
    * * **selector** - The directive type or the name used for querying.
    * * **descendants** - If `true` (default) include all descendants of the element. If `false` then
    * only query direct children of the element.
    * * **read** - Used to read a different token from the queried element.
    * * **static** - True to resolve query results before change detection runs,
    * false to resolve after change detection. Defaults to false.
    *
    * The following selectors are supported.
    *   * Any class with the `@Component` or `@Directive` decorator
    *   * A template reference variable as a string (e.g. query `<my-component #cmp></my-component>`
    * with `@ContentChild('cmp')`)
    *   * Any provider defined in the child component tree of the current component (e.g.
    * `@ContentChild(SomeService) someService: SomeService`)
    *   * Any provider defined through a string token (e.g. `@ContentChild('someToken') someTokenVal:
    * any`)
    *   * A `TemplateRef` (e.g. query `<ng-template></ng-template>` with `@ContentChild(TemplateRef)
    * template;`)
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
    * {@example core/di/ts/contentChild/content_child_howto.ts region='HowTo'}
    *
    * ### Example
    *
    * {@example core/di/ts/contentChild/content_child_example.ts region='Component'}
    *
    * @Annotation
    */
  def apply(selector: ProviderToken[Any]): Any = js.native
  def apply(selector: ProviderToken[Any], opts: Descendants): Any = js.native
}
