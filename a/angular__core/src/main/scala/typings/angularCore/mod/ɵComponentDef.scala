package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵComponentDef[T]
  extends StObject
     with ɵDirectiveDef[T] {
  
  /**
    * Used to store the result of `noSideEffects` function so that it is not removed by closure
    * compiler. The property should never be read.
    */
  @JSName("_")
  val _underscore: js.UndefOr[scala.Nothing] = js.native
  
  /** Constants associated with the component's view. */
  val consts: TConstantsOrFactory | Null = js.native
  
  /**
    * Defines arbitrary developer-defined data to be stored on a renderer instance.
    * This is useful for renderers that delegate to other renderers.
    */
  val data: StringDictionary[js.Any] = js.native
  
  /**
    * The number of nodes, local refs, and pipes in this component template.
    *
    * Used to calculate the length of the component's LView array, so we
    * can pre-fill the array and set the binding start index.
    */
  val decls: Double = js.native
  
  /**
    * Registry of directives and components that may be found in this view.
    *
    * The property is either an array of `DirectiveDef`s or a function which returns the array of
    * `DirectiveDef`s. The function is necessary to be able to support forward declarations.
    */
  var directiveDefs: DirectiveDefListOrFactory | Null = js.native
  
  /**
    * The view encapsulation type, which determines how styles are applied to
    * DOM elements. One of
    * - `Emulated` (default): Emulate native scoping of styles.
    * - `Native`: Use the native encapsulation mechanism of the renderer.
    * - `ShadowDom`: Use modern [ShadowDOM](https://w3c.github.io/webcomponents/spec/shadow/) and
    *   create a ShadowRoot for component's host element.
    * - `None`: Do not provide any template or style encapsulation.
    */
  val encapsulation: ViewEncapsulation = js.native
  
  /**
    * Runtime unique component ID.
    */
  val id: String = js.native
  
  /**
    * An array of `ngContent[selector]` values that were found in the template.
    */
  val ngContentSelectors: js.UndefOr[js.Array[String]] = js.native
  
  /** Whether or not this component's ChangeDetectionStrategy is OnPush */
  val onPush: Boolean = js.native
  
  /**
    * Registry of pipes that may be found in this view.
    *
    * The property is either an array of `PipeDefs`s or a function which returns the array of
    * `PipeDefs`s. The function is necessary to be able to support forward declarations.
    */
  var pipeDefs: PipeDefListOrFactory | Null = js.native
  
  /**
    * The set of schemas that declare elements to be allowed in the component's template.
    */
  var schemas: js.Array[SchemaMetadata] | Null = js.native
  
  /**
    * A set of styles that the component needs to be present for component to render correctly.
    */
  val styles: js.Array[String] = js.native
  
  /**
    * Ivy runtime uses this place to store the computed tView for the component. This gets filled on
    * the first run of component.
    */
  var tView: TView | Null = js.native
  
  /**
    * The View template of the component.
    */
  def template[U /* <: T */](rf: ɵRenderFlags, ctx: T | U): Unit = js.native
  
  /**
    * The number of bindings in this component template (including pure fn bindings).
    *
    * Used to calculate the length of the component's LView array, so we
    * can pre-fill the array and set the host binding start index.
    */
  val vars: Double = js.native
}
