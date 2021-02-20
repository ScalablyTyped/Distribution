package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.angularCore.anon.Read
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentChildDecorator
  extends Instantiable1[
      (/* selector */ js.Function) | (/* selector */ InjectionToken[js.Any]) | (/* selector */ String) | (/* selector */ typings.angularCore.mod.Type[js.Any]), 
      typings.angularCore.mod.ContentChild
    ]
     with Instantiable2[
      (/* selector */ js.Function) | (/* selector */ InjectionToken[js.Any]) | (/* selector */ String) | (/* selector */ typings.angularCore.mod.Type[js.Any]), 
      /* opts */ Read, 
      typings.angularCore.mod.ContentChild
    ] {
  
  def apply(selector: String): js.Any = js.native
  def apply(selector: String, opts: Read): js.Any = js.native
  def apply(selector: js.Function): js.Any = js.native
  def apply(selector: js.Function, opts: Read): js.Any = js.native
  def apply(selector: InjectionToken[_]): js.Any = js.native
  def apply(selector: InjectionToken[_], opts: Read): js.Any = js.native
  /**
    * Parameter decorator that configures a content query.
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
    * * **read** - Used to read a different token from the queried element.
    * * **static** - True to resolve query results before change detection runs,
    * false to resolve after change detection. Defaults to false.
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
  def apply(selector: typings.angularCore.mod.Type[_]): js.Any = js.native
  def apply(selector: typings.angularCore.mod.Type[_], opts: Read): js.Any = js.native
}
