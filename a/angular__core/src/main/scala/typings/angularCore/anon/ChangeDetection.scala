package typings.angularCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ChangeDetectionStrategy
import typings.angularCore.mod.ComponentDefFeature
import typings.angularCore.mod.ComponentTemplate
import typings.angularCore.mod.ContentQueriesFunction
import typings.angularCore.mod.CssSelector
import typings.angularCore.mod.DependencyTypeList
import typings.angularCore.mod.HostBindingsFunction
import typings.angularCore.mod.PipeType
import typings.angularCore.mod.SchemaMetadata
import typings.angularCore.mod.TAttributes
import typings.angularCore.mod.TConstants
import typings.angularCore.mod.TConstantsOrFactory
import typings.angularCore.mod.Type
import typings.angularCore.mod.TypeOrFactory
import typings.angularCore.mod.ViewEncapsulation
import typings.angularCore.mod.ViewQueriesFunction
import typings.angularCore.mod.ɵAttributeMarker
import typings.angularCore.mod.ɵComponentType
import typings.angularCore.mod.ɵCssSelectorList
import typings.angularCore.mod.ɵDirectiveType
import typings.angularCore.mod.ɵRenderFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeDetection[T] extends StObject {
  
  /**
    * The strategy that the default change detector uses to detect changes.
    * When set, takes effect the next time change detection is triggered.
    */
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  
  /**
    * Constants for the nodes in the component's view.
    * Includes attribute arrays, local definition arrays etc.
    */
  var consts: js.UndefOr[TConstantsOrFactory] = js.undefined
  
  /**
    * Function to create instances of content queries associated with a given directive.
    */
  var contentQueries: js.UndefOr[ContentQueriesFunction[T]] = js.undefined
  
  /**
    * Defines arbitrary developer-defined data to be stored on a renderer instance.
    * This is useful for renderers that delegate to other renderers.
    *
    * see: animation
    */
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * The number of nodes, local refs, and pipes in this component template.
    *
    * Used to calculate the length of this component's LView array, so we
    * can pre-fill the array and set the binding start index.
    */
  var decls: Double
  
  /**
    * Registry of directives, components, and pipes that may be found in this component's view.
    *
    * This property is either an array of types or a function that returns the array of types. This
    * function may be necessary to support forward declarations.
    */
  var dependencies: js.UndefOr[TypeOrFactory[DependencyTypeList]] = js.undefined
  
  /**
    * Defines template and style encapsulation options available for Component's {@link Component}.
    */
  var encapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  
  /**
    * Defines the name that can be used in the template to assign this directive to a variable.
    *
    * See: {@link Directive.exportAs}
    */
  var exportAs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of optional features to apply.
    *
    * See: {@link NgOnChangesFeature}, {@link ProvidersFeature}
    */
  var features: js.UndefOr[js.Array[ComponentDefFeature]] = js.undefined
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? string | [string, string]} */ js.Any
  ] = js.undefined
  
  /**
    * An array of `ngContent[selector]` values that were found in the template.
    */
  var ngContentSelectors: js.UndefOr[js.Array[String]] = js.undefined
  
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
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? string} */ js.Any
  ] = js.undefined
  
  /**
    * The set of schemas that declare elements to be allowed in the component's template.
    */
  var schemas: js.UndefOr[js.Array[SchemaMetadata] | Null] = js.undefined
  
  /** The selectors that will be used to match nodes to this component. */
  var selectors: js.UndefOr[ɵCssSelectorList] = js.undefined
  
  /**
    * Whether this directive/component is standalone.
    */
  var standalone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A set of styles that the component needs to be present for component to render correctly.
    */
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  
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
  def template[U /* <: T */](rf: ɵRenderFlags, ctx: T | U): Unit
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
  var template_Original: ComponentTemplate[T]
  
  /**
    * Directive type, needed to configure the injector.
    */
  var `type`: Type[T]
  
  /**
    * The number of bindings in this component template (including pure fn bindings).
    *
    * Used to calculate the length of this component's LView array, so we
    * can pre-fill the array and set the host binding start index.
    */
  var vars: Double
  
  /**
    * Additional set of instructions specific to view query processing. This could be seen as a
    * set of instruction to be inserted into the template function.
    *
    * Query-related instructions need to be pulled out to a specific function as a timing of
    * execution is different as compared to all other instructions (after change detection hooks but
    * before view hooks).
    */
  var viewQuery: js.UndefOr[ViewQueriesFunction[T] | Null] = js.undefined
}
object ChangeDetection {
  
