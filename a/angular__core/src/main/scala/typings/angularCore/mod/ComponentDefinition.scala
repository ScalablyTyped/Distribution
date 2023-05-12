package typings.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<@angular/core.@angular/core.DirectiveDefinition<T>, 'features'> */
trait ComponentDefinition[T] extends StObject {
  
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
  
  var exportAs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A list of optional features to apply.
    *
    * See: {@link NgOnChangesFeature}, {@link ProvidersFeature}
    */
  var features: js.UndefOr[js.Array[ComponentDefFeature]] = js.undefined
  
  var hostAttrs: js.UndefOr[TAttributes] = js.undefined
  
  var hostBindings: js.UndefOr[HostBindingsFunction[T]] = js.undefined
  
  var hostVars: js.UndefOr[Double] = js.undefined
  
  var inputs: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? string | [string, string]} */ js.Any
  ] = js.undefined
  
  /**
    * An array of `ngContent[selector]` values that were found in the template.
    */
  var ngContentSelectors: js.UndefOr[js.Array[String]] = js.undefined
  
  var outputs: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof T ]:? string} */ js.Any
  ] = js.undefined
  
  /**
    * The set of schemas that declare elements to be allowed in the component's template.
    */
  var schemas: js.UndefOr[js.Array[SchemaMetadata] | Null] = js.undefined
  
  var selectors: js.UndefOr[ɵCssSelectorList] = js.undefined
  
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
  
  var `type`: Type[T]
  
  /**
    * The number of bindings in this component template (including pure fn bindings).
    *
    * Used to calculate the length of this component's LView array, so we
    * can pre-fill the array and set the host binding start index.
    */
  var vars: Double
  
  var viewQuery: js.UndefOr[ViewQueriesFunction[T] | Null] = js.undefined
}
object ComponentDefinition {
  
  inline def apply[T](decls: Double, template: (/* rf */ ɵRenderFlags, T) => Unit, `type`: Type[T], vars: Double): ComponentDefinition[T] = {
    val __obj = js.Dynamic.literal(decls = decls.asInstanceOf[js.Any], template = js.Any.fromFunction2(template), vars = vars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentDefinition[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentDefinition[?], T] (val x: Self & ComponentDefinition[T]) extends AnyVal {
    
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
