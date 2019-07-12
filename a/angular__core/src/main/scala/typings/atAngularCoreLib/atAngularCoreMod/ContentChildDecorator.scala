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
    * Parameter decorator that configures a content query.
    *
    * Use to get the first element or the directive matching the selector from the content DOM.
    * If the content DOM changes, and a new child matches the selector,
    * the property will be updated.
    *
    * Content queries are set before the `ngAfterContentInit` callback is called.
    *
    * **Metadata Properties**:
    *
    * * **selector** - The directive type or the name used for querying.
    * * **read** - True to read a different token from the queried element.
    * * **static** - True to resolve query results before change detection runs,
    * false to resolve after change detection.
    *
    * When `static` is not provided, uses the query results to determine the timing of query
    * resolution. If any query results are inside a nested view (such as `*ngIf`), the query is
    * resolved after change detection runs. Otherwise, it is resolved before change detection
    * runs.
    *
    * @usageNotes
    *
    * {@example core/di/ts/contentChild/content_child_howto.ts region='HowTo'
    * linenums="false"}
    *
    * ### Example
    *
    * {@example core/di/ts/contentChild/content_child_example.ts region='Component'
    * linenums="false"}
    *
    * @Annotation
    */
  def apply(selector: Type[_], opts: atAngularCoreLib.Anon_Read): js.Any = js.native
  def apply(selector: java.lang.String, opts: atAngularCoreLib.Anon_Read): js.Any = js.native
  def apply(selector: js.Function, opts: atAngularCoreLib.Anon_Read): js.Any = js.native
}

