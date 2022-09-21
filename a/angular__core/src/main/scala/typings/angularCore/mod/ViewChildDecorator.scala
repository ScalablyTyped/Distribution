package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.angularCore.anon.Read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewChildDecorator
  extends StObject
     with Instantiable1[
      (/* selector */ js.Function) | (/* selector */ ProviderToken[Any]) | (/* selector */ String), 
      typings.angularCore.mod.ViewChild
    ]
     with Instantiable2[
      (/* selector */ js.Function) | (/* selector */ ProviderToken[Any]) | (/* selector */ String), 
      /* opts */ Read, 
      typings.angularCore.mod.ViewChild
    ] {
  
  def apply(selector: String): Any = js.native
  def apply(selector: String, opts: Read): Any = js.native
  def apply(selector: js.Function): Any = js.native
  def apply(selector: js.Function, opts: Read): Any = js.native
  /**
    * @description
    * Property decorator that configures a view query.
    * The change detector looks for the first element or the directive matching the selector
    * in the view DOM. If the view DOM changes, and a new child matches the selector,
    * the property is updated.
    *
    * View queries are set before the `ngAfterViewInit` callback is called.
    *
    * **Metadata Properties**:
    *
    * * **selector** - The directive type or the name used for querying.
    * * **read** - Used to read a different token from the queried elements.
    * * **static** - True to resolve query results before change detection runs,
    * false to resolve after change detection. Defaults to false.
    *
    *
    * The following selectors are supported.
    *   * Any class with the `@Component` or `@Directive` decorator
    *   * A template reference variable as a string (e.g. query `<my-component #cmp></my-component>`
    * with `@ViewChild('cmp')`)
    *   * Any provider defined in the child component tree of the current component (e.g.
    * `@ViewChild(SomeService) someService: SomeService`)
    *   * Any provider defined through a string token (e.g. `@ViewChild('someToken') someTokenVal:
    * any`)
    *   * A `TemplateRef` (e.g. query `<ng-template></ng-template>` with `@ViewChild(TemplateRef)
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
    * {@example core/di/ts/viewChild/view_child_example.ts region='Component'}
    *
    * ### Example 2
    *
    * {@example core/di/ts/viewChild/view_child_howto.ts region='HowTo'}
    *
    * @Annotation
    */
  def apply(selector: ProviderToken[Any]): Any = js.native
  def apply(selector: ProviderToken[Any], opts: Read): Any = js.native
}
