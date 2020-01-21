package typings.angularCore

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.angularCoreStrings.Anon_ChangeDetection
import typings.angularCore.mod.ChangeDetectionStrategy
import typings.angularCore.mod.ComponentDefFeature
import typings.angularCore.mod.ComponentTemplate
import typings.angularCore.mod.ContentQueriesFunction
import typings.angularCore.mod.DirectiveTypesOrFactory
import typings.angularCore.mod.FactoryFn
import typings.angularCore.mod.HostBindingsFunction
import typings.angularCore.mod.PipeTypesOrFactory
import typings.angularCore.mod.SchemaMetadata
import typings.angularCore.mod.Type
import typings.angularCore.mod.ViewEncapsulation
import typings.angularCore.mod.ViewQueriesFunction
import typings.angularCore.mod.ɵCssSelectorList
import typings.angularCore.mod.ɵRenderFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonChangeDetection[T] extends js.Object {
  /**
    * The strategy that the default change detector uses to detect changes.
    * When set, takes effect the next time change detection is triggered.
    */
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.native
  /**
    * The number of nodes, local refs, and pipes in this component template.
    *
    * Used to calculate the length of this component's LView array, so we
    * can pre-fill the array and set the binding start index.
    */
  var consts: Double = js.native
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[ContentQueriesFunction[T]] = js.native
  /**
    * Defines arbitrary developer-defined data to be stored on a renderer instance.
    * This is useful for renderers that delegate to other renderers.
    *
    * see: animation
    */
  var data: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Registry of directives and components that may be found in this component's view.
    *
    * The property is either an array of `DirectiveDef`s or a function which returns the array of
    * `DirectiveDef`s. The function is necessary to be able to support forward declarations.
    */
  var directives: js.UndefOr[DirectiveTypesOrFactory | Null] = js.native
  /**
    * Defines template and style encapsulation options available for Component's {@link Component}.
    */
  var encapsulation: js.UndefOr[ViewEncapsulation] = js.native
  /**
    * Defines the name that can be used in the template to assign this directive to a variable.
    *
    * See: {@link Directive.exportAs}
    */
  var exportAs: js.UndefOr[js.Array[String]] = js.native
  /**
    * Factory method used to create an instance of directive.
    */
  @JSName("factory")
  var factory_Original: FactoryFn[T] = js.native
  /**
    * A list of optional features to apply.
    *
    * See: {@link NgOnChangesFeature}, {@link ProvidersFeature}
    */
  var features: js.UndefOr[js.Array[ComponentDefFeature]] = js.native
  /**
    * Function executed by the parent template to allow child directive to apply host bindings.
    */
  var hostBindings: js.UndefOr[HostBindingsFunction[T]] = js.native
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
    *   declaredInput2: ['publicInput2', 'declaredInput2'],
    * }
    * ```
    *
    * Which the minifier may translate to:
    * ```
    * {
    *   minifiedPublicInput1: 'publicInput1',
    *   minifiedDeclaredInput2: ['publicInput2', 'declaredInput2'],
    * }
    * ```
    *
    * This allows the render to re-construct the minified, public, and declared names
    * of properties.
    *
    * NOTE:
    *  - Because declared and public name are usually same we only generate the array
    *    `['public', 'declared']` format when they differ.
    *  - The reason why this API and `outputs` API is not the same is that `NgOnChanges` has
    *    inconsistent behavior in that it uses declared names rather than minified or public. For
    *    this reason `NgOnChanges` will be deprecated and removed in future version and this
    *    API will be simplified to be consistent with `output`.
    */
  var inputs: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string]}
    */ Anon_ChangeDetection with js.Any
  ] = js.native
  /**
    * An array of `ngContent[selector]` values that were found in the template.
    */
  var ngContentSelectors: js.UndefOr[js.Array[String]] = js.native
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
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string}
    */ Anon_ChangeDetection with js.Any
  ] = js.native
  /**
    * Registry of pipes that may be found in this component's view.
    *
    * The property is either an array of `PipeDefs`s or a function which returns the array of
    * `PipeDefs`s. The function is necessary to be able to support forward declarations.
    */
  var pipes: js.UndefOr[PipeTypesOrFactory | Null] = js.native
  /**
    * The set of schemas that declare elements to be allowed in the component's template.
    */
  var schemas: js.UndefOr[js.Array[SchemaMetadata] | Null] = js.native
  /** The selectors that will be used to match nodes to this component. */
  var selectors: ɵCssSelectorList = js.native
  /**
    * A set of styles that the component needs to be present for component to render correctly.
    */
  var styles: js.UndefOr[js.Array[String]] = js.native
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
  @JSName("template")
  var template_Original: ComponentTemplate[T] = js.native
  /**
    * Directive type, needed to configure the injector.
    */
  var `type`: Type[T] = js.native
  /**
    * The number of bindings in this component template (including pure fn bindings).
    *
    * Used to calculate the length of this component's LView array, so we
    * can pre-fill the array and set the host binding start index.
    */
  var vars: Double = js.native
  /**
    * Additional set of instructions specific to view query processing. This could be seen as a
    * set of instruction to be inserted into the template function.
    *
    * Query-related instructions need to be pulled out to a specific function as a timing of
    * execution is different as compared to all other instructions (after change detection hooks but
    * before view hooks).
    */
  var viewQuery: js.UndefOr[ViewQueriesFunction[T] | Null] = js.native
  /**
    * If no constructor to instantiate is provided, an instance of type T itself is created.
    */
  /**
    * Factory method used to create an instance of directive.
    */
  def factory(): T = js.native
  /**
    * Subclasses without an explicit constructor call through to the factory of their base
    * definition, providing it with their own constructor to instantiate.
    */
  /**
    * Factory method used to create an instance of directive.
    */
  def factory[U /* <: T */](t: Type[U]): U = js.native
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
  def template[U /* <: T */](rf: ɵRenderFlags, ctx: T | U): Unit = js.native
}

