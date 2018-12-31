package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Directives[T] extends js.Object {
  /**
    * Static attributes to set on host element.
    *
    * Even indices: attribute name
    * Odd indices: attribute value
    */
  var attributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The strategy that the default change detector uses to detect changes.
    * When set, takes effect the next time change detection is triggered.
    */
  var changeDetection: js.UndefOr[
    atAngularCoreLib.srcChangeUnderscoreDetectionConstantsMod.ChangeDetectionStrategy
  ] = js.undefined
  /**
    * The number of nodes, local refs, and pipes in this component template.
    *
    * Used to calculate the length of this component's LViewData array, so we
    * can pre-fill the array and set the binding start index.
    */
  var consts: scala.Double
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[js.Function1[/* dirIndex */ scala.Double, scala.Unit]] = js.undefined
  /** Refreshes content queries associated with directives in a given view */
  var contentQueriesRefresh: js.UndefOr[
    js.Function2[/* directiveIndex */ scala.Double, /* queryIndex */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
    * Defines arbitrary developer-defined data to be stored on a renderer instance.
    * This is useful for renderers that delegate to other renderers.
    *
    * see: animation
    */
  var data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * Registry of directives and components that may be found in this component's view.
    *
    * The property is either an array of `DirectiveDef`s or a function which returns the array of
    * `DirectiveDef`s. The function is necessary to be able to support forward declarations.
    */
  var directives: js.UndefOr[
    atAngularCoreLib.srcRender3InterfacesDefinitionMod.DirectiveTypesOrFactory | scala.Null
  ] = js.undefined
  /**
    * Defines template and style encapsulation options available for Component's {@link Component}.
    */
  var encapsulation: js.UndefOr[atAngularCoreLib.srcMetadataViewMod.ViewEncapsulation] = js.undefined
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
    * See: {@link NgOnChangesFeature}, {@link ProvidersFeature}
    */
  var features: js.UndefOr[js.Array[atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentDefFeature]] = js.undefined
  /**
    * Function executed by the parent template to allow child directive to apply host bindings.
    */
  var hostBindings: js.UndefOr[
    js.Function2[/* directiveIndex */ scala.Double, /* elementIndex */ scala.Double, scala.Unit]
  ] = js.undefined
  /**
    * The number of host bindings (including pure fn bindings) in this component.
    *
    * Used to calculate the length of the LViewData array for the *parent* component
    * of this component.
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
  var inputs: js.UndefOr[atAngularCoreLib.atAngularCoreLibStrings.Anon_Directives with js.Any] = js.undefined
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
  var outputs: js.UndefOr[atAngularCoreLib.atAngularCoreLibStrings.Anon_Directives with js.Any] = js.undefined
  /**
    * Registry of pipes that may be found in this component's view.
    *
    * The property is either an array of `PipeDefs`s or a function which returns the array of
    * `PipeDefs`s. The function is necessary to be able to support forward declarations.
    */
  var pipes: js.UndefOr[
    atAngularCoreLib.srcRender3InterfacesDefinitionMod.PipeTypesOrFactory | scala.Null
  ] = js.undefined
  /** The selectors that will be used to match nodes to this component. */
  var selectors: atAngularCoreLib.srcRender3InterfacesProjectionMod.CssSelectorList
  /**
    * A set of styles that the component needs to be present for component to render correctly.
    */
  var styles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Template function use for rendering DOM.
    *
    * This function has following structure.
    *
    * ```
    * function Template<T>(ctx:T, creationMode: boolean) {
    *   if (creationMode) {
    *     // Contains creation mode instructions.
    *   }
    *   // Contains binding update instructions
    * }
    * ```
    *
    * Common instructions are:
    * Creation mode instructions:
    *  - `elementStart`, `elementEnd`
    *  - `text`
    *  - `container`
    *  - `listener`
    *
    * Binding update instructions:
    * - `bind`
    * - `elementAttribute`
    * - `elementProperty`
    * - `elementClass`
    * - `elementStyle`
    *
    */
  var template: atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentTemplate[T]
  /**
    * Directive type, needed to configure the injector.
    */
  var `type`: atAngularCoreLib.srcTypeMod.Type[T]
  /**
    * The number of bindings in this component template (including pure fn bindings).
    *
    * Used to calculate the length of this component's LViewData array, so we
    * can pre-fill the array and set the host binding start index.
    */
  var vars: scala.Double
  /**
    * Additional set of instructions specific to view query processing. This could be seen as a
    * set of instruction to be inserted into the template function.
    *
    * Query-related instructions need to be pulled out to a specific function as a timing of
    * execution is different as compared to all other instructions (after change detection hooks but
    * before view hooks).
    */
  var viewQuery: js.UndefOr[
    atAngularCoreLib.srcRender3InterfacesDefinitionMod.ComponentQuery[T] | scala.Null
  ] = js.undefined
}

