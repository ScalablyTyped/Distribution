package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AttributesContentQueries[T] extends js.Object {
  /**
    * Static attributes to set on host element.
    *
    * Even indices: attribute name
    * Odd indices: attribute value
    */
  var attributes: js.UndefOr[js.Array[java.lang.String]] = js.native
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[js.Function1[/* directiveIndex */ scala.Double, scala.Unit]] = js.native
  /** Refreshes content queries associated with directives in a given view */
  var contentQueriesRefresh: js.UndefOr[
    js.Function2[/* directiveIndex */ scala.Double, /* queryIndex */ scala.Double, scala.Unit]
  ] = js.native
  /**
    * Defines the name that can be used in the template to assign this directive to a variable.
    *
    * See: {@link Directive.exportAs}
    */
  var exportAs: js.UndefOr[java.lang.String] = js.native
  /**
    * A list of optional features to apply.
    *
    * See: {@link NgOnChangesFeature}, {@link ProvidersFeature}, {@link InheritDefinitionFeature}
    */
  var features: js.UndefOr[js.Array[atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefFeature]] = js.native
  /**
    * Function executed by the parent template to allow child directive to apply host bindings.
    */
  var hostBindings: js.UndefOr[atAngularCoreLib.srcRender3InterfacesDefinitionMod.HostBindingsFunction[T]] = js.native
  /**
    * A map of input names.
    *
    * The format is in: `{[actualPropertyName: string]:(string|[string, string])}`.
    *
    * Given:
    * ```
    * class MyComponent {
    *   @Input()
    *   publicInput1: string;
    *
    *   @Input('publicInput2')
    *   declaredInput2: string;
    * }
    * ```
    *
    * is described as:
    * ```
    * {
    *   publicInput1: 'publicInput1',
    *   declaredInput2: ['declaredInput2', 'publicInput2'],
    * }
    * ```
    *
    * Which the minifier may translate to:
    * ```
    * {
    *   minifiedPublicInput1: 'publicInput1',
    *   minifiedDeclaredInput2: [ 'publicInput2', 'declaredInput2'],
    * }
    * ```
    *
    * This allows the render to re-construct the minified, public, and declared names
    * of properties.
    *
    * NOTE:
    *  - Because declared and public name are usually same we only generate the array
    *    `['declared', 'public']` format when they differ.
    *  - The reason why this API and `outputs` API is not the same is that `NgOnChanges` has
    *    inconsistent behavior in that it uses declared names rather than minified or public. For
    *    this reason `NgOnChanges` will be deprecated and removed in future version and this
    *    API will be simplified to be consistent with `output`.
    */
  var inputs: js.UndefOr[
    atAngularCoreLib.atAngularCoreLibStrings.Anon_AttributesContentQueries with js.Any
  ] = js.native
  /**
    * A map of output names.
    *
    * The format is in: `{[actualPropertyName: string]:string}`.
    *
    * Which the minifier may translate to: `{[minifiedPropertyName: string]:string}`.
    *
    * This allows the render to re-construct the minified and non-minified names
    * of properties.
    */
  var outputs: js.UndefOr[
    atAngularCoreLib.atAngularCoreLibStrings.Anon_AttributesContentQueries with js.Any
  ] = js.native
  /** The selectors that will be used to match nodes to this directive. */
  var selectors: js.Array[
    js.Array[
      java.lang.String | atAngularCoreLib.srcRender3InterfacesProjectionMod.SelectorFlags
    ]
  ] = js.native
  /**
    * Directive type, needed to configure the injector.
    */
  var `type`: atAngularCoreLib.srcTypeMod.Type[T] = js.native
  def factory(): T = js.native
  /**
    * Factory method used to create an instance of directive.
    */
  def factory(t: atAngularCoreLib.srcTypeMod.Type[T]): T = js.native
}

