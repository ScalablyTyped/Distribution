package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Component
  extends StObject
     with Directive {
  
  /**
    * One or more animation `trigger()` calls, containing
    * [`state()`](api/animations/state) and `transition()` definitions.
    * See the [Animations guide](/guide/animations) and animations API documentation.
    *
    */
  var animations: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * The change-detection strategy to use for this component.
    *
    * When a component is instantiated, Angular creates a change detector,
    * which is responsible for propagating the component's bindings.
    * The strategy is one of:
    * - `ChangeDetectionStrategy#OnPush` sets the strategy to `CheckOnce` (on demand).
    * - `ChangeDetectionStrategy#Default` sets the strategy to `CheckAlways`.
    */
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.undefined
  
  /**
    * An encapsulation policy for the component's styling.
    * Possible values:
    * - `ViewEncapsulation.Emulated`: Apply modified component styles in order to emulate
    *                                 a native Shadow DOM CSS encapsulation behavior.
    * - `ViewEncapsulation.None`: Apply component styles globally without any sort of encapsulation.
    * - `ViewEncapsulation.ShadowDom`: Use the browser's native Shadow DOM API to encapsulate styles.
    *
    * If not supplied, the value is taken from the `CompilerOptions`
    * which defaults to `ViewEncapsulation.Emulated`.
    *
    * If the policy is `ViewEncapsulation.Emulated` and the component has no
    * {@link Component#styles styles} nor {@link Component#styleUrls styleUrls},
    * the policy is automatically switched to `ViewEncapsulation.None`.
    */
  var encapsulation: js.UndefOr[ViewEncapsulation] = js.undefined
  
  /**
    * A set of components that should be compiled along with
    * this component. For each component listed here,
    * Angular creates a {@link ComponentFactory} and stores it in the
    * {@link ComponentFactoryResolver}.
    * @deprecated Since 9.0.0. With Ivy, this property is no longer necessary.
    */
  var entryComponents: js.UndefOr[js.Array[Type[Any] | js.Array[Any]]] = js.undefined
  
  /**
    * The imports property specifies the standalone component's template dependencies — those
    * directives, components, and pipes that can be used within its template. Standalone components
    * can import other standalone components, directives, and pipes as well as existing NgModules.
    *
    * This property is only available for standalone components - specifying it for components
    * declared in an NgModule generates a compilation error.
    *
    * More information about standalone components, directives, and pipes can be found in [this
    * guide](guide/standalone-components).
    *
    * @developerPreview
    */
  var imports: js.UndefOr[js.Array[Type[Any] | js.Array[Any]]] = js.undefined
  
  /**
    * Overrides the default interpolation start and end delimiters (`{{` and `}}`).
    */
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.undefined
  
  /**
    * The module ID of the module that contains the component.
    * The component must be able to resolve relative URLs for templates and styles.
    * SystemJS exposes the `__moduleName` variable within each module.
    * In CommonJS, this can  be set to `module.id`.
    *
    */
  var moduleId: js.UndefOr[String] = js.undefined
  
  /**
    * True to preserve or false to remove potentially superfluous whitespace characters
    * from the compiled template. Whitespace characters are those matching the `\s`
    * character class in JavaScript regular expressions. Default is false, unless
    * overridden in compiler options.
    */
  var preserveWhitespaces: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The set of schemas that declare elements to be allowed in a standalone component. Elements and
    * properties that are neither Angular components nor directives must be declared in a schema.
    *
    * This property is only available for standalone components - specifying it for components
    * declared in an NgModule generates a compilation error.
    *
    * More information about standalone components, directives, and pipes can be found in [this
    * guide](guide/standalone-components).
    */
  var schemas: js.UndefOr[js.Array[SchemaMetadata]] = js.undefined
  
  /**
    * One or more relative paths or absolute URLs for files containing CSS stylesheets to use
    * in this component.
    */
  var styleUrls: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * One or more inline CSS stylesheets to use
    * in this component.
    */
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An inline template for an Angular component. If provided,
    * do not supply a template file using `templateUrl`.
    *
    */
  var template: js.UndefOr[String] = js.undefined
  
  /**
    * The relative path or absolute URL of a template file for an Angular component.
    * If provided, do not supply an inline template using `template`.
    *
    */
  var templateUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Defines the set of injectable objects that are visible to its view DOM children.
    * See [example](#injecting-a-class-with-a-view-provider).
    *
    */
  var viewProviders: js.UndefOr[js.Array[Provider]] = js.undefined
}
object Component {
  
  @JSImport("@angular/core", "Component")
  @js.native
  val ^ : ComponentDecorator = js.native
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    inline def setAnimations(value: js.Array[Any]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    inline def setAnimationsVarargs(value: Any*): Self = StObject.set(x, "animations", js.Array(value*))
    
    inline def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    inline def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
    
    inline def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
    
    inline def setEntryComponents(value: js.Array[Type[Any] | js.Array[Any]]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    inline def setEntryComponentsUndefined: Self = StObject.set(x, "entryComponents", js.undefined)
    
    inline def setEntryComponentsVarargs(value: (Type[Any] | js.Array[Any])*): Self = StObject.set(x, "entryComponents", js.Array(value*))
    
    inline def setImports(value: js.Array[Type[Any] | js.Array[Any]]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setImportsVarargs(value: (Type[Any] | js.Array[Any])*): Self = StObject.set(x, "imports", js.Array(value*))
    
    inline def setInterpolation(value: js.Tuple2[String, String]): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    inline def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setStyleUrls(value: js.Array[String]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
    
    inline def setStyleUrlsUndefined: Self = StObject.set(x, "styleUrls", js.undefined)
    
    inline def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value*))
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    inline def setViewProviders(value: js.Array[Provider]): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    inline def setViewProvidersUndefined: Self = StObject.set(x, "viewProviders", js.undefined)
    
    inline def setViewProvidersVarargs(value: Provider*): Self = StObject.set(x, "viewProviders", js.Array(value*))
  }
}
