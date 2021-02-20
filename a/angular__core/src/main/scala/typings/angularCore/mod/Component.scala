package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component extends Directive {
  
  /**
    * One or more animation `trigger()` calls, containing
    * `state()` and `transition()` definitions.
    * See the [Animations guide](/guide/animations) and animations API documentation.
    *
    */
  var animations: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * The change-detection strategy to use for this component.
    *
    * When a component is instantiated, Angular creates a change detector,
    * which is responsible for propagating the component's bindings.
    * The strategy is one of:
    * - `ChangeDetectionStrategy#OnPush` sets the strategy to `CheckOnce` (on demand).
    * - `ChangeDetectionStrategy#Default` sets the strategy to `CheckAlways`.
    */
  var changeDetection: js.UndefOr[ChangeDetectionStrategy] = js.native
  
  /**
    * An encapsulation policy for the template and CSS styles. One of:
    * - `ViewEncapsulation.Emulated`: Use shimmed CSS that
    * emulates the native behavior.
    * - `ViewEncapsulation.None`: Use global CSS without any
    * encapsulation.
    * - `ViewEncapsulation.ShadowDom`: Use Shadow DOM v1 to encapsulate styles.
    *
    * If not supplied, the value is taken from `CompilerOptions`. The default compiler option is
    * `ViewEncapsulation.Emulated`.
    *
    * If the policy is set to `ViewEncapsulation.Emulated` and the component has no `styles`
    * or `styleUrls` specified, the policy is automatically switched to `ViewEncapsulation.None`.
    */
  var encapsulation: js.UndefOr[ViewEncapsulation] = js.native
  
  /**
    * A set of components that should be compiled along with
    * this component. For each component listed here,
    * Angular creates a {@link ComponentFactory} and stores it in the
    * {@link ComponentFactoryResolver}.
    * @deprecated Since 9.0.0. With Ivy, this property is no longer necessary.
    */
  var entryComponents: js.UndefOr[js.Array[typings.angularCore.mod.Type[_] | js.Array[_]]] = js.native
  
  /**
    * Overrides the default encapsulation start and end delimiters (`{{` and `}}`)
    */
  var interpolation: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  /**
    * The module ID of the module that contains the component.
    * The component must be able to resolve relative URLs for templates and styles.
    * SystemJS exposes the `__moduleName` variable within each module.
    * In CommonJS, this can  be set to `module.id`.
    *
    */
  var moduleId: js.UndefOr[String] = js.native
  
  /**
    * True to preserve or false to remove potentially superfluous whitespace characters
    * from the compiled template. Whitespace characters are those matching the `\s`
    * character class in JavaScript regular expressions. Default is false, unless
    * overridden in compiler options.
    */
  var preserveWhitespaces: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more relative paths or absolute URLs for files containing CSS stylesheets to use
    * in this component.
    */
  var styleUrls: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * One or more inline CSS stylesheets to use
    * in this component.
    */
  var styles: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An inline template for an Angular component. If provided,
    * do not supply a template file using `templateUrl`.
    *
    */
  var template: js.UndefOr[String] = js.native
  
  /**
    * The relative path or absolute URL of a template file for an Angular component.
    * If provided, do not supply an inline template using `template`.
    *
    */
  var templateUrl: js.UndefOr[String] = js.native
  
  /**
    * Defines the set of injectable objects that are visible to its view DOM children.
    * See [example](#injecting-a-class-with-a-view-provider).
    *
    */
  var viewProviders: js.UndefOr[js.Array[Provider]] = js.native
}
object Component {
  
  @JSImport("@angular/core", "Component")
  @js.native
  val ^ : ComponentDecorator = js.native
  
  @scala.inline
  implicit class ComponentMutableBuilder[Self <: Component] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimations(value: js.Array[_]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
    
    @scala.inline
    def setAnimationsVarargs(value: js.Any*): Self = StObject.set(x, "animations", js.Array(value :_*))
    
    @scala.inline
    def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeDetectionUndefined: Self = StObject.set(x, "changeDetection", js.undefined)
    
    @scala.inline
    def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncapsulationUndefined: Self = StObject.set(x, "encapsulation", js.undefined)
    
    @scala.inline
    def setEntryComponents(value: js.Array[typings.angularCore.mod.Type[_] | js.Array[_]]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryComponentsUndefined: Self = StObject.set(x, "entryComponents", js.undefined)
    
    @scala.inline
    def setEntryComponentsVarargs(value: (typings.angularCore.mod.Type[js.Any] | js.Array[js.Any])*): Self = StObject.set(x, "entryComponents", js.Array(value :_*))
    
    @scala.inline
    def setInterpolation(value: js.Tuple2[String, String]): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    @scala.inline
    def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    @scala.inline
    def setPreserveWhitespaces(value: Boolean): Self = StObject.set(x, "preserveWhitespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveWhitespacesUndefined: Self = StObject.set(x, "preserveWhitespaces", js.undefined)
    
    @scala.inline
    def setStyleUrls(value: js.Array[String]): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUrlsUndefined: Self = StObject.set(x, "styleUrls", js.undefined)
    
    @scala.inline
    def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    @scala.inline
    def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
    
    @scala.inline
    def setViewProviders(value: js.Array[Provider]): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewProvidersUndefined: Self = StObject.set(x, "viewProviders", js.undefined)
    
    @scala.inline
    def setViewProvidersVarargs(value: Provider*): Self = StObject.set(x, "viewProviders", js.Array(value :_*))
  }
}
