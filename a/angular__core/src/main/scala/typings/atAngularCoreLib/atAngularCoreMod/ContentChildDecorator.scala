package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentChildDecorator
  extends org.scalablytyped.runtime.Instantiable2[
      (/* selector */ js.Function) | (/* selector */ java.lang.String) | (/* selector */ Type[js.Any]), 
      /* opts */ atAngularCoreLib.Anon_Read, 
      ContentChild
    ] {
  /**
    * Configures a content query.
    *
    * You can use ContentChild to get the first element or the directive matching the selector from
    * the content DOM. If the content DOM changes, and a new child matches the selector,
    * the property will be updated.
    *
    * Content queries are set before the `ngAfterContentInit` callback is called.
    *
    * **Metadata Properties**:
    *
    * * **selector** - the directive type or the name used for querying.
    * * **read** - read a different token from the queried element.
    * * **static** - whether or not to resolve query results before change detection runs (i.e.
    * return static results only). If this option is not provided, the compiler will fall back
    * to its default behavior, which is to use query results to determine the timing of query
    * resolution. If any query results are inside a nested view (e.g. *ngIf), the query will be
    * resolved after change detection runs. Otherwise, it will be resolved before change detection
    * runs.
    *
    * @usageNotes
    * ### Example
    *
    * {@example core/di/ts/contentChild/content_child_howto.ts region='HowTo'}
    *
    * ### Example
    *
    * {@example core/di/ts/contentChild/content_child_example.ts region='Component'}
    *
    * @Annotation
    */
  def apply(selector: Type[_], opts: atAngularCoreLib.Anon_Read): js.Any = js.native
  def apply(selector: java.lang.String, opts: atAngularCoreLib.Anon_Read): js.Any = js.native
  def apply(selector: js.Function, opts: atAngularCoreLib.Anon_Read): js.Any = js.native
}

