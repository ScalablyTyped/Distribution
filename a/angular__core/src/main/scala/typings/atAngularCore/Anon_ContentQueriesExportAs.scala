package typings.atAngularCore

import typings.atAngularCore.atAngularCoreMod.ContentQueriesFunction
import typings.atAngularCore.atAngularCoreMod.DirectiveDefFeature
import typings.atAngularCore.atAngularCoreMod.FactoryFn
import typings.atAngularCore.atAngularCoreMod.HostBindingsFunction
import typings.atAngularCore.atAngularCoreMod.SelectorFlags
import typings.atAngularCore.atAngularCoreMod.Type
import typings.atAngularCore.atAngularCoreMod.ViewQueriesFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ContentQueriesExportAs[T] extends js.Object {
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[ContentQueriesFunction[T]] = js.native
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
    * See: {@link NgOnChangesFeature}, {@link ProvidersFeature}, {@link InheritDefinitionFeature}
    */
  var features: js.UndefOr[js.Array[DirectiveDefFeature]] = js.native
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
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string] | undefined}
    */ typings.atAngularCore.atAngularCoreStrings.Anon_ContentQueriesExportAs with js.Any
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
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | undefined}
    */ typings.atAngularCore.atAngularCoreStrings.Anon_ContentQueriesExportAs with js.Any
  ] = js.native
  /** The selectors that will be used to match nodes to this directive. */
  var selectors: js.Array[js.Array[String | SelectorFlags]] = js.native
  /**
    * Directive type, needed to configure the injector.
    */
  var `type`: Type[T] = js.native
  /**
    * Additional set of instructions specific to view query processing. This could be seen as a
    * set of instructions to be inserted into the template function.
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
}

