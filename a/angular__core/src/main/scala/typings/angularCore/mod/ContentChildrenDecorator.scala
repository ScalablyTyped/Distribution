package typings.angularCore.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.angularCore.anon.Descendants
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentChildrenDecorator
  extends Instantiable1[
      (/* selector */ js.Function) | (/* selector */ InjectionToken[js.Any]) | (/* selector */ String) | (/* selector */ typings.angularCore.mod.Type[js.Any]), 
      Query
    ]
     with Instantiable2[
      (/* selector */ js.Function) | (/* selector */ InjectionToken[js.Any]) | (/* selector */ String) | (/* selector */ typings.angularCore.mod.Type[js.Any]), 
      /* opts */ Descendants, 
      Query
    ] {
  
  def apply(selector: String): js.Any = js.native
  def apply(selector: String, opts: Descendants): js.Any = js.native
  def apply(selector: js.Function): js.Any = js.native
  def apply(selector: js.Function, opts: Descendants): js.Any = js.native
  def apply(selector: InjectionToken[_]): js.Any = js.native
  def apply(selector: InjectionToken[_], opts: Descendants): js.Any = js.native
  /**
    * Parameter decorator that configures a content query.
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
    * * **descendants** - True to include all descendants, otherwise include only direct children.
    * * **read** - Used to read a different token from the queried elements.
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
  def apply(selector: typings.angularCore.mod.Type[_]): js.Any = js.native
  def apply(selector: typings.angularCore.mod.Type[_], opts: Descendants): js.Any = js.native
}
