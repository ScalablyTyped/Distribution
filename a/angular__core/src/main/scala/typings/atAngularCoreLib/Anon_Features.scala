package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Features[T] extends js.Object {
  /**
    * Static attributes to set on host element.
    *
    * Even indices: attribute name
    * Odd indices: attribute value
    */
  var attributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[js.Function1[/* directiveIndex */ scala.Double, scala.Unit]] = js.undefined
  /** Refreshes content queries associated with directives in a given view */
  var contentQueriesRefresh: js.UndefOr[
    js.Function2[/* directiveIndex */ scala.Double, /* queryIndex */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
    * Defines the name that can be used in the template to assign this directive to a variable.
    *
    * See: {@link Directive.exportAs}
    */
  var exportAs: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Factory method used to create an instance of directive.
    */
  var factory: js.Function1[/* t */ atAngularCoreLib.srcTypeMod.Type[T] | scala.Null, T]
  /**
    * A list of optional features to apply.
    *
    * See: {@link NgOnChangesFeature}, {@link ProvidersFeature}, {@link InheritDefinitionFeature}
    */
  var features: js.UndefOr[js.Array[atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveDefFeature]] = js.undefined
  /**
    * Function executed by the parent template to allow child directive to apply host bindings.
    */
  var hostBindings: js.UndefOr[
    js.Function2[/* directiveIndex */ scala.Double, /* elementIndex */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
    * The number of host bindings (including pure fn bindings) in this directive.
    *
    * Used to calculate the length of the LViewData array for the *parent* component
    * of this directive.
    */
  var hostVars: js.UndefOr[scala.Double] = js.undefined
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
  var inputs: js.UndefOr[atAngularCoreLib.atAngularCoreLibStrings.Anon_Features with js.Any] = js.undefined
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
  var outputs: js.UndefOr[atAngularCoreLib.atAngularCoreLibStrings.Anon_Features with js.Any] = js.undefined
  /** The selectors that will be used to match nodes to this directive. */
  var selectors: js.Array[
    js.Array[
      java.lang.String | atAngularCoreLib.srcRender3InterfacesProjectionMod.SelectorFlags
    ]
  ]
  /**
    * Directive type, needed to configure the injector.
    */
  var `type`: atAngularCoreLib.srcTypeMod.Type[T]
}

