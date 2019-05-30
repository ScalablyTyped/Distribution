package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewChildrenDecorator
  extends org.scalablytyped.runtime.Instantiable2[
      (/* selector */ js.Function) | (/* selector */ java.lang.String) | (/* selector */ Type[js.Any]), 
      /* opts */ atAngularCoreLib.Anon_ReadAny, 
      ViewChildren
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* selector */ js.Function) | (/* selector */ java.lang.String) | (/* selector */ Type[js.Any]), 
      ViewChildren
    ] {
  /**
    * Configures a view query.
    *
    * You can use ViewChildren to get the `QueryList` of elements or directives from the
    * view DOM. Any time a child element is added, removed, or moved, the query list will be updated,
    * and the changes observable of the query list will emit a new value.
    *
    * View queries are set before the `ngAfterViewInit` callback is called.
    *
    * **Metadata Properties**:
    *
    * * **selector** - the directive type or the name used for querying.
    * * **read** - read a different token from the queried elements.
    *
    * @usageNotes
    *
    * ### Example
    *
    * {@example core/di/ts/viewChildren/view_children_howto.ts region='HowTo'}
    *
    * ### Example
    *
    * {@example core/di/ts/viewChildren/view_children_example.ts region='Component'}
    *
    * @Annotation
    */
  def apply(selector: Type[_]): js.Any = js.native
  def apply(selector: Type[_], opts: atAngularCoreLib.Anon_ReadAny): js.Any = js.native
  def apply(selector: java.lang.String): js.Any = js.native
  def apply(selector: java.lang.String, opts: atAngularCoreLib.Anon_ReadAny): js.Any = js.native
  def apply(selector: js.Function): js.Any = js.native
  def apply(selector: js.Function, opts: atAngularCoreLib.Anon_ReadAny): js.Any = js.native
}

