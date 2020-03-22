package typings.angularCore

import typings.angularCore.mod.ContentQueriesFunction
import typings.angularCore.mod.DirectiveDefFeature
import typings.angularCore.mod.HostBindingsFunction
import typings.angularCore.mod.TAttributes
import typings.angularCore.mod.Type
import typings.angularCore.mod.ViewQueriesFunction
import typings.angularCore.mod.ɵCssSelectorList
import typings.angularCore.mod.ɵRenderFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentQueries[T] extends js.Object {
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[ContentQueriesFunction[T]] = js.undefined
  /**
    * Defines the name that can be used in the template to assign this directive to a variable.
    *
    * See: {@link Directive.exportAs}
    */
  var exportAs: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A list of optional features to apply.
    *
    * See: {@link NgOnChangesFeature}, {@link ProvidersFeature}, {@link InheritDefinitionFeature}
    */
  var features: js.UndefOr[js.Array[DirectiveDefFeature]] = js.undefined
  /**
    * Assign static attribute values to a host element.
    *
    * This property will assign static attribute values as well as class and style
    * values to a host element. Since attribute values can consist of different types of values, the
    * `hostAttrs` array must include the values in the following format:
    *
    * attrs = [
    *   // static attributes (like `title`, `name`, `id`...)
    *   attr1, value1, attr2, value,
    *
    *   // a single namespace value (like `x:id`)
    *   NAMESPACE_MARKER, namespaceUri1, name1, value1,
    *
    *   // another single namespace value (like `x:name`)
    *   NAMESPACE_MARKER, namespaceUri2, name2, value2,
    *
    *   // a series of CSS classes that will be applied to the element (no spaces)
    *   CLASSES_MARKER, class1, class2, class3,
    *
    *   // a series of CSS styles (property + value) that will be applied to the element
    *   STYLES_MARKER, prop1, value1, prop2, value2
    * ]
    *
    * All non-class and non-style attributes must be defined at the start of the list
    * first before all class and style values are set. When there is a change in value
    * type (like when classes and styles are introduced) a marker must be used to separate
    * the entries. The marker values themselves are set via entries found in the
    * [AttributeMarker] enum.
    */
  var hostAttrs: js.UndefOr[TAttributes] = js.undefined
  /**
    * Function executed by the parent template to allow child directive to apply host bindings.
    */
  var hostBindings: js.UndefOr[HostBindingsFunction[T]] = js.undefined
  /**
    * The number of bindings in this directive `hostBindings` (including pure fn bindings).
    *
    * Used to calculate the length of the component's LView array, so we
    * can pre-fill the array and set the host binding start index.
    */
  var hostVars: js.UndefOr[Double] = js.undefined
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
    */ typings.angularCore.angularCoreStrings.AnonContentQueries with js.Any
  ] = js.undefined
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
  {[ P_1 in keyof T ]:? string | undefined}
    */ typings.angularCore.angularCoreStrings.AnonContentQueries with js.Any
  ] = js.undefined
  /** The selectors that will be used to match nodes to this directive. */
  var selectors: js.UndefOr[ɵCssSelectorList] = js.undefined
  /**
    * Directive type, needed to configure the injector.
    */
  var `type`: Type[T]
  /**
    * Additional set of instructions specific to view query processing. This could be seen as a
    * set of instructions to be inserted into the template function.
    */
  var viewQuery: js.UndefOr[ViewQueriesFunction[T] | Null] = js.undefined
}

object AnonContentQueries {
  @scala.inline
  def apply[T](
    `type`: Type[T],
    contentQueries: (/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit = null,
    exportAs: js.Array[String] = null,
    features: js.Array[DirectiveDefFeature] = null,
    hostAttrs: TAttributes = null,
    hostBindings: (/* rf */ ɵRenderFlags, T) => Unit = null,
    hostVars: Int | Double = null,
    inputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? string | [string, string] | undefined}
    */ typings.angularCore.angularCoreStrings.AnonContentQueries with js.Any = null,
    outputs: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P_1 in keyof T ]:? string | undefined}
    */ typings.angularCore.angularCoreStrings.AnonContentQueries with js.Any = null,
    selectors: ɵCssSelectorList = null,
    viewQuery: (/* rf */ ɵRenderFlags, T) => Unit = null
  ): AnonContentQueries[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (contentQueries != null) __obj.updateDynamic("contentQueries")(js.Any.fromFunction3(contentQueries))
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (hostAttrs != null) __obj.updateDynamic("hostAttrs")(hostAttrs.asInstanceOf[js.Any])
    if (hostBindings != null) __obj.updateDynamic("hostBindings")(js.Any.fromFunction2(hostBindings))
    if (hostVars != null) __obj.updateDynamic("hostVars")(hostVars.asInstanceOf[js.Any])
    if (inputs != null) __obj.updateDynamic("inputs")(inputs.asInstanceOf[js.Any])
    if (outputs != null) __obj.updateDynamic("outputs")(outputs.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (viewQuery != null) __obj.updateDynamic("viewQuery")(js.Any.fromFunction2(viewQuery))
    __obj.asInstanceOf[AnonContentQueries[T]]
  }
}

