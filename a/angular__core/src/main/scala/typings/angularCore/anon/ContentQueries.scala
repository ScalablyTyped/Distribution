package typings.angularCore.anon

import org.scalablytyped.runtime.TopLevel
import typings.angularCore.mod.ContentQueriesFunction
import typings.angularCore.mod.CssSelector
import typings.angularCore.mod.DirectiveDefFeature
import typings.angularCore.mod.HostBindingsFunction
import typings.angularCore.mod.TAttributes
import typings.angularCore.mod.Type
import typings.angularCore.mod.ViewQueriesFunction
import typings.angularCore.mod.ɵAttributeMarker
import typings.angularCore.mod.ɵCssSelectorList
import typings.angularCore.mod.ɵRenderFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentQueries[T] extends StObject {
  
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
    * A list of optional features to apply.
    *
    * See: {@link NgOnChangesFeature}, {@link ProvidersFeature}, {@link InheritDefinitionFeature}
    */
  var features: js.UndefOr[js.Array[DirectiveDefFeature]] = js.native
  
  /**
    * Assign static attribute values to a host element.
    *
    * This property will assign static attribute values as well as class and style
    * values to a host element. Since attribute values can consist of different types of values,
    * the `hostAttrs` array must include the values in the following format:
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
  var hostAttrs: js.UndefOr[TAttributes] = js.native
  
  /**
    * Function executed by the parent template to allow child directive to apply host bindings.
    */
  var hostBindings: js.UndefOr[HostBindingsFunction[T]] = js.native
  
  /**
    * The number of bindings in this directive `hostBindings` (including pure fn bindings).
    *
    * Used to calculate the length of the component's LView array, so we
    * can pre-fill the array and set the host binding start index.
    */
  var hostVars: js.UndefOr[Double] = js.native
  
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
    */ typings.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
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
  {[ P_1 in keyof T ]:? string | undefined}
    */ typings.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
  ] = js.native
  
  /** The selectors that will be used to match nodes to this directive. */
  var selectors: js.UndefOr[ɵCssSelectorList] = js.native
  
  /**
    * Directive type, needed to configure the injector.
    */
  var `type`: Type[T] = js.native
  
  /**
    * Additional set of instructions specific to view query processing. This could be seen as a
    * set of instructions to be inserted into the template function.
    */
  var viewQuery: js.UndefOr[ViewQueriesFunction[T] | Null] = js.native
}
object ContentQueries {
  
  @scala.inline
  def apply[T](`type`: Type[T]): ContentQueries[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentQueries[T]]
  }
  
  @scala.inline
  implicit class ContentQueriesMutableBuilder[Self <: ContentQueries[_], T] (val x: Self with ContentQueries[T]) extends AnyVal {
    
    @scala.inline
    def setContentQueries(value: (/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit): Self = StObject.set(x, "contentQueries", js.Any.fromFunction3(value))
    
    @scala.inline
    def setContentQueriesUndefined: Self = StObject.set(x, "contentQueries", js.undefined)
    
    @scala.inline
    def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    @scala.inline
    def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[DirectiveDefFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: DirectiveDefFeature*): Self = StObject.set(x, "features", js.Array(value :_*))
    
    @scala.inline
    def setHostAttrs(value: TAttributes): Self = StObject.set(x, "hostAttrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostAttrsUndefined: Self = StObject.set(x, "hostAttrs", js.undefined)
    
    @scala.inline
    def setHostAttrsVarargs(value: (String | ɵAttributeMarker | CssSelector)*): Self = StObject.set(x, "hostAttrs", js.Array(value :_*))
    
    @scala.inline
    def setHostBindings(value: (/* rf */ ɵRenderFlags, T) => Unit): Self = StObject.set(x, "hostBindings", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHostBindingsUndefined: Self = StObject.set(x, "hostBindings", js.undefined)
    
    @scala.inline
    def setHostVars(value: Double): Self = StObject.set(x, "hostVars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostVarsUndefined: Self = StObject.set(x, "hostVars", js.undefined)
    
    @scala.inline
    def setInputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in keyof T ]:? string | [string, string] | undefined}
      */ typings.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
    ): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setOutputs(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P_1 in keyof T ]:? string | undefined}
      */ typings.angularCore.angularCoreStrings.ContentQueries with TopLevel[js.Any]
    ): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    @scala.inline
    def setSelectors(value: ɵCssSelectorList): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    @scala.inline
    def setSelectorsVarargs(value: CssSelector*): Self = StObject.set(x, "selectors", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Type[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewQuery(value: (/* rf */ ɵRenderFlags, T) => Unit): Self = StObject.set(x, "viewQuery", js.Any.fromFunction2(value))
    
    @scala.inline
    def setViewQueryNull: Self = StObject.set(x, "viewQuery", null)
    
    @scala.inline
    def setViewQueryUndefined: Self = StObject.set(x, "viewQuery", js.undefined)
  }
}
