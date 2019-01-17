package typings
package atAngularCoreLib.srcMetadataDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewChildDecorator
  extends org.scalablytyped.runtime.Instantiable2[
      (/* selector */ js.Function) | (/* selector */ java.lang.String) | (/* selector */ atAngularCoreLib.srcTypeMod.Type[js.Any]), 
      /* opts */ atAngularCoreLib.Anon_Read, 
      ViewChild
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* selector */ js.Function) | (/* selector */ java.lang.String) | (/* selector */ atAngularCoreLib.srcTypeMod.Type[js.Any]), 
      ViewChild
    ] {
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
    * * **selector** - the directive type or the name used for querying.
    * * **read** - read a different token from the queried elements.
    *
    * Supported selectors include:
    *   * any class with the `@Component` or `@Directive` decorator
    *   * a template reference variable as a string (e.g. query `<my-component #cmp></my-component>`
    * with `@ViewChild('cmp')`)
    *   * any provider defined in the child component tree of the current component (e.g.
    * `@ViewChild(SomeService) someService: SomeService`)
    *   * any provider defined through a string token (e.g. `@ViewChild('someToken') someTokenVal:
    * any`)
    *   * a `TemplateRef` (e.g. query `<ng-template></ng-template>` with `@ViewChild(TemplateRef)
    * template;`)
    *
    * @usageNotes
    *
    * {@example core/di/ts/viewChild/view_child_example.ts region='Component'}
    *
    * ### Example
    *
    * {@example core/di/ts/viewChild/view_child_howto.ts region='HowTo'}
    *
    * ### Example
    *
    * {@example core/di/ts/viewChild/view_child_example.ts region='Component'}
    *
    * @Annotation
    */
  def apply(selector: atAngularCoreLib.srcTypeMod.Type[_]): js.Any = js.native
  def apply(selector: atAngularCoreLib.srcTypeMod.Type[_], opts: atAngularCoreLib.Anon_Read): js.Any = js.native
  def apply(selector: java.lang.String): js.Any = js.native
  def apply(selector: java.lang.String, opts: atAngularCoreLib.Anon_Read): js.Any = js.native
  def apply(selector: js.Function): js.Any = js.native
  def apply(selector: js.Function, opts: atAngularCoreLib.Anon_Read): js.Any = js.native
}