  inline def apply[T](decls: Double, template: (/* rf */ ɵRenderFlags, T) => Unit, `type`: Type[T], vars: Double): ChangeDetection[T] = {
    val __obj = js.Dynamic.literal(decls = decls.asInstanceOf[js.Any], template = js.Any.fromFunction2(template), vars = vars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeDetection[T]]
  }
  
  extension [Self <: ChangeDetection[?], T](x: Self & ChangeDetection[T]) {
    
    inline def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    inline def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
    
    inline def setConsts(value: TConstantsOrFactory): Self = StObject.set(x, "consts", value.asInstanceOf[js.Any])
    
    inline def setConstsFunction0(value: () => TConstants): Self = StObject.set(x, "consts", js.Any.fromFunction0(value))
    
    inline def setConstsUndefined: Self = StObject.set(x, "consts", js.undefined)
    
    inline def setConstsVarargs(value: (TAttributes | String)*): Self = StObject.set(x, "consts", js.Array(value*))
    
    inline def setContentQueries(value: (/* rf */ ɵRenderFlags, T, /* directiveIndex */ Double) => Unit): Self = StObject.set(x, "contentQueries", js.Any.fromFunction3(value))
    
    inline def setContentQueriesUndefined: Self = StObject.set(x, "contentQueries", js.undefined)
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDecls(value: Double): Self = StObject.set(x, "decls", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: TypeOrFactory[DependencyTypeList]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesFunction0(value: () => DependencyTypeList): Self = StObject.set(x, "dependencies", js.Any.fromFunction0(value))
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: (ɵDirectiveType[Any] | ɵComponentType[Any] | PipeType[Any] | Type[Any])*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setFeatures(value: js.Array[ComponentDefFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: ComponentDefFeature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setHostAttrs(value: TAttributes): Self = StObject.set(x, "hostAttrs", value.asInstanceOf[js.Any])
    
    inline def setHostAttrsUndefined: Self = StObject.set(x, "hostAttrs", js.undefined)
    
    inline def setHostAttrsVarargs(value: (String | ɵAttributeMarker | CssSelector)*): Self = StObject.set(x, "hostAttrs", js.Array(value*))
    
    inline def setHostBindings(value: (/* rf */ ɵRenderFlags, T) => Unit): Self = StObject.set(x, "hostBindings", js.Any.fromFunction2(value))
    
    inline def setHostBindingsUndefined: Self = StObject.set(x, "hostBindings", js.undefined)
    
    inline def setHostVars(value: Double): Self = StObject.set(x, "hostVars", value.asInstanceOf[js.Any])
    
    inline def setHostVarsUndefined: Self = StObject.set(x, "hostVars", js.undefined)
    
    inline def setInputs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? string | [string, string]} */ js.Any
    ): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setNgContentSelectors(value: js.Array[String]): Self = StObject.set(x, "ngContentSelectors", value.asInstanceOf[js.Any])
    
    inline def setNgContentSelectorsUndefined: Self = StObject.set(x, "ngContentSelectors", js.undefined)
    
    inline def setNgContentSelectorsVarargs(value: String*): Self = StObject.set(x, "ngContentSelectors", js.Array(value*))
    
    inline def setOutputs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? string} */ js.Any
    ): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setSelectors(value: ɵCssSelectorList): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsUndefined: Self = StObject.set(x, "selectors", js.undefined)
    
    inline def setSelectorsVarargs(value: CssSelector*): Self = StObject.set(x, "selectors", js.Array(value*))
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTemplate(value: (/* rf */ ɵRenderFlags, T) => Unit): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setType(value: Type[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVars(value: Double): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    inline def setViewQuery(value: (/* rf */ ɵRenderFlags, T) => Unit): Self = StObject.set(x, "viewQuery", js.Any.fromFunction2(value))
    
    inline def setViewQueryNull: Self = StObject.set(x, "viewQuery", null)
    
    inline def setViewQueryUndefined: Self = StObject.set(x, "viewQuery", js.undefined)
  }
}
