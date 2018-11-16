package typings
package atAngularCoreLib.srcMetadataDiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentChildrenDecorator
  extends ScalablyTyped.runtime.Instantiable1[
      (/* selector */ atAngularCoreLib.srcTypeMod.Type[js.Any]) | (/* selector */ js.Function) | (/* selector */ java.lang.String), 
      Query
    ]
     with ScalablyTyped.runtime.Instantiable2[
      (/* selector */ atAngularCoreLib.srcTypeMod.Type[js.Any]) | (/* selector */ js.Function) | (/* selector */ java.lang.String), 
      /* opts */ atAngularCoreLib.Anon_Descendants, 
      Query
    ] {
  /**
       * Configures a content query.
       *
       * You can use ContentChildren to get the `QueryList` of elements or directives from the
       * content DOM. Any time a child element is added, removed, or moved, the query list will be
       * updated, and the changes observable of the query list will emit a new value.
       *
       * Content queries are set before the `ngAfterContentInit` callback is called.
       *
       * **Metadata Properties**:
       *
       * * **selector** - the directive type or the name used for querying.
       * * **descendants** - include only direct children or all descendants.
       * * **read** - read a different token from the queried elements.
       *
       * @usageNotes
       * ### Basic Example
       *
       * Here is a simple demonstration of how the `ContentChildren` decorator can be used.
       *
       * {@example core/di/ts/contentChildren/content_children_howto.ts region='HowTo'}
       *
       * ### Tab-pane Example
       *
       * Here is a slightly more realistic example that shows how `ContentChildren` decorators
       * can be used to implement a tab pane component.
       *
       * {@example core/di/ts/contentChildren/content_children_example.ts region='Component'}
       *
       * @Annotation
       */
  def apply(selector: atAngularCoreLib.srcTypeMod.Type[_]): js.Any = js.native
  /**
       * Configures a content query.
       *
       * You can use ContentChildren to get the `QueryList` of elements or directives from the
       * content DOM. Any time a child element is added, removed, or moved, the query list will be
       * updated, and the changes observable of the query list will emit a new value.
       *
       * Content queries are set before the `ngAfterContentInit` callback is called.
       *
       * **Metadata Properties**:
       *
       * * **selector** - the directive type or the name used for querying.
       * * **descendants** - include only direct children or all descendants.
       * * **read** - read a different token from the queried elements.
       *
       * @usageNotes
       * ### Basic Example
       *
       * Here is a simple demonstration of how the `ContentChildren` decorator can be used.
       *
       * {@example core/di/ts/contentChildren/content_children_howto.ts region='HowTo'}
       *
       * ### Tab-pane Example
       *
       * Here is a slightly more realistic example that shows how `ContentChildren` decorators
       * can be used to implement a tab pane component.
       *
       * {@example core/di/ts/contentChildren/content_children_example.ts region='Component'}
       *
       * @Annotation
       */
  def apply(selector: atAngularCoreLib.srcTypeMod.Type[_], opts: atAngularCoreLib.Anon_Descendants): js.Any = js.native
  /**
       * Configures a content query.
       *
       * You can use ContentChildren to get the `QueryList` of elements or directives from the
       * content DOM. Any time a child element is added, removed, or moved, the query list will be
       * updated, and the changes observable of the query list will emit a new value.
       *
       * Content queries are set before the `ngAfterContentInit` callback is called.
       *
       * **Metadata Properties**:
       *
       * * **selector** - the directive type or the name used for querying.
       * * **descendants** - include only direct children or all descendants.
       * * **read** - read a different token from the queried elements.
       *
       * @usageNotes
       * ### Basic Example
       *
       * Here is a simple demonstration of how the `ContentChildren` decorator can be used.
       *
       * {@example core/di/ts/contentChildren/content_children_howto.ts region='HowTo'}
       *
       * ### Tab-pane Example
       *
       * Here is a slightly more realistic example that shows how `ContentChildren` decorators
       * can be used to implement a tab pane component.
       *
       * {@example core/di/ts/contentChildren/content_children_example.ts region='Component'}
       *
       * @Annotation
       */
  def apply(selector: java.lang.String): js.Any = js.native
  /**
       * Configures a content query.
       *
       * You can use ContentChildren to get the `QueryList` of elements or directives from the
       * content DOM. Any time a child element is added, removed, or moved, the query list will be
       * updated, and the changes observable of the query list will emit a new value.
       *
       * Content queries are set before the `ngAfterContentInit` callback is called.
       *
       * **Metadata Properties**:
       *
       * * **selector** - the directive type or the name used for querying.
       * * **descendants** - include only direct children or all descendants.
       * * **read** - read a different token from the queried elements.
       *
       * @usageNotes
       * ### Basic Example
       *
       * Here is a simple demonstration of how the `ContentChildren` decorator can be used.
       *
       * {@example core/di/ts/contentChildren/content_children_howto.ts region='HowTo'}
       *
       * ### Tab-pane Example
       *
       * Here is a slightly more realistic example that shows how `ContentChildren` decorators
       * can be used to implement a tab pane component.
       *
       * {@example core/di/ts/contentChildren/content_children_example.ts region='Component'}
       *
       * @Annotation
       */
  def apply(selector: java.lang.String, opts: atAngularCoreLib.Anon_Descendants): js.Any = js.native
  /**
       * Configures a content query.
       *
       * You can use ContentChildren to get the `QueryList` of elements or directives from the
       * content DOM. Any time a child element is added, removed, or moved, the query list will be
       * updated, and the changes observable of the query list will emit a new value.
       *
       * Content queries are set before the `ngAfterContentInit` callback is called.
       *
       * **Metadata Properties**:
       *
       * * **selector** - the directive type or the name used for querying.
       * * **descendants** - include only direct children or all descendants.
       * * **read** - read a different token from the queried elements.
       *
       * @usageNotes
       * ### Basic Example
       *
       * Here is a simple demonstration of how the `ContentChildren` decorator can be used.
       *
       * {@example core/di/ts/contentChildren/content_children_howto.ts region='HowTo'}
       *
       * ### Tab-pane Example
       *
       * Here is a slightly more realistic example that shows how `ContentChildren` decorators
       * can be used to implement a tab pane component.
       *
       * {@example core/di/ts/contentChildren/content_children_example.ts region='Component'}
       *
       * @Annotation
       */
  def apply(selector: js.Function): js.Any = js.native
  /**
       * Configures a content query.
       *
       * You can use ContentChildren to get the `QueryList` of elements or directives from the
       * content DOM. Any time a child element is added, removed, or moved, the query list will be
       * updated, and the changes observable of the query list will emit a new value.
       *
       * Content queries are set before the `ngAfterContentInit` callback is called.
       *
       * **Metadata Properties**:
       *
       * * **selector** - the directive type or the name used for querying.
       * * **descendants** - include only direct children or all descendants.
       * * **read** - read a different token from the queried elements.
       *
       * @usageNotes
       * ### Basic Example
       *
       * Here is a simple demonstration of how the `ContentChildren` decorator can be used.
       *
       * {@example core/di/ts/contentChildren/content_children_howto.ts region='HowTo'}
       *
       * ### Tab-pane Example
       *
       * Here is a slightly more realistic example that shows how `ContentChildren` decorators
       * can be used to implement a tab pane component.
       *
       * {@example core/di/ts/contentChildren/content_children_example.ts region='Component'}
       *
       * @Annotation
       */
  def apply(selector: js.Function, opts: atAngularCoreLib.Anon_Descendants): js.Any = js.native
}

